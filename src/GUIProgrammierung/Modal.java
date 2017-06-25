package GUIProgrammierung;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Beispiel eines modal-gesetzten JDialogs
 * @author Markus Badzura
 */
public class Modal 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        JDialog d = new JDialog(f, "Dialogfenster", true);
        f.setSize(200,200);
        f.setTitle("Fenster");
        f.setLocation(300,300);
        d.setSize(200,200);
        d.setLocation(550,300);
        d.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        d.setVisible(true);
    }
}
