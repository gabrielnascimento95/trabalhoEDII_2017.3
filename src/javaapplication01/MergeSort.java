/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.math.BigInteger;
import java.util.ArrayList;

public class MergeSort {
    
    public ArrayList<BigInteger> mergeSort(ArrayList<BigInteger> v, ArrayList<BigInteger> w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, w, inicio, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
        return w;
    }

    void intercalar(ArrayList<BigInteger> v, ArrayList<BigInteger> w, int inicio, int meio, int fim) {
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
            } else if (w.get(i).compareTo(w.get(j)) == -1){ //w[i] < w[j]
                v.add(l, w.get(i++));
            } else {
                v.add(l, w.get(j++));
            }
        }
    }
}
