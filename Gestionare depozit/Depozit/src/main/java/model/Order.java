package model;

import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private int idOrder;
    private int idClient;
    private int idProduct;
    private int quantity;
    private int pricePerUnit;
    private int totalPrice;

    public Order(int idClient,int idProduct,int quantity,int pricePerUnit,int totalPrice){

      /*  OrderBLL orderBll1 = new OrderBLL();
        List<Order> cli= orderBll1.findAll();
        this.idOrder=cli.size();*/
        this.idClient=idClient;
        this.idProduct=idProduct;
        this.quantity=quantity;
        this.pricePerUnit=pricePerUnit;
        this.totalPrice=totalPrice;
    }

    public void generateBill() throws IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("Factura");
        sb.append("\n");
        sb.append("Factura Numarul "+ idOrder);
        sb.append("\n");
        sb.append("Client "+ idClient);
        sb.append("\n");
        sb.append("Cantitate "+ quantity);
        sb.append("\n");
        sb.append("Pret/Buc "+ pricePerUnit);
        sb.append("\n");
        sb.append("Pret Total "+ totalPrice);
        generateBill2(sb);

    }

    private void generateBill2(StringBuilder sb) throws IOException {
        FileWriter writer = new FileWriter("Factura.txt");

        String done = sb.toString();
        writer.write(done);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerUnit(int pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public int getPricePerUnit() {
        return pricePerUnit;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
