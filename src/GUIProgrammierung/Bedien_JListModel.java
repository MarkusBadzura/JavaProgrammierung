package GUIProgrammierung;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

/**
 * Beispiel zur Verwendung von JList
 * @author Markus Badzura
 */
public class Bedien_JListModel extends JFrame
{
    JPanel pan;
    JList jl;
    String[] farben = {"Blau", "Grün", "Gelb"};
    // Deklaration und Initialisierung vom ListModel
    DefaultListModel farbenliste = new DefaultListModel();
    /**
     * Fenster erzeugen
     */
    public void Bedien_JlistModel()
    {
        this.setTitle("Beispiel JList mit ListModel");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocation(100,100);
        this.setSize(400,400); 
        this.setLayout(null);
        pan = new JPanel();
        pan.setSize(this.getSize());
        pan.setLayout(null);
        // JListe mit listModel erstellen
        jl = new JList(farbenliste);
        jl.setBounds(10,10,300,300);
        jl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // String farben der JList hinzufügen
        for (int i = 0; i< farben.length;i++)
        {
            farbenliste.addElement(farben[i]);
        }
        // Neue Farbe einfügen. Hierfür muss der höchste Index ermittelt werden
        // Das Einfügen findet nun nach dem höchsten Index statt (+1)
        farbenliste.add(jl.getLastVisibleIndex()+1, "Orange");
        // Farbe entfernen
        farbenliste.removeElement("Grün");
        // Wenn wir einen bestimmten Index entfernen wollen, so verwenden wir
        farbenliste.removeElementAt(1);
        pan.add(jl);
        this.add(pan);
        this.setVisible(true);
    }
    /**
     * Start der Anwendung
     * @param args keine
     */
    public static void main(String[] args) {
        Bedien_JListModel bjl = new Bedien_JListModel();
        bjl.Bedien_JlistModel();
    }
}