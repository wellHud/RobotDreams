package homework38;

import java.sql.*;

public class Student {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
    private static final String DB_USERNAME = "username";
    private static final String DB_PASSWORD = "password";

    private String name;
    private int age;
    private String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void saveToDatabase() {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "INSERT INTO students (name, age, major) VALUES (?, ?, ?)";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setString(1, name);
                statement.setInt(2, age);
                statement.setString(3, major);
                statement.executeUpdate();
            }
            System.out.println("Інформацію про студента збережено в базі даних.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Student loadFromDatabase(int studentId) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
            String sql = "SELECT * FROM students WHERE id = ?";
            try (PreparedStatement statement = conn.prepareStatement(sql)) {
                statement.setInt(1, studentId);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        String name = resultSet.getString("name");
                        int age = resultSet.getInt("age");
                        String major = resultSet.getString("major");
                        return new Student(name, age, major);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        // Приклад використання

        // Створення об'єкту студента
        Student student = new Student("John Doe", 20, "Computer Science");

        // Збереження інформації про студента в базі даних
        student.saveToDatabase();

        // Отримання інформації про студента з бази даних за його ідентифікатором
        int studentId = 1; // Припустимо, що ідентифікатор студента - 1
        Student loadedStudent = Student.loadFromDatabase(studentId);

        // Виведення інформації про студента
        if (loadedStudent != null) {
            System.out.println("Інформація про студента:");
            System.out.println("Ім'я: " + loadedStudent.name);
            System.out.println("Вік: " + loadedStudent.age);
            System.out.println("Спеціальність: " + loadedStudent.major);
        } else {
            System.out.println("Студента з ідентифікатором " + studentId + " не знайдено.");
        }
    }
}