package homework14;

import java.util.Random;

public class Teacher extends Person {

    private String name;

    private int age;

    String course;

    private String homeAddress;

    public Teacher(String name, int age, String homeAddress){
        this.name = name;
        this.age = age;
        this.homeAddress = homeAddress;
    }

    void getName(){
        System.out.println("My name is " + name);
    }

    void getAge (){
        System.out.println("Im " + age + " years old!");;
    }
    void getHomeAddress(){
        System.out.println("My home address is: " + homeAddress);
    }
    void giveMarkForStudent (){
        Random random = new Random();
        System.out.println("Your mark is: " + random.nextInt(10));
    }
}
