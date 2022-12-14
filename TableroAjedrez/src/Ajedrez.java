import java.awt.*;
import javax.swing.*;

public class Ajedrez {

    public static void main(String[] args) {

        JFrame f = new JFrame("ChessChessChess");;
        JPanel p = new JPanel();
        JLabel e[];
        Color nC = Color.WHITE;


        p.setLayout(new GridLayout(8,8));

        e = new JLabel[64];
        for (int i=0 ; i< e.length ; i++) {
            e[i] = new JLabel(String.valueOf(i+1),SwingConstants.CENTER); //centra los nums
            p.add(e[i]);
            e[i].setForeground(Color.RED);
            e[i].setOpaque(true);
            e[i].setBackground(nC);


            if ((i+1)% 8 !=0) {
                if(nC == Color.WHITE)
                    nC = Color.BLACK;
                else
                    nC = Color.WHITE;
            }
        }

        f.add(p);

        f.setSize(600,500);
        f.setVisible(true);


    }

}