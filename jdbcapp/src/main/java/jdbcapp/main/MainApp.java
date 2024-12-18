package jdbcapp.main;

import java.time.LocalDate;
import java.util.Scanner;

import jdbcapp.dao.DepartmentDAO;
import jdbcapp.dao.DepartmentDAOImpl;
import jdbcapp.model.Department;
import jdbcapp.model.Employee;
import jdbcapp.service.DepartmentService;
import jdbcapp.service.DepartmentServiceImpl;
import jdbcapp.service.EmployeeService;
import jdbcapp.service.EmployeeServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		while (true) {
			System.out.println("*********************Select the choice to perform an operation*************");
			System.out.println("1. Add new department");
			System.out.println("2. Retrieve department");
			System.out.println("3. Retrieve all department");
			System.out.println("4. Update department");
			System.out.println("5. Delete department");
			System.out.println("6. Use of callable");
			System.out.println("7. Add Employee");
			System.out.println("8. Get Employee By Id");
			System.out.println("9. Exit the application");
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
			case 4:// Update department
				updateDepartment();
				break;
			case 5: // delete department by id
				deleteDepartmentById();
				break;
			case 6:
				DepartmentDAO deptDAO = new DepartmentDAOImpl();
				deptDAO.useOfCallabale();
				break;
			case 7: // add employee
				addNewEmployee();
				break;
			case 8: // get employee by id
				getEmployeeById();
				break;
			case 9:
				System.exit(0);
				break;

			}
		}

	}

	private static void getEmployeeById() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter employee id *****");
		Integer empId = sc.nextInt();
		// Making a call to service layer
		EmployeeService empService = new EmployeeServiceImpl();
		Employee emp = empService.getEmployee(empId);
		System.out.println(emp);

	}

	private static void addNewEmployee() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter employee id *****");
		Integer empId = sc.nextInt();
		System.out.println("****Enter employee name *****");
		String empName = sc.next();
		System.out.println("****Enter employee salary *****");
		Double salary = sc.nextDouble();
		System.out.println("****Enter employee year of birth *****");
		Integer empYearOfBirth = sc.nextInt();
		System.out.println("****Enter employee month of birth *****");
		Integer empMonthOfBirth = sc.nextInt();
		System.out.println("****Enter employee day of birth *****");
		Integer empDayOfBirth = sc.nextInt();
		System.out.println("****Enter employee department number *****");
		Integer deptNo = sc.nextInt();
		System.out.println("****Enter employee department name *****");
		String deptName = sc.next();

		System.out.println(" Creating employee ...... ");
		// Creating an object of Department class
		Employee emp = new Employee();
		emp.setEmpId(empId);
		emp.setEmpName(empName);
		emp.setSalary(salary);

		emp.setDateOfBirth(LocalDate.of(empYearOfBirth, empMonthOfBirth, empDayOfBirth));
		emp.setDepartment(new Department(deptNo, deptName));
		// Making a call to service layer
		EmployeeService empService = new EmployeeServiceImpl();
		Employee addedEmp = empService.addEmployee(emp);
		System.out.println(addedEmp);

	}

	private static void updateDepartment() {
		// Reading the user input
		Scanner sc = new Scanner(System.in);
		System.out.println("****Enter department number *****");
		Integer deptNo = sc.nextInt();
		System.out.println("****Enter department name *****");
		String deptName = sc.next();
		// Creating an object of Department class
		Department dept = new Department();
		dept.setDeptName(deptName);
		dept.setDeptNo(deptNo);
		// Making a call to service layer
		DepartmentService deptService = new DepartmentServiceImpl();
		Department updatedDept = deptService.updateDepartment(dept);
		System.out.println(updatedDept);

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
