package lesson_8;

import java.util.function.Predicate;

public class Practice {
    public static void main(String[] args) {
        Predicate<Integer> cut_tek = (eded) -> eded%2==0  ;

        boolean one = cut_tek.test(2);
        boolean two = cut_tek.test(3);

        System.out.println(one);
        System.out.println(two);
    }
}
