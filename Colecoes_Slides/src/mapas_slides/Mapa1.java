package mapas_slides;
import java.util.*;

public class Mapa1 {
    public static void main(String[] args) {
    	//criando um mapa com chave do tipo string
    	//e valor do tipo integer
        Map<String, Integer> map = new HashMap<>();
        
        //adiciona elementos com 'put'
        map.put("um", 1);
        map.put("dois", 2);
        map.put("tres", 3);
        
        //percorre toda coleção -> imprime somente os valores
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            System.out.println((Integer) it.next());
        }
    }
}
