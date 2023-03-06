package homework14;

public class Student extends Person{

    private String name;

    private int age;

    String course;

    private String homeAddress;

    int averageMark;

    Boolean passTheExam;

    public Student(String name, int age, String homeAddress){
        this.name = name;
        this.age = age;
        this.homeAddress = homeAddress;
    }

    void getAge (){
        System.out.println("Im " + age + " years old!");;
    }

    void getName(){
        System.out.println("My name is " + name);
    }

    void getHomeAddress(){
        System.out.println("My home address is: " + homeAddress);
    }

    int addNumbers (int number1, int number2){
        return number1 + number2;
    }
}
