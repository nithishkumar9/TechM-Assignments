package collectionApi;

//6. Write a Java program to remove the third element from an array list.

import java.util.*;

public class Task06 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Array list elements: " + list);
    
    list.remove(2);
    System.out.println("\nAfter removing third element from the list:\n" + list);
  }
}
