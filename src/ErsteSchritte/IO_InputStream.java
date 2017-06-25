package ErsteSchritte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Kleines Beispiel für den Umgang mit dem InputStream und dem FileReader
 * @author Markus Badzura
 */
public class IO_InputStream 
{
    public static void main(String[] args) 
    {
        try
        {
            File datei = new File ("InputStream.txt");
            FileReader fr = new FileReader(datei);
            BufferedReader br = new BufferedReader(fr);
            String s = br.readLine();
            System.out.println(s);
        }
        catch(IOException e)
        {
            System.err.println("Systemfehler: "+e);
        }
    }
}
