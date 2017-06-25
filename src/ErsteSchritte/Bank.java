package ErsteSchritte;

/**
 * Superklasse für Beispiel Vererbung
 * @author Markus Badzura
 */

public class Bank 
{
    protected double kontostand = 0.0;
    private String besitzer = "noname";
    
    Bank(){}
    
    /**
     * Konstruktor für die Eröffnung eines Kontos
     * @param einzahlungsbetrag Einzahlungsbetrag bei Kontoeröffnung
     * @param besitzer Verfügungsbevollmächtigter des Bankkontos
     */
    Bank(double einzahlungsbetrag, String besitzer)
    {
        kontostand = einzahlungsbetrag;
        this.besitzer = besitzer;
    }
    
    /**
     * Setter-Methode Einzahlung auf das Bankkonto
     * @param einzahlungsbetrag Double-Betrag der Einzahlung
     */
    public void setEinzahlung (double einzahlungsbetrag)
    {
        kontostand = kontostand + einzahlungsbetrag;
    }
    
    /**
     * Setter-Methode Auszahlung vom Bankkonto
     * @param auszahlungsbetrag Auszahlungsbetrag als Double-Wert
     */
    public void setAuszahlung (double auszahlungsbetrag)
    {
        kontostand = kontostand - auszahlungsbetrag;
    }
    
    /**
     * Getter-Methode Abfrage Kontostand
     * @return aktuellen Kontostand als Double-Wert
     */
    public double getKontostand()
    {
        return kontostand;
    }
}
