package homework20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork20 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ivanov", 4.5));
        students.add(new Student("Petrov", 3.8));
        students.add(new Student("Sidorov", 4.1));
        students.add(new Student("Zaycev", 3.3));
        students.add(new Student("Kuznetsov", 4.9));
        students.add(new Student("Sokolov", 4.2));

        // Оригінальний список студентів
        System.out.println("Original list of students:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getAverageGrade());
        }

        // Сортування за прізвищем
        Collections.sort(students, new Student.LastNameComparator());
        System.out.println("\nList of students sorted by last name:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getAverageGrade());
        }

        // Сортування за середнім балом
        Collections.sort(students, new Student.AverageGradeComparator());
        System.out.println("\nList of students sorted by average grade:");
        for (Student student : students) {
            System.out.println(student.getLastName() + " " + student.getAverageGrade());
        }
    }
}
