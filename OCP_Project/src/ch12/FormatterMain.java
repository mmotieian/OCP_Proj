/**
 * 
 */
package ch12;

import java.sql.Time;
import java.text.DateFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author Mohammad Najar
 *
 */
public class FormatterMain {

	private static String str;

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {

		// NumberFormat.getInstance();
		Format currency = NumberFormat.getCurrencyInstance();
		Format number = NumberFormat.getNumberInstance(Locale.FRENCH);
		Format integer = NumberFormat.getIntegerInstance();
		Format date = DateFormat.getDateInstance(DateFormat.FULL);
		Format time = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		Format timeMedium = DateFormat.getTimeInstance(DateFormat.MEDIUM);
		Format dateTime = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT);
		Format simpleFormat = new SimpleDateFormat("MM/dd/yyyy-HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		cal.set(1984, 3, 17, 5, 6, 7);
		System.out.println(cal.getTime());
		
	  List<String> list = new ArrayList<>();
	  list.add("HELLOW");
	  list.remove(0);
	  
	  
		System.out.println(currency.format(2000.00));
		System.out.println(number.format(2000.12));
		System.out.println(integer.format(2000.123));
		System.out.println(str = date.format(new Date()));
//		System.out.println(date.parseObject(str));
		System.out.println(time.format(new Time(System.currentTimeMillis())));
		System.out.println(timeMedium.format(new Time(System.currentTimeMillis())));
		System.out.println(dateTime.format(new Date()));
		
		str = simpleFormat.format(new Date());
		System.out.println(str);
		System.out.println(simpleFormat.parseObject(str));

		
		
//		for (Locale locale : Locale.getAvailableLocales()) {
//			formatter = NumberFormat.getCurrencyInstance(locale);
//			System.out.println(locale + "\t\t" + formatter.format(1000000));
//		}

	}

}
