package ErsteSchritte;
import java.util.Scanner;
/**
 * Beispielprogramm für eine Switch-Anweisung
 * @author Markus Badzura
 */
public class SwitchAnweisung 
{
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args)
    {
        System.out.print("Bitte Note eingeben: ");
        int note = sc.nextInt();
        switch (note)
        {
            case 1:
                System.out.println("Note: sehr gut");
                break;
            case 2:
                System.out.println("Note: gut");
                break;
            case 3:
                System.out.println("Note: befriedigend");
                break;
            case 4:
                System.out.println("Note: ausreichend");
                break;
            case 5:
                System.out.println("Note: ungenügend");
                break;
            case 6:
                System.out.println("Note: mangelhaft");
                break;
            default:
                System.out.println("Keine Note zwischen 1 und 6 eingegeben.");
        }
    }
}
