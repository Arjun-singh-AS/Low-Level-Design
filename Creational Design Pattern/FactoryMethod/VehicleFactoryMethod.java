interface Vehicle {
    void drive();
}

class Car implements Vehicle {

    public void drive() {
        System.out.println("Driving Car");
    }
}

class Bike implements Vehicle {

    public void drive() {
        System.out.println("Driving Bike");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        switch(type) {

            case "CAR":
                return new Car();

            case "BIKE":
                return new Bike();

            default:
                throw new IllegalArgumentException("Invalid vehicle");
        }
    }
}
public class VehicleFactoryMethod {
    public static void main(String[] args) {

        Vehicle vehicle = VehicleFactory.getVehicle("CAR");

        vehicle.drive();
    }
}
