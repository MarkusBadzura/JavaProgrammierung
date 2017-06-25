package ErsteSchritte;

import java.io.File;
/**
 * Umgang mit der Klasse File
 * @author Markus Badzura
 */
public class FileKlasse 
{
    public static void main(String[] args) 
    {
        File f1 = new File("testordner");
        File f2 = new File("testordner/testdatei");
        File f3 = new File("testordner/testdatei.txt");
        try
        {
            f1.mkdir();
            f2.createNewFile();
            f3.createNewFile();
            String[] dateien = f1.list();
            System.out.println("Dateien im Verzeichnis "+f1.getName());
            for (int i = 0; i < dateien.length;i++)
            {
                System.out.println(dateien[i]);
            }
            f3.delete();
            dateien = f1.list();
            System.out.println("Dateien im Verzeichnis "+f1.getName()+"nach löschen.");
            for (int i = 0; i < dateien.length;i++)
            {
                System.out.println(dateien[i]);
            }
            System.out.println("Dateigröße von "+f2.getName()+" :"+f2.length());     
        }
        catch(Exception e)
        {
            System.err.println("Fehler: " + e);
        }
    }
}
