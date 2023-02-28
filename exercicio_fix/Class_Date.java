package exercicio_fix;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Class_Date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60L * 5L);
		
		Date y1 = sdf1.parse("20/05/1994");
		Date y2 = sdf2.parse("20/05/1994 02:15:00");
		Date y3 = Date.from(Instant.parse("2023-06-25T15:42:07Z"));
		
		
		System.out.println("-----------SEM FORMATAÇÃO------------");
		System.out.println("Date without time : " + y1);
		System.out.println("Date with time: " + y2);
		System.out.println("Date now: " +x1);
		System.out.println("Date Current Time Millis: " + x2);
		System.out.println("Date Millis 0L: " + x3);
		System.out.println("Date Millis mutiplicate: " + x4);
		System.out.println("Date padrão UTC: " + y3);
		
		System.out.println("-----------FORMATAÇÃO DA PRÓPRIA MAQUINA------------");
		System.out.println("Date without time : " + sdf2.format(y1));
		System.out.println("Date with time: " + sdf2.format(y2));
		System.out.println("Date now: " + sdf2.format(x1));
		System.out.println("Date Current Time Millis: " + sdf2.format(x2));
		System.out.println("Date Millis 0L: " + sdf2.format(x3));
		System.out.println("Date Millis mutiplicate: " + sdf2.format(x4));
		System.out.println("Date padrão UTC: " + sdf2.format(y3));
		
		System.out.println("-----------FORMATAÇÃO UTC--------------");
		System.out.println("Date without time : " + sdf3.format(y1));
		System.out.println("Date with time: " + sdf3.format(y2));
		System.out.println("Date now: " + sdf3.format(x1));
		System.out.println("Date Current Time Millis: " + sdf3.format(x2));
		System.out.println("Date Millis 0L: " + sdf3.format(x3));
		System.out.println("Date Millis mutiplicate: " + sdf3.format(x4));
		System.out.println("Date padrão UTC: " + sdf3.format(y3));
		
	}

}
