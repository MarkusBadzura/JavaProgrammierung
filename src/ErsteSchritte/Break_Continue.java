package ErsteSchritte;

/**
 * Beispielprogramm für die Anwendung von break und Continue in Schleifen
 * @author Markus Badzura
 */
public class Break_Continue 
{
    public static void main(String[] args) 
    {
        System.out.println("Schleife mit break");
        for (int i=0;i<10;i++)
        {
            if (i==7) break;
            System.out.println("7:"+i);
        }
        System.out.println("Schleife mit continue");
        for (int i=0;i<10;i++)
        {
            if (i==7) continue;
            System.out.println("7:"+i);
        }
    }
}
