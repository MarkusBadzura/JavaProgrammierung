package ErsteSchritte;
import java.io.PrintStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Umgang mit der Klasse PrintStream
 * @author Markus Badzura
 */
public class IO_PrintStream 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        try
        {
            File datei = new File ("PrintStream.txt");
            PrintStream stream = new PrintStream(datei);
            stream.println("Mein erster gespeicherter Text");
        }
        catch (FileNotFoundException e)
        {
            System.err.println("Datei nicht gefunden");
        }
    }
}
