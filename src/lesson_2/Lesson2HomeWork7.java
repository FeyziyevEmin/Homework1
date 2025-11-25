package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int a = scanner.nextInt();
        int b = 1;
        if (a <= 0) {
            System.out.println("Factorial does not exist for negative numbers");
        } else {
            for (int i = 1; i <= a; i++) {
                b = i * b;
                System.out.println(b);
            }
        }
    }
}
