package excessoes;
import java.io.*;

public class ExemploArq1 {

		public static void main(String[] args) {
			//gravando dados
			File arqE = new File("Arquivo.txt");
			try(FileWriter fw = new FileWriter(arqE);) {
				// usar o "recurso" no try, o que está entre parentes, libera as linhas flush e close
				fw.write('2');
				fw.write("2");
				// as linhas abaixa serão executadas pelo java
				// fw.flush();
				// fw.close();
			} catch (IOException e) {
				System.out.println("Exceção na escrita!");
			}

			//lendo dados
			File arqLeit = new File("Arquivo.txt");
			try(FileReader fr = new FileReader(arqLeit);) {
				int c = fr.read();
				while (c != -1) {
					System.out.print((char) c);
					c = fr.read();
				}
			} catch (FileNotFoundException e) {
				System.out.println("Arquivo não encontrado!");
			} catch (IOException e) {
				System.out.println("Exceção na leitura!");
			}
		}
	}


