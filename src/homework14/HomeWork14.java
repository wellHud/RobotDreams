package homework14;

public class HomeWork14 {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 22, "Kyiv");
        Teacher max = new Teacher("Max", 45, "Odesa");
        bob.getName();
        bob.getAge();
        bob.getHomeAddress();
        max.getName();
        max.getAge();
        max.getHomeAddress();
    }

}
