/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;

/**
* Created by kanda on 17.05.17.
*/
public class Spielfenster {
    //Anfang Attribute
    private Karte[][] Spielfeld = new Karte[3][3];
    private JPanel jPanel1;
    //Ende Attribute
    //Anfang Methoden
    public void create(){
        for(int zeile = 0; zeile < 3; zeile++){
            for(int spalte = 0; spalte < 3; spalte++){
                Spielfeld[zeile][spalte] = new Karte();
                Spielfeld[zeile][spalte].setBounds(100 + (zeile * 30), 70 + (zeile * 30), 30, 30);
                Spielfeld[zeile][spalte].setBackground(Color.BLACK);
                Spielfeld[zeile][spalte].setText(zeile + " " + spalte);
                jPanel1.add(Spielfeld[zeile][spalte]);
            }
        }
    }

    //Ende Methoden


    public static void main(String[] args) {
        JFrame frame = new JFrame("Spielfenster");
        frame.setContentPane(new Spielfenster().jPanel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        JPanel jPanel1 = new JPanel();
    }
}
 
