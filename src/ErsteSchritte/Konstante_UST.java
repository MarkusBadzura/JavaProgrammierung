package ErsteSchritte;

/**
 * Beispiel für den Umgang mit Konstanten
 * @author Markus Badzura
 */
public class Konstante_UST 
{
    public static void main(String[] args)
    {
        final int UST = 19;
        int betragNetto = 100;
        //UST = 20;
        int betragBrutto = betragNetto + betragNetto/100*UST;
        System.out.println(betragBrutto);
    }
}
