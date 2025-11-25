package lesson_8.HomeWork_8;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CarRentalSystem {
    Set<Car> allCar = new HashSet<>();
    Set<Car> notRentCar = new HashSet();
    Map<Customer, Car> rentCar = new Hashtable<>();
    Map<Car, LocalDateTime> startRentCar = new Hashtable<>();
    Map<Car, LocalDateTime> historyRentCar = new Hashtable<>();

    public CarRentalSystem(){

    }

    public void addCar(Car car){
        allCar.add(car);
        notRentCar.add(car);
    }

    public void showAllCars(){
        System.out.println("Butin masinlar");
        for (Car car : allCar){
            System.out.println(car);
        }
    }

    public void showRentedCar(){
        System.out.println("Icarede olan masinlar");
        for (Map.Entry<Customer, Car> entry : rentCar.entrySet()){
            System.out.println(entry.getValue() + " -> " + entry.getKey().getNameCustomer());
        }
    }

    public void showNotRentCar(){
        System.out.println("Icarede olamayan masinlar");
        for (Car car : notRentCar){
            System.out.println(car);
        }
    }

    public void rentCar(Customer customer, Car car){
        if (notRentCar.contains(car)){
            rentCar.put(customer,car);
            startRentCar.put(car,LocalDateTime.now());
            notRentCar.remove(car);
            System.out.println("Masin " + customer.getNameCustomer() + " adli istifadeci terefinden icareye goturuldu");
        }
    }

    public void returnCar(Customer customer){
        Car car = rentCar.get(customer);
        if (car != null){
            rentCar.remove(customer);
            notRentCar.add(car);
            historyRentCar.put(car,LocalDateTime.now());
            System.out.println(car + " markali masin " + customer.getNameCustomer() + " adli musteri terfinden geri qaytarildi");
        }else {
            System.out.println("Icarede bele bir masin yoxdur");
        }
    }

    public void showHistory(){
        System.out.println("icare tarixcesi");
        for (Map.Entry<Car, LocalDateTime> entry : historyRentCar.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
