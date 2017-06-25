package Kontoverwaltung;

/**
 * Lösungsvorschlag Aufgabe Kundenverwaltung
 * @author Markus Badzura
 */
public class Girokonto extends Kontoverwaltung
{
    double kontokorrent;
    /**
     * Konstruktor für neues Girokonto
     * @param inhaber (Person)
     * @param kontonummer (int)
     * @param zinsen (double)
     * @param kontokorrent (double)
     */
    Girokonto(String inhaber, int kontonummer, double zinsen, double kontokorrent)
    {
        super(inhaber, kontonummer, zinsen);
        this.kontokorrent = kontokorrent;
    }
    /**
     * Getter-Methode für Kontokorrentrahmen
     * @return kontokorrent (double)
     */
    public double getKontokorrent()
    {
        return kontokorrent;
    }
    /**
     * Setter-Methode für Ändern des Kontokorrentrahmens
     * @param kontokorrent (double)
     */
    public void setKontokorrent(double kontokorrent)
    {
        this.kontokorrent = kontokorrent;
    }
    /** 
     * toString-Methode für Ausgabe eines Girokonto-Objektes
     * @return Ausgabestring
     */
    @Override
    public String toString()
    {
        return "Kontonummer:\t"+super.getKontonummer()+"\nKontoinhaber:\t"
                +super.getName()+"\nKontostand:\t"+super.getKontostand();
    }   
    
    /**
     * Einzahlung auf Girokonto
     * @param betrag (double)
     */
    @Override
    public void Einzahlen(double betrag) {
        super.kontostand += betrag;
    }
    
    /**
     * Auszahlung auf Girokonto
     * @param betrag (double)
     */
    @Override
    public void Auszahlen(double betrag) {
        super.kontostand -=betrag;
    }
    
    /**
     * Zinsberechnung Girokonto
     */
    @Override
    public void ZinsenBerechnen() {
        double zinsen = super.kontostand * super.zinsen/100;
        Einzahlen(zinsen);
        System.out.println(zinsen + " wurden als Zinsen einbezahlt.");
    }
    
}
