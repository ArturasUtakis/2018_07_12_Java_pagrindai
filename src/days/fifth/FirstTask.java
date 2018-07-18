package days.fifth;

import java.util.ArrayList;
import java.util.List;

public class FirstTask {
    public static void main(String[] args) {
        Person person = new Person("Arturas", "Utakis", 25, "Kaunas");
       /* person.setName("Arturas");
        person.setSurname("Utakis");
        person.setAge(25);
        person.setCity("Kaunas");*/

        List<Person> persons = new ArrayList<>();//listas
        persons.add(person);
        persons.add(new Person("Jonas", "Jonaitis", 100, "Vilnius"));//teisingas pvz
        print(persons);//iskvietimas
    }

    private static void print(List<Person> persons) {//metodas
        for (Person p : persons) {
            System.out.println(p.getCity());
        }

    }
}
