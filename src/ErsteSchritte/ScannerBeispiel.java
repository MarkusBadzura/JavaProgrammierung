package ErsteSchritte;
import java.util.Scanner; // Import, um auf die Scanner-Klasse zugreifen zu können

/**
 * Anwendungsbeispiel für die Konsoleneingabe mit der Scanner-Klasse
 * @author Markus Badzura
 */
public class ScannerBeispiel 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in); // Erzeugen eines Scanner-Objektes
        System.out.println("Bitte geben Sie eine Zahl von 0 bis 100 ein:");
        int Zahl = sc.nextInt();
    }
}
