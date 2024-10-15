package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UpdateView extends JFrame implements ActionListener {

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
    JButton b;

    public UpdateView(){

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
        t7 = new JTextField();
        t7.setFont(new Font("MV Boli",Font.PLAIN,13));
        t7.setForeground(new Color(200,200,200));
        t7.setBackground(new Color(50,50,50));
        t8 = new JTextField();
        t8.setFont(new Font("MV Boli",Font.PLAIN,13));
        t8.setForeground(new Color(200,200,200));
        t8.setBackground(new Color(50,50,50));
        t9 = new JTextField();
        t9.setFont(new Font("MV Boli",Font.PLAIN,13));
        t9.setForeground(new Color(200,200,200));
        t9.setBackground(new Color(50,50,50));

        l=new JLabel("ID: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(105,145,142));
        l.setFont(new Font("MV Boli",Font.PLAIN,20));

        l1=new JLabel("Nume: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(105,145,142));
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));

        l2=new JLabel("Adresa: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(105,145,142));
        l2.setFont(new Font("MV Boli",Font.PLAIN,20));

        l3=new JLabel("Email: ");
        l3.setHorizontalAlignment(JLabel.CENTER);
        l3.setForeground(new Color(105,145,142));
        l3.setFont(new Font("MV Boli",Font.PLAIN,20));

        l4=new JLabel("Varsta: ");
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setForeground(new Color(105,145,142));
        l4.setFont(new Font("MV Boli",Font.PLAIN,20));

        l5=new JLabel("SET ");
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setForeground(new Color(105,145,142));
        l5.setFont(new Font("MV Boli",Font.PLAIN,20));

        l6=new JLabel("WHERE ");
        l6.setHorizontalAlignment(JLabel.CENTER);
        l6.setForeground(new Color(105,145,142));
        l6.setFont(new Font("MV Boli",Font.PLAIN,20));

        l7=new JLabel("Actualizare Client");
        l7.setHorizontalAlignment(JLabel.CENTER);
        l7.setForeground(new Color(105,145,142));
        l7.setFont(new Font("MV Boli",Font.PLAIN,20));

        l8=new JLabel("");
        l8.setHorizontalAlignment(JLabel.CENTER);
        l8.setForeground(new Color(105,145,142));
        l8.setFont(new Font("MV Boli",Font.PLAIN,20));

        l9=new JLabel("");
        l9.setHorizontalAlignment(JLabel.CENTER);
        l9.setForeground(new Color(105,145,142));
        l9.setFont(new Font("MV Boli",Font.PLAIN,20));

        p = new JPanel();
        p.setBackground(new Color(60,60,60));
        p.setLayout(new GridLayout(6,2));


        p1 = new JPanel();
        p1.setBackground(new Color(60,60,60));
        p1.setLayout(new GridLayout(2,1));


        b =new JButton("Actualizeaza baza de date");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        p.add(l7);
        p.add(l5);
        p.add(l6);
        //p.add(l8);

        p.add(l);
        p.add(t);
        //p.add(l);
        p.add(t1);

        p.add(l1);
        p.add(t2);
        //p.add(l1);
        p.add(t3);

        p.add(l2);
        p.add(t4);
        //p.add(l2);
        p.add(t5);

        p.add(l3);
        p.add(t6);
        //p.add(l3);
        p.add(t7);

        p.add(l4);
        p.add(t8);
        //p.add(l4);
        p.add(t9);

        //p.add(l9);
        p1.add(p);
        p1.add(b,BorderLayout.PAGE_END);
        //p.add(b);
        //p.add(l8);


        this.setTitle("Actualizeaza");
        //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,1));

        this.add(p1);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object update= e.getSource();
        ArrayList<String> set = new ArrayList<>();
        set.add(t.getText());
        set.add(t2.getText());
        set.add(t4.getText());
        set.add(t6.getText());
        set.add(t8.getText());

        ArrayList<String> where = new ArrayList<>();
        where.add(t1.getText());
        where.add(t3.getText());
        where.add(t5.getText());
        where.add(t7.getText());
        where.add(t9.getText());
        try {
            Controller m= new Controller(set,where);
        } catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }

    }
}
