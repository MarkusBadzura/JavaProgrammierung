package GUIProgrammierung;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Beispielprogramm FlowLayout
 * @author Markus Badzura
 */
public class LayoutFlow extends JFrame
{
    public void LayoutFlow()
    {
        setTitle("Beispielprogramm FlowLayout");
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel_flow = new JPanel(new FlowLayout(FlowLayout.RIGHT, 20,20));
        JLabel label1 = new JLabel("Das ist ein Label");
        label1.setForeground(Color.green);
        JLabel label2 = new JLabel("kurz");
        JLabel label3 = new JLabel("und doch");
        label3.setForeground(Color.red);
        JLabel label4 = new JLabel("nur ein Label");
        panel_flow.add(label1);
        panel_flow.add(label2);
        panel_flow.add(label3);
        panel_flow.add(label4);
        add(panel_flow);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        LayoutFlow lf = new LayoutFlow();
        lf.LayoutFlow();
    }
}
