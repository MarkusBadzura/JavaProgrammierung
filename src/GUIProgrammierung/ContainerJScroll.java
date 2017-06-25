package GUIProgrammierung;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * Beispiel Container-Klasse JScrollPane
 * @author Markus Badzura
 */
public class ContainerJScroll extends JFrame
{
    public void ContainerJScroll()
    {
        setTitle("Beispiel Container-Klasse JScrollPane");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,200);
        JPanel panel = new JPanel();
        panel.setSize(400,400);
        panel.add(new JLabel("Das ist ein Label mit einer großen Anzahl von Zeichen"
                + ". Die Scrollbar erscheint in diesem Beispiel erste, wenn der Text "
                + "länger ist, als die zur Verfügung gestellt Fläche."));
        JScrollPane scroll = new JScrollPane(panel,
                ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
                ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        add(scroll);
        setVisible(true);
    }
    public static void main(String[] args) 
    {
        ContainerJScroll s = new ContainerJScroll();
        s.ContainerJScroll();
    }
}
