package com.USPProject;

public abstract class Stock {
	private String makeModel;
	private Integer quantity;
	private Integer price;
	
	
	Stock(String makeModel, Integer quantity, Integer price){
		this.makeModel = makeModel;
		this.quantity = quantity;
		this.price = price;
	}
	
	protected Integer getQuantity() {
		return quantity;
	}
	
	protected Integer getPrice() {
		return price;
	}

	public String getMakeModel() {
		return makeModel;
	}
	
}
