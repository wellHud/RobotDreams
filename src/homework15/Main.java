package homework15;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Bob", 44);
        Pilot pilot = new Pilot("Max", 56);

        driver.getInfo();
        driver.startTheEngine();
        driver.control();
        driver.stopTheEngine();

        pilot.getInfo();
        pilot.startTheEngine();
        pilot.control();
        pilot.stopTheEngine();
    }
}
