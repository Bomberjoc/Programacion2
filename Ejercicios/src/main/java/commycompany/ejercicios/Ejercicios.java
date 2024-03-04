
package commycompany.ejercicios;
import books.Book;
import java.util.*;
public class Ejercicios {

    public static void main(String[] args) {
        Book book1=new Book("Boulevard",001,"Romance",3);
        Book book2=new Book("Maze Runner",002,"Distopía",5);
        Book book3=new Book("A traves de mi ventana",003,"Romance",6);
        Book book4=new Book("Rey Arruinado",004,"Fantasía",1);
        Book book5=new Book("Ready Player One",005,"Ciencia Ficcion",8);
        Book[] inventory = {book1,book2,book3,book4,book5};
        
        menu(inventory);
        
        
    }
    public static void menu(Book[] inventory){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Id       Nombre");
        for(Book i:inventory){ 
            System.out.println(i.getId()+"      "+i.getTitle()+"("+i.getQuantity()+")");
        }
        System.out.println("------------------------------------------------------------------------");
        actionBook(inventory);
    }
    public static void actionBook(Book[] inventory){
        Scanner cap=new Scanner(System.in);
        System.out.println("Escriba el código del libro que desea");
        int c=cap.nextInt();
        for(Book i:inventory){
            if(c==i.getId()) {
                int x=i.getQuantity();
                i.setQuantity(x-1);
                menu(inventory);
            }
            else{
                System.out.println("Error");
            }
        }
    }
}
