package exceptions;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class PositiveNumberException extends Exception {
    public PositiveNumberException(String msg) {
        super(msg);
    }
}

public class P4 {
    static void checkNumbers(String fileName) throws FileNotFoundException, PositiveNumberException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            int num = Integer.parseInt(sc.nextLine());
            if (num > 0) {
            	sc.close();
                throw new PositiveNumberException("Found positive number: " + num);
            }
        }
        sc.close();
    }
	
    public static void main(String[] args) {
        try {
            checkNumbers("src//exceptions//FileForP4.txt");
            System.out.println("There are no positive numbers in the file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PositiveNumberException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
