package ErsteSchritte;

/**
 * Beispiel einer Suchanweisung mit break
 * @author Markus Badzura
 */
public class Break_Beispiel 
{
    public static void main(String[] args) 
    {
        int[] zahlen = {90,92,100,49,100,14,88};
        int suchwert = 100;
        boolean gefunden = false;
        for (int i = 0;i < zahlen.length;i++)
        {
            if (zahlen[i]==suchwert)
            {
                gefunden = true;
                break;
            }
        }
        if (gefunden)
            System.out.println("Suchwert 100 vorhanden");
        else
            System.out.println("Suchwert 100 nicht vorhanden");
    }
}
