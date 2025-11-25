package lesson_12.HomeWork_12;

public class Main {
    public static void main(String[] args) {
            NewsPublisher publisher = new NewsPublisher();

            Subscriber s1 = new Subscriber("Subscriber-1", publisher);
            Subscriber s2 = new Subscriber("Subscriber-2", publisher);
            Subscriber s3 = new Subscriber("Subscriber-3", publisher);

            publisher.addSubscriber(s1);
            publisher.addSubscriber(s2);
            publisher.addSubscriber(s3);

            new Thread(s1).start();
            new Thread(s2).start();
            new Thread(s3).start();

            int count = 1;

            while (true) {
                publisher.publishNews("Xəbər #" + count);
                count++;
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

