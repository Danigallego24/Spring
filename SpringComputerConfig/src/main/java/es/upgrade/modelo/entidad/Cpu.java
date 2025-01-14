package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cpu {
	
	@Value(value = "Intel")
	private String manufacturer;
	
	@Value(value = "i7 12700KF")
	private String model;
	
	@Value(value = "12")
	private int numberOfCores;
	
	@Value(value = "320.99")
	private double price;
	
	public Cpu(String manufacturer, String model, int numberOfCores, double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.numberOfCores = numberOfCores;
		this.price = price;
	}
	public Cpu() {
		super();
	}
	
	@Override
	public String toString() {
		return "Cpu [manufacturer=" + manufacturer + ", model=" + model + ", numberOfCores=" + numberOfCores
				+ ", price=" + price + "]";
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getNumberOfCores() {
		return numberOfCores;
	}
	public void setNumberOfCores(int numberOfCores) {
		this.numberOfCores = numberOfCores;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
