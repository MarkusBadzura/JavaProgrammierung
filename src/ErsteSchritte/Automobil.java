package ErsteSchritte;

/**
 * Beispielprogramm für die Objektorientierung
 * @author Markus Badzura
 */
public class Automobil 
{
    // Instanzvariablen
    // Die folgenden Variablen werden erst im Konstruktor initialisiert
    private String besitzer; 
    private String farbe;
    private String marke;
    private double tank;
    private double tankstand;
    private double durchschnittsverbrauch;
    // kilometerstand wird mit 0 initialisiert, da nur der Konstruktor beim
    // Gebrauchtwagenkauf den kilometerstand benötigt. Neuwagen hat km-Stand 0
    private int kilometerstand = 0;
    
    /**
     * Konstruktor
     * @param besitzer Name des Käufers
     * @param farbe Farbe des Automobils
     * @param marke Marke des Automobils
     * @param tank Fassungsvolumen des Tanks
     * @param verbrauch Durchschnittsverbrauch auf 100 km
     */
    Automobil(String besitzer, String farbe, String marke, double tank, double verbrauch)
    {
        this.besitzer = besitzer;
        this.farbe = farbe;
        this.marke = marke;
        this.tank = tank;
        tankstand = tank;
        this.durchschnittsverbrauch = verbrauch;
    }
    /**
     * Konstruktor
     * @param besitzer Name des Käufers
     * @param farbe Farbe des Automobils
     * @param marke Marke des Automobils
     * @param tank Fassungsvolumen des Tanks
     * @param verbrauch Durchschnittsverbrauch auf 100 km
     * @param km Kilometerstand
     */
    Automobil(String besitzer, String farbe, String marke, double tank, double verbrauch, int km)
    {
        this.besitzer = besitzer;
        this.farbe = farbe;
        this.marke = marke;
        this.tank = tank;
        tankstand = tank;
        this.durchschnittsverbrauch = verbrauch;
        this.kilometerstand = km;
    }
    /**
     * Besitzer ändern
     * @param name Name des neuen Besitzers
     */    
    public void setBesitzer(String name)
    {
        this.besitzer = name;
    }
    
    /**
     * Farbe ändern
     * @param farbe Neue Farbe
     */
    public void setFarbe(String farbe)
    {
        this.farbe = farbe;
    }
    
    /**
     * Kilometer- und Tankstand anhand gefahrener Strecke ändern
     * @param gefahreneStrecke gefahrene Kilometer
     */
    public void setKmStand(int gefahreneStrecke)
    {
        kilometerstand = kilometerstand + gefahreneStrecke;
        tankstand = tankstand - aendereTankinhalt(gefahreneStrecke);
    }
    
    /**
     * Ermitteln, wieviel getankt werden muss, Tankstand auf maximum setzen
     * und Textausgabe, wieviel getankt wurde.     
     */
    public void setVolltanken()
    {
        double tankmenge = tank - tankstand;
        tankstand = tank;
        System.out.println("Es wurden "+tankmenge+" Liter getankt.");
    }
    
    /**
     * Ändere Durchschnittsverbrauch
     * @param verbrauch Neuer Durchschnittsverbrauch
     */
    public void setDurchschnittsverbrauch(double verbrauch)
    {
        durchschnittsverbrauch = verbrauch;
    }
    
    /**
     * aktuellen Tankinhalt ausgeben
     * @return tankstand
     */
    public double getTankinhalt()
    {
        return tankstand;
    }
    
    /**
     * aktuellen Durschnittsverbrauch ausgeben
     * @return durschnittsverbrauch
     */
    public double getDurchschnittsverbrauch()
    {
        return durchschnittsverbrauch;
    }
    
    /**
     * aktuellen Besitzer ausgeben
     * @return besitzer
     */
    public String getBesitzer()
    {
        return besitzer;
    }
    
    /** 
     * aktuellen Kilometerstand ausgeben
     * @return kilometerstand
     */
    public int getKmStand()
    {
        return kilometerstand;
    }
    
    /**
     * Ausgabe sämtlicher Objekteigenschaften
     * @return Objekteigenschaften
     */
    @Override
    public String toString()
    {
        return "Besitzer: "+besitzer+"\tMarke :"+marke+"\tFarbe: "+farbe
                +"\tKilometerstand: "+kilometerstand+"\nDurchschnittsverbrauch: "
                +durchschnittsverbrauch+"\tTankgröße: "+tank+"\tTankinhalt: "+tankstand;
    }
    
    /**
     * Benzingverbrauch auf Grundlage der gefahrenen Strecke
     * @param gefahreneStrecke gefahrene Strecke
     * @return verbrauchte Bezinmenge
     */
    private double aendereTankinhalt(int gefahreneStrecke)
    {
        double verbrauch = gefahreneStrecke/100.0*durchschnittsverbrauch;
        return verbrauch;
    }
}
