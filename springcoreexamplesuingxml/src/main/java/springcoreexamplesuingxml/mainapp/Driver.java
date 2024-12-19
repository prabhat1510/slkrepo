package springcoreexamplesuingxml.mainapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcoreexamplesuingxml.model.Address;
import springcoreexamplesuingxml.model.Customer;

public class Driver {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Create a container
		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);

		// Here using context.getBean method we are trying to get instance of Customer
		// class
		Customer cust = context.getBean("customer", Customer.class);
		// Using cust object/bean instance we are accessing the object method
		System.out.println(cust.getCustId());
		System.out.println(cust.getName());
		System.out.println(cust.getAddress());
		System.out.println("****************************************Address bean***************");
		Address address = context.getBean("addressBean", Address.class);
		// Using address object/bean instance we are accessing the object method
		System.out.println(address.getCity());
		System.out.println(address.getAddressId());
		System.out.println("***********************************Other Address bean***************");
		Address otherAddress = context.getBean("otherAddressBean", Address.class);
		// Using address object/bean instance we are accessing the object method
		System.out.println(otherAddress.getCity());
		System.out.println(otherAddress.getAddressId());
		
		Address address1 = context.getBean("addressBean", Address.class);
		Address address2 = context.getBean("addressBean", Address.class);
		
		System.out.println(address1.hashCode());
		System.out.println(address2.hashCode());
		
	}
	

}
