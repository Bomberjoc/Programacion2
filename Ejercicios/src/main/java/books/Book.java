
package books;

public class Book {
    String title;
    int id;
    String genre;
    int quantity;
    int[][] codes= new int[10][5];
    
    public Book(String title, int id, String genre, int quantity) {
        this.title = title;
        this.id = id;
        this.genre = genre;
        this.quantity = quantity;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    boolean disponibility(){
        return 0==quantity;
    }
}
