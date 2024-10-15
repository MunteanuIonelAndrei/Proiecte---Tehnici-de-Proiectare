import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfata extends JFrame implements ActionListener {

    JTextField t;
    JTextField t1;
    static JTextArea a;
    JPanel p;
    static JButton b;
    static JButton b1;
    static JButton b2;
    static JButton b3;

    Interfata(){

        JLabel l = new JLabel("Introduceți primul polinom: ");
        JLabel l1 = new JLabel("Introduceți al II-lea polinom: ");
        JLabel l2 = new JLabel("Rezultat: ");



        GridLayout myLayout = new GridLayout(2,1);
        GridLayout myLayout2 = new GridLayout(3,2);


        this.setLayout(myLayout);

        t = new JTextField();
       // t.setPreferredSize(new Dimension(40,10));
        t1 = new JTextField();
        //t1.setPreferredSize(new Dimension(40,10));
         a = new JTextArea();

        p = new JPanel();
        //p.setLayout(new BoxLayout(p,BoxLayout.X_AXIS));

        JPanel p1 = new JPanel();
       // p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));


        p1.setLayout(myLayout2);
        p.setLayout(myLayout2);


        p.add( Box.createRigidArea(new Dimension(15,5)) );
        b= new JButton("+");
        b.addActionListener(this);
        b.setFocusable(false);
        p.add(b);
        p.add( Box.createRigidArea(new Dimension(15,5)) );
        b1= new JButton("-");
        b1.addActionListener(this);
        b1.setFocusable(false);
        p.add(b1);
        p.add( Box.createRigidArea(new Dimension(15,5)) );
        b2= new JButton("Derivata");
        b2.addActionListener(this);
        b2.setFocusable(false);
        p.add(b2);
        p.add( Box.createRigidArea(new Dimension(15,5)) );
        b3= new JButton("*");
        b3.addActionListener(this);
        b3.setFocusable(false);
        p.add(b3);
        p.setBackground(Color.cyan);

        l.setHorizontalAlignment(JLabel.CENTER);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l2.setHorizontalAlignment(JLabel.CENTER);


        p1.setBackground(Color.blue);
        p1.add(l);
        p1.add(t);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(a);

        this.setTitle("Calculator Polinomial");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,600);
        this.setLocation(300,300);

        this.add(p1,BorderLayout.CENTER);
        this.add(p,BorderLayout.PAGE_END);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object start= e.getSource();
        Motor m= new Motor(start,t.getText(),t1.getText());

    }
}


