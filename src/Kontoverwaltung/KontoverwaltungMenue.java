package Kontoverwaltung;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lösungsvorschlag Aufgabe Kontoverwaltung
 * @author Markus Badzura
 */
public class KontoverwaltungMenue 
{
    private static final String menu[] = new String[14];
    private static final Scanner sc = new Scanner(System.in);
    private static int eingabe;
    private static boolean pruef = false;
    private static final int anzahlKonten = 20;
    private static Girokonto gk[] = new Girokonto[anzahlKonten];
    private static int anzahlGirokonto = 0;
    private static Sparkonto sk[] = new Sparkonto[anzahlKonten];
    private static int anzahlSparkonto = 0;
    private static int kontonummer = 1000;
    private static double einzahlungsbetrag;
    public static void main(String[] args) 
    {   
        do
        {
            menue();
            menueAusgabe();
            System.out.print("\nBitte treffen Sie Ihre Wahl.");
            try
            {
                eingabe = sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Fehlerhafte Eingabe.");
            }
            if (eingabe>= 0 && eingabe <=6) pruef = true;
            else System.out.println("Bitte nur Zahlen von 0 bis 6 eingeben");            
            menueAuswahl();
        }
        while (eingabe!=0);
    }
    
    public static void menue()
    {
  
        menu[0] = "********************************************************";
        menu[1] = "* Kontoverwaltung (Lösungsvorschlag Markus Badzura)    *";
        menu[2] = menu[0];
        menu[3] = "*                                                      *";
        menu[4] = "* [1] Neuanlage eines Sparkontos                       *";
        menu[5] = "* [2] Neuanlage eines Girokontos                       *";
        menu[6] = "* [3] Einzahlung auf ein Konto                         *";
        menu[7] = "* [4] Auszahlung von einem Konto                       *";
        menu[8] = "* [5] Zinsberechnung für ein Konto                     *";
        menu[9] = "* [6] Anzeige Kontoauszug                              *";
        menu[10]= menu[3];
        menu[11]= "* [0] Programm beenden                                 *";
        menu[12]= menu[3];
        menu[13]=menu[0];
    }
    
    public static void menueAusgabe()
    {
        for (int i = 0;i< menu.length; i++)
        {
            System.out.println(menu[i]);
        }
    }
    
