package com.stocks.test;

import java.util.Map;

import com.stocks.model.business.StocksBusiness;
import com.stocks.model.business.impl.StocksBusinessImpl;

public class StocksDataFeedTest {

	public static void main(String[] args) {
		StocksBusiness sb = new StocksBusinessImpl();
		Map<String,Object> msg = sb.importData();
		System.out.println("Message: " + msg.get("message"));
	}

}
