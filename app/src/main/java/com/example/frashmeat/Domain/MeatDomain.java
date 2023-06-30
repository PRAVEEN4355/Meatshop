package com.example.frashmeat.Domain;

public class MeatDomain {
    private String Title;
    private String Image;
    private String Desc;
    private double price;
    private int star;
    private int time;
    private int calories;

    public MeatDomain(String title, String image, String desc, double price, int star, int time, int calories) {
        Title = title;
        Image = image;
        Desc = desc;
        this.price = price;
        this.star = star;
        this.time = time;
        this.calories = calories;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
