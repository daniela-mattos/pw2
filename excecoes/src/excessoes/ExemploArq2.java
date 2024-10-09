package excessoes;

import java.io.*;

public class ExemploArq2 {
	public static void main(String[] args) {
		//gravando textos grandes
		File arquivo = new File("Arquivo.txt");
		try(FileWriter fw = new FileWriter( arquivo );
			BufferedWriter escrita = new BufferedWriter(fw);
			){
				escrita.write( "teste" );
				escrita.newLine();
				escrita.write( "teste2");
		} catch(IOException e) {
			System.out.println("Exceção na escrita");
		} 
		
		//lendo dados passo a passo
		//arquivo = new File("Arquivo.txt");
		//FileReader fr = new FileReader(arquivo);
		//BufferedReader leitura = new BufferedReader(fr);
		
		//lendo dados de forma otimizada, dentro dos recursos do try
		try(BufferedReader leitura = new BufferedReader(new FileReader(new File("Arquivo.txt")));
			) {
				String content;
				while( ( content = leitura.readLine() ) != null){
					System.out.println( content );
				}
		} catch(NullPointerException e) {
			System.out.println("Arquivo nulo. ");
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo não encontrado. ");
		} catch(IOException e) {
			System.out.println("Não conseguiu ler o conteúdo do arquivo. ");
		}

	}
}