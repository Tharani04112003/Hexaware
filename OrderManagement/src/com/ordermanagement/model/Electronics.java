package com.ordermanagement.model;

public class Electronics extends Product {
    public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	public void setWarrantyPeriod(int warrantyPeriod) {
		this.warrantyPeriod = warrantyPeriod;
	}

	private String brand;
    @Override
	public String toString() {
		return "Electronics [brand=" + brand + ", warrantyPeriod=" + warrantyPeriod + "]";
	}

	private int warrantyPeriod;

    public Electronics(int productId, String productName, String description, double price, int quantityInStock, String brand, int warrantyPeriod) {
        super(productId, productName, description, price, quantityInStock, "Electronics");
        this.brand = brand;
        this.warrantyPeriod = warrantyPeriod;
    }

   
}