package listas_slides;

import java.util.Arrays;
import java.util.TreeSet;

public class Teste2 {
	public static void main(String[] args) {
		
		Integer numeros[] = {5, 1, 20, 3, 14};
		TreeSet<Integer> conjunto1 = new TreeSet<>(Arrays.asList(numeros));
 		for (Integer num : conjunto1) {
 			System.out.println(num);
 		}
		
 		TreeSet<Cpf> conjuntoCpfs = new TreeSet<>();
		conjuntoCpfs.add(new Cpf(93333, 22));
		conjuntoCpfs.add(new Cpf(44443, 10));
		conjuntoCpfs.add(new Cpf(55555, 20));
		
		for (Cpf cpf : conjuntoCpfs) {
			System.out.println(cpf.toString());
		}
		
		CpfComparator comparator = new CpfComparator();
		TreeSet<Cpf> conjunto = new TreeSet<>(comparator);
		conjunto.add(new Cpf(93333, 32));
		conjunto.add(new Cpf(44443, 50));
		conjunto.add(new Cpf(55555, 20));
		
		for (Cpf cpf : conjunto) {
			System.out.println(cpf.toString());
		}
		
		
	}
}
