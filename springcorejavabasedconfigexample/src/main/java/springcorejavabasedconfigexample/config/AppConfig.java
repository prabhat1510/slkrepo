package springcorejavabasedconfigexample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springcorejavabasedconfigexample.model.Address;
import springcorejavabasedconfigexample.model.Employee;

@Configuration
@ComponentScan("springcorejavabasedconfigexample")
public class AppConfig {
	
	@Bean(name="employee")
	public Employee getEmployeeBean() {
		return new Employee();
	}
	

	@Bean("homeAddress")
	public Address getAddressBean() {
		return new Address();
	}
	
	@Bean(name="officeAddress")
	public Address getOfficeAddressBean() {
		return new Address();
	}
}
