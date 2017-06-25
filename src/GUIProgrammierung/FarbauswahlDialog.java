package GUIProgrammierung;

import javax.swing.JColorChooser;
import javax.swing.JFrame;

/**
 * Beispielprogramm Einbinden JColorChooser in JFrame
 * @author Markus Badzura
 */
public class FarbauswahlDialog 
{   
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        f.setTitle("Farbauswahl");
        f.setSize(500,500);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JColorChooser c = new JColorChooser();
        f.add(c);
        f.setVisible(true);
    }
}
