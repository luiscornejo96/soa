/**
 * GenerarTablaServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package com.soa;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.palindromo.ValidarPalindromoStub;
import com.palindromo.ValidarPalindromoStub.Request;
import com.palindromo.ValidarPalindromoStub.Response;

/**
 *  GenerarTablaServiceSkeleton java skeleton for the axisService
 */
public class GenerarTablaServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param tablaAmortizacionResponse
     * @return tablaAmortizacionResponse0
     */
    public com.soa.TablaAmortizacionResponse generarTablaOperation(
        com.soa.TablaAmortizacionResponse tablaAmortizacionResponse) {
        TablaAmortizacionResponse resp = new TablaAmortizacionResponse();
        Ack_type0 ack = new Ack_type0();
        ack.setCode("0");
        try {
            ValidarPalindromoStub stub = new ValidarPalindromoStub();
            Request request = new Request();
            request.setPalabra("algo");
            Response response = stub.validarPalindromoOperation(request);
            ack.setDescription("desc" + response.getEsPalindromo());
        } catch (RemoteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            ack.setDescription("desc");
        }
        
        resp.setAck(ack);
        AmortizationTable_type0 tabla = new AmortizationTable_type0();
        Amortization_type0[] amortizaciones = new Amortization_type0[2];
        amortizaciones[0] = new Amortization_type0();
        amortizaciones[0].setNo(1);
        amortizaciones[0].setCapital(1);
        amortizaciones[0].setInteres(1);
        amortizaciones[1] = new Amortization_type0();
        amortizaciones[1].setNo(2);
        amortizaciones[1].setCapital(2);
        amortizaciones[1].setInteres(2);
        tabla.setAmortization(amortizaciones);
        resp.setAmortizationTable(tabla );
        return resp;
    }
}
