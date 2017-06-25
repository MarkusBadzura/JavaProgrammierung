package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;

/**
 * Beispielprogramm JLayeredPane
 * @author Markus Badzura
 */
public class ContainerJLayeredPane extends JFrame
{
    public void ContainerJLayeredPane()
    {
        setTitle("Beispiel JLayeredPane");    
        setSize(550, 550);    
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane( );
        lp.setSize(550,550);
        JButton bt_weiss = new JButton( );    
        bt_weiss.setBackground(Color.white);    
        bt_weiss.setBounds(20, 20, 150, 150);    
        JButton bt_grau = new JButton( );    
        bt_grau.setBackground(Color.gray);    
        bt_grau.setBounds(120, 120, 150, 150);    
        JButton bt_schwarz = new JButton( );    
        bt_schwarz.setBackground(Color.black);    
        bt_schwarz.setBounds(240, 240, 150, 150);
//        // Button ohne Schicht-Angabe
//        lp.add(bt_grau);
//        lp.add(bt_weiss);
//        lp.add(bt_schwarz);
        //Button mit Schicht-Angabe
        lp.add(bt_grau,new Integer(2));    
        lp.add(bt_weiss,new Integer(3));    
        lp.add(bt_schwarz,new Integer(1));
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJLayeredPane jlp = new ContainerJLayeredPane();
        jlp.ContainerJLayeredPane();
    }
}
