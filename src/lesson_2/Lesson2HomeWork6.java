package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers to print: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number");
        } else {
            int a = 0;
            int b = 1;

            for (int i = 1; i < n; i++) {
                int current;
                if (i == 1) {
                    current = a;
                } else if (i == 2) {
                    current = b;
                } else {
                    current = a + b;
                    a = b;
                    b = current;
                }

                if (current % 2 == 0) {
                    System.out.println(current + " (even)");
                } else {
                    System.out.println(current + " (odd)");

                }
            }

        }
    }
}
