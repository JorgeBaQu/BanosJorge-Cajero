package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import conectar.Conectar;

public class MovimientosDAO {
	private Conectar con= null;
	private PreparedStatement ps= null;
	private ResultSet rs = null;
	public void insertarMovimiento(int cuenta, String transferencia) {
		this.con= new Conectar();
		
		try {
		Connection c = con.getConnect();
		ps = c.prepareStatement("insert into movimientos(cuenta,transferencia) values(?,?)");
		ps.setInt(1, cuenta);
		ps.setString(2, transferencia);
		ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
	}
	
	
	public ArrayList<String> mostrarMovimientos(String cuenta){
		ArrayList<String> movimientos = new ArrayList<String>();
this.con= new Conectar();
		
		try {
		Connection c = con.getConnect();
		ps = c.prepareStatement("select transferencia from movimientos where cuenta = ?");
		ps.setInt(1,Integer.parseInt(cuenta));
		rs= ps.executeQuery();
		
		
		while(rs.next()) {
			movimientos.add(rs.getString("transferencia"));
		}
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		
		
		
		return movimientos;
	}
}
