package collectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> set=new TreeSet<>(new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o2.getAge()-o1.getAge();
			}
		});
		
		Employee emp1=new Employee(2);
		Employee emp2=new Employee(3);
		set.add(emp1); set.add(emp2);
		Iterator<Employee> itr=set.descendingIterator();
		while(itr.hasNext())
			System.out.println(itr.next().getAge());
		

	}

}
class Employee implements Comparable<Employee>{
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int age) {
		this.age=age;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.age-o.getAge();
	}



}
