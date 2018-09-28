package com.verizon.jdbc.model;

public class Item {
	
	private int iCode;
	private String iName;
	private Double iPrice;
	
	public Item() {
		
	}

	public Item(int iCode, String iName, Double iPrice) {
		//super();
		this.iCode = iCode;
		this.iName = iName;
		this.iPrice = iPrice;
	}

	public int getiCode() {
		return iCode;
	}

	public void setiCode(int iCode) {
		this.iCode = iCode;
	}

	public String getiName() {
		return iName;
	}

	public void setiName(String iName) {
		this.iName = iName;
	}

	public Double getiPrice() {
		return iPrice;
	}

	public void setiPrice(Double iPrice) {
		this.iPrice = iPrice;
	}

	@Override
	public String toString() {
		return "Item [iCode=" + iCode + ", iName=" + iName + ", iPrice=" + iPrice + "]";
	}
	
	

}
