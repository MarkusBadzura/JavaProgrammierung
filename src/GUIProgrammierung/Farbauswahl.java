package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 * Beispiel JColorChooser
 * @author Markus Badzura
 */
public class Farbauswahl 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        f.setTitle("Farbauswahl");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        Color auswahl = JColorChooser.showDialog(f, "Farbauswahl", Color.green);
        f.getContentPane().setBackground(auswahl);
    }
}
