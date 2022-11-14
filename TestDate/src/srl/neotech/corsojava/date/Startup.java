package srl.neotech.corsojava.date;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creare
	System.out.println(System.currentTimeMillis());
	Date d= new Date(System.currentTimeMillis());
	
		//gestire
	GregorianCalendar gc= new GregorianCalendar();
	gc.setTime(d);
	printDate1(gc);
	
	gc.add(GregorianCalendar.MONTH, 7);
	printDate1(gc);
	
	gc.add(GregorianCalendar.YEAR, -23);
	printDate1(gc);
		
		GregorianCalendar gc2= new GregorianCalendar();
		gc2.set(2013, 5, 21);
		
		//confronta le due date
		System.out.println(gc.before(gc2));
		
		//formattazione
		SimpleDateFormat sdf= new SimpleDateFormat ("dd/MM/YY hh:mm:ss");
		System.out.println(sdf.format(d));
	}
	
	private static void printDate1(GregorianCalendar gc) {
		System.out.println(gc.get(GregorianCalendar.YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println("-----------");
		
	}

}
