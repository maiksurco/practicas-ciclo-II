import creación.Producto;
import entities.Person;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("HOLA MUNDO JAVA");
        Person p = new Person();
        p.setName("David "+p);
        p.setSex("M");
        System.out.println("sexo= "+ p.getSex() );
        p.laugh();

        Person p2 = new Person("Gloria","F");
        System.out.println("sexo= "+ p2.getSex() );
        p2.laugh();

         System.out.println("---------------nuevo agregado----------------");
        Producto proc=new Producto();
        proc.setProducto("LAVADORA");
        proc.setCosto("119.90 SOLES");
        System.out.println("COSTO = "+ proc.getCosto() );
        System.out.println("PRODUCTO = "+ proc.getProducto());
       
    }
}