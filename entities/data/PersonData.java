package entities.data;

import java.util.List;
import java.util.ArrayList;
import entities.Person;

public class PersonData {
    List<Person> lis=new ArrayList<Person>();

    public void create(Person p){
        //ToDo
        System.out.println("create wye");
        lis.add(p);

    }
    public List<Person> list(String filter) {
        //ToDo
        System.out.println("list wye");
        return lis;
    }
    public Person get(int id){
        Person de=new Person();
        //ToDo
        System.out.println("get wye");
        return de;
    }

    public void Update(Person up) {
        //ToDo
        System.out.println("Update: que desea actualizar?");
        
    }
    public void delete (Person de){ 
        //ToDo
        System.out.println("delete: que desea borrar?");
        
    }
    //update(Person, int):void
    //delete(int): void
}


