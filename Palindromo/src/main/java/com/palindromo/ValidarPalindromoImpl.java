/**
 * ValidarPalindromoSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.palindromo;

/**
 *  ValidarPalindromoSkeleton java skeleton for the axisService
 */
public class ValidarPalindromoImpl extends ValidarPalindromoSkeleton {
    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public Response validarPalindromoOperation(Request request) {
        Response response = new Response();
        boolean isPalindromo = false;
        response.setEsPalindromo(isPalindromo);
        return response;
    }
}
