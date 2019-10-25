/**
 * BuroServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.soa;

/**
 *  BuroServiceSkeleton java skeleton for the axisService
 */
public class BuroServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param consultarBuroRequest
     * @return consultarBuroResponse
     */
    public com.soa.ConsultarBuroResponse buroOperation(
        com.soa.ConsultarBuroRequest consultarBuroRequest) {
    	
    	ConsultarBuroResponse response = new ConsultarBuroResponse();
    	double ran = calcularRandom();
    	response.setTasa( ran);
    	response.setAprobado( creditoAprobado(ran));
    
    	return response;
    }
    
    private double calcularRandom()
    {
    	return Math.random();
    }
    
    private boolean creditoAprobado( double random) 
    {
    	return random >= .3;
    }
}