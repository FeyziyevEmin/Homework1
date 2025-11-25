package lesson_11;

public class NotficationService {
    public void notifyUser() throws InterruptedException {
        synchronized (this){
            System.out.println("trying to send notification user");
            this.wait();
            System.out.println("Sending notification to user");
        }
    }

    public void notifyAdmin(){
        System.out.println("trying to send nnotification admin");
        synchronized (this){
            System.out.println("sending notification to admin");
            this.notifyAll();
        }
    }
}
