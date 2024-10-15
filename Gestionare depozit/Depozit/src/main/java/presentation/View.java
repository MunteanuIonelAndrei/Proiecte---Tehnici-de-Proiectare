package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener{
    JLabel l;
    JPanel p1;
    JButton b;
    JButton b1;
    JButton b2;
    static ClientView clientView;

    public View(){

        b =new JButton("Clienti");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Produse");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        b2 =new JButton("Comenzi");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli",Font.BOLD,19));
        b2.setForeground(new Color(90,250,190));
        b2.setBackground(new Color(68,69,70));
        b2.addActionListener(this);



        l=new JLabel("Alegeti o baza de date:  ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(14, 101, 100));
        l.setFont(new Font("MV Boli",Font.PLAIN,20));

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        p1.add(b);
        p1.add(b1);
        p1.add(b2);

        this.setTitle("Depozit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,1));

        this.add(l);
        this.add(p1);
        this.setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            ClientView cl=new ClientView();
            clientView=cl;
    }else if(e.getSource()==b1){
            ProductView cl=new ProductView();
        }else if(e.getSource()==b2){
            OrderView cl=new OrderView();
        }
}
}
