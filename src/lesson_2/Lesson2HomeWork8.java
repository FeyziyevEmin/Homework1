package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            int fact = 1;


            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }

            sum += fact;
            number /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is a Strong number ");
        } else {
            System.out.println(original + " is not a Strong number ");
        }

    }
}
