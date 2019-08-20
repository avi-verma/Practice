import java.util.*;

public class Test {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        boolean duplicate=false;
        ArrayList<String> list=new ArrayList<String>();
        for (int i = 0; i < numberOfDays; i++) {
        	String ingredientId = in.next();
        	if(list.size()<2) {
        	System.out.print("0");
        	if(list.contains(ingredientId.substring(0, 3))){
        		duplicate=true;
        	}
        	list.add(ingredientId.substring(0, 3));
        	System.out.println("in 1"+list);
        	}
        	else {
        		
        		if(list.contains(ingredientId.substring(0, 3) )|| duplicate) {
        			System.out.println("in 21"+list);
        			System.out.print("1");
        			
				if(duplicate) {
					System.out.println("in 22"+list);list.clear();
					duplicate=false;
				}
				else {
					System.out.println("in 23"+list);
					list.remove(ingredientId.substring(0, 3)); list.remove(0);
				}
					
        		}else {
        			System.out.println("in 3"+list);
        			System.out.print(0);
        			list.add(ingredientId.substring(0, 3));
        		}
        	}
            
       }
        }
        
    }

