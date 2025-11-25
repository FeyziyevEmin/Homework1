package lesson_2;

import java.util.Scanner;

public class Lesson2HomeWork1 {

    public static void main(String [] args){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Add to number: ");
        int a= scanner.nextInt();

        if(a>0){
            System.out.println("Our number is positive");
        }
        else if (a<0){
            System.out.println("Our number is negative");
        }else{
            System.out.println("Our number is zero");
        }



        Scanner scannerWeekDays= new Scanner(System.in);
        System.out.println("add to number from 1 to 7 ");
        int WeekDays=scannerWeekDays.nextInt();

        switch (WeekDays){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You added wrong number");
        }
    }
}
