package ErsteSchritte;
import java.util.Scanner;

/**
 * Beispiel einer einfachen if-Anweisung
 * @author Markus Badzura
 */
public class IfAnweisung 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Bitte Alter eingeben: ");
        int alter = sc.nextInt();
        if (alter<18)
        {
            System.out.println("Es dauert noch "+(18-alter)+" Jahre bis zur Volljährigkeit");
        }
        /* Wenn nur eine Anweisung im Anweisungsblock einer If-Anweisung
           erfolgt, so können die geschweiften Blockklammern weggelassen werden.
        */
        if (alter>=18)
            System.out.println("Volljährig");
    }
}
