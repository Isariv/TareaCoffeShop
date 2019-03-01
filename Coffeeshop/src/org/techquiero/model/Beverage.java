package org.techquiero.model;


public class Beverage {
	private String name;
	private double price;
	private boolean withMilk;
	private int size;
	
//	public enum Size {
//		SMALL,
//		MEDUIM,
//		LARGE
//	}
	
	public Beverage() {}

	public Beverage(String name, double price, boolean withMilk, int size) {
		super();
		this.name = name;
		this.price = price;
		this.withMilk = withMilk;
		this.size = size;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isWithMilk() {
		return withMilk;
	}

	public void setWithMilk(boolean withMilk) {
		this.withMilk = withMilk;
	}

	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beverage [name=" + name + ", price=" + price + ", withMilk=" + withMilk + ", size=" + size + "]";
	}



}
