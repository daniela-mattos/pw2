package testes;

import java.util.HashSet;
import java.util.Set;

import dao.AutorDAO;
import eagerlasy.Usuario;

public class TesteEager {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		Set<String> emails = new HashSet<>();
		emails.add("email@gmail.com");
		emails.add("email2@gmail.com");
		
		user.setEmails(emails);
		//cadastrar no banco
		if (new UsuarioDAO().salvar(user))
			System.out.print("\nNovo Autor e livros salvos!!!");
	}
//classes incompletas, tem que criar e completar depois
}
