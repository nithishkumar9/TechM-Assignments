package Last_Character_In_Every_Word;

import java.util.StringTokenizer;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            char c = s.charAt(s.length() - 1);
            if (Character.isLetter(c)) {
                System.out.print(c);
            }
        }
        sc.close();
    }
}
