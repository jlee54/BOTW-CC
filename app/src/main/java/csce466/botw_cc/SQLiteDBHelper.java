package csce466.botw_cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

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
    public static final String RECIPE_COLUMN_EFFECT = "effect";
    public static final String RECIPE_COLUMN_TIME = "time";

    public SQLiteDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + MATERIAL_TABLE_NAME + " (" +
                MATERIAL_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                MATERIAL_COLUMN_NAME + " TEXT, " +
                MATERIAL_COLUMN_TYPE + " TEXT, " +
                MATERIAL_COLUMN_BUFF + " TEXT" + ")");

        sqLiteDatabase.execSQL("CREATE TABLE " + RECIPE_TABLE_NAME + " (" +
                RECIPE_COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                RECIPE_COLUMN_NAME + " TEXT, " +
                RECIPE_COLUMN_MATERIAL_1_ID + " INTEGER FOREIGN KEY, " +
                RECIPE_COLUMN_MATERIAL_2_ID + " INTEGER FOREIGN KEY, " +
                RECIPE_COLUMN_MATERIAL_3_ID + " INTEGER FOREIGN KEY, " +
                RECIPE_COLUMN_MATERIAL_4_ID + " INTEGER FOREIGN KEY, " +
                RECIPE_COLUMN_MATERIAL_5_ID + " INTEGER FOREIGN KEY, " +
                RECIPE_COLUMN_TYPE + " TEXT, " +
                RECIPE_COLUMN_HEARTS + " DECIMAL, " +
                RECIPE_COLUMN_EFFECT + " TEXT, " +
                RECIPE_COLUMN_TIME + " DECIMAL" + ")");

        generateSeed(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + MATERIAL_TABLE_NAME);
        onCreate(sqLiteDatabase);
    }

    public void generateSeed(SQLiteDatabase sqLiteDatabase){

        //add more materials here
        insertMaterial(sqLiteDatabase, "Apple", "Food", "Health");


        //add more recipes here
        //will probably need to do a select statement to get material ids since they are foreign keys
        insertRecipe(sqLiteDatabase, "Baked Apple", 1, 0, 0, 0, 0, "Food", 0.75, null, 0);
    }

    public void insertMaterial(SQLiteDatabase sqLiteDatabase, String name, String type, String buff){
        ContentValues cv = new ContentValues();
        cv.put(MATERIAL_COLUMN_NAME, name);
        cv.put(MATERIAL_COLUMN_TYPE, type);
        cv.put(MATERIAL_COLUMN_BUFF, buff);
        sqLiteDatabase.insert(MATERIAL_TABLE_NAME, null, cv);
    }

    public void insertRecipe(SQLiteDatabase sqLiteDatabase, String name, int material1, int material2, int material3, int material4, int material5,
                             String type, double hearts, String effect, double time){

        ContentValues cv = new ContentValues();
        cv.put(RECIPE_COLUMN_NAME, name);
        cv.put(RECIPE_COLUMN_MATERIAL_1_ID, material1);
        cv.put(RECIPE_COLUMN_MATERIAL_2_ID, material2);
        cv.put(RECIPE_COLUMN_MATERIAL_3_ID, material3);
        cv.put(RECIPE_COLUMN_MATERIAL_4_ID, material4);
        cv.put(RECIPE_COLUMN_MATERIAL_5_ID, material5);
        cv.put(RECIPE_COLUMN_TYPE, type);
        cv.put(RECIPE_COLUMN_HEARTS, hearts);
        cv.put(RECIPE_COLUMN_EFFECT, effect);
        cv.put(RECIPE_COLUMN_TIME, time);
        sqLiteDatabase.insert(RECIPE_TABLE_NAME, null, cv);
    }

    public void findRecipesByName(SQLiteDatabase sqLiteDatabase, String name){
        //Some sort of fuzzy comparator or 'Like' sql statement should go here
    }


}
