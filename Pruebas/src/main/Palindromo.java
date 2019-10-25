package src.main;

import java.util.Scanner;

public class Palindromo {

	public static void main( String [] kiwi)
	{
		System.out.print("Ingrese palabra a verificar: ");
		Scanner in = new Scanner( System.in);
		String palabra = in.next();
		System.out.println( esPalindromo( palabra));
	}
	
	private static boolean esPalindromo( String palabra)
	{
		String aux = "";
		for( int i = palabra.length(); 0 < i; i--)
		{
			aux += palabra.charAt( i-1);
		}
		return aux.equals(palabra);
	}
	
}
