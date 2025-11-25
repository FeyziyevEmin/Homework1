package lesson_5;

public class Lesson5MethodOverloading {
    public void drive(int distance, String name) {
        System.out.println("Driving" + distance + "miles on" + name);
    }

    public void drive(String name, int distance) {
        System.out.println("Driving" + distance + "miles on" + name);
    }

    public void drive(String name) {
        System.out.println("Name" + name);
    }
    public static String monday = "MONDAY";

    public static void main(String[] args) {
        System.out.println(DaysOfWeek.FRIDAY.getIndex());
    }
}
