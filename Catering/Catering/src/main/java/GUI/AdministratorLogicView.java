package GUI;

import BusinessLogic.CompositeProduct;
import BusinessLogic.CompositeProducts;
import BusinessLogic.DeliveryService;
import BusinessLogic.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministratorLogicView extends JFrame implements ActionListener {
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    JTextField t7;
    JTextField t8;
    JTextField t9;
    JTextField t10;
    JTextField t11;
    JTextField t12;
    JTextField t13;
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
    JPanel p;
    JPanel p1;
    JPanel p2;
    static JButton b;
    static JButton b1;
    static JButton b2;
    JButton b3;
    JButton b4;
    public static CompositeProducts compositeProducts;
    DeliveryService model;

    public AdministratorLogicView(DeliveryService d) {
 this.model=d;
        t = new JTextField();
        t.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t.setForeground(new Color(200, 200, 200));
        t.setBackground(new Color(50, 50, 50));

        t1 = new JTextField();
        t1.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t1.setForeground(new Color(200, 200, 200));
        t1.setBackground(new Color(50, 50, 50));

        t2 = new JTextField();
        t2.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t2.setForeground(new Color(200, 200, 200));
        t2.setBackground(new Color(50, 50, 50));

        t3 = new JTextField();
        t3.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t3.setForeground(new Color(200, 200, 200));
        t3.setBackground(new Color(50, 50, 50));

        t4 = new JTextField();
        t4.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t4.setForeground(new Color(200, 200, 200));
        t4.setBackground(new Color(50, 50, 50));

        t5 = new JTextField();
        t5.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t5.setForeground(new Color(200, 200, 200));
        t5.setBackground(new Color(50, 50, 50));

        t6 = new JTextField();
        t6.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t6.setForeground(new Color(200, 200, 200));
        t6.setBackground(new Color(50, 50, 50));

        t7 = new JTextField();
        t7.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t7.setForeground(new Color(200, 200, 200));
        t7.setBackground(new Color(50, 50, 50));

        t8 = new JTextField();
        t8.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t8.setForeground(new Color(200, 200, 200));
        t8.setBackground(new Color(50, 50, 50));

        t9 = new JTextField();
        t9.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t9.setForeground(new Color(200, 200, 200));
        t9.setBackground(new Color(50, 50, 50));

        t10 = new JTextField();
        t10.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t10.setForeground(new Color(200, 200, 200));
        t10.setBackground(new Color(50, 50, 50));

        t11 = new JTextField();
        t11.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t11.setForeground(new Color(200, 200, 200));
        t11.setBackground(new Color(50, 50, 50));

        t12 = new JTextField();
        t12.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t12.setForeground(new Color(200, 200, 200));
        t12.setBackground(new Color(50, 50, 50));

        t13 = new JTextField();
        t13.setFont(new Font("MV Boli", Font.PLAIN, 13));
        t13.setForeground(new Color(200, 200, 200));
        t13.setBackground(new Color(50, 50, 50));

        l = new JLabel("Title: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(105, 145, 142));
        l.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l1 = new JLabel("Rating: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(105, 145, 142));
        l1.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l2 = new JLabel("Calories: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(105, 145, 142));
        l2.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l3 = new JLabel("Protein: ");
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(new Color(105, 145, 142));
        l3.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l4 = new JLabel("Fat: ");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(new Color(105, 145, 142));
        l4.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l5 = new JLabel("ADD/DELETE/SET ");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(new Color(105, 145, 142));
        l5.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l6 = new JLabel("WHERE ");
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(new Color(105, 145, 142));
        l6.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l7 = new JLabel("Menu Management");
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setForeground(new Color(105, 145, 142));
        l7.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l8 = new JLabel("Sodium");
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setForeground(new Color(105, 145, 142));
        l8.setFont(new Font("MV Boli", Font.PLAIN, 20));

        l9 = new JLabel("Price");
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setForeground(new Color(105, 145, 142));
        l9.setFont(new Font("MV Boli", Font.PLAIN, 20));

        p = new JPanel();
        p.setBackground(new Color(60, 60, 60));
        p.setLayout(new GridLayout(8, 2));


        p1 = new JPanel();
        p1.setBackground(new Color(60, 60, 60));
        p1.setLayout(new GridLayout(2, 1));

        p2 = new JPanel();
        p2.setBackground(new Color(60, 60, 60));
        p2.setLayout(new GridLayout(1, 5));

        b = new JButton("Update Product");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli", Font.BOLD, 19));
        b.setForeground(new Color(90, 250, 190));
        b.setBackground(new Color(68, 69, 70));
        b.addActionListener(this);

        b1 = new JButton("Add Product");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli", Font.BOLD, 19));
        b1.setForeground(new Color(90, 250, 190));
        b1.setBackground(new Color(68, 69, 70));
        b1.addActionListener(this);

        b2 = new JButton("Delete Product");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli", Font.BOLD, 19));
        b2.setForeground(new Color(90, 250, 190));
        b2.setBackground(new Color(68, 69, 70));
        b2.addActionListener(this);

        b3 = new JButton("Create New Product");
        b3.setFocusable(false);
        b3.setHorizontalAlignment(JLabel.CENTER);
        b3.setFont(new Font("MV Boli", Font.BOLD, 19));
        b3.setForeground(new Color(90, 250, 190));
        b3.setBackground(new Color(68, 69, 70));
        b3.addActionListener(this);

        b4 = new JButton("View Reports");
        b4.setFocusable(false);
        b4.setHorizontalAlignment(JLabel.CENTER);
        b4.setFont(new Font("MV Boli", Font.BOLD, 19));
        b4.setForeground(new Color(90, 250, 190));
        b4.setBackground(new Color(68, 69, 70));
        b4.addActionListener(this);

        p.add(l7);
        p.add(l5);
        p.add(l6);
        //p.add(l8);

        p.add(l); //title
        p.add(t);
        //p.add(l);
        p.add(t1);

        p.add(l1); //rating
        p.add(t2);
        //p.add(l1);
        p.add(t3);

        p.add(l2);//calories
        p.add(t4);
        //p.add(l2);
        p.add(t5);

        p.add(l3);//protein
        p.add(t6);
        //p.add(l3);
        p.add(t7);

        p.add(l4);//fat
        p.add(t8);
        //p.add(l4);
        p.add(t9);
//
        p.add(l8);//sodium
        p.add(t10);
        //p.add(l4);
        p.add(t11);

        p.add(l9);//price
        p.add(t12);
        //p.add(l4);
        p.add(t13);
//
        //p.add(l9);
        p2.add(b1);
        p2.add(b2);
        p2.add(b);
        p2.add(b3);
        p2.add((b4));
        p1.add(p);
       // p1.add(b, BorderLayout.PAGE_END);
        p1.add(p2);
        //p.add(b);
        //p.add(l8);


        this.setTitle("Actualizeaza");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(999, 555);
        this.setLayout(new GridLayout(1, 1));

        this.add(p1);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String ta;
       String t1a;
        float t2a;
        float t3a;
        int t4a;
        int t5a;
        int t6a;
        int t7a;
        int t8a;
        int t9a;
        int t10a;
        int t11a;
        int t12a;
        int t13a;

            ta=t.getText();
            t1a=t1.getText();

        try{
            t2a=Float.parseFloat(t2.getText());
        }catch(NumberFormatException ex) {
           t2a = -1; // default ??
            //t2a = Float.parseFloat(null); // default ??
        }
        try{
            t3a=Float.parseFloat(t3.getText());
        }catch(NumberFormatException ex) {
            t3a = -1; // default ??
        }

        try{
            t4a=Integer.parseInt(t4.getText());
        }catch(NumberFormatException ex) {
            t4a = -1; // default ??
        }

        try{
            t5a=Integer.parseInt(t5.getText());
        }catch(NumberFormatException ex) {
            t5a = -1; // default ??
        }

        try{
            t6a=Integer.parseInt(t6.getText());
        }catch(NumberFormatException ex) {
            t6a = -1; // default ??
        }

        try{
            t7a=Integer.parseInt(t7.getText());
        }catch(NumberFormatException ex) {
            t7a = -1; // default ??
        }

        try{
            t8a=Integer.parseInt(t8.getText());
        }catch(NumberFormatException ex) {
            t8a = -1; // default ??
        }

        try{
            t9a=Integer.parseInt(t9.getText());
        }catch(NumberFormatException ex) {
            t9a = -1; // default ??
        }

        try{
            t10a=Integer.parseInt(t10.getText());
        }catch(NumberFormatException ex) {
            t10a = -1; // default ??
        }

        try{
            t11a=Integer.parseInt(t11.getText());
        }catch(NumberFormatException ex) {
            t11a = -1; // default ??
        }

        try{
            t12a=Integer.parseInt(t12.getText());
        }catch(NumberFormatException ex) {
            t12a = -1; // default ??
        }

        try{
            t13a=Integer.parseInt(t13.getText());
        }catch(NumberFormatException ex) {
            t13a = -1; // default ??
        }
        MenuItem firstColumn = new MenuItem(ta,t2a,t4a,t6a,t8a,t10a,t12a);
        MenuItem secondColumn = new MenuItem(t1a,t3a,t5a,t7a,t9a,t11a,t13a);

        if (e.getSource()==b1  || e.getSource()==b2 || e.getSource()==b){
            try {
                AdministratorLogicADM administratorLogicView= new AdministratorLogicADM(firstColumn,secondColumn,e.getSource());
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }else if(e.getSource()==b3){
            CompositeProductView compositeProductView = new CompositeProductView();
            CompositeProducts compositeProducts1 = new CompositeProducts();
            compositeProducts=compositeProducts1;
        }else if(e.getSource()==b4){
            ReportsView r =new ReportsView(model);
        }

    }
}
