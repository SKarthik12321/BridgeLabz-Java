package objectorientedprogramming.javapolymorphismencapsulation.level1;

abstract class Vehicle {
    protected double ratePerKm;
    abstract double calculateFare(double km);
}

interface GPS {
    void updateLocation();
}

class Bike extends Vehicle implements GPS {
    public Bike() {
        ratePerKm = 10;
    }

    double calculateFare(double km) {
        return ratePerKm * km;
    }

    public void updateLocation() {
        System.out.println("Location Updated");
    }
}

public class RideHailing {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        System.out.println(v.calculateFare(15));
    }
}
