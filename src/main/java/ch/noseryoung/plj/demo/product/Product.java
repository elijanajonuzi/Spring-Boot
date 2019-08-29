package ch.noseryoung.plj.demo.product;

public class Product {
	private String productName;
	private long price;
	private boolean isVeggi;
	
	public Product(){
	}
	
	public Product(String productName, long price, boolean isVeggi) {
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
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public boolean isVeggi() {
		return isVeggi;
	}
	public void setVeggi(boolean isVeggi) {
		this.isVeggi = isVeggi;
	}
	
	


}
