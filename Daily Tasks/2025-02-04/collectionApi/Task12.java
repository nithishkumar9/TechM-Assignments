package collectionApi;

//12. Write a Java program to iterate through all elements in a linked list.

import java.util.LinkedList;

public class Task12 {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Black");
    list.add("White");
    list.add("Red");
    list.add("Blue");
    list.add("Green");

    System.out.println("Linked list elements: ");
    for (String ele : list) {
      System.out.println(ele);
    }
  }
}
