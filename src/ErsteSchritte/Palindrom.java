package ErsteSchritte;

import java.util.Scanner;

/**
 * Programm für Umgang mit String Reverse
 * @author Markus Badzura
 */
public class Palindrom 
{
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        System.out.println("Geben Sie ein Wort ein: ");
        String eingabe = sc.next();
        String reverse = "";
        for (int i = 0; i<eingabe.length(); i++)
        {
            reverse = eingabe.charAt(i) + reverse;
        }
        if (reverse.toLowerCase().equals(eingabe.toLowerCase()))
            System.out.println(eingabe+" ist ein Palindrom");
        else
            System.out.println(eingabe+" ist kein Palindrom");
    }
}
