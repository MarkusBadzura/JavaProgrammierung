/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErsteSchritte;

/**
 * Beispielprogramm für die Demonstration von Variablenfehler
 * @author Markus Badzura
 */
public class Variablenfehler 
{
    public static void main(String[] args)
    {
        int zahl1;
        double wert1, wert2;
        String zeichen1;
        
        zahl1 = 10;
        wert1 = wert2 = 20.3;
        zeichen1 = "Zeichenkette";
        
        
        int anzahlApfel = 4;
        //anzahlBirnen = 3;  // Hier wird eine Variable initialisiert, ohne Deklaration
        int anzahlBirnen = 3; // Der Fehler von Zeile 17 wurde behoben
        //anzahlApfel = "zehn"; // Hier wird einer Variablen mit Datentyp int ein String zugewiesen
        anzahlApfel = 10; // Der Fehler von Zeile 19 wurde behoben
    }
}
