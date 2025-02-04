package generics;

//5. Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.

import java.util.ArrayList;
import java.util.List;

public class Task5 {

  public static <T> List<T> mergeLists(List<T> list1, List<T> list2) {
    List<T> mergedList = new ArrayList<>();

    int maxLength = Math.max(list1.size(), list2.size());
    for (int i = 0; i < maxLength; i++) {
      if (i < list1.size()) {
        mergedList.add(list1.get(i));
      }
      if (i < list2.size()) {
        mergedList.add(list2.get(i));
      }
    }

    return mergedList;
  }

  public static void main(String[] args) {
    List<Integer> arr1 = List.of(1, 3, 5, 7, 9);
    List<Integer> arr2 = List.of(2, 4, 6, 8);
    System.out.println("Before Merging:");
    System.out.println(arr1);
    System.out.println(arr2);
    System.out.println("\nAfter Merging: " + mergeLists(arr1, arr2));
    
    List<String> arr3 = List.of("Hi", "Hello", "Hlo", "Hey");
    List<String> arr4 = List.of("Nithish", "Vinay", "Srikar", "Chetan");
    System.out.println("\n\nBefore Merging:");
    System.out.println(arr3);
    System.out.println(arr4);
    System.out.println("\nAfter Merging: " + mergeLists(arr3, arr4));
  }
}
