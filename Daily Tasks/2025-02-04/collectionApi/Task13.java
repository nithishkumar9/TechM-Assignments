package collectionApi;

//13. Write a Java program to iterate through all elements in a linked list starting at the specified position.

import java.util.LinkedList;
import java.util.Iterator;

public class Task13 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");

    Iterator p = list.listIterator(1);
    
    System.out.println("Linked list from second position:");
    while (p.hasNext()) {
      System.out.println(p.next());
    }
  }
}
