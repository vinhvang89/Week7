package BaiTapGiaoThem1;

import java.util.Arrays;

public abstract class Book {
    private int code;
    private String name;
    private int price;
    private String author;
    public Book(){

    }
    public Book(int code, String name, int price, String author) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String toString(){
        return "Code : " + Integer.toString(this.getCode())+" -"+ " Name : "
                + this.getName()+" -"+ " Price : " + Integer.toString(this.getPrice());
    }
}




