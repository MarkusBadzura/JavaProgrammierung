package ErsteSchritte;
import java.util.Scanner;
/**
 * Beispiel einer verschachtelter if-Else-Anweisung
 * @author Markus Badzura
 */
public class IfElseVerschachtelt 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        String ausgabe;
        System.out.print("Bitte Alter eingeben: ");
        int alter = sc.nextInt();
        if (alter<18)
        {
            if (alter<14)
            {
                ausgabe="Strafunmündig";
            }
            else
            {
                ausgabe="Strafmündig";
            }
        }
        else
        {
            ausgabe="Volljährig";
        }
        System.out.println(ausgabe);
    }
}
