import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.rfc.CalcularRfcServiceStub;
import com.rfc.RequestLuisCorejoDocument;
import com.rfc.RequestLuisCorejoDocument.RequestLuisCorejo;
import com.rfc.ResponseLuisCornejoDocument;

public class TestFC {

	@Test
	public void test() throws RemoteException {
		CalcularRfcServiceStub stub = new CalcularRfcServiceStub("http://localhost:8080/axis2/services/CalcularRfcService");
		RequestLuisCorejoDocument request = RequestLuisCorejoDocument.Factory.newInstance();
		RequestLuisCorejo aux = request.addNewRequestLuisCorejo();
		aux.setNombre("Luis");
		aux.setApellidoPaterno( "xyz");
		aux.setApellidoMaterno( "Arreola");
		aux.setFechaNacimiento( "08/04/1997");
		ResponseLuisCornejoDocument response = stub.calcularOperation(request);
		String rfc = response.getResponseLuisCornejo().getRfc();
		System.out.print(" Tu rfc es: " + rfc);
	}

}
