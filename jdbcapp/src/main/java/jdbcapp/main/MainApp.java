package jdbcapp.main;

import java.util.Scanner;

import jdbcapp.model.Department;
import jdbcapp.service.DepartmentService;
import jdbcapp.service.DepartmentServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		while (true) {
			System.out.println("*********************Select the choice to perform an operation*************");
			System.out.println("1. Add new department");
			System.out.println("2. Retrieve department");
			System.out.println("3. Retrieve all department");
			System.out.println("4. Update department");
			System.out.println("5. Delete department");
			System.out.println("6. Exit the application");
			Scanner sc = new Scanner(System.in);
			Integer choice = sc.nextInt();
			switch (choice) {
			case 1: // add department
				addDepartment();
				break;
			case 2:// retrieve department by id
				retrieveDepartmentById();
				break;
			case 3: // retrieve all department
				retrieveAllDepartment();
				break;
			case 5: // delete department by id
				deleteDepartmentById();
				break;
			case 6:
				System.exit(0);
				break;

			}
		}

	}

	private static void deleteDepartmentById() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter department number to be deleted *****");
		Integer deptNo = sc.nextInt();
		// Making a call to service layer
		DepartmentService deptService = new DepartmentServiceImpl();
		String msg = deptService.deleteDepartment(deptNo);
		System.out.println(msg);

	}

	private static void retrieveAllDepartment() {
		System.out.println("******List of Department*****************");
		DepartmentService deptService = new DepartmentServiceImpl();
		System.out.println(deptService.retrieveAllDepartment());

	}

	private static void retrieveDepartmentById() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter department number *****");
		Integer deptNo = sc.nextInt();
		// Making a call to service layer
		DepartmentService deptService = new DepartmentServiceImpl();
		Department dept = deptService.getDepartment(deptNo);
		System.out.println(dept);

	}

	private static void addDepartment() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter department number *****");
		Integer deptNo = sc.nextInt();
		System.out.println("****Enter department name *****");
		String deptName = sc.next();
		System.out.println(" Creating department ...... ");
		// Creating an object of Department class
		Department dept = new Department();
		dept.setDeptName(deptName);
		dept.setDeptNo(deptNo);
		// Making a call to service layer
		DepartmentService deptService = new DepartmentServiceImpl();
		Department addedDept = deptService.addDepartment(dept);
		System.out.println(addedDept);

	}

}
