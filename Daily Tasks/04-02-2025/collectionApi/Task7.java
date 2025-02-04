package collectionApi;

//7. Write a Java program to search for an element in an array list.

import java.util.*;

public class Task7 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");

    if (list.contains("Red")) {
      System.out.println("Element Found in the array list.");
    } else {
      System.out.println("Element Not Found in the array list.");
    }
  }
}
