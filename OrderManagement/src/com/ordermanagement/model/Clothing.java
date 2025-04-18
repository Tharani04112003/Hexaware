package com.ordermanagement.model;


public class Clothing extends Product {
    public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String size;
	
    @Override
	public String toString() {
		return "Clothing [size=" + size + ", color=" + color + "]";
	}

	private String color;

    public Clothing(int productId, String productName, String description, double price, int quantityInStock, String size, String color) {
        super(productId, productName, description, price, quantityInStock, "Clothing");
        this.size = size;
        this.color = color;
    }

}