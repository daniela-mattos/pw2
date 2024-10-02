package listas_slides;

public class Cpf implements Comparable<Cpf> {
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
	
	@Override
	public int compareTo(Cpf cpf) {
		if(this.numero == cpf.getNumero()) return 0;
		if(this.numero > cpf.getNumero()) return 1;
		if(this.numero < cpf.getNumero()) return -1;
		
		return 0;
	}
}
