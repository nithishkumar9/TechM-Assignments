package Unique_Characters;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            if (!s2.contains(Character.toString(s.charAt(i)))) {
                s2 += s.charAt(i);
            }
        }
        System.out.println("Number of unique characters: " + s2);
        sc.close();
    }
}
