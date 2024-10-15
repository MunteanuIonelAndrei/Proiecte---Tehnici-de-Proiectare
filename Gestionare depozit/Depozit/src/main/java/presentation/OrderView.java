package presentation;

import dao.ClientDAO;
import dao.ProductDAO;
import model.Client;
import model.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderView extends JFrame implements ActionListener {

    JLabel l;
    JLabel l1;
    JLabel l2;
    JPanel p;
    JPanel p1;
    JComboBox c;
    JComboBox c1;
    JTextField t;
    static JButton b;


    public OrderView(){
        ClientDAO clientDAO=new ClientDAO();
        List<Client> clients=clientDAO.findAll();
        ArrayList<String> clientNames=new ArrayList<>();
        clientNames.add("Select client");
        for(Client client:clients)
            clientNames.add(client.getName());
        c = new JComboBox(clientNames.toArray());
        c.setForeground(new Color(105,145,142));
        c.setBackground(new Color(68,69,70));


        ProductDAO productDAO=new ProductDAO();
        List<Product> products=productDAO.findAll();
        ArrayList<String> productNames=new ArrayList<>();
        productNames.add("Select product");
        for(Product product:products)
            productNames.add(product.getName());
        c1 = new JComboBox(productNames.toArray());
        c1.setForeground(new Color(105,145,142));
        c1.setBackground(new Color(68,69,70));

        t = new JTextField();
        t.setFont(new Font("MV Boli",Font.PLAIN,13));
        t.setForeground(new Color(200,200,200));
        t.setBackground(new Color(50,50,50));

        l=new JLabel("Client: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(105,145,142));
        l.setFont(new Font("MV Boli",Font.PLAIN,20));

        l1=new JLabel("Produs: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(105,145,142));
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));

        l2=new JLabel("Cantitate: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(105,145,142));
        l2.setFont(new Font("MV Boli",Font.PLAIN,20));

        b =new JButton("Creaza Comanda");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        p = new JPanel();
        p.setBackground(new Color(60,60,60));
        p.setLayout(new GridLayout(3,2));

        p1 = new JPanel();
        p1.setBackground(new Color(60,60,60));
        p1.setLayout(new GridLayout(1,2));

        p.add(l);
        p.add(c);
        p.add(l1);
        p.add(c1);
        p.add(l2);
        p1.add(t);
        p1.add(b);
        p.add(p1);

        this.setTitle("Comanda");
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,1));

        this.add(p);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            int i=c.getSelectedIndex()-1;
            ClientDAO clientDAO=new ClientDAO();
            List<Client> clients=clientDAO.findAll();
            Client selClient=clients.get(i);

            int j=c1.getSelectedIndex()-1;
            ProductDAO productDAO=new ProductDAO();
            List<Product> products=productDAO.findAll();
            Product selProduct=products.get(j);


            try {
                OrderLogic o=new OrderLogic(selClient,selProduct,Integer.parseInt(t.getText()));
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (NoSuchFieldException ex) {
                ex.printStackTrace();
            }


        }

    }
}
