package ErsteSchritte;

/**
 * Beispielprogramm für implizerte und expliziete Typumwandlung
 * @author Markus Badzura
 */
public class TypeCasting 
{
    public static void main (String[] args)
    {
        // Variablendeklaration und Variableninitialierung 
        // impliziertes Type-Casting
        byte zahlByte = 3;
        short zahlShort = zahlByte;
        int zahlInt = zahlShort;
        long zahlLong = zahlInt;
        float zahlFloat = zahlLong;
        double zahlDouble = zahlFloat;
        // Variablendeklaration und Variableninitialisierung
        // explicites Type-Casting
        double doubleZahl = 10;
        float floatZahl = (float) doubleZahl;
        long longZahl = (long) floatZahl;
        int intZahl = (int) longZahl;
        short shortZahl = (short) intZahl;
        byte byteZahl = (byte) shortZahl;
        int ergebnis = (int)(7.2 - 3.6);
        System.out.println(ergebnis);
    }
}
