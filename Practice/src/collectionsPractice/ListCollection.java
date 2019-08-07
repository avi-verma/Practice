package collectionsPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class ListCollection {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		String[] arr=br.readLine().split(" ");
		
		for(String i:arr) {
			for(int j=1;j<=Integer.parseInt(i);j++) {
				if(j%3==0) {
					if(j%15==0)
						System.out.println("BuzzFizz");
					else
					System.out.println("Fizz");
				}
				else if(j%5==0) {
					if(j%15==0)
						System.out.println("BuzzFizz");
					else
					System.out.println("Buzz");
				}
				
				else
					System.out.println(j);
			}
		}
	}

}
