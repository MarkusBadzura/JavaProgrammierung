/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIProgrammierung;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 * Beispielprogramm BoxLayout-Manager
 * @author Markus Badzura
 */
public class LayoutBox extends JFrame
{
    public void LayoutBox()
    {
        setTitle("Beispielprogram BoxLayout");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocationRelativeTo(null);
        JSplitPane js = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        js.setSize(400,400);
        JPanel panel_h = new JPanel();
        JPanel panel_v = new JPanel();
        panel_h.setLayout(new BoxLayout(panel_h, BoxLayout.X_AXIS));
        panel_v.setLayout(new BoxLayout(panel_v, BoxLayout.PAGE_AXIS));
        add(js);
        JButton bBlau = new JButton("Blau");
        JButton bGruen = new JButton("Grün");
        JButton bRot = new JButton("Rot");
        JButton bGelb = new JButton("Gelb");
        JButton bBlau1 = new JButton("Blau");
        JButton bGruen1 = new JButton("Grün");
        JButton bRot1 = new JButton("Rot");
        JButton bGelb1 = new JButton("Gelb");
        panel_h.add(bBlau);
        panel_h.add(bGruen);
        panel_h.add(bRot);
        panel_h.add(bGelb);
        panel_v.add(bBlau1);
        panel_v.add(bGruen1);
        panel_v.add(bRot1);
        panel_v.add(bGelb1);      
        js.setLeftComponent(panel_h);
        js.setRightComponent(panel_v);
        js.setDividerLocation(0.5);
        js.setDividerSize(2);
        setVisible(true);        
    }
    
    public static void main(String[] args) 
    {
        LayoutBox lb = new LayoutBox();
        lb.LayoutBox();
    }
}
