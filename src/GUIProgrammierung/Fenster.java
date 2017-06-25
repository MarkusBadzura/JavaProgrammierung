package GUIProgrammierung;

import java.awt.Color; //benötigt für Hintergrundfarbe
import javax.swing.JFrame; // benötigt für Objekterzeugung von JFrame

/**
 * Beispielprogramm für das Erzeugen eines Objekts der Klasse JFrame
 * @author Markus Badzura
 */
public class Fenster 
{
    public static void main(String[] args) 
    {
        JFrame j = new JFrame();
        j.setTitle("JFrame"); // Fensterüberschrift
        j.setSize(500,200); // Fenstergröße
        j.setLocationRelativeTo(null); // Fensterplatzierung mittig
        j.setLayout(null); // Festlegung Layoutmanager
        j.getContentPane().setBackground(Color.blue); // Hintergrundfarbe
        j.setVisible(true);// sichtbar machen
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Thread beenden

    }
}
