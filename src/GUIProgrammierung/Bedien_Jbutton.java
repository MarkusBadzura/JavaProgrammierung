package GUIProgrammierung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Beispielprogramm JButton
 * @author Markus Badzura
 */
public class Bedien_Jbutton extends JFrame implements ActionListener
{
    public int zaehler = 0;
    public JButton b1;
    public void Bedien_Jbutton()
    {
        this.setSize(300,300);
        this.setTitle("Beispiel JTextField");   
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
        // Button-Beschriftung hinzufügen
        b1 = new JButton("Drück mich");
        // Button dem Action-Listener hinzufügen
        b1.addActionListener(this);
        b1.setBounds(10,10,200,30);
        this.add(b1);
        this.setVisible(true);
    }
    public static void main(String[] args) 
    {
       Bedien_Jbutton bjb = new Bedien_Jbutton();
       bjb.Bedien_Jbutton();
    }
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        // prüfen, ob b1 das Event ausgelöst hat
        if (e.getSource() == b1)
        {
            zaehler++;
            b1.setText(zaehler+" x gedrückt");
        }
    } 
}
