package springcorejavabasedconfigexample.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springcorejavabasedconfigexample.config.AppConfig;
import springcorejavabasedconfigexample.model.Address;
import springcorejavabasedconfigexample.model.Employee;

public class Driver {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Address hAddress = context.getBean("homeAddress",Address.class);
		hAddress.setAddressId(1);
		hAddress.setCity("Ahmedabad");
		
		Address oAddress = context.getBean("officeAddress",Address.class);
		
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
	}
}
