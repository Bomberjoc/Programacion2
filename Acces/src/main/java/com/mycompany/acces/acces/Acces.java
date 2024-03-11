package com.mycompany.acces.acces;

import people.Person;

public class Acces {

    public static void main(String[] args) {
        OtherClass other=new OtherClass();
        other.sayHello();
        
        Person person=new Person("Pepito","Perez",15);
        // person.createFullName("ads","asd");
        System.out.println(person.getFullname());
        System.out.println(person.getAge());
    }
}
