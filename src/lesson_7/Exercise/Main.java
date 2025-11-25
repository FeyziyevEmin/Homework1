package lesson_7.Exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personArraylist = new ArrayList<>();
        List<Person> personLinkedList = new LinkedList<>();

        Person person = new Person(1,"Emin", "Feyziyev");
        Person person1 = new Person(2,"Ilkin", "Baxsiyeev");
        Person person2 = new Person(3,"Mamed", "Magerremov");

        personArraylist.add(person);
        personArraylist.add(person1);
        personArraylist.add(person2);

        personLinkedList.add(person);
        personLinkedList.add(person1);
        personLinkedList.add(person2);

        Collections.sort(personArraylist);
//        for (Person person3 : )


    }
}
