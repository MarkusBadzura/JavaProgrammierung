package ErsteSchritte;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Beispielprogramm für den Umgang mit LocalDate
 * @author Markus Badzura
 */
public class Datum 
{    
    public static void main(String[] args) 
    {
        String dateEP = "1974-01-20";
        LocalDate datum = LocalDate.now();
        LocalDate datumV = LocalDate.now();
        LocalDate datumE = LocalDate.of(1974,1,20);
        LocalDate datumS = LocalDate.of(2120,Month.JULY,20);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate datumEP = LocalDate.parse(dateEP);
        LocalDate datumEP1 = LocalDate.parse("20.01.1974",df);
        System.out.println("Heutiges Datum                        :"+datum);
        System.out.println("LocalDate.of(1974,1,20) <D1>          :"+datumE);
        System.out.println("LocalDate.of(2120,Month.JULY,20) <D2> :"+datumS);
        System.out.println("LocalDate.parse(\"1974-01-20\")         :"+datumEP);
        System.out.println("LocalDate.parse(\"20.01.1974\", format  :"+datumEP1);
        System.out.println("Methode: atStartOfDay()               :"+datum.atStartOfDay());
        System.out.println("Methode: atTime(h,m)                  :"+datum.atTime(18,20));
        System.out.println("Methode: atTime(h,m,s)                :"+datum.atTime(18,20,22));
        System.out.println("Methode: atTime(h,m,s,ns)             :"+datum.atTime(18,20,22,33));
        System.out.println("Methode: atTime(time)                 :"+datum.atTime(LocalTime.now()));
        System.out.println("Methode: equals(Objekt)               :"+datum.equals(datumV));
        System.out.println("Methode: format(formatter)            :"+datum.format(df));
        System.out.println("Methode: getDayOfWeek()               :"+datum.getDayOfWeek());
        System.out.println("Methode: getDayOfMonth()              :"+datum.getDayOfMonth());
        System.out.println("Methode: getDayOfYear()               :"+datum.getDayOfYear());
        System.out.println("Methode: getMonth()                   :"+datum.getMonth());
        System.out.println("Methode: getMonthValue()              :"+datum.getMonthValue());
        System.out.println("Methode: getYear()                    :"+datum.getYear());
        System.out.println("Methode: isAfter(D1)                  :"+datum.isAfter(datumE));
        System.out.println("Methode: isBefore(D1)                 :"+datum.isBefore(datumE));
        System.out.println("Methode: isEqual(D1)                  :"+datum.isEqual(datumE));
        System.out.println("Methode: isLeapYear()                 :"+datum.isLeapYear());
        System.out.println("Methode: lengthOfMonth()              :"+datum.lengthOfMonth());
        System.out.println("Methode: lengthOfYear()               :"+datum.lengthOfYear());
        System.out.println("Methode: minusDays(20)                :"+datum.minusDays(20));
        System.out.println("Methode: minusWeeks(20)               :"+datum.minusWeeks(20));
        System.out.println("Methode: minusMonths(20)              :"+datum.minusMonths(20));
        System.out.println("Methode: minusYears(20)               :"+datum.minusYears(20));
        System.out.println("Methode: plusDays(20)                 :"+datum.plusDays(20));
        System.out.println("Methode: plusWeeks(20)                :"+datum.plusWeeks(20));
        System.out.println("Methode: plusMonths(20)               :"+datum.plusMonths(20));
        System.out.println("Methode: plusYears(20)                :"+datum.plusYears(20)); 
        System.out.println("Methode: withYear(2020)               :"+datum.withYear(2020));
        System.out.println("Methode: withMonth(12)                :"+datum.withMonth(12));
        //LocalDate geburtstag = LocalDate.parse("1983-02-28");
        //if (geburtstag.withYear(datum.getYear()).isEqual(datum)) System.out.println("Gratulation");
    }
}
