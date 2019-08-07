package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPermutation {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String i=br.readLine();
	
		permutation(i);

	}

	private static void permutation(String i) {
		permutaion(i,"");
		
	}

	private static void permutaion(String i, String string) {
		if(i.length()==0)
			System.out.println(string);
		else {
			for(int x=0;x<i.length();x++) {
				String rem=i.substring(0,x)+i.substring(x+1);
				permutaion(rem, string+i.charAt(x));
			}
		}
	}

}
