package com.example.muneraapplication;

public class Book {
    private String name;
    private int image;
    private String attack;
    private String total;


    public Book(String name, int image, String attack, String total) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.total = total;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getImage() { return image; }

    public void setImage(int image) { this.image = image; }

    public String getAttack() { return attack; }

    public void setAttack(String attack) { this.attack = attack; }

    public String getTotal() { return total; }

    public void setTotal(String total) { this.total = total;
    }
}