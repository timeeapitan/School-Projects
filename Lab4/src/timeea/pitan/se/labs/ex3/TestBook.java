package timeea.pitan.se.labs.ex3;

import timeea.pitan.se.labs.ex2.*;

public class TestBook {
    public static void main(String[] args) {
        Author c=new Author("Lev Tolstoy", "Lev.Tolstoy@author.com",'m');
        Book book1=new Book("War and Peace", c, 99.99);
        Author d=new Author("George Orwell","g.orwell@gmail.com",'m');
        Book book2=new Book("1984", d, 49.99,1000);
        System.out.println(book1);
        System.out.println(book2);
        book2.setPrice(79.99);
        book2.setQtyInStock(2000);
        System.out.println("The are "+book2.getQtyInStock()+" copies of the book "+book2.getName()
        +" and each copy costs "+book2.getPrice());
        System.out.println(book2);


    }
}
