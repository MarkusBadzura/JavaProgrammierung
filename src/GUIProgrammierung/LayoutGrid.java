package GUIProgrammierung;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Beispielprorgramm für GridLayout
 * @author Markus Badzura
 */
public class LayoutGrid extends JFrame
{
    public void LayoutGrid()
    {
        setTitle("Beispielprogramm LayoutGrid");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,200);
        setLocationRelativeTo(null);
        JPanel panel_grid = new JPanel(new GridLayout(3,1,10,10));
        // Objektarray für Button
        JButton bt[] = new JButton[4];
        // Durch Änderung Schleifenbedingung werden weniger oder mehr Buttons
        // hinzugefügt. Wenn mehr als 4 Button muss die Arraygröße angepasst
        // werden
        for (int i=0;i<4;i++)
        {
            bt[i] = new JButton((i+1)+"");  
            panel_grid.add(bt[i]);
        }        
        add(panel_grid);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        LayoutGrid lg = new LayoutGrid();
        lg.LayoutGrid();
    }
}
