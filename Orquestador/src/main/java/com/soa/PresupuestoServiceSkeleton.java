/**
 * PresupuestoServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.soa;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.ValidarTarjeta.ValidarTarjetaServiceStub;
import com.ValidarTarjeta.ValidarTarjetaServiceStub.RequestValidarTarjeta;
import com.ValidarTarjeta.ValidarTarjetaServiceStub.ResponseValidarTarjeta;
import com.amortizacion.GenerarTablaServiceStub;
import com.amortizacion.GenerarTablaServiceStub.Amortizacion_type0;
import com.amortizacion.GenerarTablaServiceStub.TablaAmortizacionRequest;
import com.amortizacion.GenerarTablaServiceStub.TablaAmortizacionResponse;
import com.buro.BuroServiceStub;
import com.buro.BuroServiceStub.ConsultarBuroRequest;
import com.buro.BuroServiceStub.ConsultarBuroResponse;

import dao.AmortizacionDao;

/**
 *  PresupuestoServiceSkeleton java skeleton for the axisService
 */
public class PresupuestoServiceSkeleton {
	
	private AmortizacionDao amortizacionDao;
    /**
     * Auto generated method signature
     *
     * @param presupuestoRequest
     * @return presupuestoResponse
     */
    public com.soa.PresupuestoResponse presupuestoOperation(
        com.soa.PresupuestoRequest presupuestoRequest) {
    	PresupuestoResponse response = new PresupuestoResponse();
    	
    	boolean tarjetaValida = isValid( presupuestoRequest.getNoTarjeta());
    	
    	
    	System.out.println( "Su Tarjeta fue: " +  tarjetaValida);
    	if( tarjetaValida)
    	{
    		int folio = presupuestoRequest.getFolio();
    		boolean aceptado = wasAccept( folio);
        	System.out.println( "Su estatus de su credito fue: " +  aceptado);
        	if( aceptado)
        	{
        		Amortizacion_type0[] amortzaciones = getAmortizaciones( presupuestoRequest);
        		System.out.println("Longitud de amortisaciones: " + amortzaciones.length);
        		if( amortzaciones != null);
        		{
        			for( int i = 0; i < amortzaciones.length; i++)
        			{
        				amortizacionDao.add( amortzaciones[i]);
        			}
        			
        			AmortizacionTable_type0 tabla = new AmortizacionTable_type0();
        			//cambiar list por array
        			List< com.soa.Amortizacion_type0> auxAmoriti = amortizacionDao.getAmortizacionBySolicitud( amortzaciones[0]);
        			com.soa.Amortizacion_type0 amortization[] = new com.soa.Amortizacion_type0[ auxAmoriti.size()];
        			for( int i = 0; i < auxAmoriti.size(); i++)
        			{
        				amortization[i] = auxAmoriti.get( i);
        			}
        			tabla.setAmortizacion( amortization);
        			response.setAmortizacionTable( tabla);	
        		}
        	}
        	return response;
    	}
    	return response;
    }
    private boolean isValid( String noTarjeta)
    {
    	
		try {
			ValidarTarjetaServiceStub stubTarjeta = new ValidarTarjetaServiceStub("http://localhost:8080/axis2/services/ValidarTarjetaService");
	    	RequestValidarTarjeta requestTarjeta = new RequestValidarTarjeta();
	    	requestTarjeta.setTarjeta( noTarjeta);
	    	ResponseValidarTarjeta responseTarjeta;
			responseTarjeta = stubTarjeta.validarTarjetaOperation( requestTarjeta);
			System.out.println( "Peticion tarjeta hecha con exito");
			return responseTarjeta.getValidacion();} 
		catch (RemoteException e) 
		{
			e.printStackTrace();
			System.out.println( "Hubo un error en la peticion de tarjeta");
			return false;
		}
    }
    private boolean wasAccept( int folio) {
    	try 
    	{
    		BuroServiceStub buroStub = new BuroServiceStub("http://localhost:8080/axis2/services/buroService");
        	ConsultarBuroRequest requestBuro = new ConsultarBuroRequest();
        	requestBuro.setId_folio( folio);
			ConsultarBuroResponse responseBuro = buroStub.buroOperation( requestBuro);
			System.out.println( "Peticion buro hecha con exito");
			return  responseBuro.getAprobado();
		} 
    	catch (RemoteException e) 
    	{
			e.printStackTrace();
			System.out.println( "Hubo un error en la peticion de buro");
			return false;
		}
    }
    private Amortizacion_type0[] getAmortizaciones( PresupuestoRequest request) {
    	try
    	{
    		GenerarTablaServiceStub amortizacionStub = new GenerarTablaServiceStub("http://localhost:8080/axis2/services/generarTablaService");
    		TablaAmortizacionRequest requestAmor = new TablaAmortizacionRequest();
    		requestAmor.setNo_solicitud( request.getFolio());
    		requestAmor.setPlazo( request.getPlazo());
    		requestAmor.setCapital( request.getMonto());
    		requestAmor.setInteres( request.getInteres());
    		TablaAmortizacionResponse responseAmor = amortizacionStub.generarTablaOperation( requestAmor);
			System.out.println( "Peticion de amortizacion hecha con exito");
    		return responseAmor.getAmortizacionTable().getAmortizacion();	
    	}
    	catch(RemoteException e)
    	{
    		e.printStackTrace();
			System.out.println( "Hubo un error en la peticion de amortizacion");
			return null;
    	}
    	
    }
	public void setAmortizacionDao(AmortizacionDao amortizacionDao) {
		this.amortizacionDao = amortizacionDao;
	}
}