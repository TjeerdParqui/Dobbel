import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

/**
 * Created by tjeerd on 1/22/17.
 */
public class ProjectOne extends JFrame  {

    public static JLabel label, label2;
    public static ImageIcon img, img2, img3, img4 ,img5, img6;
    public static JTextField text;

    public static void main(String[] args) {
        ProjectOne frame = new ProjectOne();


        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

        JLabel label = new JLabel("test");
        frame.add(label);
        frame.setTitle("test");

    }

    public ProjectOne() {
        img = new ImageIcon(getClass().getResource("dobbel1.jpg"));
        img2 = new ImageIcon(getClass().getResource("dobbel2.jpg"));
        img3 = new ImageIcon(getClass().getResource("dobbel3.jpg"));
        img4 = new ImageIcon(getClass().getResource("dobbel4.jpg"));
        img5 = new ImageIcon(getClass().getResource("dobbel5.jpg"));
        img6 = new ImageIcon(getClass().getResource("dobbel6.jpg"));
        setLayout(new FlowLayout());
        label = new JLabel(img);
        add(label);
        JButton but1 = new JButton("dice");
        add(but1);
        Event e = new Event();
        but1.addActionListener(e);
        label2 = new JLabel();
        add(label2);

    }


}


