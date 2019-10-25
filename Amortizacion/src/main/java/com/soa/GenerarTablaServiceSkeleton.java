/**
 * GenerarTablaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.soa;

/**
 *  GenerarTablaServiceSkeleton java skeleton for the axisService
 */
public class GenerarTablaServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param tablaAmortizacionRequest
     * @return tablaAmortizacionResponse
     */
    public com.soa.TablaAmortizacionResponse generarTablaOperation(
        com.soa.TablaAmortizacionRequest tablaAmortizacionRequest) {

	  	TablaAmortizacionResponse response = new TablaAmortizacionResponse();
		AmortizacionTable_type0 tabla = new AmortizacionTable_type0();
		Amortizacion_type0[] amortizaciones = calcularAmortizacion( tablaAmortizacionRequest);
		tabla.setAmortizacion( amortizaciones);
		response.setAmortizacionTable( tabla);
		return response;
    }
    private Amortizacion_type0[] calcularAmortizacion( TablaAmortizacionRequest tabla) {	
    	double capital = tabla.getCapital();
    	int plazo = (int) tabla.getPlazo();
    	int noSolicitud = tabla.getNo_solicitud();
    	double interesPor = tabla.getInteres();
    	final double amortizacion = capital / plazo;
    	
    	Amortizacion_type0[] amortizaciones = new Amortizacion_type0[ plazo + 1];
    	for( int i = 0; i < amortizaciones.length; i++)
    	{
    		amortizaciones[i] = new Amortizacion_type0();
    		if( i == 0)
    		{
    			amortizaciones[i].setId_solicitud( noSolicitud);
    			amortizaciones[i].setPeriodo( i);
    			amortizaciones[i].setCapital( capital);
    			amortizaciones[i].setInteres( 0);
    			amortizaciones[i].setIva( 0);
    			amortizaciones[i].setMensualidad( 0);
    		}
    		else
    		{
    			amortizaciones[i].setId_solicitud( noSolicitud);
    			amortizaciones[i].setPeriodo( i);
    			capital -= amortizacion;
    			amortizaciones[i].setCapital( capital);
    			double interes = (capital * interesPor) / 360*30;
    			amortizaciones[i].setInteres( interes);
    			double iva = interes * .16;
    			amortizaciones[i].setIva( interes * .16);
    			double mensualidad = amortizacion + interes + iva;
    			amortizaciones[i].setMensualidad( mensualidad);
    		}
		}
    	return amortizaciones;
    }
}
