package exceptions;

public class Task1 {
	
	static int division(int numerator, int denominator) {
	    if (denominator == 0) {
	      throw new ArithmeticException("Division by zero is not allowed!");
	    }
	    return numerator / denominator;
	}
	
	public static void main(String[] args) {
        try {
        	int result = division(10, 0);
        	System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
	
}
