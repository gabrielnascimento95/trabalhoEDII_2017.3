/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

import java.math.BigInteger;
import java.util.ArrayList;

public class MergeSort {

    ArrayList<Tuite> id = new ArrayList<>(); 
    ArrayList<BigInteger> lista2= new ArrayList<>(); 
    
    public void merge(ArrayList<Tuite> list)
    {
        this.id.addAll(list);
        mergeSort(null, list, 0, list.size());
    
    }
    
    
    public ArrayList<Tuite> mergeSort(ArrayList<Tuite> v, ArrayList<Tuite> w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, w, inicio, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
        return w;
    }

    void intercalar(ArrayList<Tuite> v, ArrayList<Tuite> w, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            w.add(k, v.get(k));
        } // Copia o vetor 
        int i = inicio;
        int j = meio + 1;

        for (int l = inicio; l <= fim; l++) {
            if (i > meio){
                v.add(l, w.get(j++));
            } else if (j > fim) {
                v.add(l, w.get(i++));
            } else if (w.get(i).getTweetID().compareTo(w.get(j).getTweetID()) == -1){ //w[i] < w[j]
                v.add(l, w.get(i++));
            } else {
                v.add(l, w.get(j++));
            }
        }
    }
}
