package lesson_11;

import javax.management.monitor.CounterMonitor;
import java.time.LocalDateTime;
import java.util.Comparator;

public class Practice {
    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }

            counter.increment();
        };
        Thread t1 = new Thread(runnable, "Mythread");
        Thread t2 = new Thread(runnable, "Mythread");
        Thread t3 = new Thread(runnable, "Mythread");
        Thread t4 = new Thread(runnable, "Mythread");
        Thread t5 = new Thread(runnable, "Mythread");
        Thread t6 = new Thread(runnable, "Mythread");

//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();

//        ThreadWithExtend threadWithExtend = new ThreadWithExtend();
//        ThreadWithRunable threadRunable = new ThreadWithRunable();
//        Thread thread = new Thread(threadRunable);
//        Runnable runnable = () -> {
//            System.out.println("Running runable");
//        };
//
//        Thread t = new Thread(() -> {
//            System.out.println("Running Thread");
//        }, "MyThread");
//
//        t.start();
//        thread.start();
//        threadWithExtend.start();


        NotficationService notficationService = new NotficationService();

        Thread threadNotifyUser = new Thread(() -> {
            try {
                notficationService.notifyUser();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadNotifyAdmin = new Thread(()->{
            notficationService.notifyAdmin();
        });

//        threadNotifyUser.start();
//        threadNotifyAdmin.start();

        Thread thread1 = new Thread(()->{
            System.out.println("A " + LocalDateTime.now());
        });

        Thread thread2 = new Thread(()->{
            try {
                thread1.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("B " + LocalDateTime.now());
        });

        Thread thread3 = new Thread(()->{
            try {
                thread2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("C " + LocalDateTime.now());
        });

        Thread thread4 = new Thread(()->{
            try {
                thread3.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("D " + LocalDateTime.now());
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();



        


    }
}
