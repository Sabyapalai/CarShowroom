package com.test.project;

public class Car {
	private int id;
	private String name;
	private String model;
	private double price;

	public Car(int id, String name, String model, double price) {
		this.id = id;
		this.name = name;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car [ID=" + id + ", Name=" + name + ", Model=" + model + ", Price=" + price + "]";
	}
}
