package ErsteSchritte;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Beispiele für den Umgang mit Exceptions
 * @author Markus Badzura
 */
public class Exceptionhandling 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
//        System.out.println(7/0);
//        System.out.println("fertig")
        int a = 0;
        int b = 0;
        try
        {
            System.out.print("Zahl a: ");
            a = sc.nextInt();
            System.out.print("Zahl b: ");
            b = sc.nextInt();            
            System.out.println(division(a,b));
        }
        catch (ArithmeticException e)
        {
            System.err.println("Division durch 0 nicht möglich");
        }
        catch (InputMismatchException e)
        {
            System.err.println("Es wurde kein int-Wert eingegeben");
        }
        finally
        {
            System.out.println("Alle Exceptions abgearbeitet");
        }
        System.out.println("Programmende");
    }
    
    /**
     * Dividiert 2 Zahlen miteinander
     * @param a erster int-Wert
     * @param b zweiter int-Wert
     * @return Ergebnis der Division a/b
     */
    static int division(int a, int b)
    {
            return a/b;
    }
    
    /**
     * Dividiert 2 Zahlen miteinander
     * @param a erster int-Wert
     * @param b zweiter int-Wert
     * @return String mit dem Ergebnis oder Division durch 0
     */
    static String division1(int a, int b)
    {
        if (b!=0)
            return String.valueOf(a/b);
        else
            return "Division durch 0";
    }
    
}
