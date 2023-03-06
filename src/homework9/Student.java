package homework9;

public class Student {

    String name;

    int age;

    String course;

    String homeAddress;

    int averageMark;

    Boolean passTheExam;

    void printStudentName (){
        System.out.println("Hello! My name is " + name + "!");
    }

    void studentsAge (){
        System.out.println("Im " + age + " years old!");;
    }

    int addNumbers (int number1, int number2){
        return number1 + number2;
    }
}
