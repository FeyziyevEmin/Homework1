package lesson_5.abstraction;

import java.math.BigDecimal;

public interface InterfaceCarService {
    public static final String NAME="Car service";

     void repair();

    default void changeTires(){
        System.out.println("Changing tires");
    }

     private BigDecimal paint(){
        return BigDecimal.TEN;
    }
}
