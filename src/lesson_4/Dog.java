package lesson_4;

public class Dog {
    public String name;
    public int age;

    static {
        System.out.println("First static block");
    }

    static {
        System.out.println("Second static block");
    }

    static {
        System.out.println("Third static block");
    }

    {
        System.out.println("First block");
    }

    {
        System.out.println("Second block");
    }

    {
        System.out.println("Third block");
    }

    Dog() {

    }

    Dog(String name) {
        this.name = name;
    }

    Dog(int age) {
        this.age = age;
    }

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    double calculate(double a, double b) {
        return a + b;
    }

    void nextYearAge(String name, int age){
        if (name.equals(Dog.this.name)){
            age=Dog.this.age+1;
        }
    }
}


