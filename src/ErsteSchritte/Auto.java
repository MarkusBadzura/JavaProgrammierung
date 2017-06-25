package ErsteSchritte;
import java.util.Scanner;
/**
 * Konstruktoren und Methoden für die Anwendung Auto
 * @author Markus Badzura
 */
public class Auto 
{
    Scanner sc = new Scanner(System.in);
    // Variablendeklaration und Initialisierung
    private int tachometer = 0;
    private String besitzer = "keiner";
    // Konstrukoren
    // ohne Parameter
    Auto(){}
    // mit Parameter (Es wird Parameter der Klasse String, d. h. Zeichenkette
    // erwartet.
    Auto(String name)
    {
        besitzer = name;
    }
    /**
     * Erhält gefarene km, addiert diese zum Tachometer-Stand und gibt den
     * Namen des Besitzers und die gefahrenen km aus.
     * @param gefahreneKM Anzahl der gefahrenen KM
     */
    public void bewegeAuto(int gefahreneKM)
    {
        tachometer = tachometer + Math.abs(gefahreneKM);
        System.out.println(besitzer+" ist gerade "+gefahreneKM+" gefahren.");
    }
    /**
     * Gibt den Besitzer und die Gradzahl beim Wechsel der Fahrtrichtung an
     * @param grad Gradanzahl, um wieviel die Fahrtrichtung geändert wurde
     */
    public void aendereRichtung (double grad)
    {
        System.out.println(besitzer+" hat seine Fahrtrichtung um "+grad+"° geändert");
    }
    /**
     * Gibt den aktuellen KM-Stand zurück
     * @return aktuellen KM-Stand als int-Wert
     */
    public int getKmStand ()
    {
        return tachometer;
    }
}
