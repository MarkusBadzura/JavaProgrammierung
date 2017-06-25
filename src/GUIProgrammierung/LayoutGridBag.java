package GUIProgrammierung;

import java.awt.Component;
import java.awt.GridBagConstraints;
import static java.awt.GridBagConstraints.BOTH;
import static java.awt.GridBagConstraints.CENTER;
import static java.awt.GridBagConstraints.FIRST_LINE_START;
import static java.awt.GridBagConstraints.HORIZONTAL;
import static java.awt.GridBagConstraints.LINE_START;
import static java.awt.GridBagConstraints.NONE;
import static java.awt.GridBagConstraints.RELATIVE;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Beispielprogramm für GridBagLayout
 * @author Markus Badzura
 */
public class LayoutGridBag extends JFrame
{   
    // Container
    JPanel panel_grid;
    // Bedienelemente 
    private JTextField txtName, txtAlter;
    private JTextArea txaKommentar;
    private JButton btOk;
    
    //GridBagConstraints Argumente
    private int gridx, gridy, gridwidth, gridheight, fill, anchor, ipadx, ipady;
    private double weightx, weighty;
    private Insets insets;
    
    //GridBadConstraints Insets für Bedienelemente
    private int oben, links, unten, rechts;
    private final Insets insetsOben = new Insets(oben = 5, links = 0, unten = 15, rechts = 0);
    private final Insets insetsLabel = new Insets(oben = 0, links = 10, unten = 6, rechts = 5);
    private final Insets insetsText = new Insets(oben = 0, links = 0, unten = 6, rechts = 10);
    private final Insets insetsUnten = new Insets(oben = 10, links = 0, unten = 10, rechts = 0);    
    
    public void LayoutGridBag()
    {
        // Top-Level-Container JFrame
        setTitle("Beispiel GridBagLayout");
        setSize(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Container JPanel
        panel_grid = new JPanel(new GridBagLayout());
        add(panel_grid);
        // Bedienelemente dem JPanel hinzufügen.
        // Kopfzeile
        setStandardwerteGB();
        addGB(new JLabel("Anmeldeformular"), gridx = 1, gridy = 1,
                gridwidth = 2, gridheight, fill,
                weightx = 1.0, weighty, anchor,
                insets = insetsOben);
        //Grid-Reihe Name
        setStandardwerteGB();
        addGB(new JLabel("Name"), gridx = 1, gridy = 2,
                gridwidth, gridheight, fill,
                weightx, weighty, anchor = LINE_START,
                insets = insetsLabel);
        txtName = new JTextField();
        setStandardwerteGB();
        addGB(txtName, gridx = 2, gridy = 2,
                gridwidth, gridheight, fill = HORIZONTAL,
                weightx = 1.0, weighty, anchor,
                insets = insetsText);
        //Grid-Reihe Alter
        setStandardwerteGB();
        addGB(new JLabel("Alter"), gridx = 1, gridy = 3,
                gridwidth, gridheight, fill,
                weightx, weighty, anchor = LINE_START,
                insets = insetsLabel);
        txtAlter = new JTextField(3);
        txtAlter.setMinimumSize(txtAlter.getPreferredSize());
        setStandardwerteGB();
        addGB(txtAlter, gridx = 2, gridy = 3,
                gridwidth, gridheight, fill,
                weightx, weighty, anchor = LINE_START,
                insets = insetsText);
        //Grid-Reihe Kommentar
        setStandardwerteGB();
        addGB(new JLabel("Kommentar"), gridx = 1, gridy = 4,
                gridwidth, gridheight, fill,
                weightx, weighty, anchor = FIRST_LINE_START,
                insets = insetsLabel);
        txaKommentar = new JTextArea();
        setStandardwerteGB();
        addGB(new JScrollPane(txaKommentar), gridx = 2, gridy = 4,
                gridwidth, gridheight, fill = BOTH,
                weightx = 1.0, weighty = 1.0, anchor,
                insets = insetsText);
        //Grid-Reihe Boden
        btOk = new JButton("OK");
        setStandardwerteGB();
        addGB(btOk, gridx = 1, gridy = 5,
                gridwidth = 2, gridheight, fill,
                weightx, weighty, anchor,
                insets = insetsUnten);        
        
        setVisible(true);
    }
    
    /**
     * Setzen der GridBagConstraints - Argumente auf Standardwerte
     */
    private void setStandardwerteGB() 
    {
        // Standartwerte für GridBagConstraints
        gridx = RELATIVE;
        gridy = RELATIVE;
        gridwidth = 1;
        gridheight = 1;
        fill = NONE;
        weightx = 0.0;
        weighty = 0.0;
        anchor = CENTER;
        insets = new Insets(0, 0, 0, 0);
        ipadx = 0;
        ipady = 0;
    }    
    
    /**
    * 
    * @param component Bedienelement, welches dem GridBagLayout hinzugfügt wird
    * @param gridx x-Raster 
    * @param gridy y-Raster
    * @param gridwidth Breite des Elements (am Gridraster)
    * @param gridheight Höhe des Elements (am Gridraster)
    * @param fill Größenanpassung des Elements
    * @param weightx Verteilung im horizontalen Raum
    * @param weighty Verteilung im vertikalen Raum
    * @param anchor Verhalten, wenn Bedienelement kleiner als Anzeigebereich
    * @param insets Aussenabstände der Elemente
    */
    private void addGB(Component component,  int gridx,  int gridy, 
            int gridwidth, int gridheight, int fill,  double weightx,
            double weighty, int anchor, Insets insets) 
    {
        addGB(component, gridx, gridy, gridwidth, gridheight, fill, weightx,
                weighty, anchor, insets, ipadx, ipady);
    }      
    
    /**
     * Übergabe der GridBagConstraints-Argumente für die Bedienelemente mit 
     * Innenpolsterung
     * @param component Bedienelement, welches dem GridBagLayout hinzugfügt wird
     * @param gridx x-Raster 
     * @param gridy y-Raster
     * @param gridwidth Breite des Elements (am Gridraster)
     * @param gridheight Höhe des Elements (am Gridraster)
     * @param fill Größenanpassung des Elements
     * @param weightx Verteilung im horizontalen Raum
     * @param weighty Verteilung im vertikalen Raum
     * @param anchor Verhalten, wenn Bedienelement kleiner als Anzeigebereich
     * @param insets Aussenabstände der Elemente
     * @param ipadx Innenabstand Breite
     * @param ipady Innenabstand Höhe
     */
    private void addGB(Component component, int gridx,  int gridy,
             int gridwidth, int gridheight, int fill,  double weightx,  
             double weighty, int anchor,  Insets insets, int ipadx,  int ipady) 
        {
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.gridwidth = gridwidth;
        constraints.gridheight = gridheight;
        constraints.fill = fill;
        constraints.weightx = weightx;
        constraints.weighty = weighty;
        constraints.anchor = anchor;
        constraints.insets = insets;
        constraints.ipadx = ipadx;
        constraints.ipady = ipady;
        panel_grid.add(component, constraints);
    }    
    
    public static void main(String[] args) 
    {
        LayoutGridBag gb = new LayoutGridBag();
        gb.LayoutGridBag();
    }
}
