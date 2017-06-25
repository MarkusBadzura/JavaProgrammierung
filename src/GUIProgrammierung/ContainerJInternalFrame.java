package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;

/**
 * Beispielprogramm JInternalFrame
 * @author Markus Badzura
 */
    public class ContainerJInternalFrame extends JFrame
{
    public void ContainerJInternalFrame()
    {
        setTitle("Beispielprogramm JInternalFrame");
        setSize(615,538);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        JDesktopPane dpane = new JDesktopPane();
        dpane.setBackground(Color.green);
        dpane.setSize(600,500);
        // Erzeugen der JInternalFrame-Objekte
        JInternalFrame f1 = new JInternalFrame();
        JInternalFrame f2 = new JInternalFrame("Fenster 2");
        JInternalFrame f3 = new JInternalFrame("Fenster 3", true);
        JInternalFrame f4 = new JInternalFrame("Fenster 4", false, true);
        JInternalFrame f5 = new JInternalFrame("Fenster 5", true, false, false);
        JInternalFrame f6 = new JInternalFrame("Fenster 6", false, true, false, true);
        f1.setSize(250,100);// Größe festlegen
        f2.setSize(250,100);
        f3.setSize(250,100);
        f4.setSize(250,100);
        f5.setSize(250,100);
        f6.setSize(250,100);
        f1.setLocation(50,50);//Positionen festlegen
        f2.setLocation(100,100);
        f3.setLocation(150,150);
        f4.setLocation(200,200);
        f5.setLocation(250,250);
        f6.setLocation(300,300);
        f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE); // Schließverhalten
        f2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f3.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f4.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f6.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f1.show();//JInternalFrame's sichtbar machen
        f2.show();
        f3.show();
        f4.show();
        f5.show();
        f6.show();
        dpane.add(f1);
        dpane.add(f2);
        dpane.add(f3);
        dpane.add(f4);
        dpane.add(f5);
        dpane.add(f6);
        dpane.setSelectedFrame(f3);
        f3.toFront();
        f4.toBack();
        f1.hide();
        add(dpane);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJInternalFrame inf = new ContainerJInternalFrame();
        inf.ContainerJInternalFrame();
    }
}
