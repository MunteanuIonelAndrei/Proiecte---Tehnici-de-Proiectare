package BusinessLogic;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
    private int orderID;
    private int clientID;
    private LocalDateTime orderDate;

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
    @Override
    public String toString()
    {
        return this.getClientID()+" "+this.getOrderID()+" "+this.getOrderDate().toString();
    }
    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Order(int orderID, int clientID, LocalDateTime orderDate) {
        this.orderID = orderID;
        this.clientID = clientID;
        this.orderDate = orderDate;
    }


    /*public int hashCode(int key){
        return key;
    }*/


    @Override
    public int hashCode() { //asta imi calculeaza cheia la care-s mapate initial
        int result=0;
        //calc pe baza atributelor comenzii
        result+=this.getClientID()+this.getOrderID();
        result=result%9973;//pun un nr prim mare
        return result;
    }
    @Override
    public boolean equals(Object obj) { //asta imi calc locul exatc din lista de chaining
        if (obj == this)
            return true;
        if (!(obj instanceof Order))
            return false;
        Order comanda = (Order) obj;
        //aici nuj sigur daca e implementat corect
        return comanda.getOrderID()==this.getOrderID() && comanda.getOrderDate().equals(this.getOrderDate()) &&
                comanda.getClientID()==this.getClientID();
    }
}
