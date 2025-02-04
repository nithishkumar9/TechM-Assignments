package generics;

//4. Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.

import java.util.ArrayList;
import java.util.List;

public class Task4 {

  public static <T> List<T> reverseList(List<T> originalList) {
    List<T> reversedList = new ArrayList<>();
    for (int i = originalList.size() - 1; i >= 0; i--) {
      reversedList.add(originalList.get(i));
    }
    return reversedList;
  }

  public static void main(String[] args) {
    List<Integer> arr1 = List.of(1, 2, 3, 4, 5, 6);
    List<String> arr2 = List.of("Nithish", "Vinay", "Srikar", "Chetan");

    System.out.println("Array1 elements: " + arr1);
    System.out.println("Reversed Array1: " + reverseList(arr1));

    System.out.println("\nArray2 elements: " + arr2);
    System.out.println("Reversed Array2: " + reverseList(arr2));

  }
}
