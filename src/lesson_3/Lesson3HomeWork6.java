package lesson_3;

public class Lesson3HomeWork6 {
    public static void main(String[] args){
        String string = "ala";
        StringBuilder ivers = new StringBuilder(string);
        ivers.reverse();
        if (ivers.toString().equals(string)){
            System.out.println("Daxil edilen String palindrome-dur");
        }else {
            System.out.println("Daxil edilen String palindrom deyil");
        }
    }
}
