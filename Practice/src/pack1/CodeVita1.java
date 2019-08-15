package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class CodeVita1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Integer i=new Integer(1);//hashocde 1
		Integer i2=new Integer(1);//hashcode
		HashMap<Integer, String> map=new HashMap<Integer, String>();
	map.put(i, "Shish");
	map.put(i2, "Avinash");
	Employee e1=new Employee(2); Employee e2=new Employee(2);
	HashMap<Employee, String> map2=new HashMap<>();
	map2.put(e1, "Ram");
	map2.put(e2, "Avinash");
		 
		 System.out.println(map2.size());
		 
		System.out.println(map.size());
		System.out.println(Integer.hashCode(i));
	}
	

}
class Employee{
	int age;
	public Employee(int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		return true;
	}


	 
}
