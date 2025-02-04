package exceptions;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P3 {
	static void readFile(String fileName) throws FileNotFoundException {
	    File file = new File(fileName);
	    Scanner sc = new Scanner(file);
	    
	    while (sc.hasNextLine()) {
	    	String line = sc.nextLine();
	      	System.out.println(line);
	    }

	    sc.close();
	}
  
	public static void main(String[] args) {
		try {
			readFile("File1.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
