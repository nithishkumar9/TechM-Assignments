package streams;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("List elements: " + list);
        
        double avg = list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
        System.out.println("Average : " + avg);
    }
}