package GUI;

import BusinessLogic.CompositeProduct;
import BusinessLogic.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CompositeProductView extends JFrame implements ActionListener {


    JLabel l;
    JLabel l2;
    JPanel p;
    JPanel p1;
    JComboBox c;
    JTextArea a;
    JTextArea a1;
    JTextArea a2;
    JTextField t;
    static JButton b;
    static JButton b1;



    ArrayList<MenuItem> menuItemArrayList = Administrator.administrator.getMenuItems();
    ArrayList<ArrayList<MenuItem>> newMenu = new ArrayList<ArrayList<MenuItem>>();
    ArrayList<MenuItem> auxMenuItem = new ArrayList<>();

    public CompositeProductView() {
        ArrayList<String> menu=new ArrayList<>();
        menu.add("Select product");
        for(MenuItem product:menuItemArrayList) {
            menu.add(product.getTitle());
        }
        c = new JComboBox(menu.toArray());
        c.setForeground(new Color(105,145,142));
        c.setBackground(new Color(68,69,70));
        c.addActionListener(this);

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

        t = new JTextField();
        t.setFont(new Font("MV Boli",Font.PLAIN,13));
        t.setForeground(new Color(200,200,200));
        t.setBackground(new Color(50,50,50));

        l=new JLabel("Menu: ");
        l.setHorizontalAlignment(JLabel.CENTER);
        l.setForeground(new Color(90,250,190));
        l.setFont(new Font("MV Boli",Font.BOLD,19));

        /*l1=new JLabel("Produs: ");
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setForeground(new Color(105,145,142));
        l1.setFont(new Font("MV Boli",Font.PLAIN,20));*/

        l2=new JLabel("Price: ");
        l2.setHorizontalAlignment(JLabel.CENTER);
        l2.setForeground(new Color(105,145,142));
        l2.setFont(new Font("MV Boli",Font.PLAIN,20));

        b =new JButton("Create Menu with Name: ");
        b.setFocusable(false);
        b.setHorizontalAlignment(JLabel.CENTER);
        b.setFont(new Font("MV Boli",Font.BOLD,19));
        b.setForeground(new Color(90,250,190));
        b.setBackground(new Color(68,69,70));
        b.addActionListener(this);

        b1 =new JButton("Add product");
        b1.setFocusable(false);
        b1.setHorizontalAlignment(JLabel.CENTER);
        b1.setFont(new Font("MV Boli",Font.BOLD,19));
        b1.setForeground(new Color(90,250,190));
        b1.setBackground(new Color(68,69,70));
        b1.addActionListener(this);

        p = new JPanel();
        p.setBackground(new Color(60,60,60));
        p.setLayout(new GridLayout(3,2));

        p1 = new JPanel();
        p1.setBackground(new Color(60,60,60));
        p1.setLayout(new GridLayout(1,1));

        p.add(l);
        p.add(c);

        p.add(b1);
        p.add(a2);

        // p1.add(t);
        p1.add(b);
        p.add(p1);
        p.add(t);

        this.setTitle("Create New Products");
        this.setSize(555,555);
        this.setLayout(new GridLayout(2,1));

        this.add(p);
        this.add(a);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==c){
            int i=c.getSelectedIndex()-1;
            MenuItem menuItem=menuItemArrayList.get(i);
            a2.setText(menuItem.toString());
        }else if(e.getSource()==b1){
            int i=c.getSelectedIndex()-1;
            MenuItem menuItem=menuItemArrayList.get(i);
            auxMenuItem.add(menuItem);
            a.append(menuItem.toString()+"\n");
        }else if(e.getSource()==b){
            // AdministratorLogicView.compositeProduct.newMenuItems.add(auxMenuItem);
            if(t.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,
                        "Enter a Valid Name!");
            }else {
                CompositeProduct cmp = new CompositeProduct(t.getText(), auxMenuItem);
                a.setText("");
                t.setText("");
                JOptionPane.showMessageDialog(null,"Menu created successfully!");
            }
        }

    }
}
