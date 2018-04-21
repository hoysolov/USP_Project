package com.USPProject;

public class Main {

	public static void main(String[] args) {
		Storage myStorage = new Storage();
		
		myStorage.showAllStocks();
		myStorage.addStockInStorage(new Phone("Huawei P20", "myProcess", 2, 5, 250, 27));
		System.out.println();
		myStorage.searchStock("Huawei");
		
	}
}
