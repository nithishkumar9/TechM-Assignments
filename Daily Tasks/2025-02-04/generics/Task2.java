package generics;

//2. Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.

import java.util.List;

public class Task2 {
  public static <T extends Number> void calculateEvenOddSum(List<T> nums) {
    int evenSum = 0, oddSum = 0;

    for (T num : nums) {
      if (num.intValue() % 2 == 0) {
        evenSum += num.intValue();
      } else {
        oddSum += num.intValue();
      }
    }
    System.out.println("List of numbers: " + nums);
    System.out.println("Sum of even numbers: " + evenSum);
    System.out.println("Sum of odd numbers: " + oddSum);
  }

  public static void main(String[] args) {
    List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    calculateEvenOddSum(l1);
  }
}
