package ErsteSchritte;

/**
 * Beispiel eines Ternary Operators
 * @author Markus Badzura
 */
public class TernaryOperator 
{
    public static void main(String[] args) 
    {
        int alter = 17;
        String ausgabe = (alter<18) ? "minderjährig" : "volljährig";
        System.out.println("Mit "+alter+" ist man "+ausgabe);
    }
}
