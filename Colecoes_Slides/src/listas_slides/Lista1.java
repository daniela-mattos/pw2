/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas_slides;

import java.util.*;

public class Lista1{
     public static void main(String args[]){
            List<Integer> lista = new ArrayList<>();//padrão 10 posições 
            //vai expandindo depois, se adicionados mais de 10 elementos, crindo uma nova lista.
            
            List<Integer> lista2 = new ArrayList<>(20); //é possível indicar o tamanho
            
            lista.add(10); 
            lista.add(20); 
            lista.add(30); 
            lista.add(40); 
            lista.add(20); 
            lista.add(50); 
            lista.add(20); 
            lista.add(60);
            
            for(Integer obj: lista) {
                    System.out.println(obj);
            }
            System.out.println(lista.indexOf(20));//retorna o index da primeira ocorrência do
            //valor informado (elemento 20)
            
            //retornar a última ocorrência do elemento 20
            System.out.println(lista.lastIndexOf(20));
            
            //converter toda lista para vetor
            Object vetor[] = lista.toArray();
            
            //como saber o número de elementos da lista
            System.out.println(lista.size());
            
            //remover todos elementos da lista
            lista.removeAll(lista); //remove tudo de uma que tem na outra
            //menos usado pra esse fim, já que compara uma com a outra (e no caso é a mesma lista)
            lista.clear();
            
            
          //float - Float
            List<Float> lista3 = new ArrayList<>();
            
            lista3.add(20.0F); //usa o "F" pra indicar que é float 
            lista3.add(60.0F);
     }
     //int - Integer
     //char - Character
     
     
}
