package excessoes;

import java.io.*;

//estudar o código!

public class ExemploArq4 {
	public static void main(String[] args) {
		//gravando objetos
		String nomeArq = "Arquivo.txt";
		try(ObjectOutputStream out = new ObjectOutputStream(
				                  new FileOutputStream(nomeArq));){
			Cpf objCpf = new Cpf(1111111, 22);
			out.writeObject(objCpf);
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo de escrita não encontrado");
		}catch(SecurityException e) {
			System.out.println("Sem permissão de escrita no arquivo");
		}catch(NullPointerException e) {
			System.out.println("Arq de escrita nulo");
		}catch(InvalidClassException e) {
			System.out.println("Classe do objeto inválida");
		}catch(NotSerializableException e) {
			System.out.println("Objeto não pode ser serializado");
		}catch(IOException e) {
			System.out.println("Erro ao escrever no arquivo");
		}catch(Exception e) {
			System.out.println("outra exceção qq");
		}
		
		//lendo objetos
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream( nomeArq) );){
			Cpf objCpf = (Cpf) in.readObject();
			System.out.println(objCpf);
			in.close();
		}catch(FileNotFoundException e) {
			System.out.println("Arquivo de leitura não encontrado");
		}catch(SecurityException e) {
			System.out.println("Sem permissão de leitura do arquivo");
		}catch(NullPointerException e) {
			System.out.println("Arq de leitura nulo");
		}catch(StreamCorruptedException e) {
			System.out.println("Objeto corrompido");
	    }catch(ClassNotFoundException e) {
	    	System.out.println("Classe do objeto não encontrada");
	    }catch(InvalidClassException e) {
	    	System.out.println("Classe do objeto inválida");
	    }catch(OptionalDataException e) {
	    	System.out.println("Tipo primitivo e não objeto");
	    }catch(IOException e) {
			System.out.println("Erro ao ler do arquivo");
		}
	
	}
}