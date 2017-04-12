package csce466.botw_cc;

import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by Zack on 4/11/2017.
 */

public class Seed {

    public static void addAllMaterials(SQLiteDatabase sqLiteDatabase, SQLiteDBHelper db){

        db.insertMaterial(sqLiteDatabase, "Acorn", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Amber", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Ancient Core", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Ancient Gear", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Ancient Screw", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Ancient Spring", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Ancient Shaft", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Apple", "Food", "", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Armonanth", "Food", "Tough", "Green");
        db.insertMaterial(sqLiteDatabase, "Armored Carp", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Armored Porgy", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Big Hearty Radish", "Food", "Hearty", "Green");
        db.insertMaterial(sqLiteDatabase, "Big Hearty Truffle", "Food", "Hearty", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Bird Egg", "Food", "", "Filler");
        db.insertMaterial(sqLiteDatabase, "Bladed Rhino Beetle", "Food", "", ""); //May not be food??
        db.insertMaterial(sqLiteDatabase, "Blue Nightshade", "Food", "Sneaky", "Green");
        db.insertMaterial(sqLiteDatabase, "Bokoblin Fang", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Bokoblin Guts", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Bokoblin Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Bright-eyed Crab", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Cane Sugar", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Chickaloo Tree Nut", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Chillfin Trout", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Chillshroom", "Food", "Chilly", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Chuchu Jelly", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Cold Darner", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Cool Safflina", "Food", "Chilly", "Green");
        db.insertMaterial(sqLiteDatabase, "Courser Bee Honey", "Food", "Energizing", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Diamond", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Dinraal's Claw", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Dinraal's Scale", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Electric Darner", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Electric Keese Wing", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Electring Safflina", "Food", "Electro", "Green");
        db.insertMaterial(sqLiteDatabase, "Endura Carrot", "Food", "Enduring", "Green");
        db.insertMaterial(sqLiteDatabase, "Endura Shroom", "Food", "Enduring", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Fairy", "Other", "", "Filler");
        db.insertMaterial(sqLiteDatabase, "Farosh's Claw", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Farosh's Scale", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Fireproof Lizard", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Fire Keese Wing", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Fleet-Lotus Seeds", "Food", "", "Green");
        db.insertMaterial(sqLiteDatabase, "Flint", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Fortified Pumpkin", "Food", "Tough", "Green");
        db.insertMaterial(sqLiteDatabase, "Fresh Milk", "Food", "", "Filler");
        db.insertMaterial(sqLiteDatabase, "Giant Ancient Core", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Goat Butter", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Goron Spice", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Hearty Bass", "Food", "Hearty", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Hearty Blueshell Snail", "Food", "Hearty", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Hearty Durian", "Food", "Hearty", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Hearty Lizard", "Food", "Hearty", "");
        db.insertMaterial(sqLiteDatabase, "Hearty Radish", "Food", "Hearty", "Green");
        db.insertMaterial(sqLiteDatabase, "Hearty Salmon", "Food", "Hearty", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Hearty Truffle", "Food", "Hearty", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Hightail Lizard", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Hinox Guts", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Hinox Toenail", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Hinox Tooth", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Hot-footed Frog", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Hydromelon", "Food", "", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Hylian Rice", "Food", "", "Seasoning" );
        db.insertMaterial(sqLiteDatabase, "Hyrule Bass", "Food", "", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Hyrule Herb", "Food", "", "Green");
        db.insertMaterial(sqLiteDatabase, "Ice Keese Wing", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Icy Lizalfos Tail", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Ironshell Crab", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Ironshroom", "Food", "", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Keese Eyeball", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Keese Wing", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Lizalfos Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Lizalfos Tail", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Lizalfos Talon", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Luminous Stone", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Lynel Guts", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Lynel Hoof", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Lynel Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Mighty Bananas", "Food", "", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Mighty Carp", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Mighty Porgy", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Mighty Thistle", "Food", "", "Green");
        db.insertMaterial(sqLiteDatabase, "Moblin Fang", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Mobling Guts", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Moblin Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Moldulga Fin", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Moldulga Guts", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Monster Extract", "Other", "", "Other");
        db.insertMaterial(sqLiteDatabase, "Naydra's Claw", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Naydra's Scale", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Octo Balloon", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Octorok Eyeball", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Octorok Tentacle", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Opal", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Palm Fruit", "Food", "", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Raw Bird Drumstick", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Raw Bird Thigh", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Ram Gourmet Meat", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Raw Meat", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Raw Prime Meat", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Raw Whole Bird", "Food", "", "Meat");
        db.insertMaterial(sqLiteDatabase, "Razorclaw Crab", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Razorshroom", "Food", "Mighty", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Red Chuchu Jelly", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Red Lizalfos Tail", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Restless Cricket", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Rock Salt", "Ore", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Ruby", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Rugged Rhino Beetle", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Rushroom", "Food", "Hasty", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Sapphire", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Dinraal's Fang", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Dinraal's Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Farosh's Fang", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Farosh's Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Naydra's Fang", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Shard of Naydra's Horn", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Silent Princess", "Food", "Sneaky", "Green");
        db.insertMaterial(sqLiteDatabase, "Silent Shroom", "Food", "Sneaky", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Sizzlefin Trout", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Smotherwing Butterly", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Snake Carp", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Sneaky River Snail", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Spicy Pepper", "Food", "Spicy", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Stamella Shroom", "Food", "Energizing", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Staminoka Bass", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Star Fragment", "Other", "", "Other");
        db.insertMaterial(sqLiteDatabase, "Stealthfin Trout", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Summerwing Butterfly", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Sunset Firefly", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Sunshroom", "Food", "Spicy", "Mushroom");
        db.insertMaterial(sqLiteDatabase, "Swift Carrot", "Food", "Hasty", "Green");
        db.insertMaterial(sqLiteDatabase, "Swift Violet", "Food", "Sneaky", "Green");
        db.insertMaterial(sqLiteDatabase, "Tabantha Wheat", "Food", "", "Seasoning");
        db.insertMaterial(sqLiteDatabase, "Thunderwing Butterfly", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Tireless Frog", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Topaz", "Ore", "", "");
        db.insertMaterial(sqLiteDatabase, "Voltfin Trout", "Food", "", "Seafood");
        db.insertMaterial(sqLiteDatabase, "Voltfruit", "Food", "Electro", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Warm Darner", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Warm Safflina", "Food", "Spicy", "Green");
        db.insertMaterial(sqLiteDatabase, "White Chuchu Jelly", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Wild Berry", "Food", "", "Fruit");
        db.insertMaterial(sqLiteDatabase, "Winterwing Butterfly", "Food", "", "");
        db.insertMaterial(sqLiteDatabase, "Wood", "Other", "", "");
        db.insertMaterial(sqLiteDatabase, "Yellow Chuchu Jelly", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Yellow Lizalfos Tail", "Monster Part", "", "");
        db.insertMaterial(sqLiteDatabase, "Zapshroom", "Food", "", "Mushroom");
    }

    public static void insertRecipesSeed(SQLiteDatabase sqLiteDatabase, SQLiteDBHelper db) {

        ArrayList<String> meatList = db.findMaterialNamesBySubType(sqLiteDatabase, "Meat");
        ArrayList<String> fruitList = db.findMaterialNamesBySubType(sqLiteDatabase, "Fruit");
        ArrayList<String> seafoodList = db.findMaterialNamesBySubType(sqLiteDatabase, "Seafood");
        ArrayList<String> vegetableList = db.findMaterialNamesBySubType(sqLiteDatabase, "Green");
        ArrayList<String> mushroomList = db.findMaterialNamesBySubType(sqLiteDatabase, "Mushroom");

        db.insertRecipeWithLookups(sqLiteDatabase, "Apple Pie", "Apple", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "0", "Food", 3.0, 0, null, 0);
        for (int i = 0; i < meatList.size(); i++) {
            db.insertRecipeWithLookups(sqLiteDatabase, "Meat Pie", "Tabantha Wheat", "Goat Butter", "Rock Salt", meatList.get(i), "0", "Food", 14.0, -1, "Various effects from raw meat choice. Raw Gourmet restores most with 14 hearts.", 0);
            //Can this be without salt? What about multiple kinds of rice....what about multiple kinds of anything...
            db.insertRecipeWithLookups(sqLiteDatabase, "Meat and Rice Bowl", "Hylian Rice", "Rock Salt", meatList.get(i), "0", "0", "Food", 4.0, 1, "Use different types of meat to increase the hearts restored.", 0);
            db.insertRecipeWithLookups(sqLiteDatabase, "Meat/Poultry Curry", "Hylian Rice", "Goron Spice", meatList.get(i), "0", "0", "Food", 20.0, -1, "Must use either meat besides Poultry exclusively, or exclusively Poultry.", 0);
            if (meatList.get(i).contains("Bird") && meatList.get(i).contains("Raw")){
                db.insertRecipeWithLookups(sqLiteDatabase, "Poultry Pilaf", "Hylian Rice", "Goat Butter", "Bird Egg", meatList.get(i), "0", "Food", 8.0, 1, "Switch the drumsticks for any poultry meat to restore more hearts.", 0);
            }
            db.insertRecipeWithLookups(sqLiteDatabase, "Meat Stew", "Fresh Milk", "Tabantha Wheat", "Goat Butter", meatList.get(i), "0", "Food", 5.0, 1, "Use more or other types of meat to increase hearts restored.", 0);
            for (int j = 0; j < meatList.size(); j++) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Meat Pie", "Tabantha Wheat", "Goat Butter", "Rock Salt", meatList.get(i), meatList.get(j), "Food", 14.0, -1, "Various effects from raw meat choice. Two Gourmet Meats restore most with 14 hearts.", 0);
                db.insertRecipeWithLookups(sqLiteDatabase, "Meat and Rice Bowl", "Hylian Rice", "Rock Salt", meatList.get(i), meatList.get(j), "0", "Food", 4.0, 1, "Use different types of meat to increase the hearts restored.", 0);
                db.insertRecipeWithLookups(sqLiteDatabase, "Meat/Poultry Curry", "Hylian Rice", "Goron Spice", meatList.get(i), meatList.get(j), "0", "Food", 20.0, -1, "Must use either Raw Meat besides Poultry exclusively, or exclusively Poultry.", 0);
                if (meatList.get(j).contains("Bird") && meatList.get(j).contains("Raw")){
                    db.insertRecipeWithLookups(sqLiteDatabase, "Poultry Pilaf", "Hylian Rice", "Goat Butter", "Bird Egg", meatList.get(i), meatList.get(j), "Food", 8.0, 1, "Switch the drumsticks for any poultry meat to restore more hearts.", 0);
                }
                db.insertRecipeWithLookups(sqLiteDatabase, "Meat Stew", "Fresh Milk", "Tabantha Wheat", "Goat Butter", meatList.get(i), meatList.get(j), "Food", 5.0, 1, "Use more or other types of meat to increase hearts restored.", 0);
                for (int k = 0; k < meatList.size(); k++){
                    db.insertRecipeWithLookups(sqLiteDatabase, "Meat and Rice Bowl", "Hylian Rice", "Rock Salt", meatList.get(i), meatList.get(j), meatList.get(k), "Food", 4.0, 1, "Use different types of meat to increase the hearts restored.", 0);
                    db.insertRecipeWithLookups(sqLiteDatabase, "Meat/Poultry Curry", "Hylian Rice", "Goron Spice", meatList.get(i), meatList.get(j), meatList.get(k), "Food", 20.0, -1, "Must use either Raw Meat besides Poultry exclusively, or exclusively Poultry.", 0);
                }
            }
        }

        for(int i = 0; i < fruitList.size(); i++) {
            if(fruitList.get(i) != "Apple") {
                db.insertRecipeWithLookups(sqLiteDatabase, "Fruit Pie", "Tabantha Wheat", "Cane Sugar", "Goat Butter", fruitList.get(i), "0", "Food", 3.0, 1, "Various effects from fruit choice(s).", 0);
            }
            db.insertRecipeWithLookups(sqLiteDatabase, "Simmered Fruit", fruitList.get(i), "0", "0", "0", "0", "Food", 1.0, 0, "Use other fruits or more fruits to restore more hearts or add special effects.", 0);
            for (int j = 0; j < fruitList.size(); j++) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Fruit Pie", "Tabantha Wheat", "Cane Sugar", "Goat Butter", fruitList.get(i), fruitList.get(j), "Food", 3.0, 1, "Various effects from fruit choice(s).", 0);
                db.insertRecipeWithLookups(sqLiteDatabase, "Simmered Fruit", fruitList.get(i), fruitList.get(j), "0", "0", "0", "Food", 1.0, 1, "Use other fruits or more fruits to restore more hearts or add special effects.", 0);
                if (fruitList.get(i) != fruitList.get(j)) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Fruit Cake", "Tabantha Wheat", "Cane Sugar", fruitList.get(i), fruitList.get(j), "0", "Food", 5.0, 1, "Always use different fruits. Switch fruits for various effects.", 0);
                }
                for (int k = 0; k < fruitList.size(); k++) {
                    if (fruitList.get(i) != fruitList.get(k) && fruitList.get(j) != fruitList.get(k)) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Fruit Cake", "Tabantha Wheat", "Cane Sugar", fruitList.get(i), fruitList.get(j), "0", "Food", 5.0, 1, "Always use different fruits. Switch fruits for various effects.", 0);
                    }
                    db.insertRecipeWithLookups(sqLiteDatabase, "Simmered Fruit", fruitList.get(i), fruitList.get(j), fruitList.get(k), "0", "0", "Food", 1.0, 1, "Use other fruits or more fruits to restore more hearts or add special effects.", 0);
                    for (int m = 0; m < fruitList.size(); m++) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Simmered Fruit", fruitList.get(i), fruitList.get(j), fruitList.get(k), fruitList.get(m), "0", "Food", 1.0, 1, "Use other fruits or more fruits to restore more hearts or add special effects.", 0);
                        for (int n = 0; n < fruitList.size(); n++) {
                            db.insertRecipeWithLookups(sqLiteDatabase, "Simmered Fruit", fruitList.get(i), fruitList.get(j), fruitList.get(k), fruitList.get(m), fruitList.get(n), "Food", 1.0, 1, "Use other fruits to restore more hearts or add special effects.", 0);
                        }
                    }
                }
            }
        }

        db.insertRecipeWithLookups(sqLiteDatabase, "Monster Cake", "Monster Extract", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "0", "Food", 0.25, 0, "Restores five hearts if made during Blood Moon", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Nutcake", "Acorn", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "0", "Food", 3.0, 0, "The Acorn can be swapped for Chickaloo Tree Nuts", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Nutcake", "Chickaloo Tree Nut", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "0", "Food", 3.0, 0, "The Chickaloo Tree Nut can be swapped for an Acorn", 0);
        //Fruit Cake in fruit loop above

        for(int i=0; i < vegetableList.size(); i++) {
            //Probably smaller heart value for just one carrot
            if(vegetableList.get(i).contains("Carrot")) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Carrot Cake", "Tabantha Wheat", "Cane Sugar", "Goat Butter", vegetableList.get(i), "0", "Food", 7.0, 0, "Use two of the same carrots for special effects.", 0);
            }
            db.insertRecipeWithLookups(sqLiteDatabase, "Fresh Wild Greens", vegetableList.get(i), "0", "0", "0", "0", "Food", 2.0, 0, "Use other vegetables or more vegetables to increase Hearts Restored, or to add special effects.", 0);
            for (int j = 0; j < vegetableList.size(); j++) {
                if(vegetableList.get(i).contains("Carrot") && vegetableList.get(j).contains("Carrot")) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Carrot Cake", "Tabantha Wheat", "Cane Sugar", "Goat Butter", vegetableList.get(i), vegetableList.get(i), "Food", 7.0, 0, "Use two of the same carrots for special effects.", 0);
                }
                db.insertRecipeWithLookups(sqLiteDatabase, "Fresh Wild Greens", vegetableList.get(i), vegetableList.get(j), "0", "0", "0", "Food", 2.0, 1, "Use other vegetables or more vegetables to increase Hearts Restored, or to add special effects.", 0);
                for (int k = 0; k < vegetableList.size(); k++) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Fresh Wild Greens", vegetableList.get(i), vegetableList.get(j), vegetableList.get(k), "0", "0", "Food", 2.0, 1, "Use other vegetables or more vegetables to increase Hearts Restored, or to add special effects.", 0);
                    for (int m = 0; m < vegetableList.size(); m++) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Fresh Wild Greens", vegetableList.get(i), vegetableList.get(j), vegetableList.get(k), vegetableList.get(m), "0", "Food", 2.0, 1, "Use other vegetables or more vegetables to increase Hearts Restored, or to add special effects.", 0);
                        for (int n = 0; n < vegetableList.size(); n++) {
                            db.insertRecipeWithLookups(sqLiteDatabase, "Fresh Wild Greens", vegetableList.get(i), vegetableList.get(j), vegetableList.get(k), vegetableList.get(m), vegetableList.get(n), "Food", 2.0, 1, "Use other vegetables or more vegetables to increase Hearts Restored, or to add special effects.", 0);
                        }
                    }
                }
            }
        }

        //Don't know what extra receipe's there are though for Egg Pudding
        db.insertRecipeWithLookups(sqLiteDatabase, "Egg Pudding", "Fresh Milk", "Bird Egg", "Cane Sugar", "0", "0", "Food", 3.0, 1, "Add unknown extra ingredients for possible special effects and/or increased hearts.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Egg Tart", "Bird Egg", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "0", "Food", 9.0, 0, null, 0);

        for(int i=0; i < mushroomList.size(); i++) {
            db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Risotto", "Hylian Rice", "Goat Butter", "Rock Salt", mushroomList.get(i), "0", "Food", 3.0, 1, "Use other or two mushrooms to increase hearts restored.", 0);
            db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Skewer", mushroomList.get(i), "0", "0", "0", "0", "Food", 1.0, 0, "Use other or more Mushrooms to restore more hearts or add special effects.", 0);
            for (int j = 0; j < mushroomList.size(); j++) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Risotto", "Hylian Rice", "Goat Butter", "Rock Salt", mushroomList.get(i), mushroomList.get(j), "Food", 3.0, 1, "Use other or two mushrooms to increase hearts restored.", 0);
                db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Skewer", mushroomList.get(i), mushroomList.get(j), "0", "0", "0", "Food", 1.0, 1, "Use other or more Mushrooms to restore more hearts or add special effects.", 0);
                for (int k = 0; k < mushroomList.size(); k++) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Skewer", mushroomList.get(i), mushroomList.get(j), mushroomList.get(k), "0", "0", "Food", 1.0, 1, "Use other or more Mushrooms to restore more hearts or add special effects.", 0);
                    for (int m = 0; m < mushroomList.size(); m++) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Skewer", mushroomList.get(i), mushroomList.get(j), mushroomList.get(k), mushroomList.get(m), "0", "Food", 1.0, 1, "Use other or more Mushrooms to restore more hearts or add special effects.", 0);
                        for (int n = 0; n < mushroomList.size(); n++) {
                            db.insertRecipeWithLookups(sqLiteDatabase, "Mushroom Skewer", mushroomList.get(i), mushroomList.get(j), mushroomList.get(k), mushroomList.get(m), mushroomList.get(n), "Food", 1.0, 1, "Use other or more Mushrooms to restore more hearts or add special effects.", 0);
                        }
                    }
                }
            }
        }

        for(int i=0; i < seafoodList.size(); i++) {
            db.insertRecipeWithLookups(sqLiteDatabase, "Seafood Meuniere", "Goat Butter", seafoodList.get(i), "0", "0", "0", "Food", 4.0, 1, "Use other or more fish to increase hearts restored or add special effect.", 0);
            if(seafoodList.get(i).contains("Porgy")) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Porgy Meuniere", "Tabantha Wheat", "Goat Butter", seafoodList.get(i), "0", "0", "Food", 8.0, -1, "Use other porgies or only one type of porgy for different special effects. Up to eight hearts.", 0);
            }
            for (int j = 0; j < seafoodList.size(); j++) {
                db.insertRecipeWithLookups(sqLiteDatabase, "Seafood Meuniere", "Goat Butter", seafoodList.get(i), seafoodList.get(j), "0", "0", "Food", 4.0, 1, "Use other or more fish to increase hearts restored or add special effect.", 0);
                if(seafoodList.get(i).contains("Porgy") && seafoodList.get(j).contains("Porgy")) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Porgy Meuniere", "Tabantha Wheat", "Goat Butter", seafoodList.get(i), seafoodList.get(j), "0", "Food", 8.0, -1, "Use other porgies or only one type of porgy for different special effects. Up to eight hearts.", 0);
                }
                for (int k = 0; k < seafoodList.size(); k++) {
                    db.insertRecipeWithLookups(sqLiteDatabase, "Seafood Meuniere", "Goat Butter", seafoodList.get(i), seafoodList.get(j), seafoodList.get(k), "0", "Food", 4.0, 1, "Use other or more fish to increase hearts restored or add special effects.", 0);
                    if(seafoodList.get(i).contains("Porgy") && seafoodList.get(j).contains("Porgy") && seafoodList.get(k).contains("Porgy")) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Porgy Meuniere", "Tabantha Wheat", "Goat Butter", seafoodList.get(i), seafoodList.get(j), seafoodList.get(k), "Food", 8.0, -1, "Use other porgies or only one type of porgy for different special effects. Up to eight hearts.", 0);
                    }
                    for (int m = 0; m < seafoodList.size(); m++) {
                        db.insertRecipeWithLookups(sqLiteDatabase, "Seafood Meuniere", "Goat Butter", seafoodList.get(i), seafoodList.get(j), seafoodList.get(k), seafoodList.get(m), "Food", 4.0, 1, "Use other or more fish to increase hearts restored or add special effect.", 0);
                    }
                }
            }
        }
        db.insertRecipeWithLookups(sqLiteDatabase, "Creamy Heart Soup", "Fresh Milk", "Voltfruit", "Hydromelon", "Hearty Radish", "Hearty Radish", "Food", 13.0, -1, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Creamy Heart Soup", "Fresh Milk", "Voltfruit", "Hydromelon", "Hearty Radish", "0", "Food", 13.0, 0, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Fried Egg and Rice", "Hylian Rice", "Bird Egg", "0", "0", "0", "Food", 4.0, 0, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Hot Buttered Apple", "Apple", "Goat Butter", "0", "0", "0", "Food", 2.0, 0, null, 0);


        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "0", "0", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Hylian Rice", "0", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Hylian Rice", "Hylian Rice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Hylian Rice", "Goron Spice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Hylian Rice", "Goat Butter", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);

        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goron Spice", "0", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goron Spice", "Goron Spice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goron Spice", "Goat Butter", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goron Spice", "Hylian Rice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);


        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goat Butter", "0", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goat Butter", "Goat Butter", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goat Butter", "Hylian Rice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Curry Pilaf", "Goron Spice", "Goat Butter", "Hylian Rice", "Goat Butter", "Goron Spice", "Food", 6.0, -1, "You can use any number of these ingredients.", 0);


        db.insertRecipeWithLookups(sqLiteDatabase, "Omelet", "Bird Egg", "0", "0", "0", "0", "Food", 2.0, 1, "Add more ingredients to increase hearts restored and add various effects.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Omelet", "Bird Egg", "Bird Egg", "0", "0", "0", "Food", 2.0, 1, "Add more ingredients to increase hearts restored and add various effects.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Omelet", "Bird Egg", "Bird Egg", "Bird Egg", "0", "0", "Food", 2.0, 1, "Add more ingredients to increase hearts restored and add various effects.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Omelet", "Bird Egg", "Bird Egg", "Bird Egg", "Bird Egg", "0", "Food", 2.0, 1, "Add more ingredients to increase hearts restored and add various effects.", 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Omelet", "Bird Egg", "Bird Egg", "Bird Egg", "Bird Egg", "Bird Egg", "Food", 2.0, 1, "Add more ingredients to increase hearts restored and add various effects.", 0);

        db.insertRecipeWithLookups(sqLiteDatabase, "Pepper Steak", "Mighty Thistle", "Raw Bird Drumstick", "0", "0", "0", "Food", 3.0, 0, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Plain Crepe", "Fresh Milk", "Bird Egg", "Tabantha Wheat", "Cane Sugar", "Goat Butter", "Food", 5.0, 0, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Seafood Paella", "Hylian Rice", "Goat Butter", "Rock Salt", "Mighty Porgy", "Hearty Blueshell Snail", "Food", 12.0, 0, null, 0);
        db.insertRecipeWithLookups(sqLiteDatabase, "Wheat Bread", "Tabantha Wheat", "Rock Salt", "0", "0", "0", "Food", 2.0, 0, null, 0);

        db.insertRecipeWithLookups(sqLiteDatabase, "Milk", "Fresh Milk", "0", "0", "0", "0", "Food", 3.0, 0, "Add unknown extra ingredients to increase the hearts restored or add a special effect.", 0);


    }
}
