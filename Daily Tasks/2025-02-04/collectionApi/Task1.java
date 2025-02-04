package collectionApi;

//1. Write a Java program to create an array list, add some colors (strings) and print out the collection.

import java.util.*;

public class Task1 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");
    System.out.println("List of colors: "+list);
  }
}

