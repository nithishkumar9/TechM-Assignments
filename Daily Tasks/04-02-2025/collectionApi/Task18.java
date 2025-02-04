package collectionApi;

//18. Write a Java program to insert the specified element at the end of a linked list.

import java.util.LinkedList;

public class Task18 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		System.out.println("Linked list elements:\n" + list);

		list.addLast("Yellow");
		System.out.println("\nInserting an element at the end of a linked list:\n" + list);
	}
}