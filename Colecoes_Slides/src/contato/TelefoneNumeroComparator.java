package contato;

import java.util.Comparator;

public class TelefoneNumeroComparator implements Comparator<Telefone> {

	@Override
	public int compare(Telefone tel1, Telefone tel2) {
		if(tel1.getNumero() == tel2.getNumero()) return 0;
		if(tel1.getNumero() > tel2.getNumero()) return 1;
		
		return -1;
	}
	

}
