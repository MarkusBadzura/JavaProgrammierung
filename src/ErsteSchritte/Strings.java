package ErsteSchritte;

/**
 * Beispielprogramm für String-Manipulationen
 * @author Markus Badzura
 */
public class Strings 
{
    public static void main(String[] args) 
    {
        String name = "Karl-Heinz";
        int laenge = name.length();
        System.out.println(laenge);
        System.out.println(name.charAt(5));
        System.out.println(name.substring(0,4));
        System.out.println(name.substring(5));
        boolean vergleichen = "Heinz" == name.substring(5);
        System.out.println(vergleichen);
        vergleichen = "Heinz".equals(name.substring(5));
        System.out.println(vergleichen);
        System.out.println("AAA".compareTo("ABC"));
        System.out.println("aaa".compareTo("AAA"));
        System.out.println("Herr ".concat("Müller"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
    }
}
