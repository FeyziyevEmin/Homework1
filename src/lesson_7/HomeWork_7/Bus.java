package lesson_7.HomeWork_7;

import java.util.ArrayList;
import java.util.List;

public class Bus {
    final int capacity = 5;
    List<Passanger> passangersList = new ArrayList<>();

    void boardPassanger(Passanger passanger) {
        if (passangersList.size() < capacity) {
            passangersList.add(passanger);
            System.out.println(passanger.getName() + " Adli sernisin avtobusa mindi");
        } else {
            System.out.println("Avtobus artiq doludur " + passanger.getName() + " adli sernisin mine bilmedi");
        }
    }

    void removePassanger(Passanger passanger) {
        if (passangersList.remove(passanger)) {
            System.out.println(passanger.getName() + " Avtobusdan dusdu");
        } else {
            System.out.println(passanger.getName() + " Avtobusda tapilmadi");
        }
    }

    void showPassangers() {
        System.out.println("Avtobusdakı sərnişinlər:");
        for (Passanger passenger : passangersList) {
            System.out.println("- " + passenger);
        }
    }
    boolean isFull() {
        return passangersList.size() == capacity;
    }
}
