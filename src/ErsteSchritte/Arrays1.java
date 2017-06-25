package ErsteSchritte;

/**
 * Kleines Beispielprogramm zum auslesen des kleinsten, größten und des 
 * Durchscnittwertes in einem Array.
 * @author Markus Badzura
 */
public class Arrays1 
{
    public static void main(String[] args) 
    {
        int[] zahlen = {3,5,2,33,52,32,15,63,77,44,34,22};
        System.out.println("Kleinste Zahle: "+Stat.intArrayMin(zahlen));
        System.out.println("Größte Zahl: "+Stat.intArrayMax(zahlen));
        System.out.println("Durchscnitt: "+Stat.intArrayAverage(zahlen));
    }
}
