package pack1;

public class FirstProgram{

	public static void main(String[] args) {
		int[] array=new int[] {1,7,8,9,6,5,3,8,9};
		int first=array[0];
		int total=first;
		for(int i=1;i<array.length;i++) {
				total=array[i]>first?total+array[i]:total-array[i];
				first=array[i];
		}
		System.out.println(total);
		
		
}
	}