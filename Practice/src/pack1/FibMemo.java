package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibMemo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		allfib(n);
	}
	private static void allfib(int n) {
		int[] memo=new int[n+1];
		for(int i=0;i<n;i++) {
			System.out.println(fib(i,memo));
		}
		
	}

	private static int fib(int i, int[] memo) {	 
		if(i<=0)
			return 0;
		else if(i==1)
			return 1;
		else if(memo[i]>0) return memo[i];
		memo[i]=fib(i-1,memo)+fib(i-2,memo);
		return memo[i];
	}

}
