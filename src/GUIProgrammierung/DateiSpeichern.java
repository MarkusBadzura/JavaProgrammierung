package GUIProgrammierung;

import javax.swing.JFileChooser;

/**
 * Beispiel für Umgang mit JFileChooser DateiSpeichern
 * @author Markus Badzura
 */
public class DateiSpeichern 
{
    public static void main(String[] args) 
    {
        JFileChooser fc = new JFileChooser("E:\\Java-Programmierung\\Projektordner\\"
               + "JavaProgrammierung\\src\\GUIProgrammierung");
        int auswahl = fc.showSaveDialog(null);
        if (auswahl == JFileChooser.APPROVE_OPTION)
        {
            System.out.println(fc.getSelectedFile());
            System.out.println(fc.getSelectedFile().getName());
        }
        fc.approveSelection();
    }    
}
