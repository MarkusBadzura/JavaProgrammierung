package ErsteSchritte;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Beispielprogramm für die Klasse LocalTime
 * @author Markus Badzura
 */
public class Zeit 
{
    public static void main(String[] args) 
    {
        LocalTime aktuell = LocalTime.now();
        LocalTime zeit2 = LocalTime.now();
        LocalTime z1 = LocalTime.of(15,20);
        System.out.println("LocalTime.now()         : "+aktuell);
        System.out.println("LocalTime.of(h,m)<Z1>   : "+LocalTime.of(15,20));
        System.out.println("LocalTime.of(h,m,s)     : "+LocalTime.of(15,20,30));
        System.out.println("LocalTime.of(h,m,s,n)   : "+LocalTime.of(15,20,30,333));
        System.out.println("atDate(LocalDate)       : "+aktuell.atDate(LocalDate.now()));  
        System.out.println("compareTo(LocalTime)    : "+aktuell.compareTo(LocalTime.of(15,00)));
        System.out.println("equals (time)           : "+aktuell.equals(zeit2));
        System.out.println("format(formatter)       : "+aktuell.format(DateTimeFormatter.ofPattern("H-m-s")));
        System.out.println("getHour()               : "+aktuell.getHour());
        System.out.println("getMinute()             : "+aktuell.getMinute());
        System.out.println("getSecond()             : "+aktuell.getSecond());
        System.out.println("getNano()               : "+aktuell.getNano());
        System.out.println("isAfter(Z1)             : "+aktuell.isAfter(z1));
        System.out.println("isBefore(Z1)            : "+aktuell.isBefore(z1));
        System.out.println("minusHours(long)        : "+aktuell.minusHours(10));
        System.out.println("minusMinutes(long)      : "+aktuell.minusMinutes(20));
        System.out.println("minusSeconds(long)      : "+aktuell.minusSeconds(20));
        System.out.println("minusNanos(long)        : "+aktuell.minusNanos(20));
        System.out.println("parse(\"20:15\")          : "+aktuell.parse("20:15"));
        System.out.println("parse(\"20-15\",formatter): "+aktuell.parse("20-15",DateTimeFormatter.ofPattern("H-m")));
        System.out.println("plusHours(long)         : "+aktuell.plusHours(20));
        System.out.println("plusMinutes(long)       : "+aktuell.plusMinutes(20));
        System.out.println("plusSeconds(long)       : "+aktuell.plusSeconds(20));
        System.out.println("plusNanos(long)         : "+aktuell.plusNanos(20));
        System.out.println("toNanoOfDay()           : "+aktuell.toNanoOfDay());
        System.out.println("toSecondOfDay()         : "+aktuell.toSecondOfDay());
        System.out.println("withHour(20)            : "+aktuell.withHour(20));
        System.out.println("withMinute(20)          : "+aktuell.withMinute(20));
        System.out.println("withSecond(20)          : "+aktuell.withSecond(20));
        System.out.println("withNano(20)            : "+aktuell.withNano(20));
    }
}
