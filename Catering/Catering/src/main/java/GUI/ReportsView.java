package GUI;

import BusinessLogic.CompositeProduct;
import BusinessLogic.DeliveryService;
import BusinessLogic.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class ReportsView extends JFrame implements ActionListener {



    JLabel l;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JPanel p10;
    JPanel p0;
    JPanel p11;
    JPanel p12;
    JPanel p20;
    JPanel p30;
    JPanel p31;
    JPanel p32;
    JPanel p40;
    JPanel p41;
    JPanel p42;
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
    static JButton b3;
    DeliveryService model;
  /*  int totalPrice=0;
    StringBuilder stringBuilder = new StringBuilder("Bill \n");
    ArrayList<MenuItem> menuItemArrayList = Administrator.administrator.getMenuItems();
    ArrayList<CompositeProduct> compositeProducts= AdministratorLogicView.compositeProducts.getNewMenuItems();*/


    public ReportsView(DeliveryService d) {

 this.model=d;
        a = new JTextArea(10,15);
        a.setBackground(Color.BLACK);
        a.setForeground(Color.white);
        a.setFont(new Font("MV Boli",Font.PLAIN,15));


        l=new JLabel("Orders placed in the range: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(90,250,190));
        l.setFont(new Font("MV Boli",Font.BOLD,19));

        l1=new JLabel("Products ordered more than: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(90,250,190));
        l1.setFont(new Font("MV Boli",Font.PLAIN,19));

        l2=new JLabel("Start Hour: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(90,250,190));
        l2.setFont(new Font("MV Boli",Font.BOLD,19));

        l3=new JLabel("End Hour: ");
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(new Color(90,250,190));
        l3.setFont(new Font("MV Boli",Font.BOLD,19));

        l4=new JLabel("Clients who ");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(new Color(90,250,190));
        l4.setFont(new Font("MV Boli",Font.BOLD,19));

        l5=new JLabel("ordered more than: ");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(new Color(90,250,190));
        l5.setFont(new Font("MV Boli",Font.BOLD,19));

        l6=new JLabel("an order valued higher than: ");
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(new Color(90,250,190));
        l6.setFont(new Font("MV Boli",Font.BOLD,19));

        l7=new JLabel("(enter a day) ");
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setForeground(new Color(90,250,190));
        l7.setFont(new Font("MV Boli",Font.BOLD,19));

        l8=new JLabel("(enter how many times) ");
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setForeground(new Color(90,250,190));
        l8.setFont(new Font("MV Boli",Font.BOLD,19));

        l9=new JLabel("Products ordered: ");
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setForeground(new Color(90,250,190));
        l9.setFont(new Font("MV Boli",Font.BOLD,19));

        t = new JTextField();
        t.setFont(new Font("MV Boli",Font.PLAIN,13));
        t.setForeground(new Color(200,200,200));
        t.setBackground(new Color(50,50,50));

        t1 = new JTextField();
        t1.setFont(new Font("MV Boli",Font.PLAIN,13));
        t1.setForeground(new Color(200,200,200));
        t1.setBackground(new Color(50,50,50));

        t2 = new JTextField();
        t2.setFont(new Font("MV Boli",Font.PLAIN,13));
        t2.setForeground(new Color(200,200,200));
        t2.setBackground(new Color(50,50,50));

        t3 = new JTextField();
        t3.setFont(new Font("MV Boli",Font.PLAIN,13));
        t3.setForeground(new Color(200,200,200));
        t3.setBackground(new Color(50,50,50));

        t4 = new JTextField();
        t4.setFont(new Font("MV Boli",Font.PLAIN,13));
        t4.setForeground(new Color(200,200,200));
        t4.setBackground(new Color(50,50,50));

        t5 = new JTextField();
        t5.setFont(new Font("MV Boli",Font.PLAIN,13));
        t5.setForeground(new Color(200,200,200));
        t5.setBackground(new Color(50,50,50));

        t6 = new JTextField();
        t6.setFont(new Font("MV Boli",Font.PLAIN,13));
        t6.setForeground(new Color(200,200,200));
        t6.setBackground(new Color(50,50,50));

        b =new JButton("Generate report 1");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Generate report 2");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        b2 =new JButton("Generate report 3");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli",Font.BOLD,19));
        b2.setForeground(new Color(90,250,190));
        b2.setBackground(new Color(68,69,70));
        b2.addActionListener(this);

        b3 =new JButton("Generate report 4");
        b3.setFocusable(false);
        b3.setHorizontalAlignment(JLabel.CENTER);
        b3.setFont(new Font("MV Boli",Font.BOLD,19));
        b3.setForeground(new Color(90,250,190));
        b3.setBackground(new Color(68,69,70));
        b3.addActionListener(this);

        p10 = new JPanel();
        p10.setBackground(new Color(60,60,60));
        p10.setLayout(new GridLayout(1,4));

        p11 = new JPanel();
        p11.setBackground(new Color(60,60,60));
        p11.setLayout(new GridLayout(2,1));

        p11.add(l2);
        p11.add(l3);

        p12 = new JPanel();
        p12.setBackground(new Color(60,60,60));
        p12.setLayout(new GridLayout(2,1));

        p12.add(t);
        p12.add(t1);

        p10.add(l);
        p10.add(p11);
        p10.add(p12);
        p10.add(b);

        p31 = new JPanel();
        p31.setBackground(new Color(60,60,60));
        p31.setLayout(new GridLayout(2,1));

        p31.add(l5);
        p31.add(l6);

        p32 = new JPanel();
        p32.setBackground(new Color(60,60,60));
        p32.setLayout(new GridLayout(2,1));

        p32.add(t3);
        p32.add(t4);

        p30 = new JPanel();
        p30.setBackground(new Color(60,60,60));
        p30.setLayout(new GridLayout(1,4));

        p30.add(l4);
        p30.add(p31);
        p30.add(p32);
        p30.add(b2);


        p41 = new JPanel();
        p41.setBackground(new Color(60,60,60));
        p41.setLayout(new GridLayout(2,1));

        p41.add(l7);
        p41.add(l8);

        p42 = new JPanel();
        p42.setBackground(new Color(60,60,60));
        p42.setLayout(new GridLayout(2,1));

        p42.add(t5);
        p42.add(t6);

        p40 = new JPanel();
        p40.setBackground(new Color(60,60,60));
        p40.setLayout(new GridLayout(1,4));

        p40.add(l9);
        p40.add(p41);
        p40.add(p42);
        p40.add(b3);




        p20 = new JPanel();
        p20.setBackground(new Color(60,60,60));
        p20.setLayout(new GridLayout(1,3));

        p20.add(l1);
        p20.add(t2);
        p20.add(b1);


        p0 = new JPanel();
        p0.setBackground(new Color(60,60,60));
        p0.setLayout(new GridLayout(4,1));

        p0.add(p10);
        p0.add(p20);
        p0.add(p30);
        p0.add(p40);

      /*  p3 = new JPanel();
        p3.setBackground(new Color(60,60,60));
        p3.setLayout(new GridLayout(1,2));

        p4 = new JPanel();
        p4.setBackground(new Color(60,60,60));
        p4.setLayout(new GridLayout(1,2));

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
       *//* p.add(b);
        p.add(b);
        p.add(b);*/

        this.setTitle("Order");
        this.setSize(1000,1000);
        this.setLayout(new GridLayout(2,1));

        this.add(p0);
        this.add(a);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b) //daca vreau raportul 1
        {  int nr1= Integer.parseInt(t.getText());
            int nr2= Integer.parseInt(t1.getText());
            try {
                model.generateReport1(nr1,nr2,model);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        if(e.getSource()==b1) //daca vreau raportul 2
        {  int nr= Integer.parseInt(t2.getText());
            try {
                model.generateReport2(nr,model);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
        if(e.getSource()==b2) //daca vreau raportul 3
        {  int nr= Integer.parseInt(t3.getText());
            int value= Integer.parseInt(t4.getText());
            try {
                model.generateReport3(nr,value,model);
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }
}
