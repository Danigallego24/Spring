package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Computer;

public class Main {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("contextComputer.xml");
		
		Computer c = context.getBean("computer",Computer.class);
		
		c.setPrice(850);
		System.out.println(c);

	}

}
