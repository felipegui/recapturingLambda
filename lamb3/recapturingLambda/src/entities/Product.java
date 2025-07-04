package entities;

public class Product {

    private Double price;
    private String name;

    public Product(String name, Double price) {
        this.price = price;
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }
}
