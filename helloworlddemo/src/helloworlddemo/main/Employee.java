package helloworlddemo.main;

import java.time.LocalDate;

public class Employee {
	//empId
	//empName
	//dateOfBirth
	//salary
	//department
	private Integer empId;
	private String empName;
	private LocalDate dateOfBirth;
	private Double salary;
	private Department department;
	//No arg Constructor or default constructor
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	//Parameterized Constructor or All argument constructor
	public Employee(Integer empId, String empName, LocalDate dateOfBirth, Double salary, Department department) {
		this.empId = empId;
		this.empName = empName;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
		this.department = department;
	}
	//Accessor methods or getter/setter methods
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfBirth=" + dateOfBirth + ", salary="
				+ salary + ", department=" + department + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
