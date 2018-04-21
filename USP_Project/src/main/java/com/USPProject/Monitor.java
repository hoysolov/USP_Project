package com.USPProject;

public class Monitor extends Stock{
	private Integer screenSize;

	Monitor(String makeModel, Integer quantity, Integer price, Integer screenSize) {
		super(makeModel, quantity, price);
		this.screenSize = screenSize;
	}


	public String toString() {
		return "Stock: " + super.getMakeModel() + " Screen size: " + screenSize + " Quantity: " + super.getQuantity()
				+ " Price: " + super.getPrice();
	}
}
