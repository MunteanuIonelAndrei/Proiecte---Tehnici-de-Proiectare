package start;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import bll.ClientBLL;
import model.Client;
import presentation.UpdateAux;
import presentation.UpdateComponent;
import presentation.View;

/**
 * @Author: Technical University of Cluj-Napoca, Romania Distributed Systems
 *          Research Laboratory, http://dsrl.coned.utcluj.ro/
 * @Since: Apr 03, 2017
 */
public class Start {
    protected static final Logger LOGGER = Logger.getLogger(Start.class.getName());

    public static void main(String[] args) throws SQLException, IllegalAccessException, NoSuchFieldException {
     //   ClientBLL clientBll = new ClientBLL();


       View v= new View();

        /*Client client1=new Client();
        ClientBLL clientBLL = new ClientBLL();

        client1=clientBLL.findClientById(Integer.parseInt("14"));
        ReflectionExample.retrieveProperties(client1);*/
        /*UpdateComponent updateComponent= new UpdateComponent("address","strada fericirii");
        UpdateComponent updateComponent1= new UpdateComponent("age",12);
        ArrayList<UpdateComponent> arrayList=new ArrayList<>();
        arrayList.add(updateComponent);
        ArrayList<UpdateComponent> arrayList1=new ArrayList<>();
        arrayList1.add(updateComponent1);
        UpdateAux updateAux= new UpdateAux(arrayList,arrayList1);

        ClientBLL client=new ClientBLL();
        Client client2= new Client();

        client.update(client2,updateAux);*/

       // ClientBLL clientBll1 = new ClientBLL();

        //UpdateAux up = new UpdateAux()

     /*   List<Client> cli= clientBll1.findAll();

*//*
        try {
            client1 = clientBll.findClientById(1234);

        } catch (Exception ex) {
            LOGGER.log(Level.INFO, ex.getMessage());
        }*//*

        // obtain field-value pairs for object through reflection
       for (int i=0;i< cli.size();i++) {
           ReflectionExample.retrieveProperties(cli.get(i));
        }*/

        //ReflectionExample.retrieveProperties(client1);

    }
}


