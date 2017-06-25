package ErsteSchritte;

/**
 * Startklasse für Automobil-Programm
 * @author Markus Badzura
 * @version 1.0
 */
public class AutomobilStart 
{
    public static void main(String[] args)
    {
        Automobil bmw = new Automobil("Meier", "grün", "BMW", 100, 7.8);
        Automobil mercedes = new Automobil("Schulze", "schwarz","Mercedes", 70, 11.3, 23412);
        bmw.setKmStand(280);
        mercedes.setKmStand(420);
        mercedes.setBesitzer("Schneider");
        mercedes.setFarbe("gelb");
        System.out.println("km-Stand von Schneider: "+mercedes.getKmStand());
        System.out.println("Tankinhalt von Meier: "+bmw.getTankinhalt());
        bmw.setVolltanken();
        bmw.setDurchschnittsverbrauch(9.2);
        bmw.setKmStand(310);
        System.out.println(bmw);
        System.out.println(mercedes);
    }
}
