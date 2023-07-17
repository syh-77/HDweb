package com.example.servlet_test.model;

public class GoodsModel {
    private int id;
    private String gName;
    private String color;
    private double price;

    public GoodsModel() {
    }

    public GoodsModel(int id, String gName, String color, double price) {
        this.id = id;
        this.gName = gName;
        this.color = color;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "GoodsModel{" +
                "id=" + id +
                ", gName='" + gName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
