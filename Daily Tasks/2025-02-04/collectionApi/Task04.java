package collectionApi;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.*;

public class Task04 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("Array list elements: " + list);

		System.out.println("\nThird element of the array list: " + list.get(2));
	}
}
