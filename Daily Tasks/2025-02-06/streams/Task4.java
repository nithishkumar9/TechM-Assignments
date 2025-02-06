package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 1, 5, 3 ,3 ,4, 6);
		System.out.println("List elements: " + nums);
		
		List<Integer> uniq = nums.stream().distinct().collect(Collectors.toList());
		System.out.println("\nUpdated List after removing duplicates:\n" + uniq);
	}
}
