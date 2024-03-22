
package com.mycompany.restaurant.person;
import com.mycompany.restaurant.values.CustomerRole;

public class Customer {
    CustomerRole role;
    String id;
    String fullname;

    public Customer(CustomerRole role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }

    public Customer() {
    }

    public String getId() {
        return id;
    }

    public CustomerRole getRole() {
        return role;
    }
    
    
    public void sellFood(){
        if(this.role!= CustomerRole.ADMINISTRATIVE){
            System.out.println("Qué se le perdió?");
            return;
        }
        System.out.println("Ya lo atiendo, papi");
    }
}
