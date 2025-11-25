package lesson_7.HomeWork_7;

import java.nio.Buffer;
import java.util.*;

public class Simulation {
    public static void main(String[] args) {

        Random random = new Random();

        BusStop busStop1 = new BusStop();
        BusStop busStop2 = new BusStop();
        BusStop busStop3 = new BusStop();

        busStop1.addPassenger(new Passanger("Aysel", true));
        busStop1.addPassenger(new Passanger("Akif", false));
        busStop1.addPassenger(new Passanger("Zamin", false));

        busStop2.addPassenger(new Passanger("Natiq", false));
        busStop2.addPassenger(new Passanger("Vaqif", true));
        busStop2.addPassenger(new Passanger("Ayten", true));

        busStop3.addPassenger(new Passanger("Mehemmed", true));
        busStop3.addPassenger(new Passanger("Eli", false));
        busStop3.addPassenger(new Passanger("Rustem", false));

        Bus bus = new Bus();

        List<BusStop> busStopList = Arrays.asList(busStop1, busStop2, busStop3);

        for (int i = 0; i < busStopList.size(); i++) {
            BusStop currentStop = busStopList.get(i);

            System.out.println("\n Stop " + (i + 1) + " çatdı!");

            int numberToLeave = random.nextInt(2) + 1;

            for (int j = 0; j < numberToLeave && !bus.passangersList.isEmpty(); j++) {
                Passanger randomPassanger = bus.passangersList.get(random.nextInt(bus.passangersList.size()));
                bus.removePassanger(randomPassanger);
                System.out.println(randomPassanger.getName() + " avtobusdan düşdü.");
            }

            Queue<Passanger> queue = new LinkedList<>();

            for (Passanger p : currentStop.passangersQueue) {
                if (p.isPriority()) {
                    queue.add(p);
                }
            }

            for (Passanger p : currentStop.passangersQueue) {
                if (!p.isPriority()) {
                    queue.add(p);
                }
            }

            while (!queue.isEmpty() && bus.passangersList.size() < 5) {
                Passanger next = queue.poll();
                bus.boardPassanger(next);
            }

            System.out.println(" Stop " + (i + 1) + " bitdi.");
            System.out.println("Avtobusdakı sərnişinlər:");
            bus.showPassangers();
        }

        System.out.println("\n Simulyasiya bitdi.");
    }
}

