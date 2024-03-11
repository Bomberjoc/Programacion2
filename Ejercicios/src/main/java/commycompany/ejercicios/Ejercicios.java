
package commycompany.ejercicios;
import books.Book;
import java.util.*;
import books.Person;
public class Ejercicios {

    public static void main(String[] args) {
        //Creación de objetos Libros
        Book book1=new Book("Boulevard",001,"Romance",3);
        Book book2=new Book("Maze Runner",002,"Distopía",5);
        Book book3=new Book("A traves de mi ventana",003,"Romance",6);
        Book book4=new Book("Rey Arruinado",004,"Fantasía",1);
        Book book5=new Book("Ready Player One",005,"Ciencia Ficcion",8);
        Book[] inventory = {book1,book2,book3,book4,book5};
        
        //Creación de objetos Persona
        Person person1=new Person();
        
        Person[] people={person1};
        
        menu(inventory, people);
    
    }
    public static void menu(Book[] inventory, Person[] people){
        //Clase para mostrar el menú
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Id       Nombre");
        for(Book i:inventory){ 
            System.out.println(i.getId()+"      "+i.getTitle()+"("+i.getQuantity()+")");
        }
        System.out.println("------------------------------------------------------------------------");
        actionBook(inventory, people);
    }
    public static void actionBook(Book[] inventory,Person[] people){
        //Clase para acciones
        int code;
        Scanner cap=new Scanner(System.in);
        Scanner nam=new Scanner(System.in);
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1. Pedir un libro");
        System.out.println("2. Entregar un libro");
        System.out.println("3. Verificar que libros he pedido");
        System.out.println("4. Salir");
        int a=0;
        a=cap.nextInt();
        switch (a){
            case 1 -> {
                System.out.println("Escriba el código del libro que desea");
                int c=cap.nextInt();
                boolean b=false;
                int count=0;
                //Bucle para buscar el libro
                for(Book i:inventory){
                    count ++;
                    if(c==i.getId()) {
                        int x=i.getQuantity();
                        count = 0;
                        b=true;
                        if(x>0){
                            System.out.println("Ingrese su código 1");
                            code=cap.nextInt();
                            people[0].setCode(code);
                            System.out.println("Ingrese su Nombre y Apellido");
                            String name=nam.nextLine();
                            people[0].setName(name);
                            int []vec_idbooks=people[0].getId_books();
                            int countids=0;
                            //Bucle para revisar que tengas espacio para pedir libros
                            for(int revid:vec_idbooks){
                                if(revid==0){
                                    vec_idbooks[countids]= i.getId();
                                    i.setQuantity(x-1);
                                    people[0].setId_books(vec_idbooks);
                                    System.out.println("El estudiante con código "+people[0].getCode()+" pidio el libro "+i.getTitle()+" con id número "+ i.getId());
                                    System.out.println("Tiene que regresar el libro en 7 días a más tardar");
                                    menu(inventory, people);
                                }
                                else if(countids==2){
                                    System.out.println("Ha superado el máximo de libros que puede retirar");
                                    countids=-1;
                                    menu(inventory, people);
                                }
                                countids++;
                            }
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
            }
            case 2 -> {
                int countid=0;
                int countcode=0;
                System.out.println("Ingrese la id del libro que desea entregar");
                int ide=cap.nextInt();
                System.out.println("Ingrese su código 2");
                code=cap.nextInt();
                int vecprueba []=people[0].getId_books();
                for(int i:vecprueba){
                    countid++;
                    if(ide==i){
                        if(people[0].getCode()==code){
                            vecprueba[countid-1]=0;
                            people[0].setId_books(vecprueba);
                            for(Book busc:inventory){
                                if(ide==busc.getId()){
                                    int temp=busc.getQuantity();
                                    busc.setQuantity(temp+1);
                                    menu(inventory, people);
                                }
                            }
                        }
                        else if(countcode>3){
                            System.out.println("Ese no es su código");
                            menu(inventory, people);
                        }
                    }
                    else if(countid>3){
                        System.out.println("Ese libro no ha sido prestado");
                        menu(inventory, people);
                    }
                }
            }

            case 3 -> {
                int codver;
                System.out.println("Ingrese su código 3");
                codver=cap.nextInt();
                if(codver==people[0].getCode()){
                    int [] idver=people[0].getId_books();
                    for(int revi=0;revi>idver.length;revi++){
                        System.out.println(idver[revi]);
                        System.out.println("Hola1");
                    }
                }
            }
            default -> {
            }
        }
        
    }
}
