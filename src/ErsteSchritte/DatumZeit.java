package ErsteSchritte;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Beispielklasse für die JDK 1.8 Klasse LocalDateTime
 * @author Markus Badzura
 */
public class DatumZeit 
{
    public static void main(String[] args) 
    {
        LocalDateTime aktuell = LocalDateTime.now();
        LocalDateTime dz = LocalDateTime.of(2012,2,13,9,13,20);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy H:m:s");
        System.out.println("aktuell = Aktuelles Date-Time-Objekt            : "+aktuell);
        System.out.println("Vergleichsobjekt dz = 2012-02-13T09:13:20       : "+dz);
        System.out.println("now()                                           : "+aktuell);
        System.out.println("of(jahr,monat,tag,stunde,minute)                : "+LocalDateTime.of(2012,2,13,9,13));
        System.out.println("of(jahr,monat,tag,stunde,minute,sekunde)        : "+LocalDateTime.of(2012,2,13,9,13,20));
        System.out.println("of(jahr,monat,tag,stunde,minute,sekunde,nano)   : "+LocalDateTime.of(2012,2,13,9,13,20,20));
        System.out.println("of(jahr,MONAT,tag,stunde,minute)                : "+LocalDateTime.of(2012,Month.FEBRUARY,13,9,13));
        System.out.println("of(jahr,MONAT,tag,stunde,minute,sekunde)        : "+LocalDateTime.of(2012,Month.FEBRUARY,13,9,13,20));
        System.out.println("of(Jahr,MONAT,tag,stunde,minute,sekunde,nano)   : "+LocalDateTime.of(2012,Month.FEBRUARY,13,9,13,20,20));
        System.out.println("of.(LocalDate, LocalTime)                       : "+LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        System.out.println("equals(dz)                                      : "+aktuell.equals(dz));
        System.out.println("format(formatter)                               : "+aktuell.format(formatter));
        System.out.println("getDayOfMonth()                                 : "+aktuell.getDayOfMonth());
        System.out.println("getDayOfWeek()                                  : "+aktuell.getDayOfWeek());
        System.out.println("getDayOfYear()                                  : "+aktuell.getDayOfYear());
        System.out.println("getHour()                                       : "+aktuell.getHour());
        System.out.println("getMinute()                                     : "+aktuell.getMinute());
        System.out.println("getMonth()                                      : "+aktuell.getMonth());
        System.out.println("getMonthValue()                                 : "+aktuell.getMonthValue());
        System.out.println("getNano()                                       : "+aktuell.getNano());
        System.out.println("getSecond()                                     : "+aktuell.getSecond());
        System.out.println("getYear()                                       : "+aktuell.getYear());
        System.out.println("isAfter(dz)                                     : "+aktuell.isAfter(dz));
        System.out.println("isBefore(dz)                                    : "+aktuell.isBefore(dz));
        System.out.println("isEqual(dz)                                     : "+aktuell.isEqual(dz));
        System.out.println("minusDays(long)                                 : "+aktuell.minusDays(20));
        System.out.println("minusHours(long)                                : "+aktuell.minusHours(20));
        System.out.println("minusMinutes(long)                              : "+aktuell.minusMinutes(20));
        System.out.println("minusMonth(long)                                : "+aktuell.minusMonths(20));
        System.out.println("minusNanos(long)                                : "+aktuell.minusNanos(20));
        System.out.println("minusSeconds(long)                              : "+aktuell.minusSeconds(20));
        System.out.println("minusWeeks(long)                                : "+aktuell.minusWeeks(20));
        System.out.println("minusYears(long)                                : "+aktuell.minusYears(20));
        System.out.println("parse(\"2012-02-13T13:09:20\")                    : "+aktuell.parse("2012-02-13T13:09:20"));
        System.out.println("parse(\"13.02.17 13:09:20\",formatter)            : "+aktuell.parse("13.02.17 13:09:20",formatter));
        System.out.println("plusDays(long)                                  : "+aktuell.plusDays(20));
        System.out.println("plusHours(long)                                 : "+aktuell.plusHours(20));
        System.out.println("plusMinutes(long)                               : "+aktuell.plusMinutes(20));
        System.out.println("plusMonths(long)                                : "+aktuell.plusMonths(20));
        System.out.println("plusNanos(long)                                 : "+aktuell.plusNanos(20));
        System.out.println("plusSeconds(long)                               : "+aktuell.plusSeconds(20));
        System.out.println("plusWeeks(long)                                 : "+aktuell.plusWeeks(20));
        System.out.println("plusYears(long)                                 : "+aktuell.plusYears(20));
        System.out.println("toLocalDate()                                   : "+aktuell.toLocalDate());
        System.out.println("toLocalTime()                                   : "+aktuell.toLocalTime());
        System.out.println("withDayOfYear(int)                              : "+aktuell.withDayOfYear(20));
        System.out.println("withDayOfMonth(int)                             : "+aktuell.withDayOfMonth(20));
        System.out.println("withHour(int)                                   : "+aktuell.withHour(20));
        System.out.println("withMinute(int)                                 : "+aktuell.withMinute(20));
        System.out.println("withMonth(int)                                  : "+aktuell.withMonth(11));
        System.out.println("withNano(int)                                   : "+aktuell.withNano(20));
        System.out.println("withSecond(int)                                 : "+aktuell.withSecond(20));
        System.out.println("withYear(int)                                   : "+aktuell.withYear(2020));
    }
}
