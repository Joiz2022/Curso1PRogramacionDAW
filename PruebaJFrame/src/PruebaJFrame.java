import java.awt.*;

import javax.swing.*;

public class PruebaJFrame {
    /**
     * Declaracion de objetos.
     * "new" para crear objeto nuevo.
     * @param args
     */
    @SuppressWarnings({ "unused", "unchecked", "rawtypes" })
    public static void main(String[] args) {

        JFrame f=new JFrame("Ajajaja adios mundo");
        JLabel e=new JLabel("Eeh bro de chill");
        f.setShape(null);
        f.setSize(600,200);

        f.setVisible(false);

        f.add(e);
        f.setBackground(Color.red);
        e.setHorizontalAlignment(0);

        JButton b;




        JFrame a=new JFrame("Prueba");
        JPanel p=new JPanel();
        JLabel nombre=new JLabel("Nombre");
        JLabel apellido=new JLabel("Apellido");
        JTextField nombre1=new JTextField(10);
        JTextField apellido2=new JTextField(10);
        a.setBackground(Color.BLUE);
        a.setSize(500,500);
        p.setBackground(Color.CYAN);
        p.add(nombre);
        p.add(nombre1);

        p.add(apellido);
        p.add(apellido2);
        a.add(p);


        a.setVisible(true);

//		String lista[]= {"Toyota","Lago","Helicoptero","Panzer","Apache","Submarino"};
//		JFrame f=new JFrame("Un mcflurry");
//		JPanel p=new JPanel();
//		
//		JButton b=new JButton("Tócame");
//		JComboBox c=new JComboBox(lista);
//		JList l=new JList(lista);
//		p.add(b);
//		
//		p.add(c);
//		p.add(l);
//		f.add(p);
//		
//		f.setSize(500, 500);
//		f.setVisible(true);

    }

}
