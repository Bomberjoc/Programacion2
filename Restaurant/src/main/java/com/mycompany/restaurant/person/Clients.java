
package com.mycompany.restaurant.person;
import com.mycompany.restaurant.values.CustomerRole;
import java.util.ArrayList;

public class Clients {
    private ArrayList<Customer> clientslist;
    
    public Clients(){
        this.clientslist=new ArrayList<>();
    }
    
    public Clients(ArrayList<Customer> clientslist) {
        this.clientslist = clientslist;
    }
    
    public void addCustomer(Customer client){
        this.clientslist.add(client);
    }
    
    public double getPricePerRole(String id){
        for(Customer client: clientslist){
            if(id==client.getId()){
                if(client.getRole()==CustomerRole.STUDENT){
                    return 0.3428;
                }else{
                    return 1;
                }
            }
        }
        return 1;
    }
}

