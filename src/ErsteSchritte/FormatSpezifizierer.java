package ErsteSchritte;

/**
 * Arbeiten mit Format-Spezifizieren
 * @author Markus Badzura
 */
public class FormatSpezifizierer 
{
    public static void main(String[] args)
    {
        int i = 1354;
        double d = 1523.2345;
        String s = "Formatierung";
        System.out.println("Beispiel 1");
        System.out.printf("!%d!%d!%n" ,i, -i );
        System.out.println("Beispiel 2");
        System.out.printf("!%5d!%5d!%n" ,i, -i );
        System.out.println("Beispiel 3");
        System.out.printf("!%-5d!%-5d!%n" ,i, -i );
        System.out.println("Beispiel 4");
        System.out.printf("!%+-5d!%+-5d!%n" , i, -i );
        System.out.println("Beispiel 5");
        System.out.printf("!%05d!%05d!%n",  i, -i );
        System.out.println("Beispiel 6");
        System.out.printf("!%f!%f!%n" ,d, -d );
        System.out.println("Beispiel 7");
        System.out.printf("|%.2f|%.2f|%n" ,d, -d );
        System.out.println("Beispiel 8");
        System.out.printf("|%10.2f|%10.2f|%n" , d, -d );
        System.out.println("Beispiel 9");
        System.out.printf("|%010.2f|%010.2f|%n",d, -d);
        System.out.println("Beispiel 10");
        System.out.printf("!%s!%n", s);
        System.out.println("Beispiel 11");
        System.out.printf("!%S!%n", s);
        System.out.println("Beispiel 12");
        System.out.printf("|%20.5s|%n", s);
    }
}