    public static void menueAuswahl()
    {
        String name;
        double zinssatz, kontokorrent;
        int ktnr;
        boolean skpruef, gkpruef;
        
        switch(eingabe)
        {
            case 0:
                abschluss();
                System.exit(0);
            case 1: 
                if (anzahlSparkonto == anzahlKonten) 
                {
                    System.out.println("Es können keine weiteren Sparkonten angelegt werden");
                    break;
                }
                name = EingabeName("Sparkontos");
                System.out.println("Die Kontonummer lautet: "+kontonummer);
                System.out.print("Bitte geben Sie den Zinssatz ein: ");
                zinssatz = EingabeNummerDouble();
                if (zinssatz == 0.0)
                {
                    System.out.println("Fehler bei der Zinssatzeingabe. Bitte versuchen sie es erneut.");
                    break;
                }
                sk[anzahlSparkonto] = new Sparkonto(name, kontonummer, zinssatz);
                anzahlSparkonto++;
                kontonummer++;
                System.out.println("Sparkonto wurde erfolgreich erstellt.\n");                
                break;
            case 2:
                if (anzahlGirokonto == anzahlKonten) 
                {
                    System.out.println("Es können keine weiteren Girokonten angelegt werden");
                    break;
                }                
                name = EingabeName("Girokontos");
                System.out.println("Die Kontonummer lautet: "+kontonummer);
                System.out.print("Bitte geben Sie den Zinssatz ein: ");
                zinssatz = EingabeNummerDouble();
                System.out.print("Welcher Kontokorrenrahmen wird eingeräumt? ");
                kontokorrent = EingabeNummerDouble();
                gk[anzahlGirokonto] = new Girokonto(name, kontonummer, zinssatz, kontokorrent);
                anzahlGirokonto++;
                kontonummer++;
                System.out.println("Girokonto wurde erfolgreich angelegt");
                break;
            case 3:
                System.out.println("Kontoeinzahlung");
                System.out.print("Bitte Einzahlungsbetrag eingeben: ");
                einzahlungsbetrag = EingabeNummerDouble();
                System.out.print("Bitte Kontonummer eingeben: ");
                ktnr = EingabeKontonummer();
                if (ktnr == 0) break;
                gkpruef = PruefenKontonummerGiro(ktnr);
                skpruef = PruefenKontonummerSpar(ktnr);
                if (gkpruef==skpruef) 
                {
                    System.out.println("Kontonummer nicht vergeben.");
                    break;
                }
                if (gkpruef) EinzahlungGirokonto(ktnr);
                if (skpruef) EinzahlungSparkonto(ktnr);
                System.out.println("Einzahlung erfolgreich.");
                break;
            case 4:
                System.out.println("Auszahlung");
                System.out.print("Bitte geben Sie die Kontonummer an: ");
                ktnr = EingabeKontonummer();
                if (ktnr == 0) break;
                gkpruef = PruefenKontonummerGiro(ktnr);
                skpruef = PruefenKontonummerSpar(ktnr);
                if (gkpruef==skpruef) 
                {
                    System.out.println("Kontonummer nicht vergeben.");
                    break;
                }
                if (gkpruef) AuszahlungGirokonto(ktnr);
                if (skpruef) AuszahlungSparkonto(ktnr);
                System.out.println("Auszahlung erfolgt.");
                break;
            case 5:
                System.out.println("Zinsauszahlung");
                System.out.print("Für welche Kontonummer sollen die Zinsen "
                        + "dem Konto hinzugefügt werden? ");
                ktnr = EingabeKontonummer();
                if (ktnr == 0) break;
                gkpruef = PruefenKontonummerGiro(ktnr);
                skpruef = PruefenKontonummerSpar(ktnr);
                if (gkpruef==skpruef) 
                {
                    System.out.println("Kontonummer nicht vergeben.");
                    break;
                }
                if (gkpruef) zinsauszahlungGirokonto(ktnr);
                if (skpruef) zinsauszahlungSparkonto(ktnr);     
                System.out.println("Zinsen wurden ausgezahlt.");
                break;
            case 6:
                System.out.println("Kontoauszug anzeigen");
                System.out.print("Bitte Kontonummer eingeben: ");
                ktnr = EingabeKontonummer();
                if (ktnr == 0) break;
                gkpruef = PruefenKontonummerGiro(ktnr);
                skpruef = PruefenKontonummerSpar(ktnr);
                if (gkpruef==skpruef) 
                {
                    System.out.println("Kontonummer nicht vergeben.");
                    break;
                }
                if (gkpruef) kontoauszugGirokonto(ktnr);
                if (skpruef) kontoauszugSparkonto(ktnr);                   
                break;
        }
    }
    
    private static double EingabeNummerDouble()
    {
        double dbl = 0.0;
            try
            {
                dbl = sc.nextDouble();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Nur Ziffern. Eingabeformat 000,00");
            }
        return dbl;
    }    
    private static String EingabeName(String kontoart)
    {
        System.out.println("Neuanlage eines "+kontoart+".");
        System.out.print("Bitte geben Sie den Namen des Kontoinhabers ein: ");
        String name = sc.next();
        return name;
    }
    private static int EingabeKontonummer()
    {
        int ktnr = 0;
            try
            {
                ktnr = sc.nextInt();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Kontonummer konnte nicht gelesen werden.");
            }
        return ktnr;
    }      
    
    private static boolean PruefenKontonummerGiro(int ktnr)
    {
        boolean pruefen = false;
        for (int i = 0; i<anzahlGirokonto;i++)
        {
            if(ktnr == gk[i].getKontonummer()) pruefen = true;
        }
        return pruefen;
    }

    private static boolean PruefenKontonummerSpar(int ktnr)
    {
        boolean pruefen = false;
        for (int i = 0; i<anzahlSparkonto;i++)
        {
            if(ktnr == sk[i].getKontonummer()) pruefen = true;
        }
        return pruefen;
    }    
    
    private static void EinzahlungGirokonto(int ktnr)
    {
        for(int i = 0;i<anzahlGirokonto;i++)
        {
            if (ktnr == gk[i].getKontonummer())
            {
                gk[i].Einzahlen(einzahlungsbetrag);              
            }
        }
    }
    
    private static void EinzahlungSparkonto(int ktnr)
    {
        for(int i = 0;i<anzahlSparkonto;i++)
        {
            if (ktnr == sk[i].getKontonummer())
            {
                sk[i].Einzahlen(einzahlungsbetrag);              
            }
        }
    }      
    
