package es.upgrade.cfg;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import es.upgrade.modelo.entidad.Computer;
import es.upgrade.modelo.entidad.Cpu;
import es.upgrade.modelo.entidad.GraphicCard;
import es.upgrade.modelo.entidad.MotherBoard;
import es.upgrade.modelo.entidad.Peripheral;
import es.upgrade.modelo.entidad.Ram;

@Configuration
@ComponentScan(basePackages = {"es.upgrade"})
public class ConfiguracionSpring {
	
	@Bean
	@Scope("prototype")
	public ArrayList<Ram> ramList() {
		
		Ram ram = new Ram();
		ArrayList<Ram> ramList = new ArrayList<Ram>();
		ram.setManufacturer("Corsair");
		ram.setPrice(47.99);
		ram.setSize(16);
		ramList.add(ram);
		return ramList;
		
	}
	
	@Bean
	@Scope("prototype")
	public ArrayList<Peripheral> peripheralList() {
		
		Peripheral peripheral = new Peripheral();
		ArrayList<Peripheral> peripheralList = new ArrayList<Peripheral>();
		peripheral.setManufacturer("Corsair");
		peripheral.setPrice(48.95);
		peripheral.setType("mouse");
		peripheralList.add(peripheral);
		return peripheralList;
		
		
	}
	
	@Bean
	public Computer computer(Cpu cpu, GraphicCard gc, MotherBoard mb) {
		
		Computer computer = new Computer();
		computer.setCpu(cpu);
		computer.setGraphicCard(gc);
		computer.setMotherBoard(mb);
		computer.setPeripheralList(peripheralList());
		computer.setRamList(ramList());
		computer.setPrice(850.95);
		return computer;
		
	}

}
