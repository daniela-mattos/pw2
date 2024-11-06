package testes;
import onetoone.*;
import dao.*;

public class TesteOneToOne_1 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("logradouro1", "complemento1");
		Pessoa pessoa = new Pessoa("Fulano", endereco);
		PessoaDAO objPessoaDAO = new PessoaDAO();
		if (objPessoaDAO.salvar(pessoa))
			System.out.print("Pessoa foi salva!!!");

		System.out.println("\nLISTAR TODOS");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());

		//criar o objeto Pessoa e definir o endereço usando o método setEndedereço
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Tisnoj");
		pessoa2.setEndereco(new Endereco("logradouro12", "complemento2"));
		
		//salvar o objeto Pessoa
		
		PessoaDAO objPessoaDAO2 = new PessoaDAO();
		if (objPessoaDAO2.salvar(pessoa2))
			System.out.print("Pessoa2 foi salva!!!");
		
		//*** mais otimizado
		if(new PessoaDAO().salvar(new Pessoa("Uijssl", new Endereco("logradouro12", "complemento2"))));
		
		
		//imprimir pra ver se salvou o objeto 
		
		System.out.println("\nLISTAR TODOS");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());

		
	}
}
