import java.util.Scanner;

import creación.Producto;
import entities.Person;
import entities.data.PersonData;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        PersonData data=new PersonData();
        

        Scanner input = new Scanner(System.in);
        //System.out.println("Ingrese nombre:");
        //String name= input.nextLine();
        //System.out.println("Escribiste: "+name);
        
        int opt = 0;
        do{
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1: System.out.println("opcion 1 ");
                Person p = new Person();
                System.out.println("ingrese nombre: ");
                p.setName(input.nextInt());
                System.out.println("ingrese sexo: ");
                p.setSex(input.nextInt());

                System.out.println("getName= "+ p.getName()  + "sex= "+ p.getSex());
                p.laugh();
                break;
                case 2: System.out.println("opcion 1 ");
                break;

                default: System.out.println("error.....verifique sus opciones");
            }
        }while(opt != 0);
}
}