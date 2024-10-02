package listas_slides;

import java.util.Comparator;

public class CpfComparator implements Comparator<Cpf> {

	@Override
	public int compare(Cpf cpf1, Cpf cpf2) {
		if(cpf1.getDigito() == cpf2.getDigito()) return 0;
		if(cpf1.getDigito() > cpf2.getDigito()) return 1;
		return -1;
	}


}
