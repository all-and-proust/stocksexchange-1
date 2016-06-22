package com.stocks.model;
import java.util.Date;

public class Stock {
	private String stockSymbol;
	private long stockValue;
	private double lastPrice;
	private int frequency;
	private Date closingDate;

	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public long getStockValue() {
		return stockValue;
	}
	public void setStockValue(long stockValue) {
		this.stockValue = stockValue;
	}
	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public int getFrequency(){
		return frequency;
	}
	public void setFrequency(int frequency){
		this.frequency = frequency;
	}
	public Date getClosingDate(){
		return closingDate;
	}
	public void setClosingDate(Date closingDate){
		this.closingDate = closingDate;
	}
	
}
