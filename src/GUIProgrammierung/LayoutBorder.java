package GUIProgrammierung;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Beispiel des Border-Layout-Managers
 * @author Markus Badzura
 */
public class LayoutBorder extends JFrame
{
    public void LayoutBorder()
    {
        setTitle("Beispiel Border-Layout-Manager");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(217,240);
        setLocationRelativeTo(null);
        setLayout(null);
        JPanel panLayout = new JPanel();
        panLayout.setSize(200,200);
        panLayout.setLayout(new BorderLayout(5,5));
        JPanel panNorth = new JPanel();
        panNorth.setBackground(Color.cyan);
        JPanel panSouth = new JPanel();
        panSouth.setBackground(Color.blue);
        JPanel panEast = new JPanel();
        panEast.setBackground(Color.green);
        JPanel panCenter = new JPanel();
        panCenter.setBackground(Color.red);
        JPanel panWest = new JPanel();
        panWest.setBackground(Color.yellow);
        panLayout.add(panNorth,BorderLayout.PAGE_START);
        panLayout.add(panWest, BorderLayout.LINE_START);
        panLayout.add(panCenter, BorderLayout.CENTER);
        panLayout.add(panEast, BorderLayout.LINE_END);
        panLayout.add(panSouth, BorderLayout.PAGE_END);
        add(panLayout);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        LayoutBorder lb = new LayoutBorder();
        lb.LayoutBorder();
    }
}
