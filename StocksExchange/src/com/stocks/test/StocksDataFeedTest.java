package com.stocks.test;

import java.util.Map;

import com.stocks.model.dao.impl.StocksDaoImpl;

public class StocksDataFeedTest {

	public static void main(String[] args) {
		StocksDaoImpl ss = new StocksDaoImpl();
		Map<String,Object> msg = ss.importData();
		System.out.println("Message: " + msg.get("message"));
	}

}
