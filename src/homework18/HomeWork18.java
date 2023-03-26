package homework18;
import java.util.ArrayList;
import java.util.List;

public class HomeWork18 {
    public static void main(String[] args) {

        List smallList = createSmallList();
        List bigList = createBigList();

        List<Student> listOfStudent= new ArrayList<>();
        listOfStudent.add(new Student("Bob", 22));
        listOfStudent.add(new Student("Kolya", 23));
        listOfStudent.add(new Student("Lola", 20));

        for (Student student : listOfStudent) {
            System.out.println(student.toString());
        }
    }

    public static List createSmallList(){
        // Список з 10 елементів
        List<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            smallList.add(i);
        }
        return smallList;
    }

    public static List createBigList(){
        // Список з 2 000 000 елементів
        List<Long> bigList = new ArrayList<>();
        for (long i = 0; i < 2000000; i++) {
            bigList.add(i);
        }
        return bigList;
    }

}
