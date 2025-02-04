package collectionApi;

//11. Write a Java program to append the specified element to the end of a linked list.

import java.util.LinkedList;

public class Task11 {
  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.addLast("Blue");
    list.addLast("Green");
    list.addLast("Yellow");

    System.out.println("Linked list elements: " + list);
  }
}
