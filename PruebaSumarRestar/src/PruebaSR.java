import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaSR extends JFrame implements ActionListener{

    private JPanel p;
    private JLabel e1;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    int valor=0;

    public PruebaSR(){

        p=new JPanel();
        p.setLayout(new FlowLayout());
        e1=new JLabel("0");
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("Boton 3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        p.add(e1);
        p.add(b1);
        p.add(b2);

        add(p);
        setSize(500, 150);
        setVisible(true);
    }

    public static void main(String[] args) {

        PruebaSR v1=new PruebaSR();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b1){
            valor++;
            e1.setText(String.valueOf(valor));

        } else {valor--;
            e1.setText(String.valueOf(valor));
        }
    }}
