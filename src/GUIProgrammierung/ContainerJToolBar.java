package GUIProgrammierung;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;

/**
 * Beispielprogramm für JToolBar
 * @author Markus Badzura
 */
public class ContainerJToolBar extends JFrame
{
    public void ContainerJToolBar()
    {
        setTitle("Beispielprogramm Containerklasse JToolBar");
        setSize(600,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Hier wird das Menü erzeugt und hinzugefügt
        JMenuBar menu = new JMenuBar();
        menu.add(new JMenu("Tools"));
        //Hier wird die Toolbar erzeugt, der Buttons hinzugefügt werden.
        JToolBar to = new JToolBar();
        to.setSize(220, 20);
        // Insets(int top, int left, int bottom, int right)
        to.setMargin(new Insets(0,20,0,20));
        to.add(new JButton("Hammer"));
        to.add(new JButton("Schere"));
        to.add(new JButton("Locher"));   
        to.setName("Werkzeuge");
        setJMenuBar(menu); // Menü dem Frame aufsetzen
        add(to);
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        add(panel);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJToolBar tb = new ContainerJToolBar();
        tb.ContainerJToolBar();
    }
}
