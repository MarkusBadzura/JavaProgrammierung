
package ErsteSchritte;

/**
 * Beispielprogramm für die Verwendung von 2-dimensionalen-Arrays
 * @author Markus Badzura
 */
public class Matrix 
{
    public static void main(String[] args)
    {
        int[][] zahlen = {{1,2,3,4,5},
                          {6,7,8,9,10},
                          {11,12,13,14,15}};
        
        Stat.int2dArrayAusgeben(zahlen);
    }
}
