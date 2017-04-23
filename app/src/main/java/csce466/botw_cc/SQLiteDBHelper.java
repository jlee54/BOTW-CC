package csce466.botw_cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

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

    public static String sql = "INSERT INTO " + RECIPE_TABLE_NAME + " ("+RECIPE_COLUMN_NAME+", "+RECIPE_COLUMN_MATERIAL_1_ID+", "+RECIPE_COLUMN_MATERIAL_2_ID+"," +
            " "+RECIPE_COLUMN_MATERIAL_3_ID+", "+RECIPE_COLUMN_MATERIAL_4_ID+", "+RECIPE_COLUMN_MATERIAL_5_ID+", "+RECIPE_COLUMN_TYPE+"," +
            " "+RECIPE_COLUMN_HEARTS+", "+RECIPE_COLUMN_MODIFIER+", "+RECIPE_COLUMN_EFFECT+", "+RECIPE_COLUMN_TIME+") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public static SQLiteStatement statement;

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

        statement = sqLiteDatabase.compileStatement(sql);
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

//        String sql = "INSERT INTO " + RECIPE_TABLE_NAME + " ("+RECIPE_COLUMN_NAME+", "+RECIPE_COLUMN_MATERIAL_1_ID+", "+RECIPE_COLUMN_MATERIAL_2_ID+"," +
//                " "+RECIPE_COLUMN_MATERIAL_3_ID+", "+RECIPE_COLUMN_MATERIAL_4_ID+", "+RECIPE_COLUMN_MATERIAL_5_ID+", "+RECIPE_COLUMN_TYPE+"," +
//                " "+RECIPE_COLUMN_HEARTS+", "+RECIPE_COLUMN_MODIFIER+", "+RECIPE_COLUMN_EFFECT+", "+RECIPE_COLUMN_TIME+") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        //SQLiteStatement statement = sqLiteDatabase.compileStatement(sql);

        statement.bindString(1, name);
        statement.bindLong(2, material1);
        statement.bindLong(3, material2);
        statement.bindLong(4, material3);
        statement.bindLong(5, material4);
        statement.bindLong(6, material5);
        statement.bindString(7, type);
        statement.bindDouble(8, hearts);
        statement.bindLong(9, modifier);
        if (effect == null || effect.isEmpty()){
            statement.bindNull(10);
        } else {
            statement.bindString(10, effect);
        }
        statement.bindDouble(11, time);
        statement.executeInsert();

