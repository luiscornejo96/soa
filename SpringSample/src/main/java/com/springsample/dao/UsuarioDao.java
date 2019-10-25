package com.springsample.dao;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springsample.dto.UsuarioDto;

public class UsuarioDao {
	/**
	* Template para manejo de BD de Spring.
	*/
	private static final String ID = "id";
	private static final String LOGIN = "login";
	private static final String PASSWORD = "password";
	
	protected JdbcTemplate jdbcTemplate;
	/**
	* Establece el template.
	* @param jdbcTemplate
	*/
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) 
	{
		this.jdbcTemplate = jdbcTemplate;
	}
	/**
	* Agrega un usuario en la BD.
	* @param usuarioDto Usuario a agregar.
	*/
	public void add(UsuarioDto usuarioDto) 
	{
		jdbcTemplate.execute("INSERT INTO Usuario(login, password) VALUES('"
				+ usuarioDto.getLogin() + "', '" + usuarioDto.getPassword()
				+ "')");
	}
	
	public void delete( UsuarioDto usuarioDto)
	{
		jdbcTemplate.execute( "DELETE FROM Usuario WHERE login = '" + usuarioDto.getLogin() + "'");
	}
	
	public void  update( UsuarioDto usuarioDto)
	{
		jdbcTemplate.execute( "UPDATE Usuario set password = '" + usuarioDto.getPassword() + "' WHERE login = '" +  usuarioDto.getLogin() + "'");
	}
	public void getAllUser()
	{
		jdbcTemplate.execute( "SELECT * FROM Usuario");
	}
	public java.util.List<UsuarioDto> getUserByLogin( UsuarioDto usuarioDto)
	{
		List<UsuarioDto> resultado = null;
		List<LinkedHashMap< String, Object>> list = jdbcTemplate.queryForList( " SELECT id, login, password FROM Usuario WHERE login = '" + usuarioDto.getLogin() + "'");
		if( list.size() > 0)
		{
			resultado = new ArrayList<UsuarioDto>();
			for (LinkedHashMap<String, Object> aux : list) {
				UsuarioDto user = new UsuarioDto( (int) aux.get(ID), String.valueOf(aux.get( LOGIN)), String.valueOf(aux.get( PASSWORD)));
				resultado.add( user);
			}
		}
		return resultado;
	}
	 /**
     * Consulta usuarios que coincidan con el criterio.
     * @param usuarioDto Usuario a agregar.
     */
    public List<UsuarioDto> queryRowMapper(UsuarioDto usuarioDto) {
        List<UsuarioDto> resultList = jdbcTemplate.query(
                "SELECT id, login, password FROM Usuario WHERE login = '"
                        + usuarioDto.getLogin() + "'", 
                        new BeanPropertyRowMapper(UsuarioDto.class));
        
        return resultList;
    }
}
