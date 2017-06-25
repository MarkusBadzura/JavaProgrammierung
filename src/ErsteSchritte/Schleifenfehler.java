package ErsteSchritte;

/**
 * Demonstration von allgemeinen Schleifenfehlern
 * @author Markus Badzura
 */
public class Schleifenfehler 
{
    public static void main(String[] args)
    {
        double item = 1;
        double summe = 0;
        while(item!=0)
        {
            summe = summe + item;
            item = item - 0.2;
            System.out.println(item);
            if (item<-1) break;
        }
        
        for (int i = 1; i<10; i++);
        {
            System.out.println("Hallöchen");
        }
        
        while (summe !=0);
        {
            item=item-0.2;
            summe=summe+0.1;
        }
        
    }
}
