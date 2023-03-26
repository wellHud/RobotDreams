package homework18;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void getAge (){
        System.out.println("Im " + age + " years old!");;
    }

    void getName(){

        System.out.println("My name is " + name);
    }

    @Override
    public String toString() {
        return "Студент: " + name + " " + age + " років.";
    }

}
