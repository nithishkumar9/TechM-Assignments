package streams;

import java.util.Arrays;
import java.util.List;

public class Task3 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("List elements: " + nums);
		
		int evensum = nums.stream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
		System.out.println("\nSum of even numbers: " + evensum);
		
		int oddsum = nums.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
		System.out.println("\nSum of odd numbers: " + oddsum);
	}
}
