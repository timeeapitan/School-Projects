package timeea.pitan.se.labs.ex2;

public class TestAuthor {
    public static void main(String[] args) {
        Author a=new Author("John Green", "john.green@gmail.com", 'm');
        Author b=new Author("Paulo Coelho","paulo.coelho@gmail.com",'m');
        System.out.println(a);
        System.out.println(b);
        b.setEmail("paulo.istheman@hotmail.com");
        System.out.println(b);
    }
}
