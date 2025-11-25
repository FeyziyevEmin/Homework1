package lesson_7.Exercise;

public class Person implements Comparable<Person> {
   private int id;
   private String name;
   private String surName;

    public Person(int id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }




    @Override
    public int compareTo(Person o) {
        return this.id - o.id;
    }
}
