import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Test;

import com.nombre.CalcularServiceStub;
import com.nombre.RequestLuisCornejoDocument;
import com.nombre.RequestLuisCornejoDocument.RequestLuisCornejo;
import com.nombre.ResponseLuisCornejoDocument;

public class TestYear {

	@Test
	public void test() throws RemoteException {
		
		CalcularServiceStub stub = new CalcularServiceStub("http://localhost:8080/axis2/services/CalcularService");
		RequestLuisCornejoDocument request = RequestLuisCornejoDocument.Factory.newInstance();
		RequestLuisCornejo aux = request.addNewRequestLuisCornejo();
		aux.setYear(1990);
		aux.setMonth(8);
		aux.setDay(12);
		ResponseLuisCornejoDocument response = stub.calcularOperation(request);
		String edad = response.getResponseLuisCornejo().getAge();
		System.out.println(edad);

	}

}
