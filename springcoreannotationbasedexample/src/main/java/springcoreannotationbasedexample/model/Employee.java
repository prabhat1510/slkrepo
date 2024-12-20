package springcoreannotationbasedexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="emp")//using value attribute we are assigning name to the component Employee
public class Employee {
	private Integer empId;
	private String empName;
	
	@Autowired
	@Qualifier("homeAddress")
	private Address homeAddress;
	
	@Autowired
	@Qualifier("officeAddress")
	private Address officeAddress;

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

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", homeAddress=" + homeAddress + ", officeAddress="
				+ officeAddress + "]";
	}
	
}
