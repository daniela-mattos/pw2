package excessoes;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Exemplo4 {
	public static void main(String[] args) { // throws IOException {
		String nomeArq = JOptionPane.showInputDialog(null, "Informe o nome do arq:");
		int op = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Criar arq"));
		File f = new File(nomeArq);
		switch(op) {
		    case 1: 
			try {
				if(f.createNewFile())
		    		System.out.println("Criou o arquivo");
			    else  
			        System.out.println("Não criou o arquivo");
			} catch (IOException e) {
				System.out.println(e.getMessage());
				System.out.println(e.getCause());
			}
		}
	}
}
