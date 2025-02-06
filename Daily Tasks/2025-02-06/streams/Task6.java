package streams;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("banana", "apple", "cherry", "avocado", "blueberry");
        System.out.println("List elements: " + words);
        
        List<String> ascendingOrder = words.stream().sorted().collect(Collectors.toList());
        System.out.println("\nAscending Order: " + ascendingOrder);
        
        List<String> descendingOrder = words.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println("\nDescending Order: " + descendingOrder);
    }
}