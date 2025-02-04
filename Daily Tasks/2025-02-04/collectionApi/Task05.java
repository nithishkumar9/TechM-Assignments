package collectionApi;

//5. Write a Java program to update an array element by the given element.

import java.util.*;

public class Task05 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("Array list elements: " + list);

		list.set(2, "Yellow");
		System.out.println("\nAfter updating third element of the list: \n" + list);
	}
}
