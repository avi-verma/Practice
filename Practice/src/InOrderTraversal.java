import java.util.Stack;

public class InOrderTraversal {
	void inorderTraversal(MyNode node){
		Stack<MyNode> stack=new Stack<>();
		addLeftNodes(stack,node);
		while(!stack.isEmpty()) {
			MyNode curr=stack.pop();
			System.out.println(curr.value);
			if(curr.right!=null) {
				addLeftNodes(stack, curr.right);
			}
		}
		
	}

	private void addLeftNodes(Stack<MyNode> stack, MyNode node) {
		while(node!=null) {
			stack.push(node);
			node=node.left;
		}
		
	}
}
class MyNode {
	int value;
	MyNode left;
	MyNode right;
	public MyNode(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
}
