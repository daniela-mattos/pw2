package excessoes;

import java.io.*;
import javax.swing.*;

public class Exemplo3 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número:"));
			System.out.println("Número:" + num);
			switch (num) {
			case 1:
				System.out.println("3");
				int valor1 = Integer.parseInt("abc");
				System.out.println(valor1);
				break;
			case 2:
				System.out.println("4");
				String palavras[] = { "casa", "apto", "morada" };
				System.out.println(palavras[3]);
			case 3:
				//sem break, se não acontece excessão, ele segue executando o código
				System.out.println("5");
				double vetor[] = null;
				for (double valor : vetor) {
					System.out.println(valor);
				}
				break;
			case 4:
				System.out.println("6");
				File f = new File("c:\\teste.txt");
				f.createNewFile();
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("3.1");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("4.1");
		} catch (NullPointerException e) {
			System.out.println("5.1");
		} catch (IOException e) {
			System.out.println("6.1");
		} finally {
			//sempre é executado - já tem recursos que fazem o papel dele
			System.out.println("7");
		}
	}
}