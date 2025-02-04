package collectionApi;

//15. Write a Java program to insert the specified element at the specified position in the linked list.

import java.util.LinkedList;

public class Task15 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("Linked list elements:\n" + list);

		list.add(1, "Yellow");
		System.out.println("\nAfter inserting an element at the second position:\n" + list);
	}
}

