package contas;
import java.util.*;

import javax.swing.JOptionPane;

public class TesteMenu {
	public static void main(String[] args) {
		List<ContaEspecial> contas = new ArrayList<>();
		boolean flag = false;
	    		
		switch(montaMenu()) { 
		
		case 1: //cadastar Conta Especial
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Informe o saldo: "));
			long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o numero da conta: "));
			
			int numerAg = Integer.parseInt(JOptionPane.showInputDialog("Informe o Num da agencia: "));
			String endereco = JOptionPane.showInputDialog("Informe o endereco: ");
			Agencia agencia = new Agencia(numerAg, endereco);
			double limite = Double.parseDouble(JOptionPane.showInputDialog("Informe o limite:"));
			  List<Cliente> clientes = new ArrayList<>();
			  int contCli = Integer.parseInt(JOptionPane.showInputDialog("Informe total clientes"));
	  	    for(int i=0; i<contCli; i++) {
	  	    	String cpf = JOptionPane.showInputDialog("Informe o cpf:");
	  	    	String nome = JOptionPane.showInputDialog("Informe o nome:");
	  	    	clientes.add(new Cliente(cpf, nome));
	  	    }
			  contas.add(new ContaEspecial(numero, saldo, agencia, limite, clientes));
			  break;
			  
		case 2: //Pesquisar Conta Especial pelo Número
		    flag = false;
    	    long numeroPesquisa = Long.parseLong(JOptionPane.showInputDialog("Informe o número da conta:"));
    	    if(contas!=null) {
	    	   for (ContaEspecial conta : contas) {
	    	  	   if(conta != null) {
	    	  		   if(numeroPesquisa == conta.getNumero()) {
	    	  			  JOptionPane.showMessageDialog(null, "Conta encontrada");
	    	  			  flag = true;
	    	  		   }
	    	   	   }
	    	   }
	    	}
    	    if(flag == false)
    	    	JOptionPane.showMessageDialog(null, "Conta inexistente!");
			break;
			
		case 3: //Pesquisar Conta Especial pelo Número da Agência
			flag = false;
			int agenciaPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da agência:"));
			if(contas!=null) {
		    	   for (ContaEspecial conta : contas) {
		    	  	   if(conta != null) {
		    	  		   if(agenciaPesquisa == conta.getAgencia().getNumero()) {
		    	  			  JOptionPane.showMessageDialog(null, "Conta encontrada");
		    	  			  flag = true;
		    	  		   }
		    	   	   }
		    	   }
		    	}
	    	    if(flag == false)
	    	    	JOptionPane.showMessageDialog(null, "Conta inexistente!");
			break;
			
		case 4: //Pesquisar conta Especial pelo CPF
			flag = false;
		    String cpfPesquisa = JOptionPane.showInputDialog("Informe o CPF:");
		    if (contas != null) {
		        for (ContaEspecial conta : contas) {
		            if (conta != null) {
		                for (Cliente cliente : conta.getClientes()) {
		                    if (cliente.getCpf().equals(cpfPesquisa)) {
		                        JOptionPane.showMessageDialog(null, "Cliente encontrado na conta " + conta.getNumero());
		                        flag = true;
		                        break; // Sai do loop interno quando o cliente é encontrado
		                    }
		                }
		                if (flag) {
		                    break; // Sai do loop externo quando o cliente é encontrado
		                }
		            }
		        }
		    }
		    if (!flag) {
		        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
		    }
			break;
			
		case 5:
			System.exit(0);
			break;
		}
	
	}
	
	public static int montaMenu() {
		String menu = "";
		for (ItensMenu item : ItensMenu.values()) {
			menu += item.getItem() + "\n";
		}
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
