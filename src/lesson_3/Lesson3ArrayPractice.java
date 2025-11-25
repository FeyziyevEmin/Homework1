package lesson_3;

import java.math.BigDecimal;

public class Lesson3ArrayPractice {
    public static void main(String[] args) {

        BigDecimal[] salaries = new BigDecimal[3];
        double[] percantages = {3.2, 5, 7.8};
        int[] ages = new int[]{1, 2, 3};
        long[] total = new long[3];

        for (int index = 0; index < percantages.length; index++) {
            System.out.println("pecantages" + percantages[1]);
        }

        for (int element : ages) {
            System.out.println(element);
        }
//
//        //tao dimensional array
//


//        short s[][]= new short[3][2];
//        byte b[][]= {
//                {5,6,2,7},
//                {4,4,3,7},
//                {12,54,55}
//        };
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < b[i].length; j++) {
//                System.out.println("ARRAY: " + b[i][j]);
//            }
//        }


//        int arr [] = new int[]{1,2,3};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i);
//        }
//        System.out.println("-----");
//
//        for (int element : arr) {
//            System.out.println(element);
//        }


//        for (int i = 0; i < total.length ; i++) {
//            total[i]= 2+i;
//            System.out.println(total[i]);
//        }


    }
}
