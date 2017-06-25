package GUIProgrammierung;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * Beispielprogramm CardLayout
 * @author Markus Badzura
 */
public class LayoutCard extends JFrame
{
    public void FormatCardL()
    {
        setTitle("Beispielprogramm CardLayout");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JSplitPane js = new JSplitPane();
        JPanel panelNav = new JPanel();
        JPanel panelButton = new JPanel();
        panelButton.add(new JButton("Button"));
        JPanel panelLabel = new JPanel();
        panelLabel.add(new JLabel("Label"));
        JPanel panelCard = new JPanel(new CardLayout());
        panelCard.add(panelButton,"Buttonpanel");
        panelCard.add(panelLabel,"Labelpanel");
        JButton btbt = new JButton("Button");
        JButton btlb = new JButton("Label");
        panelNav.add(btbt);
        btbt.setBounds(20,20,100,25);
        panelNav.add(btlb);
        btlb.setBounds(20,50,100,25);
        js.setLeftComponent(panelNav);
        js.setRightComponent(panelCard);
        add(js);
        setVisible(true);
        
        btbt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(panelCard.getLayout());
                cl.show(panelCard, "Buttonpanel");
            }
        });

        btlb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout)(panelCard.getLayout());
                cl.show(panelCard, "Labelpanel");
            }
        });        
        
    }
    
    public static void main(String[] args) {
        LayoutCard fc = new LayoutCard();
        fc.FormatCardL();
    }
}
