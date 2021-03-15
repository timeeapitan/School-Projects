package timeea.pitan.se.labs.lab11.ex2;

public class Product {
    public String name;
    public int quantity;
    public static double price;

    public Product(){}

    public Product(String name, int quantity, double price){
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Products:\n" +
                "name= " + name + "\n"+
                "quantity= " + quantity +
                "\nprice= " + price;
    }

    public String getName() {
        return name;
    }
}
