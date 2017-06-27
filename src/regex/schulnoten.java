package regex;

import java.util.Scanner;

/**
 * Regexprüfung Schulnoten 1 bis 6
 * @author Markus Badzura
 */
public class schulnoten 
{
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) 
  {
    System.out.println("Welche Note wurde geschrieben? :");
    String eingabe = sc.next();
    if (eingabe.matches("[123456]"))
    {
      System.out.println("Diese Eingabe ist logisch richtig");
    }
    else
    {
      System.out.println("Diese Eingabe ist fehlerhaft.");
    }
    if (eingabe.matches("[1-6]"))
    {
      System.out.println("Diese Eingabe ist logisch richtig");
    }
    else
    {
      System.out.println("Diese Eingabe ist fehlerhaft.");
    }      
  }
}
