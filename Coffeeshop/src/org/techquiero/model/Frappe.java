package org.techquiero.model;



public class Frappe extends Beverage{
	
	private String cream;
	
//	public enum Cream{
//		ALMOND,
//		COCONUT,
//		SOYA,
//		RICE, 
//		HEAVY_CREAM,
//		HALF_AND_HALF
//	}

	public String getCream() {
		return cream;
	}

	public void setCream(String cream) {
		this.cream = cream;
	}

	public Frappe() {
		super();
	}

	public Frappe(String name, double price, boolean withMilk, int size, String cream) {
		super(name, price, withMilk, size);
		this.cream = cream;
	}

	@Override
	public String toString() {
		return "Frappe [cream=" + cream + "]";
	}	

}
