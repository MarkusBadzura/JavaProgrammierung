package ErsteSchritte;
import java.util.Scanner;

/**
 * Beispiele einer while-Schleife
 * @author Markus Badzura
 */
public class SchleifeWhile 
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args)
    {
        int teiler = 5;
        int eingabe = 1;
        while (eingabe == 1)
        {
            if (teiler==0)
                System.out.println("Division durch 0 nicht erlaubt.");
            else
                System.out.println("10 / "+teiler+" ist: "+(int)(10/teiler)+" Rest: "+10%teiler);
            teiler--;
            if (teiler==-5) break;
            System.out.println("Teiler um 1 erniedrigen? (1) ja ");
            eingabe=sc.nextInt();
        }
    }
}
