package homework20;

import java.util.Comparator;


public class Student {
    private String lastName;
    private double averageGrade;

    public Student(String lastName, double averageGrade) {
        this.lastName = lastName;
        this.averageGrade = averageGrade;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public static class LastNameComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

    public static class AverageGradeComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o2.getAverageGrade(), o1.getAverageGrade());
        }
    }
}