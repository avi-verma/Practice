package pack1;

public class TwoPointers {

	public static void main(String[] args) {
		int[] a=new int[] {7,8,12,18,19,20};
		int[] b=new int[] {4,5,6,7,8,9};
		int sum=19;
		int newSum=0;
		int j=b.length-1;
		for(int i=0;i<a.length & i<b.length;) {
			
			newSum=a[i]+b[j];
			System.out.println(a[i]+" "+b[j]+" "+newSum);
			if(sum==newSum) {
				System.out.println("Found");
				break;
			}
			else if(newSum>sum) {
				j=j-1;
			}
			else
				i=i+1;
		}
	}

}
