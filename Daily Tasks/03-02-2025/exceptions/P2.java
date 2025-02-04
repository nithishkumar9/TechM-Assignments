package exceptions;
import java.util.Scanner;

public class P2 {
	static void checkEven(int num){
        if (num % 2 != 0) {
        	throw new IllegalArgumentException("Encountered an odd number: " + num);
        } else {
            System.out.println("Even number: " + num);
        }
    }
	
	public static void main(String[] args) {
        try {
        	System.out.print("Enter a number: ");
        	Scanner sc = new Scanner(System.in);
            checkEven(sc.nextInt());
            sc.close();
        } catch (IllegalArgumentException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}
