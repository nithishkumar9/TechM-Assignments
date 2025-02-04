package collectionApi;

//3. Write a Java program to insert an element into the array list at the first position.

import java.util.*;

public class Task3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Array list elements: "+list);

    list.add(0, "Yellow");
    System.out.println("\nAfter inserting an element at the first position: \n"+list);
  }
}
