package ErsteSchritte;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Beispielprogramm für den Umgang mit BufferdWriter und FileWriter
 * @author Markus Badzura
 */
public class IO_FileWriter 
{
    public static void main(String[] args) 
    {
        BufferedWriter bw;
        String eingabe;
        ArrayList al = new ArrayList();
        try
        {
        bw = new BufferedWriter(new FileWriter("FileWriter.txt"));
        al.add("blubbsn");
            bw.write((String)al.get(0));
            bw.newLine();
        
        bw.close(); // WICHTIG!!!! Erst mit close() wird der Buffer geschrieben
        }
        catch (IOException e)
        {
            System.err.println("Fehlermeldung: "+e);
        }
    }
}
