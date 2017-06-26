package ErsteSchritte;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * Beispiel einer MD5 Hasfunktion
 * @author Markus Badzura
 */
public class Hashwert_MD5 
{
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    String text = "LuftBallon";
    System.out.println("Geben Sie Ihr Passwort ein");
    String eingabe = sc.next();
    if (getHash(eingabe).compareTo(getHash(text)) == 0)
    {
      System.out.println ("identisch");
    }
    else
    {
      System.out.println("nicht identisch");
    }
  }
  /**
   * Haswerte erstellen aus String
   * @param txt mit dem zu verschlüsselten Text
   * @return sb.toString() Hashwert
   */
  private static String getHash(String txt)
  {
    StringBuilder sb = new StringBuilder();
    try
    {
      MessageDigest md = MessageDigest.getInstance("MD5");
      byte[] array = md.digest(txt.getBytes());
      for (int i = 0; i< array.length; i++)
      {
        sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
      }
    }
    catch(NoSuchAlgorithmException e){}
    return sb.toString();
  }        
}
