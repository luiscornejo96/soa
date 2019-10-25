/**
 * SaludarServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package edu.itq.soa.hw.server;

import edu.itq.soa.hw.Request;
import edu.itq.soa.hw.Response;

/**
 *  SaludarServiceSkeleton java skeleton for the axisService
 */
public class SaludarServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public Response saludarOperation(Request request) {
    	Response response = new Response();
    	response.setMensaje("Hello World " +  request.getNombre());
    	return response;
    	
    }
}
