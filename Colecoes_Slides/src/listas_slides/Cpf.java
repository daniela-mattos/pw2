package listas_slides;

public class Cpf {
	private long numero;
	private int digito;
		
	public Cpf() {}
	public Cpf(long numero, int digito) {
		this.setNumero(numero);
		this.digito = digito;
	}

	//declarar o método valida como final?
	public final boolean valida() {
		return true;
	}
	@Override
	public String toString() {
		return "Cpf:" + numero + "-" + digito;
	}
	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
}
