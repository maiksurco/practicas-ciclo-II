import java.util.Scanner;


import entities.Person;
import entities.data.PersonData;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        PersonData data = new PersonData();
        Scanner input = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("4 Get by Id ");
            System.out.println("5 update ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1:
                    System.out.println("Listado de personas ");
                    for (Person d : data.list("")) {
                        System.out.println(d.getId() + "\t" + d.getName());
                    }
                    break;
                case 2:
                    System.out.println("Nueva persona ");
                    Person p= new Person();
                    System.out.print("name: ");
                    p.setName(input.nextLine());

                    data.create(p);
                    break;
                case 3:
                    System.out.println("Eliminar persona ");                    
                    System.out.print("id: ");
                    data.delete(input.nextInt());
                    break;
                case 4:
                    System.out.println("lista por Id");
                    data.getListElement(input.nextInt());
                    break;
                case 5:
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opt != 0);

}
}
     