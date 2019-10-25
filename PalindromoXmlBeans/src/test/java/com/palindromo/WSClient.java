package com.palindromo;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.junit.Test;

public class WSClient {

	@Test
	public void test() throws RemoteException{
		
		ValidarPalindromoStub stub = new ValidarPalindromoStub("http://localhost:8080/axis2/services/validarPalindromo?wsdl");
		RequestDocument request = RequestDocument.Factory.newInstance();
		request.addNewRequest().setPalabra("ana");
		ResponseDocument response = stub.validarPalindromoOperation(request);
		System.out.println( response.xmlText());
		
	}

}
