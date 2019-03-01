package org.techquiero.model;

public class Tea extends Beverage{
	
	private String leave;
	
//	public enum Leave{
//		MATCHA,
//		CHAMOMILLE,
//		CHAI,
//		GREEN,
//		RED,
//		BLACK,
//		WHITE,
//		RASPERRY,
//		CRANBERRY,
//		PASSION_FRUIT
//	}

	public String getLeave() {
		return leave;
	}

	public void setLeave(String leave) {
		this.leave = leave;
	}

	public Tea() {
		super();
	}

	public Tea(String name, double price, boolean withMilk, int size, String leave) {
		super(name, price, withMilk, size);
		this.leave = leave;
	}

	@Override
	public String toString() {
		return "Tea [leave=" + leave + "]";
	}

}
