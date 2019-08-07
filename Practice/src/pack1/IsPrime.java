package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsPrime {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i=Integer.parseInt(br.readLine());
		System.out.println(isPrime(i));
	}

	private static boolean isPrime(int i) {
		for(int x=2;x<=Math.sqrt(i);x++) {
			if(i%x==0)
				return false;
		}
		return true;
	
	}

}
