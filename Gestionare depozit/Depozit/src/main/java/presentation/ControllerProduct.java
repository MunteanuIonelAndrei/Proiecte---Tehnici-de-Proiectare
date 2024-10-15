package presentation;

import bll.ClientBLL;
import bll.ProductBLL;
import model.Client;
import model.Product;
import start.ReflectionExample;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ControllerProduct {


    private int id;
    private String name;
    private int quantity;
    private int price;

    ArrayList<UpdateComponent> arrayListSet=new ArrayList<>();
    ArrayList<UpdateComponent> arrayListWhere=new ArrayList<>();

    public ControllerProduct(ArrayList<String> set,ArrayList<String> where) throws NoSuchFieldException, IllegalAccessException {
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
                    UpdateComponent updateComponent= new UpdateComponent("quantity",set.get(i));
                    arrayListSet.add(updateComponent);
                }else if(i==3){
                    UpdateComponent updateComponent= new UpdateComponent("price",set.get(i));
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
                    UpdateComponent updateComponent= new UpdateComponent("quantity",where.get(i));
                    arrayListWhere.add(updateComponent);
                }else if(i==3){
                    UpdateComponent updateComponent= new UpdateComponent("price",where.get(i));
                    arrayListWhere.add(updateComponent);
                }else break;

            }
        }

        update(arrayListSet,arrayListWhere);

    }

    public ControllerProduct(Object button,ArrayList<String> date) throws IllegalAccessException {

        if (button==ProductView.b){
            try{
                ProductBLL clientBll1 = new ProductBLL();
                List<Product> cli= clientBll1.findAll();
                for (int i=0;i<cli.size();i++) {
                    ReflectionExample.retrieveProperties(cli.get(i));
                }
                new Table(cli);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }else if(button==ProductView.b1){
            Product product1=new Product();
            ProductBLL productBLL = new ProductBLL();

            product1= productBLL.findProductById(Integer.parseInt(date.get(0)));
            ReflectionExample.retrieveProperties(product1);
            ArrayList<Product> pro = new ArrayList<>();
            pro.add(product1);
            new Table(pro);


        }else if(button==ProductView.b2){
            try{
                Product product1 = new Product(Integer.parseInt(date.get(0)),date.get(1), Integer.parseInt(date.get(2)), Integer.parseInt(date.get(3)) );
                ProductBLL productBLL = new ProductBLL();
                productBLL.insert(product1);
            }catch(Exception exception){
                JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        } else if(button==ProductView.b3){
            try{
                ProductBLL productBLL = new ProductBLL();

                productBLL.deleteById(Integer.parseInt(date.get(0)));
            }catch(Exception exception){
                JOptionPane.showMessageDialog(new JFrame(),exception.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    private void update(ArrayList<UpdateComponent> set,ArrayList<UpdateComponent> where) throws NoSuchFieldException, IllegalAccessException {
        UpdateAux updateAux= new UpdateAux(set,where);

        ProductBLL product=new ProductBLL();
        Product product2= new Product();

        product.update(product2,updateAux);
    }
}
