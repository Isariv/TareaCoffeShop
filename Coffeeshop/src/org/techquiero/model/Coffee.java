package org.techquiero.model;

public class Coffee extends Beverage {
	
	private String grain;
	
//	public enum Grain{
//		ARABICA,
//		ROBUSTA,
//		LIBERICA,
//		EXCELSA
//	}
	
	public String getGrain() {
		return grain;
	}

	public void setGrain(String grain) {
		this.grain = grain;
	}
	public Coffee() {
		super();
	}
	public Coffee(String name, double price, boolean withMilk, int size, String grain) {
		super(name, price, withMilk, size);
		this.grain = grain;
	}

	@Override
	public String toString() {
		return "Tu café  está en preparación, es un " + getName() + " con grano " + grain + " su precio final "
				+ "será de " + getPrice(); 
	}


} 