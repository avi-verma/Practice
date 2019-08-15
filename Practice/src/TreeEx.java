import java.util.HashMap;

class Node{
	Node left;
	Node right;
	int value;
	public Node(int value) {
		this.value=value;
	}
	
}
public class TreeEx {
	void verticalSum(Node root,int index, HashMap<Integer,Integer> map) {
		if(root.left==null)
			return ;
		else {
			verticalSum(root.left, index-1, map);
			map.put(index,map.get(index)==null?0:map.get(index)+root.value);
			verticalSum(root.right, index+1, map);
		}
	}
}
