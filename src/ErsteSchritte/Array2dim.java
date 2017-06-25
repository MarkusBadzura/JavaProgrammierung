package ErsteSchritte;

/**
 * Splittet eine Matrix in 2 einzelne Arrays
 * @author Markus Badzura
 */
public class Array2dim 
{
            static String [][] array = new String[][]{ {"a","A"},{"b","B"},{"c","C"},{"d","D"}};
        static String [] a = new String[4];
        static String [] b = new String[4];
    public static void main(String[] args) 
    {

        
        for (int i = 0; i < array.length;i++)
        {
            a[i] = array[i][0];
            b[i] = array[i][1];
        }
    }
    
    /**
     * Splittet ein 2-dimensionales Array in 2 einzelne Arrays
     * @param stringarray 2dimensionales String-Array
     */
    private void splitArray(String[][] stringarray)
    {
        for (int i = 0; i < stringarray.length;i++)
        {
            a[i] = stringarray[i][0];
            b[i] = stringarray[i][1];
        }        
    }
}
