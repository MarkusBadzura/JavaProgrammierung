package ErsteSchritte;

/**
 * Subklasse für Beispiel Vererbung
 * @author Markus Badzura
 */
public class Sparkonto extends Bank
{
    private double zinsrate = 2.3;
        
    /**
     * Konstruktor für die Eröffnung eines Kontos
     * @param einzahlungsbetrag Einzahlungsbetrag bei Kontoeröffnung
     * @param besitzer Verfügungsbevollmächtigter des Bankkontos
     * @param zinsrate Zinsrate des Sparkontos
     */
    Sparkonto(double einzahlungsbetrag, String besitzer, double zinsrate)
    {
        super(einzahlungsbetrag, besitzer); // Konstruktor der Klasse Bank
        this.zinsrate = zinsrate;
    }
    
    /**
     * Verzinsen des aktuellen Kontostandes
     */
    public void verzinsung()
    {   
          kontostand = kontostand + (kontostand * zinsrate/100);
    }
}
