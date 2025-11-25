package lesson_5.home_work;

import java.util.Scanner;

public class TransportManagmentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- TRANSPORT CALCULATOR -----");
        System.out.println("1. Taxi");
        System.out.println("2. Scooter");
        System.out.println("3. Bicycle");
        System.out.println("4. Bus");
        System.out.print("Select transport type (1-4): ");

        int choice = sc.nextInt();
        double distance;
        int passengers;

        switch (choice) {
            case 1: {
                Taxi taxi = new Taxi();  // final rate və speed artıq Taxi class-da verilib
                System.out.print("Enter distance (km): ");
                distance = sc.nextDouble();
                System.out.print("Enter number of passengers: ");
                passengers = sc.nextInt();

                System.out.println("\n" + taxi.getTransportInfo(passengers));
                System.out.println("Fare: " + taxi.calculateFare(distance, passengers) + " AZN");
                break;
            }

            case 2: {
                Scooter scooter = new Scooter();
                System.out.print("Enter distance (km): ");
                distance = sc.nextDouble();

                System.out.println("\n" + scooter.getTransportInfo(0));
                System.out.println("Fare: " + scooter.calculateFare(distance) + " AZN");
                break;
            }

            case 3: {
                Bicycle bike = new Bicycle();
                System.out.print("Enter distance (km): ");
                distance = sc.nextDouble();

                System.out.println("\n" + bike.getTransportInfo(0));
                System.out.println("Fare: " + bike.calculateFare(distance) + " AZN");
                break;
            }

            case 4: {
                Bus bus = new Bus();
                System.out.print("Enter distance (km): ");
                distance = sc.nextDouble();
                System.out.print("Enter number of passengers: ");
                passengers = sc.nextInt();

                System.out.println("\n" + bus.getTransportInfo(passengers));
                System.out.println("Fare: " + bus.calculateFare(distance, passengers) + " AZN");
                break;
            }

            default:
                System.out.println("Invalid choice! Please select between 1–4.");
        }
    }
}
