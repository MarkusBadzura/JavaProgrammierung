package ErsteSchritte;

/**
 * Bibliotheksklasse mit statischen Methoden für das Arbeiten innerhalb des
 * Projektes
 * @author Markus Badzura
 */
public class Stat 
{
     /**
     * Berechnung der Fakultät einer Zahl mit while-Schleife
     * @param fakultaet Zahl, von welcher die Fakultät ermittelt werden soll.
     * @return Fakultät der übergebenen Zahl
     */
    static long fakultaetWhile(int fakultaet)
    {
        long ergebnis = fakultaet;
        while (fakultaet>1)
        {
            fakultaet--;
            ergebnis = ergebnis * fakultaet;
        }
        return ergebnis;
    }
    
    /**
     * Konsolenausgabe der einzelnen Werte eines Arrays vom Datentyp int
     * @param array Array vom Datentyp int
     */
    static void intArrayAusgeben(int[] array)
    {
        for (int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    
    /**
     * Tabellarische Ausgabe eines 2-dimensionalen int-Arrays
     * @param array vom Datentyp int[][]
     */
    static void int2dArrayAusgeben(int[][] array)
    {
        for (int i = 0; i<array.length;i++)
        {
            for (int j = 0; j<array[i].length; j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    
    /**
     * Gibt die größte Zahl in einem int-Array zurück
     * @param array array vom Datentyp int
     * @return int-Zahl max (größten int-Wert im Array)
     */
    static int intArrayMax(int[] array)
    {
        int max = array[0];
        for (int i = 0;i<array.length;i++)
        {
            if (array[i]>max) max = array[i];
        }
        return max;
    }
    
    /**
     * Gibt die kleinste Zahl in einem int-Array zurück
     * @param array array vom Datentyp int
     * @return int-Zahl min (kleinster int-Wert im Array)
     */    
    static int intArrayMin(int[] array)
    {
        int min = array[0];
        for (int i = 0;i<array.length;i++)
        {
            if (array[i]<min) min = array[i];
        }
        return min;
    }
    
    /**
     * Gibt den Durchscnittswert in einem int-Array zurück
     * @param array array vom Datentyp int
     * @return int-Zahl Average (Durchscnittswert vom Datentyp double)
     */    
    static double intArrayAverage(int[] array)
    {
        double summe = 0;
        for (int i =0;i<array.length;i++)
        {
            summe = summe + array[i];
        }
        return summe/array.length;
    }
}
