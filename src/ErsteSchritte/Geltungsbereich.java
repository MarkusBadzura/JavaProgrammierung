package ErsteSchritte;

/**
 * Geltungsbereich für Variablen
 * @author Markus Badzura
 */
public class Geltungsbereich 
{
    static int zahl1 = 1;
    /**
     * Ändern von zahl1 mit Deklaration von zahl1
     * @param zahl2 int-Zahl
     */
    public static void setZahl (int zahl2)
    {
        int zahl1 = zahl2;
        System.out.println (zahl1);
    }
    /**
     * Ändern von zahl1 ohne Deklaration von zahl1
     * @param zahl2 int-Zahl
     */
    public static void setZahl1 (int zahl2)
    {
        zahl1 = zahl2;
        System.out.println (zahl1);
    }    
    
    public static void main (String[] args)
    {
        System.out.println(zahl1); //
        setZahl(3);
        System.out.println(zahl1);
        setZahl1(4);
        System.out.println(zahl1);
    }
}
