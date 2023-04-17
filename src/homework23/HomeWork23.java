package homework23;
import java.util.*;
import java.util.stream.Collectors;


public class HomeWork23 {
    public static void main(String[] args) {
        List<String> surnames = Arrays.asList(
                "Smith", "Johnson", "Williams", "Jones", "Smith",
                "Anderson", "Johnson", "Williams", "Thompson", "Anderson",
                "Anderson", "Rodriguez", "Harris", "Harris", "Thompson",
                "Smith", "Anderson", "Robinson", "Williams", "Rodriguez"
        );

        Map<String, Long> surnameCount = surnames.stream()
                .collect(Collectors.groupingBy(
                        surname -> surname, Collectors.counting()
                ));

        System.out.println(surnameCount);

        List<Integer> numbers = new Random().ints(10, 1, 101)
                .boxed().toList();
        System.out.println("Numbers: " + numbers);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);
    }
}
