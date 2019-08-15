package pack1;

import java.io.*;
import java.lang.*;
import java.util.*;

class CharStack
{
	// Instance variables:
	private char[] stackArray;
	private int topOfStack;
	private static int counter;
	
	// Constructor now increments the counter for each object created.
	public CharStack(int capacity)
	{
		stackArray = new char[capacity];
		topOfStack = -1;
		counter++;
	}
	
	// Instance methods:
	public void push(char element)
	{
		stackArray[++topOfStack] = element;
	}
	public char pop()
	{
		return stackArray[topOfStack--];
	}
	
	public char peek()
	{
		return stackArray[topOfStack]; 
	}

	public boolean isEmpty()
	{
		return topOfStack < 0; 
	}

	public boolean isFull()
	{
		return topOfStack == stackArray.length - 1; 
	}

	// Static method
	public static int getInstanceCount()
	{ 
		return counter;
	}
	public void reverseString() {
		CharStack tempstack = new CharStack(40);
		while(!this.isEmpty()) {
			char temp=this.pop();
			tempstack.push(temp);
		}
		while(!tempstack.isEmpty())
			System.out.print(tempstack.pop());
	}
}

public class CodeVita2
{
	public static void main(String[] args)
	{
		CharStack stack = new CharStack(40);
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int length = str.length();
		
		// Push the string char by char onto the stack:
		for (int i = 0; i < length; i++)
		{
			stack.push(str.charAt(i));
		}
		stack.reverseString();
	
	}

}