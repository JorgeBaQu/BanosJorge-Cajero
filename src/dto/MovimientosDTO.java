package dto;

public class MovimientosDTO {
private int cuenta;
private int codigo;
private String transferencia;
public MovimientosDTO(int cuenta, int codigo, String transferencia) {
	
	this.cuenta = cuenta;
	this.codigo = codigo;
	this.transferencia = transferencia;
}
public int getCuenta() {
	return cuenta;
}
public void setCuenta(int cuenta) {
	this.cuenta = cuenta;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public String getTransferencia() {
	return transferencia;
}
public void setTransferencia(String transferencia) {
	this.transferencia = transferencia;
}
}
