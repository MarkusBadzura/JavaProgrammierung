package ErsteSchritte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Beispielprogramm für den Umgang mit dem FileReader
 * @author Markus Badzura
 */
public class IO_FileReader 
{
    public static void main(String[] args) 
    {
        BufferedReader br;
        String ausgabe;
        try
        {
            br = new BufferedReader(new FileReader("FileReader.txt"));
            while((ausgabe=br.readLine())!= null)
            {
                System.out.println(ausgabe);
            }
            br.close();
        }
        catch(IOException e)
        {
            System.err.println("Fehlermeldung: "+e);
        }
    }
}
