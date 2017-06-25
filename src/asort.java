
import java.util.Arrays;

/**
 * Einfaches int-Array mit Klasse Arrays sortieren
 * @author Markus Badzura
 */
public class asort 
{
    public static void main(String[] args) {
        int[] zahl = new int[] {2,4,3,1,8,6,5};
        Arrays.sort(zahl);
        for (int i = 0;i < zahl.length; i++)
        {
            System.out.println(zahl[i]);
        }
    }
}
