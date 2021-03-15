package timeea.pitan.se.labs.ex4;

import timeea.pitan.se.labs.ex2.*;

public class TestBookLover {
    public static void main(String[] args) {
        Author[] a=new Author[4];
        a[0]=new Author("Cassandra Clare", "cassandra.clare@gmail.com", 'f');
        a[1]=new Author("Sarah Rees Brennan", "sarah.rees@gmail.com", 'f');
        a[2]=new Author("Maureen Johnson", "maureen.johnson@gmail.com", 'f');
        a[3]=new Author("Robin Wasserman", "robin.wasserman@gmail.com",'m');
        BookLover book1=new BookLover("Tales from Shadownhunter Academy", a, 99.99);
        System.out.println(book1);
        System.out.println("The name of the book is \'"+book1.getName()+"\'");
        book1.printAuthors();
        Author[] b=new Author[2];
        b[0]=new Author("John Green", "John.Green@gmail.com", 'm');
        b[1]=new Author("his wife", "John.Green.Wife@gmail.com", 'f');
        BookLover book2=new BookLover("John Green",b, 49.99, 100);
        System.out.println(book2);
        book2.setPrice(59.99);
        book2.setQtyInStock();
        System.out.println("The book \'"+book2.getName()+"\' costs "+book2.getPrice()+
                " and there are "+book2.getQtyInStock()+" copes in stock");
    }

}
