package ch.noseryoung.plj.demo;

public class Product {
	private String productName;
	private int price;
	private boolean isVeggi;
	
	
	
	public Product(String productName, int price, boolean isVeggi) {
		super();
		this.productName = productName;
		this.price = price;
		this.isVeggi = isVeggi;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isVeggi() {
		return isVeggi;
	}
	public void setVeggi(boolean isVeggi) {
		this.isVeggi = isVeggi;
	}
	
	


}
