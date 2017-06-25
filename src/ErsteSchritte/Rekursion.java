package ErsteSchritte;

/**
 * Beispieldatei für die Rekursion
 * @author Markus Badzura
 */
public class Rekursion 
{
    public static void main(String[] args) 
    {
        System.out.println("Ergebnis Iterativ: "+AddierenIterativ(10,12));
        System.out.println("Ergebnis Rekursiv: "+AddierenRekursiv(10,12));
        System.out.println("Umkehrtext = "+ZeichenkettenUmkehrRekursiv("Umkehrtext"));
    }
    
    /**
     * Addiert 2 Zahlen mit einem Iterativen Lösungsschema
     * @param zahl1 int-Wert
     * @param zahl2 int-Wert
     * @return Ergebnis der Addition zahl1 und zahl2 als Int-Wert
     */
    private static int AddierenIterativ(int zahl1, int zahl2)
    {
        for (int i = 0; i<zahl2; i++)
        {
            zahl1++;
        }
        return zahl1;
    }
    
    /**
     * Addiert 2 Zahlen mit einem Rekursiven Lösungsschema
     * @param zahl1 int-Wert
     * @param zahl2 int-Wert
     * @return Ergebnis der Addition zahl1 und zahl2 als Int-Wert
     */
    private static int AddierenRekursiv(int zahl1, int zahl2)
    {
        if (zahl2 == 0) return zahl1;
        return AddierenRekursiv(++zahl1,--zahl2); 
    }
    
    /**
     * gibt eine Zeichenkette rückwärts wieder aus mit Rekursiver Lösung
     * @param zeichenkette String zur Umkehrung
     * @return String mit umgekehrten Zeichen
     */
    private static String ZeichenkettenUmkehrRekursiv(String zeichenkette)
    {
        String temp = "";
        if(temp.length() == zeichenkette.length()) return temp;
        temp = zeichenkette.substring(zeichenkette.length()-1);
        return temp + ZeichenkettenUmkehrRekursiv(zeichenkette.substring(0, zeichenkette.length()-1));
    }
}
