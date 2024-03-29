
package com.mycompany.restaurant.food;
import com.mycompany.restaurant.values.DishType;

public class Dish {
    private DishType type;
    private String name;
    private String ingredients;  // ToDo: Convertir a una Lista
    private double price;
    private int qty;

    public Dish(DishType type, String name, String ingredients, double price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }

    public Dish() {
    }

    public int getPrice(double desc) {
        
        return (int) Math.ceil(price*desc);
    }
    
    public DishType getType() {
        return this.type;
    }

    public String getName() {
        return name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
    
    
}
