package contas;

import java.util.List;

public class ContaEspecial extends Conta {

	private double limite;
	private List<Cliente> clientes;
	
	public ContaEspecial() {}	
	public ContaEspecial(long numero, double saldo, Agencia agencia, double limite, List<Cliente> clientes) {
		super(numero, saldo, agencia);
		this.limite = limite;
		this.clientes = clientes;
	}
	@Override
	public double debita(double valor) {
		if(valor <= getSaldo()+limite) {
			setSaldo(getSaldo() - valor);
			return getSaldo();
		}
		return -1;
	}

	public String toString() {
		String aux = "";
		for (Cliente cliente : clientes) {
			if(cliente != null) {
				aux += cliente.toString() + "\n";
			}
		}
		return super.toString() + "\nLimite:" + limite + "\n" + aux;
	}
	
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	

}
