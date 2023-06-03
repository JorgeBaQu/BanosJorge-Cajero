package dao;
import dto.CuentaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conectar.Conectar;

public class CuentaDAO {
	
	private Conectar con= null;
	private PreparedStatement ps= null;
	private ResultSet rs = null;
	
	
	public CuentaDTO conseguirCuenta(int cuent){
		 this.con = new Conectar();
		 CuentaDTO cuenta = null;
		try {
			Connection c = con.getConnect();
			 ps = c.prepareStatement("select * from cuentas c inner join tarjetas t on c.iban=t.cuenta where t.numero = ? ");
			 
			 ps.setInt(1, cuent);
			 rs = ps.executeQuery();
			if(rs.next()) {
			 int iban=rs.getInt("iban");
			 int saldo=rs.getInt("saldo");
			 cuenta = new CuentaDTO(iban,saldo);
			} 
			  
		}catch(Exception e) {
			System.out.println(e);
			  }
		finally {
			
			con.cerrarConexion(rs, con.getConnect(), ps);
			
		}
		return cuenta;
			
			 
	}
	public int borrarCuenta(String cuenta) {
		this.con = new Conectar();
		 int n=2;
		try {
			Connection c = con.getConnect();
			 ps = c.prepareStatement("delete from cuentas where iban = ? ");
			 
			 ps.setInt(1, Integer.parseInt(cuenta));
			n= ps.executeUpdate();
			
			  
		}catch(Exception e) {
			System.out.println(e);
			  }
		finally {
			
			con.cerrarConexion(rs, con.getConnect(), ps);
			
		}
		return n;
	}
	public int crearCuenta(String cuenta,String saldo) {
		this.con = new Conectar();
		 int n=2;
		try {
			Connection c = con.getConnect();
			 ps = c.prepareStatement("insert into cuentas (iban,saldo)values(?,?) ");
			 
			 ps.setInt(1, Integer.parseInt(cuenta));
			 ps.setInt(2, Integer.parseInt(saldo));
			n= ps.executeUpdate();
			
			  
		}catch(Exception e) {
			System.out.println(e);
			  }
		finally {
			
			con.cerrarConexion(rs, con.getConnect(), ps);
			
		}
		return n;
	}
	
}
