
public class rfc {
	
	public static void main( String[] kiwi)
	{
		String nombre = "luis";
    	String aPa = "cornejo";
    	String aMa = "arreola";
    	String fecha = "08/04/1997";
    	String[] fechas = fecha.split("/");
    	String rfc;
    	rfc = "" + aPa.toUpperCase().charAt(0) + aPa.toUpperCase().charAt(1) + aMa.toUpperCase().charAt(0) + nombre.toUpperCase().charAt(0);
    	rfc += fechas[2].charAt(2) + fechas[2].charAt(3) + fechas[1] + fechas[0];
    	System.out.println(fechas[2].charAt(2) + fechas[2].charAt(3) +  fechas[2].substring(2,4));
    	System.out.print( rfc);
	}

}
