package com.example.myapplication.module;

public class Food {
    private  String name;
    private String categ;
    private String price;
    private  int img;

    public Food(String name, String categ, String price, int img) {
        this.name = name;
        this.categ = categ;
        this.price = price;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getCateg() {
        return categ;
    }

    public String getPrice() {
        return price;
    }

    public int getImg() {
        return img;
    }
}
