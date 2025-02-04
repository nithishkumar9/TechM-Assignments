package collectionApi;

//8. Write a Java program to sort a given array list.

import java.util.*;

public class Task8 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Array list before sorting: " + list);
    
    Collections.sort(list);
    System.out.println("\nArrray list after sorting: " + list);
  }
}
