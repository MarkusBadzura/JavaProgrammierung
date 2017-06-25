
package ErsteSchritte;

import java.util.ArrayList;

/**
 * Beispiel einer ArrayList
 * @author Markus Badzura
 */
public class MyArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList namen = new ArrayList();
        namen.add("Markus");
        namen.add("Thomas");
        namen.add("Karl");
        for (int i = 0; i<namen.size();i++)
        {
            System.out.println(namen.get(i));
        }
        namen.remove("Markus");
        namen.add("Jochen");
        for (int i = 0; i<namen.size();i++)
        {
            System.out.println(namen.get(i));
        }        
    }
}
