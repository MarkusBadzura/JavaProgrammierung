package ErsteSchritte;

/**
 * Beispielprogramm für die Methode getPorperty der Klasse System.
 * @author Markus Badzura
 */
public class Systemeigenschaft 
{
    public static void main(String[] args) 
    {
        System.out.println("Java Version:\t"+System.getProperty("java.version"));
        System.out.println("JRE-Anbieter: \t"+System.getProperty("java.vendor"));
        System.out.println("JRE-Anbieter Homepage:\t"+System.getProperty("java.vendor.url"));
        System.out.println("Installationsverzeichnis Java:\t"+System.getProperty("java.home"));
        System.out.println("Installiert JVM-Version:\t"+System.getProperty("java.vm.specification.version"));
        System.out.println("JVM-Version Anbieter: \t"+System.getProperty("java.vm.specification.vendor"));
        System.out.println("JVM-Name;\t"+System.getProperty("java.vm.specification.name"));
        System.out.println("implementierteJVM-Version\t"+System.getProperty("java.vm.version"));
        System.out.println("Anbieter JVM-Version:\t"+System.getProperty("java.vm.vendor"));
        System.out.println("Name der JVM-Version:\t"+System.getProperty("java.vm.name"));
        System.out.println("JRE-Specification Version:\t"+System.getProperty("java.specification.version"));
        System.out.println("Anbieter der JRE-Specification\t"+System.getProperty("java.specification.vendor"));
        System.out.println("Name der JRE-Specification:\t"+System.getProperty("java.specification.name"));
        System.out.println("Java-Versionsnummer:\t"+System.getProperty("java.class.version"));
        System.out.println("Java-Klassen-Pfad:\t"+System.getProperty("java.class.path"));
        System.out.println("Java-Bibliothekspfad:\t"+System.getProperty("java.library.path"));
        System.out.println("Default Temp-Pfad:\t"+System.getProperty("java.io.tmpdir"));
        System.out.println("Name JIT-Compiler:\t"+System.getProperty("java.compiler"));
        System.out.println("Java Verzeichnispfad ext:\t"+System.getProperty("java.ext.dirs"));
        System.out.println("Name des Betriebssystems:\t"+System.getProperty("os.name"));
        System.out.println("Prozessortyp:\t"+System.getProperty("os.arch"));
        System.out.println("Betriebssystemversion:\t"+System.getProperty("os.version"));
        System.out.println("Dateien-Trennzeichen:\t"+System.getProperty("file.separator"));
        System.out.println("Pfad-Trennzeichen:\t"+System.getProperty("path.separator"));
        System.out.println("Zeilen-Trennzeichen:\t"+System.getProperty("line.separator"));
        System.out.println("Nutzername:\t"+System.getProperty("user.name"));
        System.out.println("Home-Verzeichnis Nutzer:\t"+System.getProperty("user.home"));
        System.out.println("aktuelles Arbeitsverzeichnis:\t"+System.getProperty("user.dir"));
    }
    
}
