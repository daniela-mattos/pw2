package testes;

import manytomany.*;
import onetoone.Pessoa;
import dao.*;
import java.util.*;

public class TesteManyToMany {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Java 11", 2019, "Editora X" );
		Livro livro2 = new Livro("JPA", 2029, "Editora Y" );
		List<Livro> livros = new LinkedList<>();
		livros.add(livro1);
		livros.add(livro2);
		
		Autor autor = new Autor();
		autor.setNome("Fulano");
		autor.setLivros(livros);
		if (new AutorDAO().salvar(autor))
			System.out.print("Autor e livros salvos!!!");
		
		//criar um autor e seus livros
		Livro lvr1 = new Livro("BD", 2019, "Editora 1" );
		Livro lvr2 = new Livro("OLP", 2020, "Editora 1" );
		List<Livro> lvrList = new LinkedList<>();
		lvrList.add(lvr1);
		lvrList.add(lvr2);
		
		Autor atr = new Autor();
		atr.setNome("Aiuthl");
		atr.setLivros(lvrList);
				
		//cadastrar no banco
		AutorDAO autoresDAO = new AutorDAO();
		if (autoresDAO.salvar(atr))
			System.out.print("\nNovo Autor e livros salvos!!!");
		
		//listar todos
		//*** em manytomany tem que cuidar ao listar, pra um objeto não chamar o outro e dar stack overflow
		System.out.println("\nLISTAR TODOS");
		for (Autor a : autoresDAO.buscarTodos())
			System.out.printf(a.toString());
	}
}
