package collectionApi;

//2. Write a Java program to iterate through all elements in an array list.

import java.util.*;

public class Task2 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    
    System.out.println("Array list elements:");
    for (String ele : list) {
      System.out.println(ele);
    }
  }
}
