package Reverse_String;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer(sc.next().toLowerCase());
        sb.reverse();
        System.out.println("Reversed String: " + sb);
        sc.close();
    }
}
