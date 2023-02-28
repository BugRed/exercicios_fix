package exercicio_fix;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Calendar;

public class Calendar_fix {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("1994-05-20T02:15:00Z"));
		
		System.out.println("Date no format: " + sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.add(Calendar.HOUR_OF_DAY, 3);
		d = cal.getTime();
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Date with calendar add Hour: " + sdf.format(d));
		System.out.println("Minutes of the date: " + minutes);
		System.out.println("Month of the date: " + month);
	}

}
