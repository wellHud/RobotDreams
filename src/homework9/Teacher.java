package homework9;

import java.util.Random;

public class Teacher {

    String name;

    int age;

    String course;

    String homeAddress;

    void giveMarkForStudent (){
        Random random = new Random();
        System.out.println("Your mark is: " + random.nextInt(10));
    }
}
