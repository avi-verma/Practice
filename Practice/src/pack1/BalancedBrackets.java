package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		char[] arr=str.toCharArray();
		HashMap<Character,Character> map=new HashMap<>();
		Stack<Character> stack=new Stack<>();
		int count=0;
		int pairCount=0;
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		map.put('*', '*');
		int i=0;
		for(char c:arr) {
			i++;
			if(Character.isAlphabetic(c) || Character.isDigit(c) ) {
				continue;
			}
			if(map.containsKey(c) && count==0) {
				stack.push(c);
				if(c=='*') {
				count++;
				}else
				pairCount++;
			}
			else if(stack.isEmpty() || c!=map.get(stack.pop())) {
				System.out.println("No");
				break;
			}else
				count--;
			if(i==arr.length-1 && stack.isEmpty()) {
				System.out.println("Yes "+pairCount);
				
			}
			
		}
	}

}
