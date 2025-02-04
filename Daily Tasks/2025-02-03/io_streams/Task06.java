package io_streams;

import java.io.File;
import java.util.Date;

public class Task06 {
     public static void main(String[] args) {
          File file = new File("src//exceptions//File1.txt");
          Date date = new Date(file.lastModified());
          System.out.println("The file was last modified on: " + date);
     }
}
