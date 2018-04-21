package com.USPProject;

public class Phone extends Stock {
	private Integer screenSize;
	private String processor;
	private Integer ram;

	Phone(String makeModel, String processor, Integer ram, Integer quantity, Integer price,
			Integer screenSize) {
		super(makeModel, quantity, price);
		this.screenSize = screenSize;
		this.processor = processor;
		this.ram = ram;
	}
	
	public String toString() {
		return "Stock: " + super.getMakeModel() + " Screen size: " + screenSize + " Processor: " + processor
				+ " Ram: " + ram + " Quantity: " + super.getQuantity() + " Price: " + super.getPrice();
	}
}
