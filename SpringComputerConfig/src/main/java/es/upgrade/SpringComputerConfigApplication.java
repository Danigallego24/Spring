package es.upgrade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import es.upgrade.cfg.ConfiguracionSpring;
import es.upgrade.modelo.entidad.Computer;

@SpringBootApplication
public class SpringComputerConfigApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(ConfiguracionSpring.class, args);
		
		Computer computer = context.getBean("computer", Computer.class);
		
		System.out.println(computer);
		
	}

}
