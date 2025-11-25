package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int original = number;
        int sum = 0;


        int temp = number;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }


        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;


            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }


        if (sum == original) {
            System.out.println(original + " is an Armstrong number ");
        } else {
            System.out.println(original + " is not an Armstrong number ");
        }
    }
}
