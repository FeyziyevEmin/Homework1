package lesson_5.inheritance;


public abstract class AbstaractAnimal {

    private final String name;
    private final int age;

    protected AbstaractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void eat();

    public void sleep(){
        System.out.println();
    }
}
