import java.util.Arrays;

public class EqualDelete {
	int equalDelete(int arr[]) {
		Arrays.sort(arr);
		int max=0;
		int count=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==arr[i+1]) {
				count++;
				continue;
			}else {
				max=Math.max(max, count);
				count=1;
			}
		}
		
		return max=arr.length-Math.max(max, count);
	}
}
