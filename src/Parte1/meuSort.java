/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel_Nascimento
 */
public class meuSort {
  
    ArrayList<Tuite> lista = new ArrayList<>();
   
    private void troca(ArrayList<Tuite> vet, int i, int j){
        final List l = vet;
        l.set(i, l.set(j, l.get(i)));
    }
    
    private void imprime(ArrayList<Tuite>list){
        for (int r = 0; r < list.size(); r++) {
            if (r < list.size() - 1) {
                System.out.print(" " + list.get(r).getTweetID() + " ,");

            } else {
                System.out.print(" " + list.get(r).getTweetID() + " ");
            }
        }

    }
    public void meuSort(ArrayList<Tuite> list){
        lista.addAll(list);
        int n = list.size();
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (lista.get(i).getTweetID().compareTo(lista.get(k).getTweetID())== 1){  //vet[i] > vet[k]
                    troca(list, i, k);
                }
            }
        }
        imprime(lista);
    }    
}

