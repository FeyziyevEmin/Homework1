package lesson_3;

public class Lesson3HomeWork7 {
    public static void main(String[] args) {
        String sentence = "aaa bbb ccc ddd abcda";
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(" ", "");

        int[] count = new int[256];

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            count[c]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " - " + count[i]);
            }
        }
    }
}
