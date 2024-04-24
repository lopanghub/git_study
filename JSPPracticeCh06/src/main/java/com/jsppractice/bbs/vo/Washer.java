package com.jsppractice.bbs.vo;

public class Washer {
	private int no;
	private String name;
	private int price;
	private String manufacturer;
	private String productCode;
	private String function;
	
	public Washer() {}

	public Washer(int no, String name, int price, String manufacturer, String productcode, String function) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		this.manufacturer = manufacturer;
		this.productCode = productcode;
		this.function = function;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productcode) {
		this.productCode = productcode;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}
	
	
}
