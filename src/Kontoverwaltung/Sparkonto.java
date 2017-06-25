package Kontoverwaltung;

/**
 * Lösungsvorschlag Aufgabe Kontoverwaltung
 * @author Markus Badzura
 */
public class Sparkonto extends Kontoverwaltung
{
    /**
     * Konsturktor für neues Sparkonto
     * @param inhaber
     * @param kontonummer
     * @param zinssatz 
     */
    Sparkonto(String inhaber, int kontonummer, double zinssatz)
    {
        super(inhaber, kontonummer, zinssatz);
    }
    /**
     * toString-Methode für Ausgabe eines Sparkonto-Objektes
     * @return Ausgabestring
     */
    @Override
    public String toString()
    {
        return "Kontonummer:\t"+super.getKontonummer()+"\nKontoinhaber:\t"
                +super.getName()+"\nKontostand:\t"+super.getKontostand();
    }
    /**
     * Einzahlung auf Sparkonto
     * @param betrag (double)
     */
    @Override
    public void Einzahlen(double betrag) {
        super.kontostand += betrag;
    }
    /**
     * Auszahlung von Sparkonto
     * @param betrag (double)
     */
    @Override
    public void Auszahlen(double betrag) {
        super.kontostand -=betrag;
    }
    /**
     * Zinsberechnung für Sparkonto
     */
    @Override
    public void ZinsenBerechnen() {
        double zinsen = super.kontostand * super.zinsen/100;
        Einzahlen(zinsen);
        System.out.println(zinsen + " wurden als Zinsen einbezahlt.");
    }
}
