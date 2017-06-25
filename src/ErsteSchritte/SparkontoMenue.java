package ErsteSchritte;
import java.util.Scanner;

/**
 * Benutzerführung durch Sparkonto
 * @author Markus Badzura
 */
public class SparkontoMenue 
{
    public static void main(String[] args) 
    {
        Sparkonto sk;
        Scanner sc = new Scanner(System.in);
        String auswahl;
        String name;
        double einzahlung, zinsrate;
        System.out.print("Bitte Namen eingeben: ");
        name = sc.next();
        System.out.print("Bitte Einzahlungsbetrag eingeben: ");
        einzahlung = sc.nextDouble();
        System.out.print("Bitte Zinsrate eingeben: ");
        zinsrate = sc.nextDouble();
        sk = new Sparkonto(einzahlung, name, zinsrate);
        do
        {
            System.out.println("<E>inzahlung, <A>uszahlung, <K>ontostand, <V>erzinsung, <B>eenden");
            System.out.print("Ihre Wahl: E, A, K, V oder B ");
            auswahl = sc.next();
            switch(auswahl.toUpperCase())
            {
                case "E":
                    System.out.print("Einzahlungsbetrag: ");
                    sk.setEinzahlung(sc.nextDouble());
                    System.out.println("Einzahlung wurde getätigt.");
                    break;
                case "A":
                    System.out.print("Auszahlungsbetrag: ");
                    sk.setAuszahlung(sc.nextDouble());
                    System.out.println("Auszahlung durchgeführt.");  
                    break;
                case "K":
                    System.out.println("Aktueller Kontostand: "+sk.getKontostand());
                    break;
                case "V":
                    sk.verzinsung();
                    System.out.println("Kontostand wurde verzinst");
                    break;
            }
        }
        while ("E".equals(auswahl.toUpperCase()) || "A".equals(auswahl.toUpperCase()) 
                || "K".equals(auswahl.toUpperCase()) || "V".equals(auswahl.toUpperCase()) );
        System.out.println("Vielen Dank und einen schönen Tag noch");
    }
}
