package springcorescopeexample.mainapp;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springcorescopeexample.beans.Order;

public class Driver {

	public static void main(String[] args) {
		// configuration metadata
		String springConfigurationFile = "springconfig.xml";

		// Create a container
		// Instantiating a Spring IoC container
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(springConfigurationFile);
		Order order = context.getBean("order",Order.class);
		
		System.out.println(order);
		System.out.println("************************After order is created values are set*************");
		order.setOrderId(1);
		order.setDescription("Diljeet Dosanjh Dillumanati");
		order.setAmount(1500000);
		System.out.println("****************after setting the data***************");
		System.out.println(order);
		System.out.println("*******************Address of order object or bean*******************");
		System.out.println(order.hashCode());
		
		System.out.println("******************New order1 object is created ****************************");
		Order order1 = context.getBean("order",Order.class);
		System.out.println(order1);
		System.out.println(order1.hashCode());
		System.out.println("******************newOrder object is created ****************************");
		Order newOrder = context.getBean("newOrder",Order.class);
		System.out.println(newOrder);
		System.out.println(newOrder.hashCode());
		System.out.println("******************newOrder a different object  is created i.e referred by newOrder1****************************");
		Order newOrder1 = context.getBean("newOrder",Order.class);
		System.out.println(newOrder1);
		System.out.println(newOrder1.hashCode());
		
		
	}

}
