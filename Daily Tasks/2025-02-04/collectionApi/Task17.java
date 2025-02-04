package collectionApi;

//17. Write a Java program to insert the specified element at the front of a linked list.

import java.util.LinkedList;

public class Task17 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("Linked list elements:\n" + list);

		list.addFirst("Yellow");
		System.out.println("\nInserting an element at the front of a linked list:\n" + list);
	}
}
