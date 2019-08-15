
public class RecursionEx1 {

	void display(int n) {
		if (n==0)
		return ;
		
		display(n-1);
		System.out.println(n);
	}
	int mobileSpeakers(int mobiles) {
		if(mobiles==0)
			return 0;
		else {
			if(mobiles%2==0)
				return 2+mobileSpeakers(mobiles-1);
			else
				return 1+mobileSpeakers(mobiles-1);
				
		}
	}
	int reverse(int n) {
		if(n<=9)
			return n;
		else {
			
			return n%10 + reverse(n/10);
		}
	}

}
