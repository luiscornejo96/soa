package dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.amortizacion.GenerarTablaServiceStub.Amortizacion_type0;

public class AmortizacionDao {
	
	protected JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void add( Amortizacion_type0 amortizacion)
	{
		jdbcTemplate.execute( "INSERT INTO Amortizacion( id_solicitud, periodo, capital, interes, iva, mensualidad) "
				+ "VALUES( " + amortizacion.getId_solicitud() + "," + amortizacion.getPeriodo() + "," + amortizacion.getCapital() + "," 
				+ amortizacion.getInteres() + "," + amortizacion.getIva() + "," + amortizacion.getMensualidad() +  ")");
	}
	
	public List<com.soa.Amortizacion_type0> getAmortizacionBySolicitud( Amortizacion_type0 amortizacion){
		
		List<com.soa.Amortizacion_type0> list = jdbcTemplate.query( "SELECT * FROM Amortizacion WHERE id_solicitud = " +  amortizacion.getId_solicitud()
		, new BeanPropertyRowMapper( com.soa.Amortizacion_type0.class));
		
		return list;
	}
	
	

}