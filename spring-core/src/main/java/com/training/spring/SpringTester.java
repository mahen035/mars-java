package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.spring.config.ApplicationConfig;

public class SpringTester {

	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		//Person p1 = (Person)context.getBean("person");
		
		Person p1 = context.getBean(Person.class);
		
		System.out.println(p1.getFirstName());
		
		/*
		Person p2 = (Person)context.getBean("person");
		
		p2.setFirstName("Keith");
		
		System.out.println(p1.getPersonDetails());*/
		
		((AnnotationConfigApplicationContext) context).close();

	}

}
