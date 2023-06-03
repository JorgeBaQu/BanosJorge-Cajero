package dto;

public class CuentaDTO {
private int iban;
private int saldo;
public CuentaDTO(int iban, int saldo) {
	
	this.iban = iban;
	this.saldo = saldo;
}
public CuentaDTO() {
	
}
public int getIban() {
	return iban;
}
public void setIban(int iban) {
	this.iban = iban;
}
public int getSaldo() {
	return saldo;
}
public void setSaldo(int saldo) {
	this.saldo = saldo;
}

}
