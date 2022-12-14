import java.awt.*;

import javax.swing.*;

public class Frame {

    public static void main(String[] args) {

        JFrame f=new JFrame ("Frame");
        JPanel p=new JPanel ();

        JButton b1=new JButton("Boton1");
        JButton b2=new JButton("Boton2");
        JButton b3=new JButton("Boton3");
        JButton b4=new JButton("Boton4");
        JButton b5=new JButton("Boton5");
        JButton b6=new JButton("Boton6");



        FlowLayout flujo=new FlowLayout();  //Layout de flujo
        BorderLayout border=new BorderLayout(); //Layout de bordes.  BorderLayout.EAST, SOUTH....
        GridLayout grid=new GridLayout(3,2); //Layout cuadricula.


        f.setSize(500,500);
        f.setVisible(true);
        f.add(p);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);

        p.setLayout(grid); //Cambiar donde pone grid con "flujo" o "border"



    }
    /**
     * En el caso de ser borderlayout tendriamos que decir tambien la cardinalidad o posicion
     * de cada objeto. Por ejemplo     p.add(b1,BorderLayout.SOUTH);
     * para colocar ese objeto abajo del todo.
     */

}
