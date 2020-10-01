package entities.data;

import java.util.ArrayList;
import java.util.List;
import entities.Person;

public class PersonData {
    List<Person> lis= new ArrayList<Person>();
    int id=0;
    public void create(Person p) {
        p.setId(++id);
        lis.add(p);
    }
    public List<Person> list(String filter) {
        return lis;
    }
    public Person get(int id) {
        int index=0;
        for (Person d : lis) {
            if (d.getId() == id ) {
                return lis.get(index);
            }
            index++;
        }
        return null;
    }
    public void getListElement(int id) {
        for (Person person: lis) {
            if (person.getId() == id) {
                System.out.println(person.getId() + "\t" + person.getName());
            }
        }
    }
    // update(Person, int): void
    public void delete(int id) {
        for (Person d : lis) {
            if (id == d.getId()) {
                lis.remove(d);
                System.out.println("Eliminado " + d.getName());
            }
        }
    }
    public void update(Person p) {
        int index=0;
        boolean b=false;
        for (Person d: lis) {
            if (d.getId() == p.getId()) {
                //d = p;
                lis.set(index, p);
                b=true;
                //break;
            }
            index++;
        }
        if (b)
            System.out.println("encontrado");
        else
        System.out.println("no encontrado");
    }
   
}
        



