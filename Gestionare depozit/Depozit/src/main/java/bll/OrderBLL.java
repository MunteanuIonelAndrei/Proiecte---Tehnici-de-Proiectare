package bll;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


import dao.OrderDAO;
import dao.ProductDAO;
import model.Order;
import model.Product;
import presentation.UpdateAux;
import presentation.UpdateComponent;

import javax.swing.*;

public class OrderBLL {
    private OrderDAO orderDAO;


    public OrderBLL() {

        orderDAO = new OrderDAO();
    }

    public List<Order> findAll() {
        List<Order> cl = orderDAO.findAll();
        if (cl == null) {
            throw new NoSuchElementException("The table was not found!");
        }
        return cl;
    }

    public void insertAutoIncr(Order x,int cantitateCeruta,int cantitateDisponibila) throws IllegalAccessException, IOException, NoSuchFieldException {

        System.out.println(cantitateCeruta+"\n");
        System.out.println(cantitateDisponibila);
        if(cantitateCeruta>cantitateDisponibila){
            JOptionPane.showMessageDialog(null, "Nu exista suficiente produse pentru comanda ceruta!");
            //return;
            throw new IllegalArgumentException("Nu exista suficiente produse pentru comanda ceruta!");

        }
        Order cl = orderDAO.insertAutoIncr(x);
        int idProd=x.getIdProduct();
        Product pro=new Product();
       ProductDAO productDAO = new ProductDAO();
       pro = productDAO.findById(idProd);
        UpdateComponent set = new UpdateComponent("quantity",pro.getQuantity()-cantitateCeruta);
        ArrayList<UpdateComponent> list1= new ArrayList<UpdateComponent>();
        list1.add(set);
        UpdateComponent where = new UpdateComponent("id",idProd);
        ArrayList<UpdateComponent> list2= new ArrayList<UpdateComponent>();
        list2.add(where);
        UpdateAux aux = new UpdateAux(list1,list2);
        ProductBLL productBLL = new ProductBLL();
        productBLL.update(pro,aux);
        x.generateBill();
    }


}
