package GUIProgrammierung;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Beispielprogramm Containerklasse JTabbedPane
 * @author Markus Badzura
 */
public class ContainerJTabbed extends JFrame
{
    public void ContainerJTabbed()
    {
        setTitle("Beispielprogramm JTabbedPane");
        Dimension d = new Dimension(400,400);    
        setSize(d);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel_blau = new JPanel();
        panel_blau.setSize(d);
        panel_blau.setBackground(Color.blue);
        JPanel panel_rot = new JPanel();
        panel_rot.setSize(d);
        panel_rot.setBackground(Color.red);
        JPanel panel_gruen = new JPanel();
        panel_gruen.setSize(d);
        panel_gruen.setBackground(Color.green);
        JPanel panel_gelb = new JPanel();
        panel_gelb.setSize(d);
        panel_gelb.setBackground(Color.yellow);
        JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP, JTabbedPane.SCROLL_TAB_LAYOUT);
        tab.add("Blauer Reiter",panel_blau);
        tab.add("Roter Reiter", panel_rot);
        tab.add("Grüner Reiter",panel_gruen);
        tab.add("Gelber Reiter",panel_gelb);
        add(tab);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJTabbed ct = new ContainerJTabbed();
        ct.ContainerJTabbed();
    }
}
