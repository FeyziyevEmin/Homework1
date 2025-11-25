package lesson_6;

public class MemberInnerClassMain {
    public static void main(String[] args) {
        Car car = new Car(4,"red", "BMW");
        Car.Engine engineFromCar = car.new Engine(1000);
        Car.Engine engine = new Car(4,"black", "Merc").new Engine(1000);

        engine.start();
    }
}
