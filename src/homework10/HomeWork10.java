package homework10;

public class HomeWork10 {
    public static void main(String[] args) {

        Car car = new Car("Toyota", 10000, "regular");
        car.getTypeOfCar();

        PassengerCar passengerСar = new PassengerCar();
        passengerСar.getTypeOfCar();

        Truck truck = new Truck();
        truck.getTypeOfCar();
    }
}
