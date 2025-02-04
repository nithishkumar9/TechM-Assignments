package collectionApi;

//20. Write a Java program to get the first and last occurrence of the specified elements in a linked list.

import java.util.LinkedList;

public class Task20 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Linked list elements:\n" + list);

    System.out.println("\nFirst Element of linked list is: " + list.getFirst());

    System.out.println("\nLast Element of linked list is: " + list.getLast());
  }
}

