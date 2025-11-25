package lesson_5.home_work;

public class Bus extends Transport implements InterfaceTransport {
    public Bus(double ratePerKm, double speed) {
        super(ratePerKm, speed);
    }

    public Bus(){
        super(0.6,60);
    }

    @Override
    public double calculateFare(double distance) {

        return distance * getRatePerKm();
    }

    @Override
    public double calculateFare(double distance, int passangers) {
        double fare = calculateFare(distance);

        if (passangers > 1) {
            fare += (passangers - 1) * 0.6;
        }
        return fare;
    }

    @Override
    public double calculateTime(double distance) {

        return distance / getSpeed();
    }

    @Override
    public String getTransportInfo(int passangers) {

        return "Bus → Speed: " + getSpeed() + " km/h | Rate per km: " + getRatePerKm() + " AZN | Passengers: " + passangers;
    }
}
