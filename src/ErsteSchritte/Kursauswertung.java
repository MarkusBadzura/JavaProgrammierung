package ErsteSchritte;
import java.util.Scanner;

/**
 * Beispielprogramm für eine Kursauswertung
 * @author Markus Badzura
 */
public class Kursauswertung 
{
    public static void main(String[] args)
    {
        /**
         * Variablen und Objekt Deklaration und Initialisierung
         */
        Scanner sc = new Scanner(System.in);
        int gewichtPruefung = 70;   
        int gewichtPraxis = 20;     
        int gewichtHausaufgabe = 10;
        double punktePruefung;       
        double punktePraxis;        
        double punkteHausaufgabe;         
        double punkteGesamt;      

        /**
         * Abfrage der Ergebnisse
         */
        System.out.println("Punkte der Prüfung: ");
        punktePruefung = sc.nextDouble();
        System.out.println("Punkte der Praxis: ");
        punktePraxis = sc.nextDouble();
        System.out.println("Punkte der Hausaufgabe: ");
        punkteHausaufgabe = sc.nextDouble();
        
        /**
         * Berechnungen
         */
	punktePruefung = punktePruefung * (gewichtPruefung / 100.0);
        punktePraxis = punktePraxis * (gewichtPraxis / 100.0);
        punkteHausaufgabe = punkteHausaufgabe * (gewichtHausaufgabe / 100.0);
        punkteGesamt = punktePruefung + punktePraxis + punkteHausaufgabe;
        
        /**
         * Ausgabe der Gesamtpunktzahl
         */
        System.out.println("Your final grade is " + punkteGesamt);    
    }    
}
