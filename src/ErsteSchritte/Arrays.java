package ErsteSchritte;

import java.util.Scanner;

/**
 * Programm für den Umgang mit Arrays
 * @author Markus Badzura
 */
public class Arrays 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        int[] zahlen = {1,2,3,4,5};
        Stat.intArrayAusgeben(zahlen);
        System.out.println("Wert ändern");
        zahlen[2] = 20;
        Stat.intArrayAusgeben(zahlen);
        System.out.println("Zahlentausch");
        zahlentausch(zahlen, 2, 4);
        Stat.intArrayAusgeben(zahlen);
    }
    
    /**
     * Methode für den Tausch 2er Zahlen in einem Int-Array
     * @param array Array vom Datentyp int
     * @param index1 Index1 von der 1ten Zahl, die vom Tausch betroffen ist.
     * @param index2 Index2 von der 2ten Zahl, die vom Tausch betroffen ist.
     * @return Rückgabe des Arrays mit getauschten Zahlen
     */ 
    public static int[] zahlentausch(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;  return array;
    }
      
}
