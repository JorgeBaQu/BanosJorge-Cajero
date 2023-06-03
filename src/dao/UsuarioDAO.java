package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conectar.Conectar;

import dto.UsuarioDTO;

public class UsuarioDAO {
	private Conectar con= null;
	private PreparedStatement ps= null;
	private ResultSet rs = null;
	
	
	
	
	public int anadirUsuario(UsuarioDTO user) {
		this.con=new Conectar();
		int n=2;
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("insert into clientes values( ?,?,?,?,?,?,?,?,?)");
		ps.setString(1,user.getNombre());
		ps.setString(2,user.getApellido1());
		ps.setString(3, user.getApellido2());
		ps.setString(4,user.getTelefono());
		ps.setString(5, user.getEmail());
		ps.setString(6,user.getDireccion());
		ps.setString(7,user.getDni());
		ps.setString(8,user.getPass());
		ps.setInt(9,user.getAdmin());
		
		
		 n = ps.executeUpdate();
	
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	public int modificarUsuario(String nombre, String apellido1, String apellido2, String telefono, String email, String direccion, String dni, String contrasena) {
		this.con=new Conectar();
		int n=2;
		try {
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("update clientes set nombre=? , apellido1=? , apellido2=?,telefono=?,email=? ,direccion=?, dni=?, contrasena=? where dni = ? ");
		ps.setString(1,nombre);
		ps.setString(2,apellido1);
		ps.setString(3,apellido2);
		ps.setString(4,telefono);
		ps.setString(5,email);
		ps.setString(6,direccion);
		ps.setString(7,dni);
		ps.setString(8,contrasena);
		ps.setString(9,dni);
		
		 n = ps.executeUpdate();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	public int eliminarUsuario(String dni) {
		this.con=new Conectar();
		int n=2;
		try {
		
		Connection c = con.getConnect();
		
		ps = c.prepareStatement("delete from clientes where dni=?");
		ps.setString(1, dni);
		
		 n = ps.executeUpdate();
		
		}catch(Exception e) {
			System.out.println(e);
		}finally{
			con.cerrarConexion(rs, con.getConnect(), ps);
		}
		return n;
	}
	
}
