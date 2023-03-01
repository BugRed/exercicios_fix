package exercicio_fix;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DataHora_ex {

	public static void main(String[] args) {
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		
	/*for (String s : ZoneId.getAvailableZoneIds()) {
		System.out.println(s);
		}*/
		
		//LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		//Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("1994-05-20");
		LocalDateTime d05 = LocalDateTime.parse("1994-05-20T02:15:30");
		Instant d06 = Instant.parse("1994-05-20T02:15:30Z");
		Instant d07 = Instant.parse("1994-05-20T02:15:30-03:00");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		LocalDate d09 = LocalDate.parse("20/07/2022 02:15", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate pastYearLocalDate = d04.minusYears(28);
		LocalDate nextYearLocalDate = d04.plusYears(28);
		
		LocalDateTime pastHourLocalDateTime = d05.minusHours(12);
		LocalDateTime nextHourLocalDateTime = d05.plusHours(12);
		
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstat = d06.plus(7, ChronoUnit.DAYS);
		
		Duration t1 = Duration.between(pastWeekInstant, d06);
		Duration t2 = Duration.between(pastYearLocalDate.atStartOfDay(), d04.atStartOfDay());
		LocalDate d10 = LocalDate.of(1994, 05, 20);
		LocalDateTime d11 = LocalDateTime.of(1994, 05, 20, 2, 30);
		Instant d12 = Instant.parse("1994-05-20T02:15:30Z");
		
		LocalDate r1 = LocalDate.ofInstant(d12, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d12, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d12, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d12, ZoneId.of("Portugal"));
		
		System.out.println("LocalDate: " + fmt1.format(d11));
		System.out.println("LocalDateTime: " + d02.toString());
		System.out.println("Instant: " + fmt2.format(d06));
		
		System.out.println("Parse date: " + d04.format(fmt1));
		System.out.println("Parse time: " + d05);
		System.out.println("Intant parse: " + d06);
		System.out.println("Intant parse GMT: " + d07);
		
		System.out.println("Local Date whit Brazil form: " + d08);
		System.out.println("Local Date and hour whit Brazil form: " + d09);
		System.out.println("Local Date of: " + d10);
		System.out.println("Local Date Time of: " + d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		
		System.out.println("Local Date Zone Id default: "+ r1);
		System.out.println("Local Date Zone Id portugal: "+ r2);
		System.out.println("Local Date Time Zone Id default: "+ r3);
		System.out.println("Local Date Time Zone Id portugal: "+ r4);
		
		System.out.println("Extrair o dia de Local Date: " + d04.getDayOfMonth());
		System.out.println("Extrair mês de Local Date: " + d04.getMonthValue());
		System.out.println("Extrair ano de Local Date: " + d04.getYear());
		System.out.println("Extrair hora de Local Date Time: " + d05.getHour());
		System.out.println("Extrair minuto de Local Date Time: " + d05.getMinute());
		System.out.println("Extrair segundo de Local date Time: " + d05.getSecond());
		
		System.out.println("Retirando ano de uma data previa: " + pastYearLocalDate);
		System.out.println("Adicionando ano a uma data previa: " + nextYearLocalDate);
		
		System.out.println("Retirando horas de uma data previa: " + pastHourLocalDateTime);
		System.out.println("Adicionando horas a uma data previa: " + nextHourLocalDateTime);
		
		System.out.println("Retirando dias de um instante: " + pastWeekInstant);
		System.out.println("Adicionandodias a um instante: " + nextWeekInstat);
		
		System.out.println("Duração entre duas datas LocalDateTime: " + t1.toDays());
		System.out.println("Duração entre duas datas LocalDate: " + t2.toDays());
	}

}
