package training;
import java.util.Scanner;
import java.lang.StringBuffer;

public class Day2p5 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		String st = sc.next();
		
		char[] s = st.toCharArray();
		
		int i;
		for(i=0;i<s.length;i+=2) {
			s[i] = Character.toUpperCase(s[i]);
		}
		
		for(i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
	}
}
