import java.util.Collections;
import java.util.LinkedList;

import contato.Telefone;
import contato.TelefoneNumeroComparator;

public class Exercicio {

	public static void main(String[] args) {

		LinkedList<Telefone> telefones = new LinkedList<>();
		telefones.add(new Telefone(22, 2222));
		telefones.add(new Telefone(11, 1111));
		telefones.add(new Telefone(33, 3333));
		TelefoneNumeroComparator comparador = new TelefoneNumeroComparator();
		Collections.sort(telefones, comparador);
		for (Telefone telefone : telefones) {
		if(telefone!=null)
		System.out.println(telefone);
		}

	}

}
