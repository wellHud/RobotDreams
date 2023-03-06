package homework15;

public class Driver extends Human implements Profession {
    private String name;

    private int age;

    private String profession = "Driver";

    public Driver(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getProfession(){
        System.out.println("My profession is " + profession);
    }

    @Override
    public void startTheEngine() {
        System.out.println("The key is starting the engine");
    }

    @Override
    public void control() {
        System.out.println("Control my car with help of steering wheel");
    }

    @Override
    public void stopTheEngine() {
        System.out.println("Stop the car. Stop the engine with my key");
    }
}
