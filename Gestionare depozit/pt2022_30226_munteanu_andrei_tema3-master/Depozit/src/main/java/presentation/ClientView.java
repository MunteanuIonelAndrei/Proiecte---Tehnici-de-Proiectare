package presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;


public class ClientView extends JFrame implements ActionListener {

    JLabel l;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JPanel p;
    JPanel p1;
    JPanel p2;
    JPanel p3;
    static JButton b;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    JButton b4;
    JTextField t;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;

    public ClientView(){

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



        b =new JButton("Toti clientii");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Gaseste client specific");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        b2 =new JButton("Insereaza client");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli",Font.BOLD,19));
        b2.setForeground(new Color(90,250,190));
        b2.setBackground(new Color(68,69,70));
        b2.addActionListener(this);

        b3 =new JButton("Sterge client");
        b3.setFocusable(false);
        b3.setHorizontalAlignment(JLabel.CENTER);
        b3.setFont(new Font("MV Boli",Font.BOLD,19));
        b3.setForeground(new Color(90,250,190));
        b3.setBackground(new Color(68,69,70));
        b3.addActionListener(this);

        b4 =new JButton("Actualizeaza client");
        b4.setFocusable(false);
        b4.setHorizontalAlignment(JLabel.CENTER);
        b4.setFont(new Font("MV Boli",Font.BOLD,19));
        b4.setForeground(new Color(90,250,190));
        b4.setBackground(new Color(68,69,70));
        b4.addActionListener(this);


        p = new JPanel();
        p.setBackground(new Color(60,60,60));
        p.setLayout(new GridLayout(5,2));

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());

        p2 = new JPanel();
        p2.setBackground(new Color(60,60,60));
        p2.setLayout(new GridLayout(1,2));

        p.add(l);
        p.add(t);
        p.add(l1);
        p.add(t1);
        p.add(l2);
        p.add(t2);
        p.add(l3);
        p.add(t3);
        p.add(l4);
        p.add(t4);

        p1.add(b);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(b4);
        p2.add(p1);
        p2.add(p);

        this.setTitle("Clienti");
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,1));

        this.add(p2);
        this.setVisible(true);

    }

 /*   public void setPanel(JTable table){
//add(table);
        this.add(table.getTableHeader(), BorderLayout.PAGE_START);
        this.add(table, BorderLayout.CENTER);
        this.pack();
        this.setLocationRelativeTo(null);
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {
        ArrayList<String> date=new ArrayList<>();

        date.add(t.getText());
        date.add(t1.getText());
        date.add(t2.getText());
        date.add(t3.getText());
        date.add(t4.getText());
        if (e.getSource() == b|| e.getSource() == b1||e.getSource() == b2||e.getSource() == b3) {

            Object findAll= e.getSource();
            try {
                Controller c= new Controller(findAll,date);
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            }
        }

        if (e.getSource() == b4) {
            UpdateView updateView = new UpdateView();
        }
    }
}
