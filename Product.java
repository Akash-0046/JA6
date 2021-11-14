package com;

public class Product {
	int productId;
	String productName;
	public Product(int productId, String productName) {
//		super();
		this.productId = productId;
		this.productName = productName;
	}
	public int getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
	

}
