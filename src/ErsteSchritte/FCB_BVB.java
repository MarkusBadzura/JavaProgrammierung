
package ErsteSchritte;

/**
 * Beispielprogramm für IF-Anweisung
 * @author Markus Badzura
 */
public class FCB_BVB 
{
    public static void main(String[] args) 
    {
        int toreFCB = (int) (Math.random()*10+1);
        int toreBVB = (int) (Math.random()*10+1);
        System.out.println("FC Bayern : Borussia Dortmund\t"+toreFCB+" : "+toreBVB);
        if (toreFCB == toreBVB) 
            System.out.println("Ein gerechtes Unentschieden.");
        if (toreFCB > toreBVB)
            System.out.println("FC Bayern gewinnt gegen Borussia Dortmund.");
        if (toreFCB-3 >= toreBVB)
            System.out.println("FC Bayern deklassiert Borussia Dortmund.");
        if (toreFCB < toreBVB)
            System.out.println("FC Bayern verliert gegen Borussia Dortmund.");
        if (toreBVB-3 >= toreFCB)
            System.out.println("FC Bayern wird von Borussia Dortmund deklassiert.");     
        
    }
}
