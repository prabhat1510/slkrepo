package beanlifecycleanotherexample.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beanlifecycleanotherexample.beans.MySpringBean;
import beanlifecycleanotherexample.config.MySpringConfiguration;

public class Driver {

	public static void main(String[] args) {
		// Creating IOC Container
		ApplicationContext context4 = new AnnotationConfigApplicationContext(MySpringConfiguration.class);
		// Getting Bean
		MySpringBean mySpringBean = (MySpringBean) context4.getBean("mySpringBean");
		// Closing the context
		((AbstractApplicationContext) context4).registerShutdownHook();

	}

}
