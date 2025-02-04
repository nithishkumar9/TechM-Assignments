package collectionApi;

//14. Write a Java program to iterate a linked list in reverse order.

import java.util.LinkedList;
import java.util.Iterator;

public class Task14 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Linked list elements:\n" + list);

    Iterator it = list.descendingIterator();;

    System.out.println("\nLinked list elements in Reverse Order:");
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
