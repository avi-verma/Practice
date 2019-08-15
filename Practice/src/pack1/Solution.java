package pack1;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
    	Rect rect=new Rect();
    	
    	int[] arr1=new int[4];
    	int[] arr2=new int[4];
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();    

        String[] strs = lines.trim().split("\\s+");

        for (int i = 0; i < strs.length; i++) {
        	if(i<4)
        arr1[i] = Integer.parseInt(strs[i]);
        	else
        	arr2[i-4] = Integer.parseInt(strs[i]);		
        }
    	System.out.println(rect.isRectangleOverlap(arr1, arr2));
    
    }
}
class Rect {
    public int isRectangleOverlap(int[] rec1, int[] rec2) {
    	      int x1 = Math.max(rec1[0], rec2[0]);
    	      int  y1 = Math.max(rec1[1], rec2[1]);
    	      int  x2 = Math.min(rec1[2], rec2[2]);
    	      int  y2 = Math.min(rec1[3], rec2[3]);
    	        if (x1 < x2 && y1 < y2)
    	            return 1;
    	        return 0;
    }
}