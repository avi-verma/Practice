
public class MergeSortedArray {
	int[] mergeArray(int[] a,int[] b) {
		int i=0,j=0,k=0;
		int[] result=new int[a.length+b.length];
		while(i<a.length &&  j<b.length) {
			if(a[i]<b[j]) {
				System.out.println("a"+a[i]);
				result[k++]=a[i++];
			}else {
				System.out.println("b"+b[j]);
				result[k++]=b[j++];
			}
				//result[k++]=a[i]<b[j]?a[i++]:b[j++];
				
		}
		return result;
	}
}
