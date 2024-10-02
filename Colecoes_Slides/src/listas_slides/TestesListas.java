package listas_slides;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import pessoas.Pessoa;

public class TestesListas {
    public static void main(String[] args) {
        //Como declarar um ArrayList para objetos do tipo Cpf?
    	
    	ArrayList<Cpf> listaCpfs = new ArrayList<>();
       
        //Como declarar uma LinkedList para armazenar 
    	//objetos do tipo Pessoa e Aluno?
        LinkedList<Pessoa> listaPessoasAlunos = new LinkedList<>();
        
        //Como Aluno é sub classe de Pessoa, o .add funciona para ambos
        //ele aceita adicionar Pessoa e suas subclasses.
        listaPessoasAlunos.add(new Pessoa());
        listaPessoasAlunos.add(new Aluno());
        
        //adiciona somente alunos
        LinkedList<Aluno> listaAlunos = new LinkedList<>();

        listaAlunos.add(new Aluno());
        
        //como imprimir a lista?  
    	for(Pessoa p : listaPessoasAlunos) {
    		
    		if(p instanceof Aluno) 
    			System.out.println("Objeto Aluno* => " + p.toString());
    		else
    			System.out.println("Objeto Pessoa => " + p.toString());
    		
    	}
    
    }
}