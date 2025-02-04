package Perfect_Square;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
        System.out.println(sqrt * sqrt == n);
        sc.close();
    }
}
