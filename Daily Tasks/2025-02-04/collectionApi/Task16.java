package collectionApi;

//16. Write a Java program to insert elements into the linked list at the first and last positions.

import java.util.LinkedList;

public class Task16 {
  public static void main(String[] args) {
    LinkedList<String> l_list = new LinkedList<String>();
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    System.out.println("Linked list elements: " + l_list);
    l_list.addFirst("White");
    l_list.addLast("Pink");
    System.out.println("\nLinked list after inserting elements at the first and last positions:\n" + l_list);
  }
}

