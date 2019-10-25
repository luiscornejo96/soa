/**
 * ValidarPalindromoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.palindromo;

import com.palindromo.RequestDocument.Request;
import com.palindromo.ResponseDocument.Response;

/**
 *  ValidarPalindromoSkeleton java skeleton for the axisService
 */
public class ValidarPalindromoImpl extends ValidarPalindromoSkeleton{
    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public com.palindromo.ResponseDocument validarPalindromoOperation(
        com.palindromo.RequestDocument request) {
    	
        ResponseDocument doc = ResponseDocument.Factory.newInstance();
        Response response =  doc.addNewResponse( );
        response.setEsPalindromo( esPali(request));
        System.out.println( "Representacion xml: " + doc);
        return doc;
        
    }
    private static boolean esPali( RequestDocument request)
    {
    	String palabra = request.toString();
    	System.out.println( "Holis: " + palabra);
    	String aux = "";
		for( int i = palabra.length(); 0 < i; i--)
		{
			aux += palabra.charAt( i-1);
		}
		return aux.equals(palabra);
	}
}
