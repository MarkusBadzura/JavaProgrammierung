package ErsteSchritte;

/**
 * Beispiel des Exceptionhandlings mit Throw
 * @author Markus Badzura
 */
public class ThrowsBeispiel
{            
    public static void main(String[] args) 
    {
    int ergebnis;
    try
    {
      System.out.println(ergebnis = teilen(0));
    }
    catch (ArithmeticException e)
    {
        System.err.println("Fehlermeldung: "+e);
    }
    System.out.println("Programmende");
    }
    
    /**
     * Teilt ein Ergebnis durch 0 und gibt die Exception an die aufrufende
     * Methode zurück
     * @param a intZahl Wert 0
     * @return ArithmeticException
     */
    public static int teilen(int a) throws ArithmeticException
    {
        return 7/a;
    }
}
