import javax.swing.*;

public class JavaMenu {

    public static void main(String[] args) {

        JMenu menu,menu2, submenu;

        menu=new JMenu("Archivo");
        menu2=new JMenu("Edicion");
        submenu=new JMenu("Sub-Menu");

        JMenuItem i1, i2, i3, i4, i5;

        i1=new JMenuItem("Item 1");
        i2=new JMenuItem("Item 2");
        i3=new JMenuItem("Item 3");
        i4=new JMenuItem("Item 4");
        i5=new JMenuItem("Item 5");

        menu.add(i1);

        menu2.add(i2);
        menu2.add(i3);
        submenu.add(i4);
        submenu.add(i5);

        JFrame f= new JFrame("Ejemplo menu");
        JMenuBar mb=new JMenuBar();

        menu.add(submenu);
        mb.add(menu);
        mb.add(menu2);


        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);






    }}
