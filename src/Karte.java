/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
* Created by kanda on 17.05.17.
*/
public class Karte extends JButton{
    private boolean gedrueckt;
    private String inhalt;

    public boolean isGedrueckt() {
        return gedrueckt;
    }

    public void setGedrueckt(boolean gedrueckt) {
        this.gedrueckt = gedrueckt;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public Karte() {
        gedrueckt = false;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(isGedrueckt() == true){
                    setBackground(new Color(255,255,255));
                    setForeground(new Color(0,0,0));
                    setGedrueckt(true);
                }
            }
        });
    }
}
 
