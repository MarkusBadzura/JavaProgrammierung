package ErsteSchritte;

/**
 * Umgang mit Boolschen Ausdrücken
 * @author Markus Badzura
 */
public class Boolean 
{
    public static void main(String[] args) 
    {
        System.out.println("Boolsche Ausdrücke");
        System.out.print("true && true ergibt: ");
        System.out.println(true&&true);
        System.out.print("true || false ergibt: ");
        System.out.println(true||false);
        System.out.print("true && !false ergibt: ");
        System.out.println(true&& !false);     
        boolean x = true && !false;
        boolean y = false || !false;
        System.out.println("x = true && !false");
        System.out.println("y = false || !false");
        System.out.print("!y || x ergibt: ");
        System.out.println(y||x);
        System.out.print("342 / 17 >= 32 ergibt: ");
        System.out.println(342 / 17 >= 32);
        System.out.print("85 / 5 != 21 && true ergibt: ");
        System.out.println(85 / 5 != 21 && true);
        int z = 84 / 24;
        y = !false && true;
        System.out.println("z = 84/24");
        System.out.println("y = !false && true");
        System.out.print("z <= 30 && y ergibt: ");
        System.out.println(z <= 30 && y);
    }
}
