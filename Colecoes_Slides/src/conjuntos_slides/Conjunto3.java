package conjuntos_slides;
import java.util.*;

public class Conjunto3 {

    public static void main(String[] args) {
        Set<String> cidades = new TreeSet<>(); //arvore binária
        //ordena a exibição em ordem alfabética, segundo a tabela asci (case sensitive)
        cidades.add("Porto Alegre");
        cidades.add("Canoas");
        cidades.add("Alvorada");
        cidades.add("Viamao");
        for (String cidade : cidades) {
            System.out.println(cidade);
        }
        //ou para cada cidade que consta na coleção, imprimi 
        cidades.forEach(cidade -> System.out.println(cidade));
    }
}
