package beanlifecycle.beans;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

public class Book implements InitializingBean, DisposableBean, BeanFactoryAware,
		ApplicationContextAware, BeanNameAware {
	// Property or field of Book class
	private String bookName;

	// Constructor
	public Book() {
		System.out.println("Constructor of Book bean is called !! ");
	}

	// Parameterized constructor
	public Book(String bookName) {
		this.bookName = bookName;
	}

	// Getter Method
	public String getBookName() {
		return bookName;
	}

	// Setter Method
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	// ToString method
	@Override
	public String toString() {
		return "Book{" + "bookName='" + bookName + '\'' + '}';
	}

	// implementation InitializingBean method
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of Book bean is called !! ");
	}

	// implementation of BeanFactoryAware method

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method of AwareBeanImpl is called");
		System.out.println("setBeanFactory:: AwareBeanImpl singleton= " + beanFactory.isSingleton("bookBean"));

	}
	
	// implementation of ApplicationContextAware method
		@Override
		public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
			System.out.println("setApplicationContext method of AwareBeanImpl is called");
			System.out.println("setApplicationContext:: Bean Definition Names= "
					+ Arrays.toString(applicationContext.getBeanDefinitionNames()));

		}

	// implementation of BeanNameAware method
	@Override
	public void setBeanName(String beanName) {
		System.out.println("setBeanName method of AwareBeanImpl is called");
		System.out.println("setBeanName:: Bean Name defined in context= " + beanName);

	}

	

	// implementation DisposableBean destroy method
	public void destroy() throws Exception {
		System.out.println("Destroy method of Book bean called !! ");
	}

}
