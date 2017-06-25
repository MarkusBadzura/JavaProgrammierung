package GUIProgrammierung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Beispielprogramm für JOptionPane
 * @author Markus Badzura
 */
public class OptionFenster 
{
    public static void main(String[] args) 
    {
        JFrame f = new JFrame();
        f.setTitle("Beispiel JOptionPane");
        f.setSize(500,500);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("JOptionPane öffnen");
        b1.setBounds(20,20,150,25);
        f.add(b1);
        f.setVisible(true);
        
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) 
            {
               int auswahl = JOptionPane.showConfirmDialog(f, "Beispiel JOptionPane",
                       "Button drücken",JOptionPane.YES_NO_CANCEL_OPTION);
               switch (auswahl)
               {
                   case JOptionPane.YES_OPTION:
                       System.out.println("Ja-Button wurde gedrückt.");
                       break;
                   case JOptionPane.NO_OPTION:
                       System.out.println("Nein-Button wurde gedrückt.");
                       break;
                   case JOptionPane.CANCEL_OPTION:
                       System.out.println("Abbrechen-Button wurde gedrückt");
                       break;
                   case JOptionPane.CLOSED_OPTION:
                       System.out.println("Es wurde kein Button gedrückt.");
                       break;
                   default:
                       System.out.println("Es konnte keine Aktion ermittelt werden.");
               }
            }        
        });
    }
}
