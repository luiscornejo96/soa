import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.temperatura.RequestCelsiusDocument;
import com.temperatura.ResponseFarenheitDocument;
import com.temperatura.ValidarTemperaturaServiceStub;

public class TestTemperatura {

	@Test
	public void test() throws RemoteException  {
		
		ValidarTemperaturaServiceStub stub = new ValidarTemperaturaServiceStub("http://localhost:8080/axis2/services/validarTemperaturaService");
		RequestCelsiusDocument req = RequestCelsiusDocument.Factory.newInstance();
		req.addNewRequestCelsius().setTempCelcius(100);
		ResponseFarenheitDocument response = stub.validarTemperaturaOperation(req);
		double temp = response.getResponseFarenheit().getTempFarenheit();
		System.out.println(temp); 
		
	}

}
