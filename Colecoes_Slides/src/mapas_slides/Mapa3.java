package mapas_slides;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import listas_slides.Cpf;

public class Mapa3 {

	// criar um mapa que armazena vários cpfs, usar a chave com número sequencial
	
	public static void main(String[] args) {
		
		Map<Integer, Cpf> mapaCpfs = new HashMap<>();
		
		//usando cpf anônimo
        mapaCpfs.put(mapaCpfs.size(), new Cpf(1111111, 11));
        
        //usando cpf com nome 'c1'
        Cpf c1 = new Cpf(222222, 22);
        mapaCpfs.put(mapaCpfs.size(), c1);
        
        //imprimir valores
        
        Set<Integer> cpfs = mapaCpfs.keySet();
        for (Integer chave : cpfs) {
            System.out.print("Chave => " + chave);
            
         // pega do mapa o valor que tem essa chave
            System.out.println(" - Valor=> " + mapaCpfs.get(chave));
        }
        
        
        
        
        
	}

}
