/**
 * CalcularServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.nombre;

import java.time.LocalDate;
import java.util.Date;

import com.nombre.ResponseLuisCornejoDocument.ResponseLuisCornejo;

/**
 *  CalcularServiceSkeleton java skeleton for the axisService
 */
public class CalcularServiceImpl extends CalcularServiceSkeleton{
    /**
     * Auto generated method signature
     *
     * @param requestLuisCornejo
     * @return responseLuisCornejo
     */
    public com.nombre.ResponseLuisCornejoDocument calcularOperation(
        com.nombre.RequestLuisCornejoDocument requestLuisCornejo) {
        
    	ResponseLuisCornejoDocument doc = ResponseLuisCornejoDocument.Factory.newInstance();
    	ResponseLuisCornejo response = doc.addNewResponseLuisCornejo();
    	response.setAge( calculaAnios(requestLuisCornejo.getRequestLuisCornejo().getYear()));
    	return doc;
    }
    private String calculaAnios(double year)
    {
    	LocalDate hoy = LocalDate.now();
    	LocalDate anios = hoy.minusYears( (int)year);
    	return String.format("Tu edad es de %s anios", anios.getYear());
    }
}
