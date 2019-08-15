
public class RecursiveMultiple {
	int getMultiple(int i,int j) {
		if(i==1)
			return j;
		else {
			return getMultiple(i-1, j)+j;
		}
	}
}
