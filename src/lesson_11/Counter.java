package lesson_11;

public class Counter {
    private int count;

    public void increment() {
      synchronized (this) {
          count++;
          System.out.println("Count is " + count);
        }


    }
}
