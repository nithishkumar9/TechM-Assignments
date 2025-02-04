package collectionApi;

//19. Write a Java program to insert some elements at the specified position into a linked list.

import java.util.LinkedList;

public class Task19 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        System.out.println("Linked list elements: " + list);

        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("White");
        list2.add("Pink");

        list.addAll(1, list2);
        System.out.println("\nLinked List after inserting some elements at the first position:\n" + list);
    }
}

