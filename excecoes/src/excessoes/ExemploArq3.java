package excessoes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;

public class ExemploArq3 {
	public static void main(String[] args) {
		//gravando objetos
		
		String nomeArq = "Arquivo.txt";
		String obj = "objeto do tipo String";
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArq));){	
			out.writeObject(obj);
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo de escrita não encontrado. ");
		} catch(SecurityException e) {
			System.out.println("Sem permissão de escrita no arquivo. ");
		} catch(NullPointerException e) {
			System.out.println("Arquivo nulo. ");
		} catch(InvalidClassException e) {
			System.out.println("Classe do objeto inválida ");
		} catch(NotSerializableException e) {
			System.out.println("Objeto não pode ser serializado. ");
		} catch(IOException e) {//IO é super de todas, por isso deve ficar sempre por último
			System.out.println("Erro ao escrever o arquivo. ");
		}
		
		
		//lendo objetos
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArq));
			){
			obj = (String) in.readObject();
			System.out.println(obj);
		} catch(FileNotFoundException e) {
			System.out.println("Arquivo de leitura não encontrado. ");
		} catch(SecurityException e) {
			System.out.println("Sem permissão de leitura do arquivo. ");
		} catch(NullPointerException e) {
			System.out.println("Arquivo nulo. ");
		} catch(StreamCorruptedException e) {
			System.out.println("Sem permissão de leitura do arquivo. ");
		} catch(ClassNotFoundException e) {
			System.out.println("Classe do objeto não encontrada. ");
		} catch(InvalidClassException e) {
			System.out.println("Classe do objeto inválida ");
		} catch(OptionalDataException e) {
			System.out.println("Tipo primitivo e não objeto. ");
		} catch(IOException e) {//IO é super de todas, por isso deve ficar sempre por último
			System.out.println("Erro ao escrever o arquivo. ");
		}
		
	}
}
