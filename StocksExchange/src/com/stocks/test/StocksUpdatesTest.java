package com.stocks.test;

import java.util.List;
import java.util.Map;

import com.stocks.model.dao.impl.StocksDaoImpl;

public class StocksUpdatesTest {

	public static void main(String[] args) {
		StocksDaoImpl ss = new StocksDaoImpl();
		ss.removeData("2016-07-01");
		List<Map<String,String>> liveDataFromPSE = ss.viewDataFromPSE();
		int importResult = ss.importData(liveDataFromPSE);
		if(importResult == 0){
			System.out.println("Successfully imported stocks data.");
		} else {
			System.out.println("Import of stocks data has failed.");
		}
		ss.sendStocksUpdates();

	}

}
