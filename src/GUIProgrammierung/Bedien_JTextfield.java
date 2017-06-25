package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Beispiel JTextField
 * @author Markus Badzura
 */
public class Bedien_JTextfield extends JFrame
{
    public static void main(String[] args) 
    {
        Bedien_JTextfield tf = new Bedien_JTextfield();
        tf.Bedien_JTextfield();
    }
    
    public void Bedien_JTextfield()
    {
        this.setSize(300,300);
        this.setTitle("Beispiel JTextField");   
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setSize(this.getSize());
        JTextField tf1 = new JTextField();
        JTextField tf2 = new JTextField("Textfeld");
        JTextField tf3 = new JTextField(10);
        JTextField tf4 = new JTextField("Textfeld",10);
        tf1.setColumns(15);
        tf2.setForeground(Color.RED);
        tf3.setBackground(Color.GREEN);
        tf4.setSize(150,40);
        panel.add(tf1);
        panel.add(tf2);
        panel.add(tf3);
        panel.add(tf4);
        this.add(panel);
        this.setVisible(true);
        int alter = Integer.parseInt(tf3.getText());
    }
}
