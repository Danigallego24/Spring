package es.upgrade.modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GraphicCard {
	
	@Value(value = "Nvidia")
	private String manufacturer;
	
	@Value(value = "RTX 3060Ti")
	private String model;
	
	@Value(value = "4352")
	private int CUDACores;
	
	@Value(value = "350.99")
	private double price;
	
	@Autowired
	private Ram ram;
	
	public GraphicCard() {
		super();
	}
	
	public GraphicCard(String manufacturer, String model, int cUDACores, double price, Ram ram) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		CUDACores = cUDACores;
		this.price = price;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "GraphicCard [manufacturer=" + manufacturer + ", model=" + model + ", CUDACores=" + CUDACores
				+ ", price=" + price + ", ram=" + ram + "]";
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
	public int getCUDACores() {
		return CUDACores;
	}
	public void setCUDACores(int cUDACores) {
		CUDACores = cUDACores;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}
	
	
}
