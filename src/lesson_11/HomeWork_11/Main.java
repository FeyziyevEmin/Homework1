package lesson_11.HomeWork_11;

import lesson_7.HomeWork_7.Simulation;

public class Main {
    public static void main(String[] args) {
        long simulationStart = System.currentTimeMillis();

        PizzaOrder[] orders = new PizzaOrder[5];

        for (int i = 0; i < 5; i++) {
            orders[i] = new PizzaOrder(i + 1);
            orders[i].start();
            synchronized (System.out){
                System.out.println("[Order #" + (i+1) + "] Started.");
            }
        }

        for (PizzaOrder order : orders){
            try {
                order.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        PizzaOrder fastest = orders[0];
        for (PizzaOrder order : orders){
            if (order.getTotalTime() < fastest.getTotalTime()){
                fastest = order;
            }
        }

        long simulationEnd = System.currentTimeMillis();
        long totalSimulationTime = (simulationEnd-simulationStart) / 1000;

        System.out.println("All orders completed!");
        System.out.println("Total simulation time: " + totalSimulationTime + " seconds");
        System.out.println("Fastest order: Order #" + fastest.getId() + " → " + fastest.getTotalTime() + " sec");

    }
}
