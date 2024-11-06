package testes;

import onetoone.*;
import dao.*;

public class TesteOneToOne_2 {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("logradouro1", "complemento1");
		
		Telefone telefone = new Telefone();
		telefone.setDdd(51);
		telefone.setNumero(33445566);
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fulano");
		pessoa.setEndereco(endereco);
		pessoa.setTelefone(telefone);
		telefone.setPessoa(pessoa);
		PessoaDAO objPessoaDAO = new PessoaDAO();
		if (objPessoaDAO.salvar(pessoa))
			System.out.print("Pessoa foi salva!!!");

		System.out.println("\nLISTAR TODOS");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());

		//criar o objeto Pessoa e inicializar seu telefone e endereço
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Ehsjlo");
		pessoa2.setEndereco(new Endereco("Log ejfkdk", "jdkeler"));
		
		Telefone telefone2 = new Telefone();
		telefone2.setDdd(22);
		telefone2.setNumero(98989898);
		
		pessoa2.setTelefone(telefone2);
		telefone2.setPessoa(pessoa2);
				
		//salvar objeto no banco
	
		if (objPessoaDAO.salvar(pessoa2))
			System.out.print("Pessoa2 foi salva!!!");
		
		//listar todos
		System.out.println("\nLISTAR TODOS FINAL");
		for (Pessoa p : objPessoaDAO.buscarTodos())
			System.out.printf(p.toString());
	}
}
