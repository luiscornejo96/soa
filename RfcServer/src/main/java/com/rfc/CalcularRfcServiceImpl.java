/**
 * CalcularRfcServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.rfc;

import com.rfc.ResponseLuisCornejoDocument.ResponseLuisCornejo;

/**
 *  CalcularRfcServiceSkeleton java skeleton for the axisService
 */
public class CalcularRfcServiceImpl extends CalcularRfcServiceSkeleton{
    /**
     * Auto generated method signature
     *
     * @param requestLuisCorejo
     * @return responseLuisCornejo
     */
    public com.rfc.ResponseLuisCornejoDocument calcularOperation(
        com.rfc.RequestLuisCorejoDocument requestLuisCorejo) {
    	
    	ResponseLuisCornejoDocument doc = ResponseLuisCornejoDocument.Factory.newInstance();
    	ResponseLuisCornejo response = doc.addNewResponseLuisCornejo();
    	response.setRfc( calculaRFC( requestLuisCorejo));
    	
    	return doc;
    }
    private String calculaRFC( RequestLuisCorejoDocument request)
    {
    	String nombre = request.getRequestLuisCorejo().getNombre();
    	String aPa = request.getRequestLuisCorejo().getApellidoPaterno();
    	String aMa = request.getRequestLuisCorejo().getApellidoMaterno();
    	String fecha = request.getRequestLuisCorejo().getFechaNacimiento();
    	String[] fechas = fecha.split("/");
    	String rfc;
    	rfc = "" + aPa.toUpperCase().charAt(0) + aPa.toUpperCase().charAt(1) + aMa.toUpperCase().charAt(0) + nombre.toUpperCase().charAt(0);
    	rfc += fechas[2].substring(2,4) + fechas[1] + fechas[0];
    	
    	return rfc;
    }
}
