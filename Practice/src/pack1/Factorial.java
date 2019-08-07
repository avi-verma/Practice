package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		System.out.println(factorial(i));

	}

	private static int factorial(int i) {
		if(i<0) {
			return -1;
		}
		else if(i==0) {
			return 1;
		}
		else {
		return i*factorial(i-1);
		}
	}

}
