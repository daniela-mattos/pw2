import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class aula0210 {

	public static void main(String[] args) {
		//criar uma lista com 10 números
		Integer numeros[] = {2, 33, 65, 45, 87, 10, 25, 54};
		List<Integer> lista = new ArrayList<>(Arrays.asList(numeros));

		//ordenar a lista usando a classe colletions
		Collections.sort(lista);
		System.out.println(lista);
//		for (Integer numero : lista) {
//			JOptionPane.showMessageDialog(null,  numero);
//		}

		
		//preencher a lista com valor 20
		Collections.fill(lista, 20);
        
	}
}