    private static void AuszahlungSparkonto(int ktnr)
    {
        double ktStandAktuell;
        for(int i = 0;i<anzahlSparkonto;i++)
        {
            if (ktnr == sk[i].getKontonummer())
            {
                   ktStandAktuell = sk[i].getKontostand();
                   System.out.print ("Bitte Auszahlungsbetrag eingeben: ");
                   double auszahlung = EingabeNummerDouble();
                   if (auszahlung > ktStandAktuell)
                       System.out.println("Auszahlung nicht möglich, da Konto nicht genug Deckung aufweist.");
                   else
                       sk[i].Auszahlen(auszahlung);
            }
        }        
    }
    
    private static void AuszahlungGirokonto(int ktnr)
    {
        double auszahlungMax;
        for(int i = 0;i<anzahlGirokonto;i++)
        {
            if (ktnr == gk[i].getKontonummer())
            {
                   auszahlungMax = Math.abs(gk[i].getKontostand()-gk[i].getKontokorrent()*-1);
                   System.out.print ("Bitte Auszahlungsbetrag eingeben: ");
                   double auszahlung = EingabeNummerDouble();
                   if (auszahlung > auszahlungMax)
                       System.out.println("Auszahlung nicht möglich, da Konto nicht genug Deckung aufweist.");
                   else
                       gk[i].Auszahlen(auszahlung);
            }
        }     
    }
    private static void zinsauszahlungSparkonto(int ktnr)
    {
        for(int i = 0;i<anzahlSparkonto;i++)
        {
            if (ktnr == sk[i].getKontonummer())
            {
                sk[i].ZinsenBerechnen();
            }
        }        
    }
    
    private static void zinsauszahlungGirokonto(int ktnr)
    {
        for(int i = 0;i<anzahlGirokonto;i++)
        {
            if (ktnr == gk[i].getKontonummer())
            {
                gk[i].ZinsenBerechnen();
            }
        }        
    }
    
    private static void kontoauszugGirokonto(int ktnr)
    {
        for(int i = 0;i<anzahlGirokonto;i++)
        {
            if (ktnr == gk[i].getKontonummer())
            {
                System.out.println(gk[i]);
            }
        }         
    }
    
    private static void kontoauszugSparkonto(int ktnr)
    {
        for(int i = 0;i<anzahlSparkonto;i++)
        {
            if (ktnr == sk[i].getKontonummer())
            {
                System.out.println(sk[i]);
            }
        }         
    }
    private static void abschluss()
    {
        String konto = "Konto";
        String ktnr = "KtNr";
        String inhaber = "Inhaber";
        String saldo = "Saldo";
        double saldoges = 0.0;
        boolean gkpruef = true;
        boolean skpruef = true;
        boolean loop = true;
        System.out.printf("%-15s%-8s%-20s%-10s%n%n",konto,ktnr,inhaber,saldo);
        int kontonr = 1000;
        while(loop)
        {
            gkpruef = PruefenKontonummerGiro(kontonr);
            skpruef = PruefenKontonummerSpar(kontonr);            
            if(gkpruef)
            {
                for(int i = 0;i<anzahlGirokonto;i++)
                {
                    if (kontonr == (int) gk[i].getKontonummer())
                    {
                        String a = "Girokonto";
                        int kt = gk[i].getKontonummer();
                        String inh = gk[i].getName();
                        double eur = gk[i].getKontostand();
                        System.out.printf("%-15s%-8d%-20s%10.2f €%n",a,kt,inh,eur);
                        saldoges +=eur;
                        kontonr++;
                    }
                }                  
            }
            if(skpruef)
            {
                for(int i = 0;i<anzahlSparkonto;i++)
                {
                    if (kontonr == (int) sk[i].getKontonummer())
                    {
                        String a = "Sparkonto";
                        int kt = sk[i].getKontonummer();
                        String inh = sk[i].getName();
                        double eur = sk[i].getKontostand();
                        System.out.printf("%-15s%-8d%-20s%10.2f €%n",a,kt,inh,eur);
                        saldoges +=eur;
                        kontonr++;
                    }
                }                  
            } 
            if (gkpruef == skpruef) loop = false;
        } 
        String ges = "Gesamtkapital";
        System.out.println();
        System.out.printf("%-43s%10.2f €",ges,saldoges);
    }
}
