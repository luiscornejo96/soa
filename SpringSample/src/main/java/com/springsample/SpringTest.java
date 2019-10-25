package com.springsample;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.springsample.dao.UsuarioDao;
import com.springsample.dto.UsuarioDto;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context = null; // Context for creating beans.
		DataSourceTransactionManager txManagerJDBC = null;
		DefaultTransactionDefinition def = null;
		TransactionStatus status = null;
		context = new ClassPathXmlApplicationContext("context.xml");
		txManagerJDBC = (DataSourceTransactionManager) context.getBean("transactionManager");
		try 
		{
			def = new DefaultTransactionDefinition();
			def.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);
			status = txManagerJDBC.getTransaction(def);
		} 
		catch (Exception e) 
		{
			System.out.println("Error en definición de transacción: " + e.getMessage());
			return;
		}
		UsuarioDao usuarioDao = (UsuarioDao) context.getBean("usuarioDao");
		UsuarioDto usuarioDto = new UsuarioDto();
		usuarioDto.setLogin("prueba");
		usuarioDto.setPassword("pwd");
		
		UsuarioDto usuarioDto2 = new UsuarioDto();
		usuarioDto2.setLogin("prueba2");
		usuarioDto2.setPassword("pwd2");
		try 
		{
			usuarioDto.setLogin("prueba");
            List<UsuarioDto> list = usuarioDao.queryRowMapper(usuarioDto);
            for (UsuarioDto usuarioDto3 : list) {
                System.out.println("id: " + usuarioDto3.getId() 
                + ", login: " + usuarioDto3.getLogin() 
                + ", password: " + usuarioDto3.getPassword());
            }
		} 
		catch (Exception e) 
		{
			System.out.println("Error en transacción: " + e.getMessage());
			txManagerJDBC.rollback(status);
			return;
		}
		// txManagerJDBC.rollback(status);
		txManagerJDBC.commit(status);
	}
}
