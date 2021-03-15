package timeea.pitan.se.labs.ex4;

import timeea.pitan.se.labs.ex2.*;

public class BookLover {
    private String name;
    private Author[] authors;
    private double price;
    private int qtyInStock;

    public BookLover(String name, Author[] authors, double price, int qtyInStock){
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qtyInStock=qtyInStock;
    }

    public BookLover(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public String getName(){
        return name;
    }

    public Author[] getAuthors(){
        return authors;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public int getQtyInStock(){
        return qtyInStock;
    }

    public void setQtyInStock(){
        this.qtyInStock=qtyInStock;
    }

    public String toString(){
        return "\'"+getName()+"\' by "+ authors.length + " authors";
    }

    public void printAuthors(){
        System.out.println("The authors who wrote the book are: ");
        for(int i=0; i<authors.length; i++)
            System.out.println(authors[i].getName());
    }
}
