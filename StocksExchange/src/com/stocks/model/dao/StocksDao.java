package com.stocks.model.dao;

import java.util.List;
import java.util.Map;
import com.stocks.model.Stock;
import com.stocks.model.StockScore;

public interface StocksDao {
	public List<Stock> getHighFrequencyStocks();
	public Map<String,Object> getHistoricalData(String symbol);
	public Map<String,Object> getHistoricalData();
	public StockScore getStockScore(String symbol, int numShare, double costPerShare, double low, double high);
	public Map<String,Object> importData();
	public int importData(List<Map<String,String>> stocksList);
	public List<Stock> getAllStocks();
	public List<Map<String,String>> viewDataFromPSE();
	public int removeData(String tradingDate);
	public void sendStocksUpdates();	
	public String buildBestBuyData(List<Stock> stocks);
	public void stocksMonitoring(String tradingDate);
	public String buildSellStocksData(List<Stock> sellStocks);
	public String buildBuyStocksData(List<Stock> sellStocks);
}
