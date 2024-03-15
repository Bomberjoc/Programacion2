
package com.mycompany.restaurant;
import person.Customer;
import food.Dish;
import values.CustomerRole;


public class Restaurant {

    public static void main(String[] args) {
        
        Customer student = new Customer(CustomerRole.STUDENT,"asd","Jose Torres");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRole.ADMINISTRATIVE,"aed","Cocinera fastidiosa");
        administrative.sellFood();
        
        
//        Dish bf1=new Dish("Desayuno","Sandwich","Sandwich de pollo con jugo de guanabana",35,7000);
//        Dish bf2=new Dish("Desayuno","Pan con huevo revuelto","Pan, huevos revueltos y café",15,7000);
//        Dish bf3=new Dish("Desayuno","Cereal","Cereal zucaritas bien rico con leche y juguito de guanaba si o qué",20,7000);
//        Dish lun1=new Dish();
    }
}
