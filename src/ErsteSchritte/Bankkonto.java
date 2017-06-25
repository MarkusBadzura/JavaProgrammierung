package ErsteSchritte;

/**
 * Beispielprogramm für die Objektorientierte Programmierung am Beispiel
 * eines Bankkontos
 * @author Markus Badzura
 * @version 1.0
 */
public class Bankkonto 
{
    // Instanzvariablen
    private double kontostand = 0.0;
    private String bankkunde = "";
    final private  double KONTOFUEHRUNG = 3.90;
    
    // Konstruktoren

    /**
     *
     */
    public Bankkonto(){}
    /**
     * Konstruktor
     * @param bankkunde Name des Bankkunden
     */
    public Bankkonto(String bankkunde)
    {
        this.bankkunde = bankkunde;
    }
    /**
     * Konstruktor
     * @param bankkunde Name des Bankkunden
     * @param einzahlung Einzahlungsbetrag zur Kontoeröffnung
     */
    public Bankkonto(String bankkunde, double einzahlung)
    {
        this.bankkunde = bankkunde;
        this.kontostand = einzahlung;
    }
    /**
     * Setter-Methode für die Einzahlung
     * @param betrag Einzahlungsbetrag
     */
    public void einzahlung(double betrag)
    {
        kontostand = kontostand + betrag;
    }
    /**
     * Setter-Methode für die Auszahlung
     * @param betrag Auszahlungsbetrag
     */
    public void auszahlung(double betrag)
    {
        kontostand = kontostand - betrag;
    }
    /**
     * Setter-Methode für das Ändern des Kontobesitzers
     * @param name Name des neuen Kontobesitzers
     */
    public void bankkundeAendern(String name)
    {
        bankkunde = name;
    }
    /**
     * Getter-Methode für den Namen des Bankkunden
     * @return Name des Bankkunden
     */
    public String ausgabeBankkunde()
    {
        return bankkunde;
    }
    /**
     * Getter-Methode für den Kontostand
     * @return Kontostand
     */
    public double ausgabeKontostand()
    {
        return kontostand;
    }
    /**
     * Getter-Methode toString für die Ausgabe der Eigenschaften
     * eines Bankkontos
     * @return Name des Kontoinhabers und Kontostand
     */
    @Override
    public String toString()
    {
        return "Das Bankkonto von "+bankkunde+" hat einen Kontostand von "+kontostand+" EURO.";
    }
    /**
     * Belastet den Kontostand mit den Kontoführungsgebühr
     * @version 1.0
     */
    public void kontofuehrungsgebuehr()
    {
        kontostand = kontostand - KONTOFUEHRUNG;
    }
}
