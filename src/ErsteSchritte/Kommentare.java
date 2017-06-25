package ErsteSchritte;

/**
 * Beispiele verschiedener Kommentarmöglichkeiten unter Java
 * @author Markus Badzura
 */
public class Kommentare 
{
    // Das hier ist ein Zeilenkommentar
    private int zahl; // Auch dass ist ein Zeilenkommentar
    
    // Das hier ist ein Zeilen-
    // kommentar über 2 Zeilen. Jede Zeile muss mit // beginnen.
    
    
    /* Hier beginnt der Blockkommentar
       Schnatter, schnatter, schnatter
       Schreib, schreib, schreib
       Hier endet der Blockkommentar */
    
    private int /*String*/ zahl1;
    
    /**
     * Beispielsmethode für Javadoc-Kommentare
     * @version 1.0
     * @author Markus Badzura
     * @param b vom Datentyp int
     * @param c vom Objekttyp String
     * @param d vom Datentyp double
     * @param a vom Datentyp boolean
     * @return Datentyp String
     */
    public String testen(int b, String c, double d, boolean a)
    {
        return b+c+d+a;
    }
    
}
