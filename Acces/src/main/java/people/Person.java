
package people;

public class Person {
    private String name;
    private String lastname;
    private String fullname;
    private int age;

   
    
    public Person(String name,String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        createFullName(name, lastname);
    }
    
    public Person() {
    }
    
    private void createFullName(String name,String lastname){
        this.fullname=name + " " + lastname;
    }

    public int getAge() {
        return age;
    }

  public String getFullname(){
      return fullname;
  }
    
   
    
}
