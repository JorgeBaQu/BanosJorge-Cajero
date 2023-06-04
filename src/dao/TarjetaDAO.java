package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conectar.Conectar;

import dto.TarjetaDTO;

public class TarjetaDAO {
	private Conectar con= null;
	private PreparedStatement ps= null;
	private ResultSet rs = null;
	
	
	public TarjetaDTO conseguirTarjeta(int numero){
		this.con=new Conectar();
		TarjetaDTO tarjeta = null;
		
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("select * from tarjetas where numero = ?");
		ps.setInt(1, numero);
		rs = ps.executeQuery(); 
		
		if(rs.next()) {
			tarjeta = new TarjetaDTO(rs.getString("pin"),rs.getInt("numero"),rs.getString("tipo"),rs.getInt("limite_diario"),rs.getInt("limite_mensual"),rs.getInt("cuenta"),rs.getInt("cliente"));
		}
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return tarjeta;
}
	
	public int anadirTarjeta(String numero, String limiteD, String limiteM, String pin, String tipo, String cuenta, String cliente) {
		this.con=new Conectar();
		int n=2;
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("insert into tarjetas values( ?,?,?,?,?,?,?)");
		ps.setString(1, pin);
		ps.setInt(2,Integer.parseInt(numero));
		ps.setString(3, tipo);
		ps.setInt(4,Integer.parseInt(limiteD));
		ps.setInt(5, Integer.parseInt(limiteM));
		ps.setInt(6, Integer.parseInt(cuenta));
		ps.setString(7, cliente);
		
		
		 n = ps.executeUpdate();
		 
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	public int modificarTarjeta(String numero, String limiteD, String limiteM, String pin, String tipo) {
		this.con=new Conectar();
		int n=2;
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("update tarjetas set pin=?,numero=?,tipo=?,limite_diario=?,limite_mensual=?  where numero =? ");
		ps.setString(1, pin);
		ps.setInt(2,Integer.parseInt(numero));
		ps.setString(3, tipo);
		ps.setInt(4,Integer.parseInt(limiteD));
		ps.setInt(5, Integer.parseInt(limiteM));
		ps.setInt(6, Integer.parseInt(numero));
		
		 n = ps.executeUpdate();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	public int eliminarTarjeta(String numero) {
		this.con=new Conectar();
		int n=2;
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("delete from tarjetas where numero=?");
		ps.setInt(1, Integer.parseInt(numero));
		
		 n = ps.executeUpdate();
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	
	public int cambiarPin(String tarjeta,String pin) {
		this.con = new Conectar();
		int n=2;
		try {
			
			Connection c = con.getConnect();
			
			ps = c.prepareStatement("update tarjetas set pin = ? where numero=?");
			ps.setString(1, pin);
			ps.setInt(2, Integer.parseInt(tarjeta));
			 n = ps.executeUpdate();
			
			}catch(Exception e) {
				System.out.println(e);
			}finally{
				con.cerrarConexion(rs, con.getConnect(), ps);
			}
		return n;
	}
	
}
