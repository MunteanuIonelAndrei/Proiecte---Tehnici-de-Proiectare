package model;

public class Product {


    private int id;
    private String name;
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(int id, String name, int quantity, int price) {
        super();
        this.id = id;
        this.name = name;
        this.quantity=quantity;
        this.price = price;
    }

    public Product( String name, int price,int quantity) {
        super();
        this.name = name;
        this.quantity=quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name +"quantity"+quantity+ "price=" + price
                + "]";
    }
}
