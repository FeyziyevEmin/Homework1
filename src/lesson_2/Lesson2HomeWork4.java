package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int a = scanner.nextInt();
        int b = a;
        int c = 0;

        while (a != 0) {
            int qaliq = a % 10;
            c = c * 10 + qaliq;
            a = a / 10;
        }

        if(b==c){
            System.out.println("The number you entered is a palindrome.");
        }else {
            System.out.println("The number you entered is not a palindrome.");
        }
    }
}
