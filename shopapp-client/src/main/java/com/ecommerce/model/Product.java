package com.ecommerce.model;


public class Product {

	private Long productid;

	private String productname;

	private String description;

	private int price;

	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Long getProductid() {
		return productid;
	}

	public Product(Long productid, String productname, String description, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.description = description;
		this.price = price;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public Product() {
		super();
	}

}
