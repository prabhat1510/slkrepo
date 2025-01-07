package designpattern.prototype;

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		try {
			Employees empsNew = (Employees) emps.clone();
			Employees empsNew1 = (Employees) emps.clone();
			
			List<String> list = empsNew.getEmpList();
			list.add("Rajesh");
			
			List<String> list1 = empsNew1.getEmpList();
			list1.add("Rajeshwara");
			list1.remove("Raj");
			
			System.out.println("Emps list "+ emps.getEmpList());
			System.out.println("Emps new list "+list);
			System.out.println("Emps new list1 "+ list1);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
