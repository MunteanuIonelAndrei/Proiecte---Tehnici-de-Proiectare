package presentation;

import bll.ClientBLL;
import model.Client;
import start.ReflectionExample;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private int id;
    private String name;
    private String address;
    private String email;
    private Integer age;
    ArrayList<UpdateComponent> arrayListSet=new ArrayList<>();
    ArrayList<UpdateComponent> arrayListWhere=new ArrayList<>();

public Controller(ArrayList<String> set,ArrayList<String> where) throws NoSuchFieldException, IllegalAccessException {
    for(int i=0;i< set.size();i++){
        if (set.get(i).equals("")){
            continue;
        }else if(set.get(i)!=null){
            if(i==0){
                UpdateComponent updateComponent= new UpdateComponent("id",set.get(i));
                arrayListSet.add(updateComponent);
            }else if(i==1){
                UpdateComponent updateComponent= new UpdateComponent("name",set.get(i));
                arrayListSet.add(updateComponent);
            }else if(i==2){
                UpdateComponent updateComponent= new UpdateComponent("address",set.get(i));
                arrayListSet.add(updateComponent);
            }else if(i==3){
                UpdateComponent updateComponent= new UpdateComponent("email",set.get(i));
                arrayListSet.add(updateComponent);
            }else if(i==4){
                UpdateComponent updateComponent= new UpdateComponent("age",set.get(i));
                arrayListSet.add(updateComponent);
            }else break;

        }
    }

    for(int i=0;i< where.size();i++){
        if (where.get(i).equals("")){
            continue;
        }else if(where.get(i)!=null){
            if(i==0){
                UpdateComponent updateComponent= new UpdateComponent("id",where.get(i));
                arrayListWhere.add(updateComponent);
            }else if(i==1){
                UpdateComponent updateComponent= new UpdateComponent("name",where.get(i));
                arrayListWhere.add(updateComponent);
            }else if(i==2){
                UpdateComponent updateComponent= new UpdateComponent("address",where.get(i));
                arrayListWhere.add(updateComponent);
            }else if(i==3){
                UpdateComponent updateComponent= new UpdateComponent("email",where.get(i));
                arrayListWhere.add(updateComponent);
            }else if(i==4){
                UpdateComponent updateComponent= new UpdateComponent("age",where.get(i));
                arrayListWhere.add(updateComponent);
            }else break;

        }
    }

update(arrayListSet,arrayListWhere);

}

public Controller(Object button,ArrayList<String> date) throws IllegalAccessException {

    if (button==ClientView.b){
        try{
        ClientBLL clientBll1 = new ClientBLL();
        List<Client> cli= clientBll1.findAll();
        for (int i=0;i<cli.size();i++) {
            ReflectionExample.retrieveProperties(cli.get(i));
        }
            new Table(cli);
            //JTable t = new JTable(cli);
        //View.clientView.setPanel(new Table(cli).tableDone);
        }catch(Exception exception){
            JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }else if(button==ClientView.b1){
        Client client1=new Client();
        ClientBLL clientBLL = new ClientBLL();

           client1= clientBLL.findClientById(Integer.parseInt(date.get(0)));
        ReflectionExample.retrieveProperties(client1);
       ArrayList<Client> cli = new ArrayList<>();
       cli.add(client1);
        new Table(cli);


    }else if(button==ClientView.b2){
        try{
            Client client1 = new Client(Integer.parseInt(date.get(0)),date.get(1), date.get(2), date.get(3),Integer.parseInt(date.get(4)) );
            ClientBLL clientBLL = new ClientBLL();
            clientBLL.insert(client1);
        }catch(Exception exception){
            JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    } else if(button==ClientView.b3){
        try{
        ClientBLL clientBLL = new ClientBLL();

        clientBLL.deleteById(Integer.parseInt(date.get(0)));
    }catch(Exception exception){
        JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
    }
    }
}


    private void update(ArrayList<UpdateComponent> set,ArrayList<UpdateComponent> where) throws NoSuchFieldException, IllegalAccessException {
        UpdateAux updateAux= new UpdateAux(set,where);

        ClientBLL client=new ClientBLL();
        Client client2= new Client();

        client.update(client2,updateAux);
    }
}



