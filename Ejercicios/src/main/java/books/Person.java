
package books;

public class Person {
    String name;
    int code;
    int id_books []= new int[3];
    int id_date []= new int[3];

    public Person(String name, int code) {
        this.name = name;
        this.code=code;
    }

    public Person() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getId_books() {
        return id_books;
    }

    public void setId_books(int[] id_books) {
        this.id_books = id_books;
    }

    public int[] getId_date() {
        return id_date;
    }

    public void setId_date(int[] id_date) {
        this.id_date = id_date;
    }
    
    
}
