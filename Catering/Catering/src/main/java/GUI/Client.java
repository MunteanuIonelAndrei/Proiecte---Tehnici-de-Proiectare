package GUI;

import BusinessLogic.DeliveryService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Client extends JFrame implements ActionListener {
    JLabel l;
    JLabel l1;
    JTextField t;
    JPasswordField pas;
    static ArrayList<Worker> workers=new ArrayList<Worker>();

    public static ArrayList<Worker> getWorkers() {
        return workers;
    }

    public static void setWorkers(ArrayList<Worker> workers) {
        Client.workers = workers;
    }

    JPanel p1;
    JPanel p2;
    static JButton b;
    JButton b1;
    static JButton b2;
    DeliveryService model;


    public Client(DeliveryService d){
 this.model=d;
        b =new JButton("Login");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Show Password");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        b2 =new JButton("Register");
        b2.setFocusable(false);
        b2.setHorizontalAlignment(JLabel.CENTER);
        b2.setFont(new Font("MV Boli",Font.BOLD,19));
        b2.setForeground(new Color(90,250,190));
        b2.setBackground(new Color(68,69,70));
        b2.addActionListener(this);

        l=new JLabel("Username:  ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(14, 101, 100));
        l.setFont(new Font("MV Boli",Font.PLAIN,20));

        l1=new JLabel("Password:  ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(14, 101, 100));
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));

        t = new JTextField();
        t.setFont(new Font("MV Boli",Font.PLAIN,13));
        t.setForeground(new Color(200,200,200));
        t.setBackground(new Color(50,50,50));

        pas = new JPasswordField();
        pas.setFont(new Font("MV Boli",Font.PLAIN,13));
        pas.setForeground(new Color(200,200,200));
        pas.setBackground(new Color(50,50,50));

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,2));

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,3));

        p1.add(l);
        p1.add(t);
        p1.add(l1);
        p1.add(pas);
        p2.add(b);
        p2.add(b2);
        p2.add(b1);

        this.setTitle("Client Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,2));

        this.add(p1);
        this.add(p2);
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) {
            String password = new String(pas.getPassword());
            JOptionPane.showMessageDialog(null,
                    "Password is " + password);
        }else if(e.getSource()==b||e.getSource()==b2){
            ClientVerify cl= new ClientVerify(t.getText(),pas.getPassword(), e.getSource(),model);
        }
    }
}
