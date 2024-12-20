package springcorejavabasedconfigexample.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springcorejavabasedconfigexample.model.Address;
import springcorejavabasedconfigexample.model.Employee;

@Configuration
public class AppConfig {
	
	@Bean(name="employee")
	//@Qualifier("employee")
	public Employee getEmployeeBean() {
		return new Employee();
	}
	

	@Bean
	@Qualifier("homeAddress")
	//@Primary
	public Address getAddressBean() {
		return new Address();
	}
	
	@Bean
	@Qualifier("officeAddress")
	public Address getOfficeAddressBean() {
		return new Address();
	}
}
