package excessoes;

import java.util.*;

public class Exemplo1 {
	public static void main(String[] args) {
		List<Number> lista = new ArrayList<>();
		lista.add(1);
		lista.add(30);
		lista.add(null);
		
		for (Number number : lista) {
			System.out.println(number);
		}
		
		try {
			System.out.println(lista.get(4));
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ind. inválido no método get()!");
			//e = objeto que representa a exceção
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		try {
			int indice = 5;
			if(indice>=0 && indice<lista.size())
		       lista.add(indice, 25);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("ind. inválido no método add()!");
		}
	}
}
