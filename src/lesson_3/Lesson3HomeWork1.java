package lesson_3;

public class Lesson3HomeWork1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 1, 7, 10,77,0,-1,-10};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("En boyuk eded: " + max);
        System.out.println("En kicik eded: " + min);
    }
}

