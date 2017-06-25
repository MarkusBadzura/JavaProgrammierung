package ErsteSchritte;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Beispiel zum Auslesen von Daten aus einer Binärdatei
 * @author Markus Badzura
 */
public class BinaerLesen 
{
    public static void main(String[] args) 
    {
        try
        {
            FileInputStream fileIn = new FileInputStream("binaer.dat");
            DataInputStream dataIn = new DataInputStream(fileIn);
            int anzahl = 11;
            int k;
            for (int i = 0; i< anzahl;i++)
            {
                k = dataIn.readInt();
                System.out.println("Basis 2 mit Exponent "+i+" ergibt: "+k);
            }
            dataIn.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Fehler beim Öffnen der Datei.");
        }
        catch(IOException e)
        {
            System.out.println("Fehler beim Lesen der Datei.");
        }
    }
}
