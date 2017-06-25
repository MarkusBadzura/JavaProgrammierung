package ErsteSchritte;

/**
 * Beispiele von arithmetischen Operationen
 * @author Markus Badzura
 */
public class AritmetischeOperatoren 
{
    public static void main (String[] args)
    {
        int addition, subtraktion, division, multiplikation, modulo;
        int preAddition, postAddition, preSubtraktion, postSubtraktion;
        int i;
        addition = 3+2;
        System.out.println("Addition 3 + 2 = "+addition);
        subtraktion = 5-3;
        System.out.println("Subtraktion 5 - 3 = "+subtraktion);
        multiplikation = 2*3;
        System.out.println("Multiplikation 2 * 3 = "+multiplikation);
        division = 4/2;
        System.out.println("Division 4 / 2 = "+division);
        modulo = 4%2;
        System.out.println("Modulo 4 % 2 = "+modulo);
        i = 1;
        postAddition = i++;
        System.out.println("Postinkrement = "+postAddition+" Wert von i : "+i);
        i = 1;
        preAddition = ++i;
        System.out.println("Preinkrement = "+preAddition+" Wert von i : "+i);
        i = 2;
        postSubtraktion = i--;
        System.out.println("Postdekrement = "+postSubtraktion+" Wert von i : "+i);
        i = 2;
        preSubtraktion = --i;
        System.out.println("Predekrement = "+preSubtraktion+" Wert von i : "+i);
    }
}
