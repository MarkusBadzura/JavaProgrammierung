package ErsteSchritte;

/**
 * Startklasse für das Beispielprogramm Bankkonto
 * @author Markus Badzura
 */
public class BankkontoStart 
{
    public static void main (String[] args)
    {
        Bankkonto konto1 = new Bankkonto();
        Bankkonto konto2 = new Bankkonto("Meier");
        Bankkonto konto3 = new Bankkonto("Schulz", 150.0);
        String besitzer = konto1.ausgabeBankkunde();
        System.out.println(besitzer);
        konto1.bankkundeAendern("Berger");
        besitzer = konto1.ausgabeBankkunde();
        System.out.println(besitzer);
        konto2.einzahlung(170);
        konto3.auszahlung(30);
        konto1.einzahlung(220);
        System.out.println(konto2);
        double kontoStand = konto3.ausgabeKontostand();
        System.out.println(kontoStand);
        konto3.kontofuehrungsgebuehr();
        System.out.println(konto3);
    }
}
