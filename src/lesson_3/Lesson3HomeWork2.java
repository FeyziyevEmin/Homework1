package lesson_3;

public class Lesson3HomeWork2 {
    public static void main(String[] args) {

        int mainDioganalSum = 0;
        int secondDioganalSum = 0;

        int[][] matrix = {
                {7, 2, 7},
                {4, 7, 6},
                {9, 8, 8}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (i == j) {
                    mainDioganalSum += matrix[i][j];
                }
                if (i + j == matrix[i].length - 1) {
                    secondDioganalSum += matrix[i][j];
                }
            }
        }
        System.out.println("Esas dioganallarin cemi: " + mainDioganalSum);
        System.out.println("Komekci dioqanallarin cemi: " + secondDioganalSum);
    }
}
