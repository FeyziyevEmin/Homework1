package lesson_7.HomeWork_7;

import java.util.LinkedList;
import java.util.Queue;

public class BusStop {
    Queue<Passanger> passangersQueue = new LinkedList<>();

    void addPassenger(Passanger passanger){
        passangersQueue.add(passanger);
    }

    void removePassanger(){
        passangersQueue.poll();
    }

    void showPassangers(){
        for (Passanger passanger : passangersQueue){
            System.out.println(passanger);
        }
    }
}
