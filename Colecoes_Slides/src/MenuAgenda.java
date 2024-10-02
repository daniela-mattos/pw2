import javax.swing.JOptionPane;

import agenda.Agenda;
import contato.Telefone;
import pessoas.Pessoa;

public class MenuAgenda {
	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		while (true) {
			switch (montaMenu()) {
			case 1:// Cadastrar uma pessoa
				String nome = JOptionPane.showInputDialog("informe o nome:");
				String cpf = JOptionPane.showInputDialog("informe o cpf:");
				int ddd = Integer.parseInt(JOptionPane.showInputDialog("informe o ddd:"));
				long numero = Long.parseLong(JOptionPane.showInputDialog("informe o número:"));
				Telefone fone = new Telefone(ddd, numero);
				//como cadastrar a pessoa?
				agenda.cadastrar(new Pessoa(nome, cpf, fone));
								
				break;
			case 2:// Listar todas as pessoas ordenadas pelo nome
				JOptionPane.showMessageDialog(null, agenda.listarTodos());
				break;
			case 3:// Listar o número total de contatos e
				//informar se a agenda está ou não vazia
				JOptionPane.showMessageDialog(null, "Total de objetos: " + agenda.totalizar());
				if(agenda.totalizar() == 0) JOptionPane.showMessageDialog(null, "Vazia");
				else JOptionPane.showMessageDialog(null, "Não está vazia.");
				break;
			case 4://Pesquisar se uma pessoa está na agenda
				String nomePesq = JOptionPane.showInputDialog("informe o nome:");
				Pessoa pessoaPesq = new Pessoa();
				pessoaPesq.setNome(nomePesq);
				if(agenda.pesquisar(pessoaPesq)) JOptionPane.showMessageDialog(null, "Pessoa está cadastrada. ");
				else JOptionPane.showMessageDialog(null, "Pessoa não cadastrada. ");
				break;
			case 5://sair
				System.exit(0);
				break;
			}
		}
	}

	private static int montaMenu() {
		String menu = "1 - Cadastrar uma pessoa\n" + "2 - Listar todas as pessoas ordenadas pelo nome\n"
				+ "3 - Listar o número total de contatos e informar se a agenda está ou não vazia\n"
				+ "4 - Pesquisar se uma pessoa está na agenda\n" + "5 - Sair da agenda";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}
}