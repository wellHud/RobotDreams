package homework19;

import java.util.*;

public class HomeWork19 {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < 1000; i++) {
            int num = random.nextInt(50) + 1;
            hashSet.add(num);
            linkedHashSet.add(num);
            treeSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}
