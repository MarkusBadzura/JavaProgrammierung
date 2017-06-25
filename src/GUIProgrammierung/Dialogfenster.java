package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JDialog;

/**
 * Beispielprogram für JDialog
 * @author Markus Badzura
 */
public class Dialogfenster 
{
    public static void main(String[] args) 
    {
        JDialog d = new JDialog();
        d.setSize(200,150);
        d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        d.setLocation(400,300);
        d.getContentPane().setBackground(Color.red);
        d.setTitle("Dialogfenster");
        d.setLayout(null);
        d.setVisible(true);
    }
}
