
package com.mycompany.restaurant.food;

import com.mycompany.restaurant.values.DishType;
import java.util.ArrayList;



public class Menu {
    private ArrayList<Dish> dishlist;


    public Menu(){
        this.dishlist=new ArrayList<>();
    }
    
    public Menu(ArrayList<Dish> dishlist) {
        this.dishlist = dishlist;
    }
    
    public void addDish(Dish dish){
        this.dishlist.add(dish);
    }
    
    public ArrayList<String> getDishesPerType(DishType dishType){
        ArrayList<String> foundDishes=new ArrayList<>();
        
        for(Dish dish:dishlist){
            if(dish.getType()==dishType){
                foundDishes.add(dish.getName());
            }
        }
        
        return foundDishes;
        
    }
}
