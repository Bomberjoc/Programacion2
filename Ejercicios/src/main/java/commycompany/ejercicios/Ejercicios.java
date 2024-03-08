
package commycompany.ejercicios;
import books.Book;
import java.util.*;
import books.Person;
public class Ejercicios {

    public static void main(String[] args) {
        
        Book book1=new Book("Boulevard",001,"Romance",3);
        Book book2=new Book("Maze Runner",002,"Distopía",5);
        Book book3=new Book("A traves de mi ventana",003,"Romance",6);
        Book book4=new Book("Rey Arruinado",004,"Fantasía",1);
        Book book5=new Book("Ready Player One",005,"Ciencia Ficcion",8);
        Book[] inventory = {book1,book2,book3,book4,book5};
        
        Person person1=new Person();
        
        Person[] people={person1};
        
        menu(inventory, people);
        
        
        
    }
    public static void menu(Book[] inventory, Person[] people){
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Id       Nombre");
        for(Book i:inventory){ 
            System.out.println(i.getId()+"      "+i.getTitle()+"("+i.getQuantity()+")");
        }
        System.out.println("------------------------------------------------------------------------");
        actionBook(inventory, people);
    }
    public static void actionBook(Book[] inventory,Person[] people){
        int code;
        Scanner cap=new Scanner(System.in);
        Scanner nam=new Scanner(System.in);
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Pedir un libro");
        System.out.println("2. Entregar un libro");
        System.out.println("3. Verificar que libros he pedido");
        System.out.println("4. Salir");
        int a=cap.nextInt();
        switch (a){
            case 1:
                System.out.println("Escriba el código del libro que desea");
                int c=cap.nextInt();
                boolean b=false;
                int count=0;
                for(Book i:inventory){
                    count ++;
                    if(c==i.getId()) {
                        int x=i.getQuantity();
                        count = 0;
                        b=true;
                        if(x>0){
                            System.out.println("Ingrese su código");
                            code=cap.nextInt();
                            people[0].setCode(code);
                            System.out.println("Ingrese su Nombre y Apellido");
                            String name=nam.nextLine();
                            people[0].setName(name);
                            System.out.println("Tiene que regresar el libro en 7 días a más tardar");
                            i.setQuantity(x-1);
                            people[0].setId_books[0](1);
                            
                            menu(inventory, people);
                        }
                        else{
                            System.out.println("No hay unidades disponibles");
                            menu(inventory, people);
                        }
                    }
                    else{
                        if(count==inventory.length && b==false){
                            System.out.println("No existe ese código");
                        }
                    }
                }
                break;
            case 2:
                System.out.println("Ingrese la id del libro que desea entrega");
                int ide=cap.nextInt();
                System.out.println("Ingrese su código");
                code=cap.nextInt();
                break;
            case 3:
                
                break;
            default:
        }
        
    }
}
