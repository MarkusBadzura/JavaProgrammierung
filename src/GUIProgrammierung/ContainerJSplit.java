package GUIProgrammierung;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * Beispiel für Containerklasse JSplitPane
 * @author Markus Badzura
 */
public class ContainerJSplit extends JFrame
{
    public void ContainerJSplit()
    {
        setTitle("Beispielprogram JSplitPane");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        JSplitPane js = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        js.setSize(400,400);
        JPanel panel_rot = new JPanel();
        JPanel panel_gruen = new JPanel();
        panel_gruen.setBackground(Color.green);
        panel_rot.setBackground(Color.red);
        add(js);
        js.setLeftComponent(panel_rot);
        js.setRightComponent(panel_gruen);
        js.setDividerLocation(0.5);
        js.setDividerSize(2);
        setVisible(true);
    }
    
    public static void main(String[] args) 
    {
        ContainerJSplit cjs = new ContainerJSplit();
        cjs.ContainerJSplit();
    }
}
