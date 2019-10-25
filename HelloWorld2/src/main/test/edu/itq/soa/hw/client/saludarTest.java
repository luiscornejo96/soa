package edu.itq.soa.hw.client;
import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import edu.itq.soa.hw.client.SaludarServiceStub.Request;
import edu.itq.soa.hw.client.SaludarServiceStub.Response;

public class saludarTest {

	@Test
	public void test() throws RemoteException{
		SaludarServiceStub stub = new SaludarServiceStub();
		Request request = new Request();
		request.setNombre("holis");
		Response response = stub.saludarOperation(request);
		//assertEquals("Hola Mundo holis", response.getMensaje());
		System.out.println(response.getMensaje());
	}

}
