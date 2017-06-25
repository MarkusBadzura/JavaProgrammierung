package ErsteSchritte;
import java.util.Scanner;

/**
 * Berechnung einer Fakultät
 * @author Markus Badzura
 */
public class Fakultaet 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
       System.out.println("Von welcher Zahl soll die Fakultät ermittelt werden? ");
       int eingabe = sc.nextInt();
       System.out.println(eingabe+"! = "+fakultaetWhile(eingabe));
       System.out.println(eingabe+"! = "+fakultaetDoWhile(eingabe));
       System.out.println(eingabe+"! = "+fakultaetFor(eingabe));
    }
    /**
     * Berechnung der Fakultät einer Zahl mit while-Schleife
     * @param fakultaet Zahl, von welcher die Fakultät ermittelt werden soll.
     * @return Fakultät der übergebenen Zahl
     */
    static long fakultaetWhile(int fakultaet)
    {
        long ergebnis = fakultaet;
        while (fakultaet>1)
        {
            fakultaet--;
            ergebnis = ergebnis * fakultaet;
        }
        return ergebnis;
    }
    /**
     * Berechnung der Fakultät mit einer Do-While-Schleife
     * @param fakultaet Zahl, von welcher die Fakultät ermittelt werden soll
     * @return Fakultät der übergebenen Zahl
     */
    static long fakultaetDoWhile(int fakultaet)
    {
        long ergebnis = 1;
        int zaehler = 0;
        do
        {
            if (fakultaet <= 2) 
            {
                ergebnis = fakultaet;
                break;
            }
            zaehler++;
            ergebnis = ergebnis * zaehler;
        }
        while (zaehler<fakultaet);
        return ergebnis;
    }
    /**
     * Berechnung der Fakultät mit einer For-Schleife
     * @param fakultaet Zahl, von welcher die Fakultät ermittelt werden soll
     * @return Fakultät der übergebenen Zahl
     */
    static long fakultaetFor(int fakultaet)
    {
        int ergebnis = 1;
        if (fakultaet == 0) ergebnis = 0;
        for (int i = 1; i<=fakultaet;i++)
        {
            ergebnis = ergebnis * i;
        }
        return ergebnis;
    }
}
