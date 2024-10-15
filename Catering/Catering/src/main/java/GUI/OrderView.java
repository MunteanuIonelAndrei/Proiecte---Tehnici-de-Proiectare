package GUI;

import BusinessLogic.*;
import BusinessLogic.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class OrderView extends JFrame implements ActionListener {

    JLabel l;
    JLabel l2;
    JPanel p;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JComboBox c;
    JComboBox c1;
    JTextArea a;
    JTextArea a1;
    JTextArea a2;
    JTextArea a3;
    static JButton b;
    static JButton b1;
    static JButton b2;
    int totalPrice=0;
    StringBuilder stringBuilder = new StringBuilder("Bill \n");
    ArrayList<MenuItem> menuItemArrayList = Administrator.administrator.getMenuItems();
    ArrayList<CompositeProduct> compositeProducts= AdministratorLogicView.compositeProducts.getNewMenuItems();
    JTextField dataComanda;
    DeliveryService model;
    ArrayList<MenuItem> listaProduseComanda=new ArrayList<MenuItem>();

    public OrderView(DeliveryService d) {
        this.model=d;
        ArrayList<String> menu=new ArrayList<>();
        menu.add("Select product");
        for(MenuItem product:menuItemArrayList) {
            menu.add(product.getTitle());
        }
        c = new JComboBox(menu.toArray());
        c.setForeground(new Color(105,145,142));
        c.setBackground(new Color(68,69,70));
        c.addActionListener(this);

        ArrayList<String> composed=new ArrayList<>();
        composed.add("Select Menu");
        for(CompositeProduct productName:compositeProducts) {
            composed.add(productName.getName());
        }
        c1 = new JComboBox(composed.toArray());
        c1.setForeground(new Color(105,145,142));
        c1.setBackground(new Color(68,69,70));
        c1.addActionListener(this);


        a = new JTextArea(10,15);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.white);
        a.setFont(new Font("MV Boli",Font.PLAIN,15));

        a1 = new JTextArea(10,15);
        a1.setBackground(Color.BLACK);
        a1.setForeground(Color.white);
        a1.setFont(new Font("MV Boli",Font.PLAIN,15));

        a2 = new JTextArea(10,15);
        a2.setBackground(Color.BLACK);
        a2.setForeground(Color.white);
        a2.setFont(new Font("MV Boli",Font.PLAIN,15));

        a3 = new JTextArea(10,15);
        a3.setBackground(Color.BLACK);
        a3.setForeground(Color.white);
        a3.setFont(new Font("MV Boli",Font.PLAIN,15));
    /*    t = new JTextField();
        t.setFont(new Font("MV Boli",Font.PLAIN,13));
        t.setForeground(new Color(200,200,200));
        t.setBackground(new Color(50,50,50));*/

        l=new JLabel("MenuItems: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(90,250,190));
        l.setFont(new Font("MV Boli",Font.BOLD,19));

        /*l1=new JLabel("Produs: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(105,145,142));
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));*/

        l2=new JLabel("Menus: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(90,250,190));
        l2.setFont(new Font("MV Boli",Font.BOLD,19));

        b =new JButton("Create Order");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Add MenuItem");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        b2 =new JButton("Add Menu");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli",Font.BOLD,19));
        b2.setForeground(new Color(90,250,190));
        b2.setBackground(new Color(68,69,70));
        b2.addActionListener(this);

        p = new JPanel();
        p.setBackground(new Color(60,60,60));
        p.setLayout(new GridLayout(3,2));

        p1 = new JPanel();
        p1.setBackground(new Color(60,60,60));
        p1.setLayout(new GridLayout(1,2));

        p2 = new JPanel();
        p2.setBackground(new Color(60,60,60));
        p2.setLayout(new GridLayout(1,2));

        p3 = new JPanel();
        p3.setBackground(new Color(60,60,60));
        p3.setLayout(new GridLayout(1,2));

        p4 = new JPanel();
        p4.setBackground(new Color(60,60,60));
        p4.setLayout(new GridLayout(1,2));
        dataComanda=new JTextField(20);
        p4.add(dataComanda);

        p1.add(l);
        p1.add(c);

        p2.add(l2);
        p2.add(c1);

        p3.add(b1);
        p3.add(a1);

        p4.add(b2);
        p4.add(a2);

        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(a3);
        p.add(b);
       // p1.add(t);
       // p1.add(b);
      //  p.add(p1);
       /* p.add(b);
        p.add(b);
        p.add(b);*/

        this.setTitle("Order");
        this.setSize(1000,1000);
        this.setLayout(new GridLayout(2,1));

        this.add(p);
        this.add(a);
        this.setVisible(true);
    }

    private void generateBill(StringBuilder stringBuilder) throws IOException {
        FileWriter writer = new FileWriter("Bill.txt");
        stringBuilder.append("\nTotal Proice"+totalPrice);
        totalPrice=0;
        String done = stringBuilder.toString();
        writer.write(done);
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            int i=c.getSelectedIndex()-1;

            MenuItem menuItem=menuItemArrayList.get(i); //aici imi face rost de alt produs


                listaProduseComanda.add(menuItem);




            a.append(menuItem.toString());
            a.append("\n");
            stringBuilder.append(menuItem.toString()+"\n");
            totalPrice+=menuItem.getPrice();//creste pretul comenzii
            a3.setText("");
            a3.append("You added "+menuItem.getTitle()+"\n");
            a3.append("Total price:" +totalPrice);
        }else if(e.getSource()==c){//aici afiseaza datele, neimportant
            int i=c.getSelectedIndex()-1;
            MenuItem menuItem=menuItemArrayList.get(i);
            a1.setText(menuItem.toString());
        }else if(e.getSource()==c1){//same shit
            int i=c1.getSelectedIndex()-1;
            CompositeProduct compositeProducts1=compositeProducts.get(i);
            a2.setText(compositeProducts1.getName());

        }else if(e.getSource()==b2){

            int i=c1.getSelectedIndex()-1;
            CompositeProduct compositeProducts1=compositeProducts.get(i);
            a.append(compositeProducts1.toString());
            a.append("\n");
            stringBuilder.append(compositeProducts1 +"\n");

            totalPrice += compositeProducts1.getTotalPrice();

            a3.setText("");
            a3.append("You added "+compositeProducts1.getName()+"\n");
            a3.append("Total price:" +totalPrice);
        }else if(e.getSource()==b){
            //acum creez un obiect de tip Order
            Random rand = new Random();
            int orderId= rand.nextInt(5000);
            //fac rost de data pe baza a ce am deja
            if(!dataComanda.getText().equals("")) {
                String dataComenzii = dataComanda.getText();//fac rost de ce am textField
                int anC, lunaC, ziC, oraC, minutC, secC;
                String[] parts = dataComenzii.split(" ");
                String part1 = parts[0]; // an stuff
                String part2 = parts[1]; // time stff
                String[] anStuff = part1.split("-");
                anC = Integer.parseInt(anStuff[0]);
                lunaC = Integer.parseInt(anStuff[1]);
                ziC = Integer.parseInt(anStuff[2]);
                String[] timeStuff = part2.split(":");
                oraC = Integer.parseInt(timeStuff[0]);
                minutC = Integer.parseInt(timeStuff[1]);
                secC = Integer.parseInt(timeStuff[2]);

                LocalDateTime date1 = LocalDateTime.of(anC,
                        lunaC, ziC, oraC, minutC, secC, 0);
                //fac o smecherie aici, clientID=ziua din luna cand introduc data pentru a putea face rapoartele
                Order comandaNoua=new Order(orderId,ziC,date1);
                //adaug in hashMap
                model.getMap().put(comandaNoua,listaProduseComanda);
                //adaug si in lista cu toate comenzile
                model.getListaToateComenzi().add(comandaNoua);
            }
            else
            {
                System.out.println("Nu ati dat o data pentru comanda! Va rugam reveniti...");
            }

            a.setText("");
            a1.setText("");
            a2.setText("");
            a3.setText("");
            try {
                generateBill(stringBuilder);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            JOptionPane.showMessageDialog(null,"Order created successfully!");
        }
    }
}

