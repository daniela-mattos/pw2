package agenda;

import java.util.Iterator;
import java.util.TreeSet;

import pessoas.Pessoa;

public class Agenda implements OperacoesAgenda<Pessoa> {

	private TreeSet<Pessoa> pessoas;

	public Agenda() {
		//inicializar o conjunto
		pessoas = new TreeSet<>();
	};
	
	@Override
	public boolean cadastrar(Pessoa pessoa) {
		return pessoas.add(pessoa);
	}

	@Override
	public String listarTodos() {
		String aux = "";
		for (Pessoa pessoa : pessoas) {
			if(pessoa != null)
				aux += pessoa.toString() + "\n";
		}
		return aux;
	}

	@Override
	public Integer totalizar() {
		return pessoas.size();
	}

	@Override
	public boolean pesquisar(Pessoa pessoa) {
		return pessoas.contains(pessoa);
	}

	@Override
	public boolean remover(Pessoa pessoa) {
		return pessoas.remove(pessoa);
	}

	

	
}
