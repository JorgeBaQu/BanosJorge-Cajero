package logica;

import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import dao.*;
import dto.*;

import java.util.ArrayList;
import java.util.Date;

public class Logica {
	TarjetaDAO t = new TarjetaDAO();
	CuentaDAO c = new CuentaDAO();
	UsuarioDAO u = new UsuarioDAO();
	MovimientosDAO m = new MovimientosDAO();
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
		UsuarioDTO admin = u.conseguirUsuario(user);;
		String contra = new String(pass);
		if(user.equals(admin.getDni())&&contra.equals(admin.getPass())&&admin.getAdmin()==1) {
		return true;
		}else {
			return false;
		}
	}

public boolean ingresarSaldo(String user, String dinero,JLabel saldo) {
	String saldoRestante = saldo.getText();
	TarjetaDTO tarjeta= new TarjetaDTO();
	Date date = new Date();
		int nuevoSaldo=Integer.parseInt(saldoRestante)+Integer.parseInt(dinero);
		if(c.actualizarSaldo(nuevoSaldo, user)==1) {
			tarjeta=t.conseguirTarjeta(Integer.parseInt(user));
			String movimiento = date+" +"+dinero+"€";
			m.insertarMovimiento(tarjeta.getCuenta(), movimiento);
		this.mostrarSaldo(saldo, user);
		return true;
		}else return false;
	
}
	
public boolean retirarSaldo(String user, String dinero,JLabel saldo) {
	String saldoRestante = saldo.getText();
	TarjetaDTO tarjeta= new TarjetaDTO();
	Date date = new Date();
	
	if(Integer.parseInt(dinero)<Integer.parseInt(saldoRestante)) {
		int nuevoSaldo=Integer.parseInt(saldoRestante)-Integer.parseInt(dinero);
		if(c.actualizarSaldo(nuevoSaldo, user)==1) {
		tarjeta=t.conseguirTarjeta(Integer.parseInt(user));
		String movimiento = date+" -"+dinero+"€";
		m.insertarMovimiento(tarjeta.getCuenta(), movimiento);
		this.mostrarSaldo(saldo, user);
		return true;
		}else return false;
	}else return false;
	
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

public void mostrarHistorial(JTextArea historial,String user) {
	String movimientos ="";
	ArrayList<String> mov= m.mostrarMovimientos(user);
	for(int i = 0;i<mov.size();i++) {
		movimientos= movimientos+mov.get(i)+"\n";
		historial.setText(movimientos);
	}
	
}

public boolean cambiarPin(String tarjeta,String pin) {
	
	if(t.cambiarPin(tarjeta,pin)==1) {
	return true;
	}else return false;
}
	
}
