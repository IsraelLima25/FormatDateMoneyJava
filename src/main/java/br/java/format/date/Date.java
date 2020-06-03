package br.java.format.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date {

	public static void main(String[] args) {
		
		LocalDate dataAgora = LocalDate.now();		
		//DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dataAgora.format(formatadorData));
		
		LocalDateTime dataHoraAgora = LocalDateTime.now();
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		DateTimeFormatter formatadorMedio = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
				.withLocale(new Locale("pt","br"));
		
		/**
		 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
		 */		
		String dataFormatada = dataHoraAgora.format(formatadorMedio);
		
		System.out.println(dataFormatada);
		
		System.out.println(dataHoraAgora.minusHours(2));
		System.out.println(dataHoraAgora.plusHours(4));
		
		

	}

}
