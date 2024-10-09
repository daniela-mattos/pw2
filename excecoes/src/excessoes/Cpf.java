package excessoes;

import java.io.Serializable;

public final class Cpf implements Serializable {
	private long numero;
	private int digito;

	public Cpf() {}
	public Cpf(long numero, int digito) {
		this.numero = numero;
		this.digito = digito;
	}

	//declarar o método valida como final?
	public final boolean valida() {
		return true;
	}
	
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	
	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	@Override
	public String toString() {
		return "Cpf:" + numero + "-" + digito;
	}
}