package exceptions;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class EmptyFileException extends Exception {
	public EmptyFileException(String message) {
		super(message);
	}
}

public class Task5 {
	public static void checkFile(String fileName) throws FileNotFoundException, EmptyFileException {
		File file = new File(fileName);
		Scanner sc = new Scanner(file);

		if (!sc.hasNextLine()) {
			sc.close();
			throw new EmptyFileException("File is empty.");
		}
		sc.close();
	}
	  
	public static void main(String[] args) {
		try {
			checkFile("src//exceptions//EmptyFile.txt");
			System.out.println("File is not empty.");
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		} catch (EmptyFileException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
}


