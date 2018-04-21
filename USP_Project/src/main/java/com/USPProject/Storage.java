package com.USPProject;

import java.util.ArrayList;
import java.util.List;

public class Storage {
	private List<Stock> allStocks;
	
	Storage(){
		allStocks = new ArrayList<>();
		allStocks.add(new Monitor("Samsung W220", 2, 125, 22));
		allStocks.add(new Monitor("Samsung W221", 5, 250, 27));
		allStocks.add(new Monitor("Asus G222", 2, 125, 22));
		allStocks.add(new Monitor("Asus A223", 5, 250, 27));
		allStocks.add(new Monitor("Lenovo Q224", 5, 250, 27));
		allStocks.add(new Phone("Samsung S8", "DualCore", 2, 5, 250, 27));
		allStocks.add(new Phone("Samsung S8+", "QuadCore", 2, 5, 250, 27));
		allStocks.add(new Phone("Huawei P10", "QuadCore", 2, 5, 250, 27));
		allStocks.add(new Phone("Huawei P10+", "QuadCore", 2, 5, 250, 27));
		allStocks.add(new Phone("Huawei P9 Lite", "QuadCore", 2, 5, 250, 27));
		allStocks.add(new Camera("Canon J22", 10, 1200, 22));
		allStocks.add(new Camera("Canon J23", 10, 1300, 20));
		allStocks.add(new Camera("Nikon Aspect", 10, 800, 22));
		allStocks.add(new Camera("Nikon Eagle", 10, 1000, 22));
		allStocks.add(new Camera("Panasonic 22", 10, 500, 22));
	}

	public void showAllStocks() {
		for (Stock stock : allStocks) {
			System.out.println(stock);
		}
	}
	
	public void addStockInStorage(Stock newStock) {
		allStocks.add(newStock);
	}
	
	public void searchStock(String searchedBrand) {
		for (Stock stock: allStocks) {
			if((stock.getMakeModel()).contains(searchedBrand)) {
				System.out.println(stock);
			}
		}
	}
}
