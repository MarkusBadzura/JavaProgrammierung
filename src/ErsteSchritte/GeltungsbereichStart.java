package ErsteSchritte;

/**
 * Beispiel für den Umgang mit dem Schlüsselwort static
 * @author Markus Badzura
 */
public class GeltungsbereichStart 
{
    public static void main(String[] args)
    {
        System.out.println(Geltungsbereich.zahl1);
        Geltungsbereich.setZahl(3);
        System.out.println(Geltungsbereich.zahl1);
        Geltungsbereich.setZahl1(4);
        System.out.println(Geltungsbereich.zahl1);
    }
}
