package beanlifecycle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import beanlifecycle.beans.Book;
import beanlifecycle.processor.MyBeanPostProcessor;

@Configuration
@ComponentScan("beanlifecycle")
public class AppConfig {

	@Bean(name = "bookBean")
	public static Book getBookBean() {
		return new Book();
	}

	@Bean
	public MyBeanPostProcessor myBeanPostProcessor() {
		return new MyBeanPostProcessor();
	}

	/*
	 * @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod") public
	 * MySpringBean mySpringBean(){ return new MySpringBean(); }
	 */
}