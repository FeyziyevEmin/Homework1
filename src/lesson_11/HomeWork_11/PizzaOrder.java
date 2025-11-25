package lesson_11.HomeWork_11;

public class PizzaOrder extends Thread {
    private final int orderId;
    private long totalTime;


    public PizzaOrder(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        preparePizza();
        bakePizza();
        deliverPizza();

        long end = System.currentTimeMillis();
        totalTime = (end - start) / 1000;

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Pizza delivered!");
            System.out.println("[Order #" + orderId + "] Total time: " + totalTime + " seconds\n");
        }
    }


    private void deliverPizza() {
        int time = getRandom(2, 5);

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Delivering pizza to customer...");
        }

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Pizza delivered!");
        }
    }

    private void bakePizza() {
        int time = getRandom(3, 6);

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Baking pizza...");
        }

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Baking complete.");
        }
    }

    private void preparePizza() {
        int time = getRandom(1, 3);

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Preparing pizza...");
        }

        try {
            Thread.sleep(time * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (System.out) {
            System.out.println("[Order #" + orderId + "] Preparation complete.");
        }
    }

    private int getRandom(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public int getIdOrder() {
        return orderId;
    }

    public long getTotalTime() {
        return totalTime;
    }
}

