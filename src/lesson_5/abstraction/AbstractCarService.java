package lesson_5.abstraction;


public abstract class AbstractCarService {
    public final String name;
    public final String destination;
    public final String date;

    protected AbstractCarService(String name, String destination, String date) {
        this.name = name;
        this.destination = destination;
        this.date = date;
    }

    public abstract void repair();

    public void changeTires(){
        System.out.println("Changing tires");
    }

    public static void paint(){
        System.out.println("Painting car");
    }

    public static void makeDiagnosting(){
        System.out.println("Diagnosting a car");
    }
}
