package mapas_slides;
import java.util.*;

public class Mapa2 {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        //ordena pela chave
        map.put("cinco", 5);
        map.put("dois", 2);
        map.put("tres", 3);
        
     // pega o conjunto de chaves do mapa
     // como não pode ter chave repetida, usou um conjunto para armazenar as chaves
        Set<String> chaves = map.keySet();
        for (String chave : chaves) {
            System.out.print("Chave => " + chave);
            
         // pega do mapa o valor que tem essa chave
            System.out.println(" - Valor=> " + map.get(chave));
        }  
        
        System.out.println("--------------------------------");
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(5, "cinco");
        map2.put(2, "dois");
        map2.put(3, "tres");
        
        Set<Integer> chaves2 = map2.keySet();
        for (Integer chave : chaves2) {
            System.out.print("Chave => " + chave);
            System.out.println(" - Valor=> " + map2.get(chave));
        }       
    }
}
