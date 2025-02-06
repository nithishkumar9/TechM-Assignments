package streams;

import java.util.*;
import java.util.List;

public class Task7 {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(10, 45, 3, 130, 33, 89, 5);
        System.out.println("List elements:" + list);
        
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("\nMaximum Value: " + max.get());
        
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("\nMinimum Value: " + min.get());
    }
}