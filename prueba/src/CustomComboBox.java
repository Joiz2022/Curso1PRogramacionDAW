package stack;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class CustomComboBox {
    JComboBox fontComboBox;
    JFrame frame;
    String fontName[];
    Integer array[];

    public CustomComboBox() {
        JFrame.setDefaultLookAndFeelDecorated(true);

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        fontName = ge.getAvailableFontFamilyNames();
        array = new Integer[fontName.length];
        for(int i=1;i<=fontName.length;i++) {
            array[i-1] = i;
        }

        fontComboBox = new JComboBox(array);
        ComboBoxRenderar renderar = new ComboBoxRenderar();
        fontComboBox.setRenderer(renderar);

        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(fontComboBox);

        frame.pack();
        frame.setVisible(true);
    }

    public class ComboBoxRenderar extends JLabel implements ListCellRenderer {

        @Override
        public Component getListCellRendererComponent(JList list,
                                                      Object value,
                                                      int index,
                                                      boolean isSelected,
                                                      boolean cellHasFocus) {
            int offset = ((Integer)value).intValue() - 1 ;
            String name = fontName[offset];
            setText(name);
            setFont(new Font(name,Font.PLAIN,20));
            return this;
        }
    }
    public static void main(String args[]) {
        new CustomComboBox();
    }
}