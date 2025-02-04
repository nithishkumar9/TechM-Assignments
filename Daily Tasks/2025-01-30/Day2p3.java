package training;
import java.util.Arrays;

public class Day2p3 {
	
	public static void main(String args[]) {
		
		int[][] a1= {{1,2,3},{4,5,6}};
		int[][] a2=a1;
		int[][] a3=a1.clone();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		System.out.println(a1.equals(a2));
		System.out.println(Arrays.deepEquals(a1, a2));
		
		System.out.println(a1.equals(a3));
		System.out.println(Arrays.deepEquals(a1, a3));

	}

}
