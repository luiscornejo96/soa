/**
 * SaludarServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.9  Built on : Nov 16, 2018 (12:05:37 GMT)
 */
package edu.itq.soa.hw;

import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;

/**
 *  SaludarServiceSkeleton java skeleton for the axisService
 */
public class SaludarServiceImpl extends SaludarServiceSkeleton {
    private UsuarioDao usuarioDao;

    /**
     * Auto generated method signature
     *
     * @param request
     * @return response
     */
    public Response saludarOperation(Request request) {
        Response response = new Response();
        UsuarioDto usuarioDto = new UsuarioDto();
        usuarioDto.setLogin(request.getNombre());
        usuarioDto.setPassword("pwd" + request.getNombre());
        usuarioDao.add(usuarioDto);
        
        response.setMensaje("hola mundo " + request.getNombre());
        return response;
    }

    /**
     * @param usuarioDao the usuarioDao to set
     */
    public void setUsuarioDao(UsuarioDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}
