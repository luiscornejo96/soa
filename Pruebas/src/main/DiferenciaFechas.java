package src.main;

import java.time.LocalDate;

public class DiferenciaFechas {
	
	public static void main( String [] kiwi)
	{
		LocalDate hoy = LocalDate.now();
        System.out.println(hoy);
        String date = "2016-08-16";
        LocalDate localDate = LocalDate.parse("2016-08-16");
        LocalDate newDate = localDate.minusYears(1997);
        LocalDate aux = newDate.minusMonths(4);
        LocalDate aux2 = aux.minusDays(8);
        System.out.println(localDate);
        System.out.println( "Tu edad es: " + aux2.getYear() + " anios.");
	}

}
