package GUIProgrammierung;

import java.awt.Color;
import java.awt.event.ActionEvent; // Erklärung folgt später
import java.awt.event.ActionListener; // Erklärung folgt später
import javax.swing.JButton; // Erklärung folgt später
import javax.swing.JWindow;

/**
 * Beispielprogram für die Klasse JWindow
 * @author Markus Badzura
 */
public class FensterWindows 
{
    public static void main(String[] args) 
    {
        JWindow w = new JWindow();
        w.setSize(200,500);
        w.setLocationRelativeTo(null);
        w.getContentPane().setBackground(Color.blue);
        w.setLayout(null);
        w.setVisible(true);
        //Der nachfolgende Bereich wird später erklärt. Dient hier nur zum
        //Schließen des Objektes
        JButton b1 = new JButton("schließen");
        b1.setBounds(20,20,150,25);
        w.add(b1);
        
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                w.dispose();
            }
        });        
    }
}
