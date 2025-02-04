import java.util.Scanner;
import java.lang.StringBuffer;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuffer sb = new StringBuffer(Integer.toString(n));
        sb.reverse();
        System.out.println("Reversed Number: " + sb);

        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("Reversed Number: " + rev);

        sc.close();
    }
}