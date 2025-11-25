package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();


        System.out.println("Enter your gender M or F: ");
        char gender = scanner.next().charAt(0);

        if(age<18){
            System.out.println("Access denied");
        } else if (gender=='M' || gender=='m') {
            System.out.println("Male access granted");
        } else if (gender=='F' || gender=='f') {
            System.out.println("Female access granted");
        }else {
            System.out.println("You have not entered the age or gender correctly.");
        }
    }
}
