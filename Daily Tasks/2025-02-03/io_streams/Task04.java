package io_streams;

import java.io.File;

public class Task04 {
  public static void main(String[] args) {
    File fileDir = new File("src//exceptions//File1.txt");
    
    if (fileDir.canWrite()) {
      System.out.println(fileDir.getAbsolutePath() + " have write permission.");
    } else {
      System.out.println(fileDir.getAbsolutePath() + " does not have write permission.");
    }
    
    if (fileDir.canRead()) {
      System.out.println(fileDir.getAbsolutePath() + " have read permission.");
    } else {
      System.out.println(fileDir.getAbsolutePath() + " does not have read permission.");
    }
  }
}
