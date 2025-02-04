package collectionApi;

//10. Write a Java program to shuffle elements in an array list.

import java.util.*;

public class Task10 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("Array list before shuffling:\n" + list);
    
    Collections.shuffle(list);
    System.out.println("\nArray list after shuffling:\n" + list);
  }
}
