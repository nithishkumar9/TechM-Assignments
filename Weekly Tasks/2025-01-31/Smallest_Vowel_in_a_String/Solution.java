package Smallest_Vowel_in_a_String;

import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        int minIndex = -1;

        for (int i = 0; i <= vowels.length; i++) {
            for (int j = 0; j <= str.length(); j++) {
                if (str.charAt(j) == vowels[i]) {
                    minIndex = i;
                    break;
                }
            }
            if (minIndex != -1)
                break;
        }

        if (minIndex == -1) {
            System.out.println("Vowel not found.");
        } else {
            System.out.println("Smallest vowel in the string: " + vowels[minIndex]);
        }

        sc.close();
    }
}
