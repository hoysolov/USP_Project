package com.USPProject;

public class Camera extends Stock {
	private Integer cameraQuality;

	Camera(String makeModel, Integer quantity, Integer price, Integer cameraQuality) {
		super(makeModel, quantity, price);
		this.cameraQuality = cameraQuality;
	}

	public String toString() {
		return "Stock: " + super.getMakeModel() + " Camera quality: " + cameraQuality + " Quantity: "
				+ super.getQuantity() + " Price: " + super.getPrice();
	}
}