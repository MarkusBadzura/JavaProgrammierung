package ErsteSchritte;

/**
 * Startklasse für die Anwendung Auto
 * @author Markus Badzura
 */
public class AutoStart 
{
    public static void main(String[] args)
    {
        // Erzeugen von 2 Objekten des Types Auto
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Hans"); // String muss in doppelten Hochkommas übergeben werden.
        // Auto 1 und 2 bewegen
        auto1.bewegeAuto(120);
        auto2.bewegeAuto(-100);
        // Auto2 ist 100km rückwärts gefahren. Um zu sehen, welcher km-Stand der
        // Tachometer hat deklarieren wir Variable km und initialisieren diese mit
        // dem Rückgabewert der Methode getKmStand()
        int km = auto2.getKmStand();
        System.out.println("Auto 2 - Km-Stand: "+km);
        auto1.aendereRichtung(20.5);
    }
}
