package generics;

//1. Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.

public class Task1 {
	
    public static <T> boolean arraysEqual(T[] arr1, T[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Integer[] arr1 = { 1, 2, 3 };
        Integer[] arr2 = { 1, 2, 3 };
        
        String[] arr3 = { "hi", "hello" };
        String[] arr4 = { "hi", "Hello" };
        
        System.out.print("Array1 elements: ");
        for(int i:arr1) {
        	System.out.print(i+" ");
        }
        System.out.print("\nArray2 elements: ");
        for(int i:arr2) {
        	System.out.print(i+" ");
        }
        System.out.println("\nAre both the arrays equal? : "+arraysEqual(arr1, arr2));
        
        System.out.print("\nArray3 elements: ");
        for(String i:arr3) {
        	System.out.print(i+" ");
        }
        System.out.print("\nArray4 elements: ");
        for(String i:arr4) {
        	System.out.print(i+" ");
        }
        System.out.println("\nAre both the arrays equal? : "+arraysEqual(arr3, arr4));
    }
}
