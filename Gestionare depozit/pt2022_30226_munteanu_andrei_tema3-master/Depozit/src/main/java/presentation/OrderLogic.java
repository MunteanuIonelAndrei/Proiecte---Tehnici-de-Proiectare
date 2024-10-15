package presentation;

import bll.OrderBLL;
import model.Client;
import model.Order;
import model.Product;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class OrderLogic {

    Client selClient;
    Product selProduct;
    int cantitateCeruta;

    public OrderLogic(Client selClient, Product selProduct, int cantitateCeruta) throws IllegalAccessException, IOException, NoSuchFieldException {
    this.selClient=selClient;
    this.selProduct=selProduct;
    this.cantitateCeruta=cantitateCeruta;

    tryToInsert(cantitateCeruta);
    }

    private void tryToInsert( int cantitateCeruta) throws IllegalAccessException, IOException, NoSuchFieldException {

        Order order1 = new Order(selClient.getId(),selProduct.getId(), cantitateCeruta, selProduct.getPrice(),selProduct.getPrice()*cantitateCeruta );
        OrderBLL orderBLL = new OrderBLL();
        orderBLL.insertAutoIncr(order1,cantitateCeruta,selProduct.getQuantity());

    }




}
