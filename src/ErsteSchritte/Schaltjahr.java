package ErsteSchritte;
import java.util.Scanner;

/**
 * Berechnung Schaltjahr
 * @author Markus Badzura
 */


public class Schaltjahr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine Jahreszahl ein, die überprüft werden soll, "
                + "ob es sich um ein Schaltjahr handelt oder nicht: ");
        int jahr = sc.nextInt();
        boolean sj = false;
        if (jahr%4 == 0) sj = true;
        if (jahr%400 == 0) sj = true;
        if (jahr%100 == 0 && jahr%400 != 0) sj = false;     
        String ausgabe = sj ? "ein" : "kein";
        System.out.println("Das Jahr "+jahr+" ist "+ausgabe+ " Schaltjahr");
        
        // absolute Kurzform wäre
        //System.out.println(" sj = ((jahr%4==0 && jahr%100!=0) || jahr%400==0)"); 
    }
}
