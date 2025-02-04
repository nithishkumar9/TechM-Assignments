package generics;

//3. Write a Java program to create a generic method that takes a list of any type and a target element. It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.

import java.util.List;

public class Task3 {

  public static <T> int findIndex(List<T> list, T target) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(target)) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    List<Integer> arr1 = List.of(1, 2, 3, 4, 5, 6);
    List<String> arr2 = List.of("Nithish", "Vinay", "Srikar", "Chetan");
    
    System.out.println("Array1 elements: " + arr1);
    System.out.println("Index of \"4\" : " + findIndex(arr1, 4)); 
    System.out.println("Index of \"9\" : " + findIndex(arr1, 9)); 
    
    System.out.println("\nArray2 elements: " + arr2);
    System.out.println("Index of \"Chetan\" : " + findIndex(arr2, "Srikar")); 
    System.out.println("Index of \"Akhil\" : " + findIndex(arr2, "Akhil")); 
  }
}
