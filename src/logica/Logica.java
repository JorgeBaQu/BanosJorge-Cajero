package logica;

public class Logica {

	public boolean checkLogin(String user, char[] pass) {
		
		if(user.equals("hola")) {
		return true;
		}else {
			return false;
		}
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
	return true;
}

public boolean borrarTarjeta(String user) {
	return true;
}

public boolean borrarCuenta(String user) {
	return true;
}
public boolean crearUser() {
	return true;
}

	
}
