package ErsteSchritte;
import java.util.Scanner;

/**
 * Beispielprogramm für eine optimierte Version einer Kursauswertung
 * @author Markus Badzura
 */
public class Kursauswertung_opt 
{
    public static void main(String[] args)
    {
        /**
         * Variablen und Objekt Deklaration und Initialisierung
         */
        Scanner sc = new Scanner(System.in);
        final byte GEWICHT_PRUEFUNG = 70;   
        final byte GEWICHT_PRAXIS = 20;     
        final byte GEWICHT_HAUSAUFGABE = 10;
        float punktePruefung, punktePraxis, punkteHausaufgabe, punkteGesamt;       

        /**
         * Abfrage der Ergebnisse
         */
        System.out.println("Punkte der Prüfung: ");
        punktePruefung = sc.nextFloat();
        System.out.println("Punkte der Praxis: ");
        punktePraxis = sc.nextFloat();
        System.out.println("Punkte der Hausaufgabe: ");
        punkteHausaufgabe = sc.nextFloat();
        
        /**
         * Berechnungen
         */
	punktePruefung = punktePruefung * (float)(GEWICHT_PRUEFUNG / 100);
        punktePraxis = punktePraxis * (float)(GEWICHT_PRAXIS / 100);
        punkteHausaufgabe = punkteHausaufgabe * (float)(GEWICHT_HAUSAUFGABE / 100);
        punkteGesamt = punktePruefung + punktePraxis + punkteHausaufgabe;
        
        /**
         * Ausgabe der Gesamtpunktzahl
         */
        System.out.println("Endpunktzahl " + punkteGesamt);    
    }        
}
