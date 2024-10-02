package pessoas;

import contato.Contato;
import listas_slides.Cpf;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;
	private String cpf;
	private Contato contato;
	
	public Pessoa() {};
	public Pessoa(String nome, String cpf, Contato contato) {
		this.nome = nome;
		this.cpf = cpf;
		this.contato = contato;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	
	@Override
	public String toString() {
		return "Pessoa nome: " + nome + ", cpf: " + cpf + ", telefone: " + contato;
	}
	@Override
	public int compareTo(Pessoa objeto) {
		return nome.compareToIgnoreCase(objeto.getNome());
	}
	
	
}
