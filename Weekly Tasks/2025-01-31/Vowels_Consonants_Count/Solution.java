package Vowels_Consonants_Count;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        int v = 0, c = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    v++;
                } else {
                    c++;
                }
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        sc.close();
    }
}
