package ErsteSchritte;
import java.util.Scanner;

/**
 * Beispiel einer if-else-Anweisung
 * @author Markus Badzura
 */
public class IfElseAnweisung 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Bitte Alter eingeben: ");
        int alter = sc.nextInt();
        if (alter<18)
        {
            System.out.println("Volljährig in "+(18-alter)+" Jahren.");
        }
        else
        {
            System.out.println("Volljährig");
        } 
    }
}
