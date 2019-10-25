package com.ValidarTarjeta;

import edu.itq.soa.RequestValidarTarjeta;
import edu.itq.soa.ResponseValidarTarjeta;

public class ValidarTarjetaServiceImpl extends ValidarTarjetaServiceSkeleton{

    public ResponseValidarTarjeta validarTarjetaOperation
     (
     RequestValidarTarjeta requestValidarTarjeta
     )
{
   //TODO : fill this with the necessary business logic
    	 ResponseValidarTarjeta response =new ResponseValidarTarjeta();
		 String input=requestValidarTarjeta.getTarjeta().toString();
		 
		 response.setValidacion(esValido(input));
		 
		 return response;
 }
    public boolean esValido(String tarjeta) {
    	 boolean valido=true;;
	   	 char[] a=tarjeta.toCharArray();
	   	 for(int i=0;i<a.length;i++) {
	   		 if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122)) {
	   			 valido=false;
	   					 break;
	   		 }
	   	 }
	   	 if(valido==true) {
	   	 	if(tarjeta.equals("1111-1111-1111-1111")||tarjeta.equals("0000-0000-0000-0000") ) {
	   	 		valido=false;
	   	 	}else {
	   	 		valido=true;
	   	 	}
	   	 	    }
	   	return valido;
    }
}
