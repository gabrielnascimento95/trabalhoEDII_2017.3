/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.util.ArrayList;

/**
 *
 * @author 12265041670
 */
public class QuickSort {
     ArrayList<Integer> id = new ArrayList<>();
   

   public QuickSort(ArrayList<Integer> id) {
       this.id=id;
       int vetor[] = null;
       
       for (int i = 0; i < id.size(); i++) {
           vetor[i] = id.get(i);
       }
       int pivo = 2;
       Divisao divisao = new Divisao(vetor);
       divisao.quicksort(0, vetor.length - 1, 2);
       //divisao.ordenar(vetor, 2 );
       divisao.imprimirVetorDiv();
   }
    
}
