package lesson_5.home_work;

public class Transport {
    private final double ratePerKm;
    private final double speed;

    public Transport(double ratePerKm, double speed) {
        this.ratePerKm = ratePerKm;
        this.speed = speed;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    public double getSpeed() {
        return speed;
    }
}
