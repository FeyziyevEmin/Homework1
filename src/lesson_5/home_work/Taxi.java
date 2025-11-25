package lesson_5.home_work;

public class Taxi extends Transport implements InterfaceTransport {
    public Taxi(double ratePerKm, double speed) {
        super(ratePerKm, speed);
    }

    public Taxi() {
        super(2,100);
    }

    @Override
    public double calculateFare(double distance) {

        return distance * getRatePerKm();
    }

    @Override
    public double calculateFare(double distance, int passangers) {
        double fare = calculateFare(distance);

        if (passangers > 1){
            fare += (passangers - 1) * 2.0;
        }
            return fare;
    }

    @Override
    public double calculateTime(double distance) {

        return distance / getSpeed();
    }

    @Override
    public String getTransportInfo(int passangers) {

        return "Taxi → Speed: " + getSpeed() + " km/h | Rate per km: " + getRatePerKm() + " AZN | Passengers: " + passangers;
    }
}
