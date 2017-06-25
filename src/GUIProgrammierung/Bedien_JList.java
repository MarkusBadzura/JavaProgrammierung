package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Beispiel zur Verwendung von JList
 * @author Markus Badzura
 */
public class Bedien_JList extends JFrame implements ListSelectionListener
{
    JPanel pan;
    JList jl;
    String[] farben = {"Blau", "Grün", "Gelb"};
    
    /**
     * Fenster erzeugen
     */
    public void Bedien_Jlist()
    {
        this.setTitle("Beispiel JList");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setSize(400,400); 
        this.setLayout(null);
        pan = new JPanel();
        pan.setSize(this.getSize());
        pan.setLayout(null);
        jl = new JList(farben);
        jl.setBounds(10,10,300,300);
        jl.addListSelectionListener(this);
        jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        pan.add(jl);
        this.add(pan);
        this.setVisible(true);
    }
    /**
     * Start der Anwendung
     * @param args keine
     */
    public static void main(String[] args) {
        Bedien_JList bjl = new Bedien_JList();
        bjl.Bedien_Jlist();
    }
    /**
     * ListSelectionListener, um auf Listenauswahl zu reagieren
     * @param e 
     */
    @Override
    public void valueChanged(ListSelectionEvent e) 
    {
        if (e.getSource() == jl)
        {
            int fall = jl.getSelectedIndex();
            if (fall == 0) pan.setBackground(Color.BLUE);
            if (fall == 1) pan.setBackground(Color.GREEN);
            if (fall == 2) pan.setBackground(Color.YELLOW);
            jl.clearSelection();
        }
    }
}
