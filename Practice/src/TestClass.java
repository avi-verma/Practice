import java.util.Scanner;

public class TestClass {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int T=sc.nextInt();
	int[] arr=new int[1001];
	while(T-->0) {
		int i=sc.nextInt();
		arr[i]=arr[i]==0?1:++arr[i];
	}
	int n=sc.nextInt();
	while(n-->0) {
		int j=sc.nextInt(); 
		System.out.println(arr[j]==0?"NOT PRESENT":arr[j]);;
	}
}
}
