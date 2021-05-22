package com.company;

import java.util.ArrayList;

public class Menu {
    // Array lists to hold items
    private ArrayList<MenuItem> appetizers = new ArrayList<>();
    private ArrayList<MenuItem> main = new ArrayList<>();
    private ArrayList<MenuItem> dessert = new ArrayList<>();

    //constructors
    public Menu(){
        populateMenu();
    }

    //setters and getters


    //methods
    public void populateMenu (){
        //appetizers
        appetizers.add(new MenuItem("Bacon Jammin' Wings", 10.59, "Bone-In or Boneless wings topped with savory-sweet bacon jam, bacon crumbles, cherry peppers and BBQ brown sugar glaze. " +
                "Served on a bed of Yukon kettle chips.", "Appetizers", false));
        appetizers.add(new MenuItem("Fried Pickle Nickles", 6.29, "Golden-fried dill slices served with Campfire Mayo.", "Appetizers", false));
        //main dishes
        main.add(new MenuItem("Ensenada Chicken Platter", 14.89, "One or two ancho-grilled chicken breasts, house-made salsa and salsa-ranch dressing. " +
                "Served with choice of side.", "Main Dish", false));
        main.add(new MenuItem("Pub Mac & Cheese", 9.59, "Pasta, creamy cheese sauce, toasted crouton crumbs and Parmesan. " +
                "Served with choice of side.", "Main Dish", false));
        //desserts
        dessert.add(new MenuItem("Mountain High Mudd Pie", 8.49, "Chocolate and vanilla ice cream, layered with OREO® cookies, fudge, caramel and whipped cream.", "Dessert", false));
        dessert.add(new MenuItem("Gooey Chocolate Brownie Cake", 6.99, "Chocolate brownie cake with hot fudge and strawberry puree, served à la mode.", "Dessert", false));
    }
}
