
package javaapplication;
import java.time.*;
import java.time.format.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class JavaApplication {

    public static void main(String[] args) {
       LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        
        LocalDate atentados= LocalDate.of(2001, Month.SEPTEMBER, 11);
        System.out.println(atentados);
        
        DateTimeFormatter formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        String hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        
        formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        
        formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        
        formatador = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        hojeFormatado = hoje.format(formatador);
        System.out.println(hojeFormatado);
        System.out.println("");
        
        System.out.println("Dia da semana: "+hoje.getDayOfWeek().name());
        System.out.println("Dia: "+hoje.getDayOfMonth());
        System.out.println("Mes: "+hoje.getMonthValue());
        System.out.println("Mes: "+hoje.getMonth().name());
        System.out.println("Ano: "+hoje.getYear());
        System.out.println("");
        
        String diaDaSemana=hoje.getDayOfWeek()
                .getDisplayName(TextStyle.FULL, Locale.getDefault());
        String mes = hoje.getMonth()
               .getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println("Dia da semana: "+diaDaSemana);
        System.out.println("Mes: "+mes);
        System.out.println("");
        
        LocalDate niverW= LocalDate.of(1987, Month.NOVEMBER, 10);
        LocalDate niverC=LocalDate.of(1998, 5, 19);
        
        Period periodo = Period.between(niverW, niverC);
        System.out.println("Anos: "+periodo.getYears());
        System.out.println("Meses: "+periodo.getMonths());
        System.out.println("Dias: "+periodo.getDays());
        System.out.println("");
        
        long totalAnos = ChronoUnit.YEARS.between(niverW, niverC);
        long totalMeses = ChronoUnit.MONTHS.between(niverW, niverC);
        long totalDias = ChronoUnit.DAYS.between(niverW, niverC);
        System.out.println("Total anos: "+totalAnos);
        System.out.println("Total meses: "+totalMeses);
        System.out.println("Total dias: "+totalDias);
        
        
        System.out.println("Mais 5 dias: "+hoje.plusDays(5));
        System.out.println("Mais 5 semanas: "+hoje.plusWeeks(5));
        System.out.println("Mais 5 anos: "+hoje.plusYears(5));
        System.out.println("Mais 2 meses: "+hoje.plusMonths(2));
        System.out.println("Menos 1 ano: "+hoje.minusYears(1));
        System.out.println("Menos 1 mes: "+hoje.minusMonths(1));
        System.out.println("Menos 3 dias: "+hoje.minusDays(3));
        
        
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data/Hora: "+agora);
        
        DateTimeFormatter formatador2 = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
        String agoraFormatado = agora.format(formatador2);
        System.out.println(agoraFormatado);
        
        System.out.println("HOras: "+agora.getHour());
        System.out.println("Minutos: "+agora.getMinute());
        System.out.println("Segundo "+agora.getSecond());
        System.out.println("Nanos: "+agora.getNano());
    }
    
}
