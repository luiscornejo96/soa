/**
 * ValidarTemperaturaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.temperatura;

import com.temperatura.ResponseFarenheitDocument.ResponseFarenheit;

/**
 *  ValidarTemperaturaServiceSkeleton java skeleton for the axisService
 */
public class ValidarTemperaturaServiceImpl extends ValidarTemperaturaServiceSkeleton{
    /**
     * Auto generated method signature
     *
     * @param requestCelsius
     * @return responseFarenheit
     */
    public com.temperatura.ResponseFarenheitDocument validarTemperaturaOperation(
        com.temperatura.RequestCelsiusDocument requestCelsius) {
    	
    	ResponseFarenheitDocument doc = ResponseFarenheitDocument.Factory.newInstance();
    	ResponseFarenheit response = doc.addNewResponseFarenheit();
    	response.setTempFarenheit( convertC2F( 0));
    	return doc;
    }
    private double convertC2F( double celsius) {
    	double farenheit = (celsius * 9/5) + 32;
    	return farenheit;
    }
}
