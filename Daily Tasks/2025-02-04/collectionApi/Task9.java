package collectionApi;

//9. Write a Java program to copy one array list into another.

import java.util.*;

public class Task9 {
  public static void main(String[] args) {
    List<String> List1 = new ArrayList<String>();
    List1.add("1");
    List1.add("2");
    List1.add("3");
    List1.add("4");
    System.out.println("List1 elements: " + List1);
    List<String> List2 = new ArrayList<String>();
    List2.add("Red");
    List2.add("Blue");
    List2.add("Green");
    List2.add("White");
    System.out.println("List2 elements: " + List2);

    Collections.copy(List1, List2);
    System.out.println("\nAfter copying List2 to List1: ");
    System.out.println("List1 elements: " + List1);
    System.out.println("List2 elements: " + List2);
  }
}

