class A {

	  void display(int[] arr) {
		arr[1]=1;
		
	}
	
	void newDisplay() {
		// TODO Auto-generated method stub
		
	}

	void display1() {
		System.out.println("non Static");
	}
}

public class MyClass {

public static void main(String[] args) {
	int[] arr=new int[] {0,0};
	A a=new A();
	a.display(arr);
	System.out.println(arr[1]);
}
}
