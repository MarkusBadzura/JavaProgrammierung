package Kontoverwaltung;

/**
 * Lösungsvorschlag Aufgabe Kontoverwaltung
 * @author Markus Badzura
 */
    abstract class Kontoverwaltung
{
    String kontoinhaber;
    int kontonummer;
    double zinsen;
    double kontostand;
    
    Kontoverwaltung(String name, int kontonummer, double zinsen)
    {
        this.kontoinhaber = name;
        this.kontonummer = kontonummer;
        this.zinsen = zinsen;
        this.kontostand = 0.0;
    }
    /**
     * Getter Methode für Name
     * @return name (String)
     */
    public String getName()
    {
        return kontoinhaber;
    }
    /**
     * Getter-Methode für Kontonummerabfrage
     * @return kontonummer(int)
     */
    public int getKontonummer()
    {
        return kontonummer;
    }
    /**
     * Getter-Methode für Zinsabfrage
     * @return zinsen(double)
     */
    public double getZinsen()
    {
        return zinsen;
    }
    /**
     * Getter-Methode für Kontostandsabfrage
     * @return kontostand (double)
     */
    public double getKontostand()
    {
        return kontostand;
    }
    /**
     * Setter-Methode zur Namensänderung
     * @param name (String)
     */
    public void setName(String name)
    {
        this.kontoinhaber = name;
    }
    /**
     * Setter-Methode zur Kontonummer
     * @param kontonummer (int)
     */
    public void setKontonummer(int kontonummer)
    {
        this.kontonummer = kontonummer;
    }
    /**
     * Setter-Methode zum Ändern des Zinssatzes
     * @param zinsen (double)
     */
    public void setZinsen(double zinsen)
    {
        this.zinsen = zinsen;
    }
    /**
     * Setter-Methode um Kontostand zu aktualisieren
     * @param kontostand (double)
     */
    public void setKontostand(double kontostand)
    {
        this.kontostand = kontostand;
    }
    
    public abstract void Einzahlen(double betrag);
    public abstract void Auszahlen(double betrag);
    public abstract void ZinsenBerechnen();
}
