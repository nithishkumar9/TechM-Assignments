package Data_Transmission;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static boolean prime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int n;
        while(st.hasMoreTokens()){
            n = Integer.parseInt(st.nextToken());
            if(prime(n)){
                arr.add(n);
            }
        }
        Collections.sort(arr);
        System.out.println(arr.size()+arr.get(arr.size()-2));
        sc.close();
    }
}
