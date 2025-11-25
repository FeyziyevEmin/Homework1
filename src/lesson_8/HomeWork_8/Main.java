package lesson_8.HomeWork_8;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CarRentalSystem carRentalSystem = new CarRentalSystem();
        Car car1 = new Car(1,"BMW", "X5",2025);
        Car car2 = new Car(2,"BMW", "X6",2025);
        Car car3 = new Car(3,"BMW", "X7",2025);

        Customer customer1 = new Customer(1,"Aylin","AZ123");
        Customer customer2 = new Customer(2,"Ayla","AZ435");
        Customer customer3 = new Customer(3,"Amin","AZ568");

        carRentalSystem.addCar(car1);
        carRentalSystem.addCar(car2);
        carRentalSystem.addCar(car3);

        carRentalSystem.rentCar(customer1,car1);
        carRentalSystem.rentCar(customer2,car2);

        carRentalSystem.showAllCars();

        carRentalSystem.showRentedCar();

        carRentalSystem.showNotRentCar();

        carRentalSystem.returnCar(customer1);

        carRentalSystem.showNotRentCar();

        carRentalSystem.showHistory();
    }
}