//        ContentValues cv = new ContentValues();
//        cv.put(RECIPE_COLUMN_NAME, name);
//        cv.put(RECIPE_COLUMN_MATERIAL_1_ID, material1);
//        cv.put(RECIPE_COLUMN_MATERIAL_2_ID, material2);
//        cv.put(RECIPE_COLUMN_MATERIAL_3_ID, material3);
//        cv.put(RECIPE_COLUMN_MATERIAL_4_ID, material4);
//        cv.put(RECIPE_COLUMN_MATERIAL_5_ID, material5);
//        cv.put(RECIPE_COLUMN_TYPE, type);
//        cv.put(RECIPE_COLUMN_HEARTS, hearts);
//        cv.put(RECIPE_COLUMN_MODIFIER, modifier);
//        cv.put(RECIPE_COLUMN_EFFECT, effect);
//        cv.put(RECIPE_COLUMN_TIME, time);
//        sqLiteDatabase.insert(RECIPE_TABLE_NAME, null, cv);
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
        int ret_id = cursor.getInt(cursor.getColumnIndex(MATERIAL_COLUMN_ID));
        cursor.close();
        return ret_id;
    }


    public static ArrayList<String> findMaterialNamesBySubType(SQLiteDatabase sqLiteDatabase, String subtype){
        ArrayList<String> arraylist = new ArrayList<String>();

        String query = "SELECT " + MATERIAL_COLUMN_NAME + " FROM " + MATERIAL_TABLE_NAME + " WHERE " + MATERIAL_COLUMN_SUBTYPE + " = '"+subtype+"'";

        Cursor c = sqLiteDatabase.rawQuery(query, null);
        while(c.moveToNext()) {
            arraylist.add(c.getString(0));
        }
        c.close();
        return arraylist;
    }

    public static int findRecipeIdByMaterials(SQLiteDatabase sqLiteDatabase, int materialId1, int materialId2, int materialId3, int materialId4, int materialId5){

        String[] tableColumns = new String[]{RECIPE_COLUMN_ID, RECIPE_COLUMN_NAME};
        ArrayList<String> idArray = new ArrayList<String>();
        if(materialId1 != 0)idArray.add(Integer.toString(materialId1));
        if(materialId2 != 0)idArray.add(Integer.toString(materialId2));
        if(materialId3 != 0)idArray.add(Integer.toString(materialId3));
        if(materialId4 != 0)idArray.add(Integer.toString(materialId4));
        if(materialId5 != 0)idArray.add(Integer.toString(materialId5));
        int numberOfMaterials = idArray.size();
        String[] whereArgs;
        String whereClause;
        Cursor cursor;
        HashMap<Integer, HashMap<Integer, Integer>> results = new HashMap<>();

        for(int i = 0; i < numberOfMaterials; i++){
            for(int j = 1; j <= numberOfMaterials; j++){
                whereArgs = new String[]{idArray.get(i)};
                whereClause = "material" + j + "_id = ?";
                cursor = sqLiteDatabase.query(true, RECIPE_TABLE_NAME, tableColumns, whereClause, whereArgs, null, null, null, null, null);
                cursor.moveToFirst();
                while (!cursor.isAfterLast()) {
                    if (results.containsKey(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)))) {
                        if(!results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).containsKey(j)){
                            results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).put(j, 1);
                            results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).put(6, results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).get(6) + 1);
                        }
                    } else {
                        HashMap<Integer, Integer> columnMatched = new HashMap<Integer, Integer>();
                        columnMatched.put(j, 1);
                        columnMatched.put(6, 1);
                        results.put(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)), columnMatched);
                    }
                    cursor.moveToNext();
                }
                cursor.close();
            }
        }
        for(int i = numberOfMaterials; i < 5; i++){
            whereArgs = new String[]{"0"};
            whereClause = "material" + (i + 1) + "_id = ?";
            cursor = sqLiteDatabase.query(true, RECIPE_TABLE_NAME, tableColumns, whereClause, whereArgs, null, null, null, null, null);
            cursor.moveToFirst();
            while (!cursor.isAfterLast()) {
                if (results.containsKey(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)))) {
                    if(!results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).containsKey(i+1)){
                        results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).put(i+1, 1);
                        results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).put(6, results.get(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID))).get(6) + 1);
                    }
                } else {
                    HashMap<Integer, Integer> columnMatched = new HashMap<Integer, Integer>();
                    columnMatched.put(i+1, 1);
                    columnMatched.put(6, 1);
                    results.put(cursor.getInt(cursor.getColumnIndex(RECIPE_COLUMN_ID)), columnMatched);
                }
                cursor.moveToNext();
            }
            cursor.close();
        }
        boolean flag = true;
        for(Map.Entry<Integer, HashMap<Integer, Integer>> entry : results.entrySet()){
            for(int i = 1; i <= 6; i++){
                if(!entry.getValue().containsKey(i)){
                    flag = false;
                }
            }
            if(entry.getValue().get(6) != 5){
                flag = false;
            }
            if(flag == true){
                return entry.getKey();
            }
            else{
                flag = true;
            }
        }
        return 0;
    }

    public static String findRecipeNameById(SQLiteDatabase sqLiteDatabase, int id){
        Cursor cursor = sqLiteDatabase.query(true, RECIPE_TABLE_NAME, new String[] { RECIPE_COLUMN_ID, RECIPE_COLUMN_NAME},
                RECIPE_COLUMN_ID + " = ?", new String[]{Integer.toString(id)}, null, null, null, null, null);
        cursor.moveToFirst();
        return cursor.getString(cursor.getColumnIndex(RECIPE_COLUMN_NAME));
    }

}
