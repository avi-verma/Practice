
public class Palindrome {
	public int isPalindrome(int n) {
		int newN=0;
		while(n>0)
		{
			newN=newN+(n%10)*(int) Math.pow(10,(int) (Math.log(n)/Math.log(10)));
			n=n/10;
		}
		return newN;
		
	}
}
