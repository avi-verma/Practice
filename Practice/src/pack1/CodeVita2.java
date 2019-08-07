package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeVita2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int n=Integer.parseInt(br.readLine());
			for(int i=1;i<=n;i++) {
				if(n%i==0)
					System.out.print(i+" ");
			}
		}

	}

}
