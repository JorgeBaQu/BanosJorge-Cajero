package logica;

import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import dao.*;
import dto.*;

public class Logica {
	TarjetaDAO t = new TarjetaDAO();
	CuentaDAO c = new CuentaDAO();
	UsuarioDAO u = new UsuarioDAO();
	public boolean checkLogin(String user, char[] pass) {
		
		TarjetaDTO tarjeta = t.conseguirTarjeta(Integer.parseInt(user));
		String contra = new String(pass);
		if(tarjeta!=null) {
		if(user.equals(Integer.toString(tarjeta.getNumero()))&&contra.equals(tarjeta.getPin())) {
			
		return true;
		}else {
			return false;
		}
		}else return false;
	}
	
public boolean checkLoginAdmin(String user, char[] pass) {
		
		
		if(user.equals("hola")) {
		return true;
		}else {
			return false;
		}
	}
	
public boolean comprobarSaldo(String user, String dinero) {
	
	if(Integer.parseInt(dinero)>1000) {
		return false;
	}else return true;
	
}

public boolean borrarUser(String user) {
	if(u.eliminarUsuario(user) ==1) {
		return true;
	}
	return false;
}

public boolean borrarTarjeta(String numero) {
	if(t.eliminarTarjeta(numero)==1) {
		return true;
		}else return false;
}
public boolean crearCuenta(String cuenta,String saldo) {
	if(c.crearCuenta(cuenta,saldo)==1) {
		return true;
	}else return false;
}

public boolean borrarCuenta(String cuenta) {
	if(c.borrarCuenta(cuenta)==1) {
		return true;
	}else return false;
}
public boolean crearUser(UsuarioDTO us) {
	if(u.anadirUsuario(us)==1) {
		return true;
	}else return false;
}
public boolean modificarUser(String nombre, String apellido1, String apellido2, String telefono, String email, String direccion, String dni, String contrasena) {
	if(u.modificarUsuario( nombre,  apellido1,  apellido2,  telefono,  email,  direccion,  dni,  contrasena)==1) {
		return true;
	}else return false;
}
public boolean modificarTarjeta(String numero,String limiteD, String limiteM,String pin, String tipo) {
	if(t.modificarTarjeta(numero, limiteD, limiteM, pin, tipo)==1) {
	return true;
	}else return false;
}

public boolean crearTarjeta(String numero, String limiteD, String limiteM, String pin, String tipo, String cuenta,
		String cliente) {
	if(t.anadirTarjeta(numero, limiteD, limiteM, pin, tipo, cuenta, cliente)==1) {
		return true;
	}
	else return false;
}

public void mostrarSaldo(JLabel saldo,String nTarjeta) {
	CuentaDAO c = new CuentaDAO();
	System.out.println();
	CuentaDTO cu= c.conseguirCuenta(Integer.parseInt(nTarjeta));
	saldo.setText(Integer.toString(cu.getSaldo()));
}

public void mostrarHistorial(JTextArea historial) {
	historial.setText("hola");
	
}
	
}
