package com.csc340.demo;

public class Car {
    public String type;
    public String model;
    public String brand;

    public Car (String type, String model, String brand) {
        this.type = type;
        this.model = model;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}
