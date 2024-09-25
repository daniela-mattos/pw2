package conjuntos_slides;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Conjunto4 {
//criar dois conjuntos A e B
//A = 1,2,3,4
//B = 4,5,6,7
//Faça:    A união B
		// A intersecção B
		// A - B
		// B - A
	
	public static void main(String[] args) {
		Integer numerosA[] = {1,2,3,4};
		Set<Integer> conjuntoA = new HashSet<>(Arrays.asList(numerosA));

		for (Integer num : conjuntoA) {
            System.out.println("Conjunto A: " + num);
        }
        
		Integer numerosB[] = {4,5,6,7};
        Set<Integer> conjuntoB = new HashSet<>(Arrays.asList(numerosB));
        
        for (Integer num : conjuntoB) {
            System.out.println("Conjunto B: " + num);
        }
        
      // A união B
        Set<Integer> conjuntoAux = new HashSet<>();
        conjuntoAux.addAll(conjuntoA);
        conjuntoAux.addAll(conjuntoB);
        
        for (Integer num : conjuntoAux) {
            System.out.println("Conjunto Aux: " + num);
        }
        
      // intersecção
        conjuntoAux = new HashSet<>();
        conjuntoAux.addAll(conjuntoA);
        conjuntoAux.retainAll(conjuntoB);
        conjuntoAux.forEach(valor -> System.out.println("A intersecção B: " + valor));
        
      // A - B
        conjuntoAux = new HashSet<>();
        conjuntoAux.addAll(conjuntoA);
        conjuntoAux.removeAll(conjuntoB); //remove tudo que tem em A = ao que tem no B
        conjuntoAux.forEach(valor -> System.out.println("A - B: " + valor));
     
      // B - A
        conjuntoAux = new HashSet<>();
        conjuntoAux.addAll(conjuntoB);
        conjuntoAux.removeAll(conjuntoA);//remove tudo que tem em B = ao que tem no A
        conjuntoAux.forEach(valor -> System.out.println("B - A: " + valor));
        
	}
}
