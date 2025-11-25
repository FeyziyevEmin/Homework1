package lesson_5.home_work;

public class Scooter extends Transport implements InterfaceTransport {
    public Scooter(double ratePerKm, double speed) {
        super(ratePerKm, speed);
    }

    public Scooter(){
        super(0.2,25);
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

        return "Scooter → Speed: " + getSpeed() + " km/h | Rate per km: " + getRatePerKm() + " AZN | Passengers: " + passangers;
    }
}
