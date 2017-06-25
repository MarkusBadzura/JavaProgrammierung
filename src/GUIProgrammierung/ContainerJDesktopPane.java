package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 * Beispielprogramm Containerklasse JDesktopPane
 * @author Markus Badzura
 */
public class ContainerJDesktopPane extends JFrame
{
    public void ContainerJDesktopPane()
    {
        setTitle("Beispielprogramm JDesktopPane");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        JDesktopPane dpane = new JDesktopPane();
        dpane.setBackground(Color.green);
        dpane.setSize(500,500);
        add(dpane);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJDesktopPane dp = new ContainerJDesktopPane();
        dp.ContainerJDesktopPane();
    }
}
