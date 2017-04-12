package csce466.botw_cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Zack on 3/20/2017.
 */
public class SQLiteDBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 2;

    public static final String DATABASE_NAME = "cooking_database";

    public static final String MATERIAL_TABLE_NAME = "material";
    public static final String MATERIAL_COLUMN_ID = "_id";
    public static final String MATERIAL_COLUMN_NAME = "name";
    public static final String MATERIAL_COLUMN_TYPE = "type";
    public static final String MATERIAL_COLUMN_BUFF = "buff";
    public static final String MATERIAL_COLUMN_SUBTYPE = "sub_type";


    public static final String RECIPE_TABLE_NAME = "recipe";
    public static final String RECIPE_COLUMN_ID = "_id";
    public static final String RECIPE_COLUMN_NAME = "materials";
    public static final String RECIPE_COLUMN_MATERIAL_1_ID = "material1_id";
    public static final String RECIPE_COLUMN_MATERIAL_2_ID = "material2_id";
    public static final String RECIPE_COLUMN_MATERIAL_3_ID = "material3_id";
    public static final String RECIPE_COLUMN_MATERIAL_4_ID = "material4_id";
    public static final String RECIPE_COLUMN_MATERIAL_5_ID = "material5_id";
    public static final String RECIPE_COLUMN_TYPE = "type";
    public static final String RECIPE_COLUMN_HEARTS = "hearts";
    public static final String RECIPE_COLUMN_MODIFIER = "modifier";
    public static final String RECIPE_COLUMN_EFFECT = "effect";
    public static final String RECIPE_COLUMN_TIME = "time";

    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MATERIAL_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + RECIPE_TABLE_NAME);
        sqLiteDatabase.execSQL("CREATE TABLE " + MATERIAL_TABLE_NAME + " (" +
                MATERIAL_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                MATERIAL_COLUMN_NAME + " TEXT, " +
                MATERIAL_COLUMN_TYPE + " TEXT, " +
                MATERIAL_COLUMN_BUFF + " TEXT, " +
                MATERIAL_COLUMN_SUBTYPE + " TEXT " + ")");

        sqLiteDatabase.execSQL("CREATE TABLE " + RECIPE_TABLE_NAME + " (" +
                RECIPE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                RECIPE_COLUMN_NAME + " TEXT, " +
                RECIPE_COLUMN_MATERIAL_1_ID + " INTEGER, " +
                RECIPE_COLUMN_MATERIAL_2_ID + " INTEGER, " +
                RECIPE_COLUMN_MATERIAL_3_ID + " INTEGER, " +
                RECIPE_COLUMN_MATERIAL_4_ID + " INTEGER, " +
                RECIPE_COLUMN_MATERIAL_5_ID + " INTEGER, " +
                RECIPE_COLUMN_TYPE + " TEXT, " +
                RECIPE_COLUMN_HEARTS + " DECIMAL, " +
                RECIPE_COLUMN_MODIFIER + " INTEGER, " +
                RECIPE_COLUMN_EFFECT + " TEXT, " +
                RECIPE_COLUMN_TIME + " DECIMAL" + ")");

        generateSeed(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MATERIAL_TABLE_NAME);
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + RECIPE_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void generateSeed(SQLiteDatabase sqLiteDatabase){
        Seed.addAllMaterials(sqLiteDatabase, this);
        insertRecipe(sqLiteDatabase, "Baked Apple", 1, 0, 0, 0, 0, "Food", 0.75, 0, null, 0);
        Seed.insertRecipesSeed(sqLiteDatabase, this);
    }

    public void insertMaterial(SQLiteDatabase sqLiteDatabase, String name, String type, String buff, String subtype){
        ContentValues cv = new ContentValues();
        cv.put(MATERIAL_COLUMN_NAME, name);
        cv.put(MATERIAL_COLUMN_TYPE, type);
        cv.put(MATERIAL_COLUMN_BUFF, buff);
        cv.put(MATERIAL_COLUMN_SUBTYPE, subtype);
        sqLiteDatabase.insert(MATERIAL_TABLE_NAME, null, cv);
    }


    public void insertRecipeWithLookups(SQLiteDatabase sqLiteDatabase, String name, String one, String two, String three, String four, String five,
                                        String type, double hearts, int modifier, String effect, double time){

                insertRecipe(sqLiteDatabase, name,
                        findMaterialIdByName(sqLiteDatabase, one),
                        two == "0" ? 0 : findMaterialIdByName(sqLiteDatabase, two),
                        three == "0" ? 0 : findMaterialIdByName(sqLiteDatabase, three),
                        four == "0" ? 0 : findMaterialIdByName(sqLiteDatabase, four),
                        five == "0" ? 0 : findMaterialIdByName(sqLiteDatabase, five),
                        type, hearts, modifier, effect, time);
    }


    public void insertRecipe(SQLiteDatabase sqLiteDatabase, String name, int material1, int material2, int material3, int material4, int material5,
                             String type, double hearts, int modifier, String effect, double time){

        ContentValues cv = new ContentValues();
        cv.put(RECIPE_COLUMN_NAME, name);
        cv.put(RECIPE_COLUMN_MATERIAL_1_ID, material1);
        cv.put(RECIPE_COLUMN_MATERIAL_2_ID, material2);
        cv.put(RECIPE_COLUMN_MATERIAL_3_ID, material3);
        cv.put(RECIPE_COLUMN_MATERIAL_4_ID, material4);
        cv.put(RECIPE_COLUMN_MATERIAL_5_ID, material5);
        cv.put(RECIPE_COLUMN_TYPE, type);
        cv.put(RECIPE_COLUMN_HEARTS, hearts);
        cv.put(RECIPE_COLUMN_MODIFIER, modifier);
        cv.put(RECIPE_COLUMN_EFFECT, effect);
        cv.put(RECIPE_COLUMN_TIME, time);
        sqLiteDatabase.insert(RECIPE_TABLE_NAME, null, cv);
    }

    public static ArrayList<String> findMaterialsByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] {"%"+ name + "%" }, null, null, null, null, null);

        ArrayList<String> results = new ArrayList<String>();
        int i = 0;
        while(cursor.moveToNext()){
            results.add(cursor.getString(cursor.getColumnIndex(MATERIAL_COLUMN_NAME)));
        }
        return results;
    }

    public static String findMaterialByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] {"%"+ name + "%" }, null, null, null, null, null);

        //cursor.moveToFirst();
        if(cursor.getCount() > 0) {
            while (cursor.moveToNext()) {
                String suggestion = cursor.getString(cursor.getColumnIndex(MATERIAL_COLUMN_NAME));
                if (suggestion.substring(0, name.length()).toLowerCase().equals(name.toLowerCase())) {
                    return name + suggestion.substring(name.length());
                }
            }
        }

        return "";
    }


    public static int findMaterialIdByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " = ?", new String[] {name}, null, null, null, null, null);
        cursor.moveToFirst();
        return cursor.getInt(cursor.getColumnIndex(MATERIAL_COLUMN_ID));


    }

    public static ArrayList<String> findMaterialNamesBySubType(SQLiteDatabase sqLiteDatabase, String subtype){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_SUBTYPE},
                MATERIAL_COLUMN_SUBTYPE + " = ?", null, null, null, null, null);

        ArrayList<String> results = new ArrayList<String>();
        int i = 0;
        while(cursor.moveToNext()){
            results.add(cursor.getString(cursor.getColumnIndex(MATERIAL_COLUMN_NAME)));
        }
        return results;
    }

    public static int findRecipeIdByMaterials(SQLiteDatabase sqLiteDatabase, int materialId1, int materialId2, int materialId3, int materialId4, int materialId5){

        String[] tableColumns = new String[]{RECIPE_COLUMN_ID, RECIPE_COLUMN_NAME};
        String whereClause = RECIPE_COLUMN_MATERIAL_1_ID + " = ? OR " + RECIPE_COLUMN_MATERIAL_1_ID + " = ? OR "
                + RECIPE_COLUMN_MATERIAL_3_ID + " = ? OR " + RECIPE_COLUMN_MATERIAL_4_ID + " = ? OR " + RECIPE_COLUMN_MATERIAL_5_ID + " = ?";
        String[] idArray = new String[]{Integer.toString(materialId1), Integer.toString(materialId2),
                Integer.toString(materialId3), Integer.toString(materialId4), Integer.toString(materialId5)};
        String[] whereArgs;
        Cursor cursor;
        HashMap<Integer, Integer> results = new HashMap<Integer, Integer>();
        for(int i = 0; i < 5; i++){
            whereArgs = new String[]{idArray[i], idArray[i], idArray[i], idArray[i], idArray[i]};
            cursor = sqLiteDatabase.query(true, RECIPE_TABLE_NAME, tableColumns, whereClause, whereArgs, null, null, null, null, null);
            while (cursor.moveToNext()) {
                if(results.containsKey(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)))){
                    results.put(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)), results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))) + 1);
                }
                else{
                    results.put(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)), 1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : results.entrySet()){
            if(entry.getValue() == 5){
                return entry.getKey();
            }
        }
        return 0;
    }

}
