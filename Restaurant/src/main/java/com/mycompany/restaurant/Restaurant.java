
package com.mycompany.restaurant;
import com.mycompany.restaurant.person.Customer;
import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.values.CustomerRole;
import com.mycompany.restaurant.values.DishType;


public class Restaurant {

    public static void main(String[] args) {
        
        Customer student = new Customer(CustomerRole.STUDENT,"asd","Jose Torres");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"aed","Cocinera fastidiosa");
        administrative.sellFood();
        
        Menu menu = new Menu();

        Dish bf1=new Dish(DishType.BREAKFAST,"Sandwich","Sandwich de pollo con jugo de guanabana",35,7000);
        Dish bf2=new Dish(DishType.BREAKFAST,"Pan con huevo revuelto","Pan, huevos revueltos y café",15,7000);
        Dish bf3=new Dish(DishType.BREAKFAST,"Cereal","Cereal zucaritas bien rico con leche y juguito de guanaba si o qué",20,7000);
        Dish lun1=new Dish(DishType.LUNCH,"Pastas a la bolognesa","Pastas frescas",88,7000);
        
        menu.addDish(bf1);
        menu.addDish(bf2);
        menu.addDish(bf3);
        menu.addDish(lun1);

        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        
    }
}
