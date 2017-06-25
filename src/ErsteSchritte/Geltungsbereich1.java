package ErsteSchritte;

/**
 * Beispielprogramm für Geltungsbereiche Variablen
 * @author Knuddel
 */
public class Geltungsbereich1 
{
    private int zahl1 = 50;
    
    /**
     * Beispiele für Geltungsbereich von Variablen
     * zahl1 ändern
     * @param zahl1 int-Zahl
     */
    public void setZahl(int zahl1)
    {
        this.zahl1 = zahl1;
    }
    
    /**
     * Ausgabe der Instanzvariablen zahl1
     */
    public void ausgabeZahl()
    {
        System.out.println(zahl1);
    }
}
