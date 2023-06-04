package dto;

public class UsuarioDTO {
private String nombre;
private String apellido1;
private String apellido2;
private String telefono;
private String email;
private String direccion;
private String dni;
private String pass;
private int admin;

public UsuarioDTO(String nombre, String apellido1, String apellido2, String telefono, String email, String direccion,
		String dni, String pass) {
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.telefono = telefono;
	this.email = email;
	this.direccion = direccion;
	this.dni = dni;
	this.pass = pass;
	this.admin=0;
}
public UsuarioDTO(String nombre, String apellido1, String apellido2, String telefono, String email, String direccion,
		String dni, String pass,int admin) {
	this.nombre = nombre;
	this.apellido1 = apellido1;
	this.apellido2 = apellido2;
	this.telefono = telefono;
	this.email = email;
	this.direccion = direccion;
	this.dni = dni;
	this.pass = pass;
	this.admin=admin;
}

public UsuarioDTO() {
	
}

public int getAdmin() {
	return admin;
}

public void setAdmin(int admin) {
	this.admin = admin;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido1() {
	return apellido1;
}

public void setApellido1(String apellido1) {
	this.apellido1 = apellido1;
}

public String getApellido2() {
	return apellido2;
}

public void setApellido2(String apellido2) {
	this.apellido2 = apellido2;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
}
