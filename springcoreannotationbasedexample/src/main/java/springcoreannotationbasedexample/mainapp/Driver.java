package springcoreannotationbasedexample.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcoreannotationbasedexample.model.Address;
import springcoreannotationbasedexample.model.Employee;

public class Driver {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		Address hAddress = context.getBean("homeAddress",Address.class);
		hAddress.setAddressId(1);
		hAddress.setCity("Ahmedabad");
		
		Address oAddress = context.getBean("officeAddress",Address.class);
		
		
		//Employee emp = context.getBean("employee",Employee.class);
		Employee emp = context.getBean("emp",Employee.class);
		System.out.println(emp);
		emp.setEmpId(111);
		emp.setEmpName("Sujan Arora");
		emp.setHomeAddress(hAddress);
		emp.setOfficeAddress(oAddress);
		System.out.println(emp);
		
		
	}

}
