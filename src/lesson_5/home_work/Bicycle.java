package lesson_5.home_work;

public class Bicycle extends Transport implements InterfaceTransport {
    public Bicycle(double ratePerKm, double speed) {
        super(ratePerKm, speed);
    }

    public Bicycle(){
        super(0.1,15);
    }

    @Override
    public double calculateFare(double distance) {

        return distance * getRatePerKm();
    }

    @Override
    public double calculateFare(double distance, int passangers) {

        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {

        return distance / getSpeed();
    }

    @Override
    public String getTransportInfo(int passangers) {

        return "Bicycle → Speed: " + getSpeed() + " km/h | Rate per km: " + getRatePerKm() + " AZN | Passengers: " + passangers;
    }
}
