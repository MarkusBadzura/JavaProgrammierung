package GUIProgrammierung;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Beispiel für Umgang mit JFileChooser DateiÖffnen
 * @author Markus Badzura
 */
public class DateiOeffnen 
{
    public static void main(String[] args) 
    {
        JFileChooser fc = new JFileChooser("E:\\Java-Programmierung\\Projektordner\\"
               + "JavaProgrammierung\\src\\GUIProgrammierung");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("nur java", "java", "jar");
        FileNameExtensionFilter filter1 = new FileNameExtensionFilter("nur Bitmap", "bmp");
        fc.setFileFilter(filter); 
        fc.setFileFilter(filter1);
        int auswahl = fc.showOpenDialog(null);
        if (auswahl == JFileChooser.APPROVE_OPTION)
        {
            System.out.println(fc.getSelectedFile());
            System.out.println(fc.getSelectedFile().getName());
        }
        fc.approveSelection();
    }
}
