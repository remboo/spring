package com.johnremboo.spring.aop;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		/**
		 * Provides all components and beans to Spring container using AnnotationConfigApplicationContext
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Service service = context.getBean("service", Service.class);
		service.hi();
		service.bye();
		System.out.println(service.getValue());
	}
}
