package ErsteSchritte;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Beispiel zum Schreiben in eine Binärdatei
 * @author Markus Badzura
 */
public class BinaerSchreiben 
{
    public static void main(String[] args) 
    {      
        try
        {
            FileOutputStream fileOut = new FileOutputStream("binaer.dat");
            DataOutputStream datOut = new DataOutputStream(fileOut);
            int basis = 2;
            int exponentrange = 10;
            for (int i = 0;i <= exponentrange; i++)
            {
                datOut.writeInt((int) (Math.pow(basis, i)));
            }
            datOut.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Fehler beim öffnen der Datei");
        }
        catch (IOException e)
        {
            System.out.println("Fehler beim Schreiben in die Datei");
        }
        System.out.println("Programmende");
    }
}
