package homework15;

public class Pilot extends Human implements Profession {

    private String name;

    private int age;

    private String profession = "Driver";

    public Pilot(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getInfo(){
        System.out.println("My name is " + name + " and my age is " + age + ". My profession is " + profession);
    }

    @Override
    public void startTheEngine() {
        System.out.println("The button is starting the engine");
    }

    @Override
    public void control() {
        System.out.println("Control my plane with help of joystick");
    }

    @Override
    public void stopTheEngine() {
        System.out.println("landing the plane. Stop the engine with button");
    }

}
