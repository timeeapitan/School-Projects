package timeea.pitan.lab3.ex3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a=new Author("Agatha Christie", "agatha.christie@gmail.com", 'f');
        a.getName();
        a.getEmail();
        a.setEmail("Agatha.Christie@student.utcluj.ro");
        System.out.println(a);
        a.getGender();
    }
}
