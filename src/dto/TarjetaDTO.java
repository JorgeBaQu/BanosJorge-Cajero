package dto;

public class TarjetaDTO {
private String pin;
private int numero;
private String tipo;
private int limiteD;
private int limiteM;
private int cuenta;
private int cliente;
public TarjetaDTO(String pin, int numero, String tipo, int limiteD, int limiteM, int cuenta, int cliente) {
	this.pin = pin;
	this.numero = numero;
	this.tipo = tipo;
	this.limiteD = limiteD;
	this.limiteM = limiteM;
	this.cuenta = cuenta;
	this.cliente = cliente;
}
public String getPin() {
	return pin;
}
public void setPin(String pin) {
	this.pin = pin;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public int getLimiteD() {
	return limiteD;
}
public void setLimiteD(int limiteD) {
	this.limiteD = limiteD;
}
public int getLimiteM() {
	return limiteM;
}
public void setLimiteM(int limiteM) {
	this.limiteM = limiteM;
}
public int getCuenta() {
	return cuenta;
}
public void setCuenta(int cuenta) {
	this.cuenta = cuenta;
}
public int getCliente() {
	return cliente;
}
public void setCliente(int cliente) {
	this.cliente = cliente;
}
}
