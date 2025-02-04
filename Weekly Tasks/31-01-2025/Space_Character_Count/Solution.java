package Space_Character_Count;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int c1 = 0, c2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                c1++;
            } else if (Character.isLetterOrDigit(str.charAt(i))) {
                c2++;
            }
        }
        System.out.println("No of spaces : " + c1 + " and characters : " + c2);
        sc.close();
    }
}
