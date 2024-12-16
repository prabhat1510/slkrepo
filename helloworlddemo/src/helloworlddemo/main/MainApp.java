package helloworlddemo.main;

import java.time.LocalDate;

public class MainApp {

	public static void main(String[] args) {
		
		createObjects();
	}
	public static void createObjects() {

		/**
		 * Objects are created by calling no arg constructor with default value
		 */
		Department dept = new Department();// No arg constructor
		Employee emp = new Employee();// No arg constructor
		/***********************
		 * Objects will be created and initialized with the value passed in constructor
		 ************/
		Department dept1 = new Department(1, "Marketing");
		Employee emp1 = new Employee(1, "Rahul", LocalDate.of(2010, 10, 15), 15555.55, dept1);
		System.out.println(dept);
		dept.setDeptName("Finance");
		dept.setDeptNo(1);
		System.out.println(dept);
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(dept1);
		System.out.println(dept1.getDeptName());
	}
}
