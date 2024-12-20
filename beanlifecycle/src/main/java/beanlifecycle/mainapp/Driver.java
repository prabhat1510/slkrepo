package beanlifecycle.mainapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import beanlifecycle.beans.Book;
import beanlifecycle.config.AppConfig;

public class Driver {

	public static void main(String[] args) {
		// Creating IOC Container
		ApplicationContext context4 = new AnnotationConfigApplicationContext(AppConfig.class);
		// Getting Bean
		Book bookBean = (Book) context4.getBean("bookBean");
		// Closing the context
		((AbstractApplicationContext) context4).registerShutdownHook();

	}

}
