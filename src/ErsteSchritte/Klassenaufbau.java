package ErsteSchritte;

/**
 * Grundlegender Klassenaufbau
 * @author Markus Badzura
 */
public class Klassenaufbau 
{
    /**
     * Bereich für Instanzvariablen
     */
    private int zahl = 0;
    
    /**
     * Bereich für die Konstruktoren
     */
    
    /**
     * öffentlicher Konstruktor ohne Parameter
     */
    public Klassenaufbau(){}
    /**
     * Konstruktor mit Parameter, welcher nur innerhalb des packages sichtbar ist.
     * @param zahl1 Übergabe einer int-Zahl
     */
    Klassenaufbau(int zahl1)
    {
        zahl = zahl1;
    }
    
    /**
     * Setter- und Getter-Methoden
     * @param zahl intZahl wird erwartet
     */
    public void setZahl(int zahl)
    {
        this.zahl = zahl;
    }
    public int getZahl()
    {
        return zahl;
    }

    /**
     * toString()-Methode
     * @return Textausgabe des Objektwertes zahl
     */
    @Override
    public String toString() {
        return "Die Zahl lautet: "+zahl;
    }
    
    /**
     * Weitere Methoden
     */
}
