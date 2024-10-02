package contato;

import java.util.Objects;

public class Telefone extends Contato {
	private Integer ddd;
	private long numero;
	
	public Telefone() {};
	public Telefone(Integer ddd, long numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public Integer getDdd() {
		return ddd;
	}
	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Telefone (" + ddd + ") " + numero;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ddd, numero);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(ddd, other.ddd) && numero == other.numero;
	}
	

}
