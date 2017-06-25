package GUIProgrammierung;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Beispielprogramm Container JPanel
 * @author Markus Badzura
 */
public class ContainerJPanel extends JFrame
{
    public void ContainerJPanel()
    {
        // Eigenschaften unseres JFrames
        setTitle("ContainerJPanel");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        // JPanel-Objekt erzeugen
        JPanel container = new JPanel();
        container.setBackground(Color.blue); // Hintergrundfarbe JPanel
        // JPanel JFrame hinzufügen
        add(container);
        // Größe des JFrame ermitteln
        Dimension d = new Dimension(getSize());
        // JPanel auf diese Größe setzen
        container.setSize(d);
        // JFrame sichtbar machen
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJPanel c = new ContainerJPanel();
        c.ContainerJPanel();
    }
}
