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
            System.out.println(
            "1 = List \n"+
            "2 = New \n"+
            "3 = Delete \n"+
            "4 = lista por id \n"+
            "5 = get  persona \n"+
            "6 = update \n"+
            "0 = Exit \n"+
            "Choice option: ");
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
                    System.out.println("get persona ");                    
                    System.out.print("id: ");
                    Person d = data.get(input.nextInt());
                    System.out.println("id: "+d.getId());
                    System.out.println("id: "+d.getName());
                    break;
                    case 6:
                    System.out.println("update persona ");                    
                    System.out.print("id: ");
                    Person de = data.get(input.nextInt());
                    System.out.println("name current: "+de.getName());
                    input.nextLine(); // Limpiar el buffer
                    System.out.print("new name: ");
                    de.setName(input.nextLine());
    
                    data.update(de);
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (opt != 0);

}
}
     