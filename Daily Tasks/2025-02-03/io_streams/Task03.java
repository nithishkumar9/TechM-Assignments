package io_streams;

import java.io.File;

public class Task03 {
  public static void main(String[] args) {
    File path = new File("src//exceptions//File1.txt");
    if (path.exists()) {
      System.out.println("The file or directory specified by pathname exist.");
    } else {
      System.out.println("The file or directory specified by pathname does not exist.");
    }
  }
}
