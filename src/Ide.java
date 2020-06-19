import javax.swing.*;
import java.awt.*;

public class Ide extends JFrame{
    Ide(){
        setSize(1200, 600);
        setTitle("C-IDE");
        getContentPane().setBackground(new Color(0,0,0));
        ImageIcon img = new ImageIcon("icon.png");
        setIconImage(img.getImage());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("FILE");
        JMenuItem item1 = new JMenuItem("Open");
        JMenuItem item2 = new JMenuItem("New");
        JMenuItem item3 = new JMenuItem("Save");
        //item1.setIcon(new ImageIcon("icon.png"));
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menuBar.add(menu1);
        setJMenuBar(menuBar);
        //JTextField textField = new JTextField("Start writing code here...", 50);
        JTextArea textField = new JTextArea(30, 30);
        JPanel p = new JPanel();
        p.setLayout(new BorderLayout());
        p.add(textField, BorderLayout.WEST);
        add(p);
        setVisible(true);
    }
    public static void main(String... args){
        new Ide();
    }
}