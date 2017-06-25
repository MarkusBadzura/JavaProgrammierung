package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Beispielprogramm für die Verwendung von JLabel
 * @author Markus Badzura
 */
public class Bedien_JLabel extends JFrame
{
    public static void main(String[] args) 
    {
        Bedien_JLabel bjl = new Bedien_JLabel();
        bjl.Bedien_JLabel();
    }
    public void Bedien_JLabel()
    {
        this.setTitle("Beispiel JLabel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setSize(400,400);
        JPanel jp = new JPanel();
        jp.setSize(400,400);
        // JLabel mit verschiedenen Konstruktoren
        JLabel lb_1 = new JLabel("");
        lb_1.setText("Text");
        JLabel lb_2 = new JLabel("noch ein Text");
        jp.setLayout(null);
        lb_1.setLocation(10,10);
        lb_1.setSize(150,20);
        lb_2.setBounds(10,40,150,20);
        lb_2.setBackground(Color.green);
        lb_2.setOpaque(true);
        lb_1.setFont(lb_1.getFont().deriveFont(20f));
        lb_1.setForeground(Color.PINK);
        lb_1.setHorizontalAlignment(JLabel.RIGHT);
        JLabel lb_3 = new JLabel("Blubb",JLabel.CENTER);
        lb_3.setBounds(10,70,150,100);
        lb_3.setVerticalAlignment(JLabel.CENTER);
        jp.add(lb_3);
        jp.add(lb_1);
        jp.add(lb_2);
        this.add(jp);
        this.setVisible(true);
    }
}
