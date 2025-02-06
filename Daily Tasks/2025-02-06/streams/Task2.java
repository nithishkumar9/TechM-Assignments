package streams;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Nithish", "Vinay", "Srikar", "Chetan", "Akhil");
		System.out.println("List elements: " + names);
		
		List<String> uppercase = names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("\nUppercase Strings: " + uppercase);
		
		List<String> lowercase = names.stream().map(String::toLowerCase).collect(Collectors.toList());
		System.out.println("\nLowercase Strings: " + lowercase);
	}
}
