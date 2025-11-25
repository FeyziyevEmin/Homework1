package lesson_5.home_work;

public interface InterfaceTransport {
    double calculateFare(double distance);
    double calculateFare(double distance, int passangers);
    double calculateTime(double distance);
    String  getTransportInfo(int passangers);

}
