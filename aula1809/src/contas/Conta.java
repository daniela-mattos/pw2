package contas;

public abstract class Conta {
	
	private double saldo;
	private long numero;
	private Agencia agencia;
	
	public Conta() {}
	public Conta(long numero, double saldo, Agencia agencia) {
		this.numero = numero;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	
	public double credita(double valor) {
		saldo += valor;
		return saldo;
	}
	public abstract double debita(double valor);
	
	@Override
	public String toString() {
		return "Conta\n Numero=" + numero 
				+ "\nSaldo:  " + saldo 
				+ "\nAgencia= " + (agencia!=null?agencia.toString():"Agência inválida") + "]";
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public Agencia getAgencia() {
		return agencia;
	}
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	

	
}
