package GUIProgrammierung;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Beispielprogramm für JCheckBox
 * @author Markus Badzura
 */
public class Bedien_Checkbox extends JFrame
{
    public void Bedien_Checkbox()
    {
        setTitle("Beispiel JCheckBox");
        setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        JPanel j_pan = new JPanel();
        JCheckBox a = new JCheckBox();
        JCheckBox b = new JCheckBox("Test");
        JCheckBox c = new JCheckBox("noch ein Test",true);
        j_pan.add(a);
        j_pan.add(b);
        j_pan.add(c);
        add(j_pan);
        setVisible(true);
    }
    public static void main(String[] args) {
        Bedien_Checkbox cb = new Bedien_Checkbox();
        cb.Bedien_Checkbox();
    }
}
