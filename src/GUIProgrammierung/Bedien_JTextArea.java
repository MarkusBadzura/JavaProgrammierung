package GUIProgrammierung;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;

/**
 * Beispielprogramm JTextArea
 * @author Markus Badzura
 */
public class Bedien_JTextArea extends JFrame
{
    public static void main(String[] args) throws BadLocationException 
    {
        Bedien_JTextArea jta = new Bedien_JTextArea();
        jta.Bedien_JTextArea();
    }
    public void Bedien_JTextArea() throws BadLocationException
    {
        this.setSize(800,500);
        this.setTitle("Beispiel JTextArea");
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        String lore = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, "
                + "sed diam nonumy eirmod tempor invidunt ut labore et dolore "
                + "magna aliquyam erat, sed diam voluptua. At vero eos et "
                + "accusam et justo duo dolores et ea rebum. Stet clita kasd "
                + "gubergren, no sea takimata sanctus est Lorem ipsum dolor "
                + "gubergren, no sea takimata sanctus est Lorem ipsum dolor "
                + "sit amet.";
        String lore1= "Lorem ipsum dolor sit amet, consetetur sadipscing elitr"
                + ", sed diam nonumy eirmod tempor\n invidunt ut labore et dolore"
                + " magna aliquyam erat, sed diam voluptua. \nAt vero eos et "
                + "accusam et justo duo dolores et ea rebum. \n\nStet clita "
                + "kasd gubergren, no sea takimata sanctus est Lorem ipsum "
                + "Lorem ipsum dolor sit amet.";
        JPanel panel = new JPanel();
        panel.setSize(this.getSize());
        panel.setLayout(new FlowLayout());
        JTextArea ta1 = new JTextArea(10,20);
        ta1.setBackground(Color.gray);
        JTextArea ta2 = new JTextArea(lore1);
        JTextArea ta3 = new JTextArea();
        ta3.setText(lore);
        ta3.setColumns(20);
        ta3.setRows(5);
        ta3.setLineWrap(true);
        ta3.setBackground(Color.gray);
        JTextArea ta4 = new JTextArea(lore1,10,20);
        panel.add(ta1);
        panel.add(ta2);
        panel.add(ta3);
        panel.add(ta4);
        this.add(panel);
        this.setVisible(true);
    }
}