
package com.mycompany.restaurant;
import com.mycompany.restaurant.person.Customer;
import com.mycompany.restaurant.food.Dish;
import com.mycompany.restaurant.food.Menu;
import com.mycompany.restaurant.values.CustomerRole;
import com.mycompany.restaurant.values.DishType;
import java.util.Scanner;
import com.mycompany.restaurant.person.Clients;

public class Restaurant {

    public static void main(String[] args) {
        Scanner cap=new Scanner(System.in);
        Scanner fras=new Scanner(System.in);

//        Customer student = new Customer(CustomerRole.STUDENT,"asd","Jose Torres");
//        student.sellFood();
//        
//        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"aed","Cocinera fastidiosa");
//        administrative.sellFood();
        Menu menu = new Menu();

        Dish bf1=new Dish(DishType.BREAKFAST,"Sandwich","Sandwich de pollo con jugo de guanabana",7000,35);
        Dish bf2=new Dish(DishType.BREAKFAST,"Pan con huevo revuelto","Pan, huevos revueltos y café",7000,15);
        Dish bf3=new Dish(DishType.BREAKFAST,"Cereal","Cereal zucaritas bien rico con leche y juguito de guanaba si o qué",7000,20);
        Dish lun1=new Dish(DishType.LUNCH,"Pastas a la bolognesa","Pastas frescas",7000,88);
        Dish lun2=new Dish(DishType.LUNCH,"Bandeja paisa","Arroz, frijoles, tajada, huevo frito, chorizo y carne de res",7000,95);
        Dish lun3=new Dish(DishType.LUNCH,"Pollo frito","Arroz, frijoles, tajada y pollo frito",7000,63);
        Dish din1=new Dish(DishType.DINNER,"Sandwich","Sandwich de pollo con jugo de guanabana",7000,33);
        Dish din2=new Dish(DishType.DINNER,"Arepa con huevo","Arepa con huevos revueltos",7000,23);
        Dish din3=new Dish(DishType.DINNER,"Tamal","Tamal de carne de cerdo",7000,15);
        
        menu.addDish(bf1);
        menu.addDish(bf2);
        menu.addDish(bf3);
        menu.addDish(lun1);
        menu.addDish(lun2);
        menu.addDish(lun3);
        menu.addDish(din1);
        menu.addDish(din2);
        menu.addDish(din3);
        
        Clients clients=new Clients();
        
        Customer student1 = new Customer(CustomerRole.STUDENT,"192202","Jose Torres");
        Customer administrative1 = new Customer(CustomerRole.ADMINISTRATIVE,"012","Cocinera fastidiosa");
        Customer teacher1 = new Customer(CustomerRole.TEACHER,"0158","Profesor Badwin");
        
        clients.addCustomer(student1);
        clients.addCustomer(administrative1);
        clients.addCustomer(teacher1);
        
        System.out.println("Dígite su código");
        String id=fras.nextLine();
        
        System.out.println("¿Qué tipo de comida desea comprar?");
        System.out.println("1.  Desayuno");
        System.out.println("2.  Almuerzo");
        System.out.println("3.  Cena");
        int a=cap.nextInt();
        switch(a){
            case 1 -> System.out.println(menu.getDishesPerType(DishType.BREAKFAST, (String) id));
            case 2 -> System.out.println(menu.getDishesPerType(DishType.LUNCH, (String) id));
            case 3 -> System.out.println(menu.getDishesPerType(DishType.DINNER,(String) id));
            default -> System.out.println("Error");
        }
        
    }
    public static void error(){
        System.out.println("Error");
    }
}
