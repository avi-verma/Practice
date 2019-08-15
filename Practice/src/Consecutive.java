import java.util.Arrays;
import java.util.HashSet;

public class Consecutive {
	
	int consecutive(int[] a) {
		int max=0;
		HashSet<Integer> set=new HashSet<Integer>();
		for(int i:a)
			set.add(i);
		for(int j:set) {
			if(set.contains(j-1))
				continue;
			int length=0;
			while(set.contains(j++)) {
				length++;
			max=Math.max(max, length);
			}
		}
			return max;
				
	}

}
