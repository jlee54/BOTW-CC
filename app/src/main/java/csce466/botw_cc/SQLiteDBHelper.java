package csce466.botw_cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

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
        insertMaterial(sqLiteDatabase, "Acorn", "Food", "");
        insertMaterial(sqLiteDatabase, "Amber", "Ore", "");
        insertMaterial(sqLiteDatabase, "Ancient Core", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Ancient Gear", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Ancient Screw", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Ancient Spring", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Ancient Shaft", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Apple", "Food", "");
        insertMaterial(sqLiteDatabase, "Armonanth", "Food", "Tough");
        insertMaterial(sqLiteDatabase, "Armored Carp", "Food", "");
        insertMaterial(sqLiteDatabase, "Armored Porgy", "Food", "");
        insertMaterial(sqLiteDatabase, "Big Hearty Radish", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Big Hearty Truffle", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Bird Egg", "Food", "");
        insertMaterial(sqLiteDatabase, "Bladed Rhino Beetle", "Food", ""); //May not be food??
        insertMaterial(sqLiteDatabase, "Blue Nightshade", "Food", "Sneaky");
        insertMaterial(sqLiteDatabase, "Bokoblin Fang", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Bokoblin Guts", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Bokoblin Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Bright-eyed Crab", "Food", "");
        insertMaterial(sqLiteDatabase, "Cane Sugar", "Food", "");
        insertMaterial(sqLiteDatabase, "Chickaloo Tree Nut", "Food", "");
        insertMaterial(sqLiteDatabase, "Chillfin Trout", "Food", "");
        insertMaterial(sqLiteDatabase, "Chillshroom", "Food", "Chilly");
        insertMaterial(sqLiteDatabase, "Chuchu Jelly", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Cold Darner", "Food", "");
        insertMaterial(sqLiteDatabase, "Cool Safflina", "Food", "Chilly");
        insertMaterial(sqLiteDatabase, "Courser Bee Honey", "Food", "Energizing");
        insertMaterial(sqLiteDatabase, "Diamond", "Ore", "");
        insertMaterial(sqLiteDatabase, "Dinraal's Claw", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Dinraal's Scale", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Electric Darner", "Food", "");
        insertMaterial(sqLiteDatabase, "Electric Keese Wing", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Electring Safflina", "Food", "Electro");
        insertMaterial(sqLiteDatabase, "Endura Carrot", "Food", "Enduring");
        insertMaterial(sqLiteDatabase, "Endura Shroom", "Food", "Enduring");
        insertMaterial(sqLiteDatabase, "Fairy", "Other", "");
        insertMaterial(sqLiteDatabase, "Farosh's Claw", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Farosh's Scale", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Fireproof Lizard", "Food", "");
        insertMaterial(sqLiteDatabase, "Fire Keese Wing", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Fleet-Lotus Seeds", "Food", "");
        insertMaterial(sqLiteDatabase, "Flint", "Ore", "");
        insertMaterial(sqLiteDatabase, "Fortified Pumpkin", "Food", "Tough");
        insertMaterial(sqLiteDatabase, "Fresh Milk", "Food", "");
        insertMaterial(sqLiteDatabase, "Giant Ancient Core", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Goat Butter", "Food", "");
        insertMaterial(sqLiteDatabase, "Goron Spice", "Food", "");
        insertMaterial(sqLiteDatabase, "Hearty Bass", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Blueshell Snail", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Durian", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Lizard", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Radish", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Salmon", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hearty Truffle", "Food", "Hearty");
        insertMaterial(sqLiteDatabase, "Hightail Lizard", "Food", "");
        insertMaterial(sqLiteDatabase, "Hinox Guts", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Hinox Toenail", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Hinox Tooth", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Hot-footed Frog", "Food", "");
        insertMaterial(sqLiteDatabase, "Hydromelon", "Food", "");
        insertMaterial(sqLiteDatabase, "Hylian Rice", "Food", "");
        insertMaterial(sqLiteDatabase, "Hyrule Bass", "Food", "");
        insertMaterial(sqLiteDatabase, "Hyrule Herb", "Food", "");
        insertMaterial(sqLiteDatabase, "Ice Keese Wing", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Icy Lizalfos Tail", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Ironshell Crab", "Food", "");
        insertMaterial(sqLiteDatabase, "Ironshroom", "Food", "");
        insertMaterial(sqLiteDatabase, "Keese Eyeball", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Keese Wing", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Lizalfos Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Lizalfos Tail", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Lizalfos Talon", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Luminous Stone", "Ore", "");
        insertMaterial(sqLiteDatabase, "Lynel Guts", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Lynel Hoof", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Lynel Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Mighty Bananas", "Food", "");
        insertMaterial(sqLiteDatabase, "Mighty Carp", "Food", "");
        insertMaterial(sqLiteDatabase, "Mighty Porgy", "Food", "");
        insertMaterial(sqLiteDatabase, "Mighty Thistle", "Food", "");
        insertMaterial(sqLiteDatabase, "Moblin Fang", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Mobling Guts", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Moblin Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Moldulga Fin", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Moldulga Guts", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Monster Extract", "Other", "");
        insertMaterial(sqLiteDatabase, "Naydra's Claw", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Naydra's Scale", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Octo Balloon", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Octorok Eyeball", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Octorok Tentacle", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Opal", "Ore", "");
        insertMaterial(sqLiteDatabase, "Palm Fruit", "Food", "");
        insertMaterial(sqLiteDatabase, "Raw Bird Drumstick", "Food", "");
        insertMaterial(sqLiteDatabase, "Raw Bird Thigh", "Food", "");
        insertMaterial(sqLiteDatabase, "Ram Gourmet Meat", "Food", "");
        insertMaterial(sqLiteDatabase, "Raw Meat", "Food", "");
        insertMaterial(sqLiteDatabase, "Raw Prime Meat", "Food", "");
        insertMaterial(sqLiteDatabase, "Raw Whole Bird", "Food", "");
        insertMaterial(sqLiteDatabase, "Razorclaw Crab", "Food", "");
        insertMaterial(sqLiteDatabase, "Razorshroom", "Food", "Mighty");
        insertMaterial(sqLiteDatabase, "Red Chuchu Jelly", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Red Lizalfos Tail", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Restless Cricket", "Food", "");
        insertMaterial(sqLiteDatabase, "Rock Salt", "Ore", "");
        insertMaterial(sqLiteDatabase, "Ruby", "Ore", "");
        insertMaterial(sqLiteDatabase, "Rugged Rhino Beetle", "Food", "");
        insertMaterial(sqLiteDatabase, "Rushroom", "Food", "Hasty");
        insertMaterial(sqLiteDatabase, "Sapphire", "Ore", "");
        insertMaterial(sqLiteDatabase, "Shard of Dinraal's Fang", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Shard of Dinraal's Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Shard of Farosh's Fang", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Shard of Farosh's Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Shard of Naydra's Fang", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Shard of Naydra's Horn", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Silent Princess", "Food", "Sneaky");
        insertMaterial(sqLiteDatabase, "Silent Shroom", "Food", "Sneaky");
        insertMaterial(sqLiteDatabase, "Sizzlefin Trout", "Food", "");
        insertMaterial(sqLiteDatabase, "Smotherwing Butterly", "Food", "");
        insertMaterial(sqLiteDatabase, "Snake Carp", "Food", "");
        insertMaterial(sqLiteDatabase, "Sneaky River Snail", "Food", "");
        insertMaterial(sqLiteDatabase, "Spicy Pepper", "Food", "Spicy");
        insertMaterial(sqLiteDatabase, "Stamella Shroom", "Food", "Energizing");
        insertMaterial(sqLiteDatabase, "Staminoka Bass", "Food", "");
        insertMaterial(sqLiteDatabase, "Star Fragment", "Other", "");
        insertMaterial(sqLiteDatabase, "Stealthfin Trout", "Food", "");
        insertMaterial(sqLiteDatabase, "Summerwing Butterfly", "Food", "");
        insertMaterial(sqLiteDatabase, "Sunset Firefly", "Food", "");
        insertMaterial(sqLiteDatabase, "Sunshroom", "Food", "Spicy");
        insertMaterial(sqLiteDatabase, "Swift Carrot", "Food", "Hasty");
        insertMaterial(sqLiteDatabase, "Swift Violet", "Food", "Sneaky");
        insertMaterial(sqLiteDatabase, "Tabantha Wheat", "Food", "");
        insertMaterial(sqLiteDatabase, "Thunderwing Butterfly", "Food", "");
        insertMaterial(sqLiteDatabase, "Tireless Frog", "Food", "");
        insertMaterial(sqLiteDatabase, "Topaz", "Ore", "");
        insertMaterial(sqLiteDatabase, "Voltfin Trout", "Food", "");
        insertMaterial(sqLiteDatabase, "Voltfruit", "Food", "Electro");
        insertMaterial(sqLiteDatabase, "Warm Darner", "Food", "");
        insertMaterial(sqLiteDatabase, "Warm Safflina", "Food", "Spicy");
        insertMaterial(sqLiteDatabase, "White Chuchu Jelly", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Wild Berry", "Food", "");
        insertMaterial(sqLiteDatabase, "Winterwing Butterfly", "Food", "");
        insertMaterial(sqLiteDatabase, "Wood", "Other", "");
        insertMaterial(sqLiteDatabase, "Yellow Chuchu Jelly", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Yellow Lizalfos Tail", "Monster Part", "");
        insertMaterial(sqLiteDatabase, "Zapshroom", "Food", "");



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

    public static ArrayList<String> findMaterialsByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] {"%"+ name + "%" }, null, null, null, null);
        /*
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] { name + "%" }, null, null, null, null);
         */
        ArrayList<String> results = new ArrayList<String>();
        int i = 0;
        while(cursor.moveToNext()){
            results.add(cursor.getString(cursor.getColumnIndex(MATERIAL_COLUMN_NAME)));
        }
        return results;
    }

    public String findMaterialByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] {"%"+ name + "%" }, null, null, null, null);
        /*
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " LIKE ?", new String[] { name + "%" }, null, null, null, null);
         */

        cursor.moveToFirst();
        return cursor.getString(cursor.getColumnIndex(MATERIAL_COLUMN_NAME));
    }


    public static int findMaterialIdByName(SQLiteDatabase sqLiteDatabase, String name){
        Cursor cursor = sqLiteDatabase.query(true, MATERIAL_TABLE_NAME, new String[] { MATERIAL_COLUMN_ID, MATERIAL_COLUMN_NAME},
                MATERIAL_COLUMN_NAME + " = ?", new String[] {name}, null, null, null, null);
        cursor.moveToFirst();
        return cursor.getInt(cursor.getColumnIndex(MATERIAL_COLUMN_ID));


    }

}
