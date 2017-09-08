/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

public class MergeSort {
    
    public int [] mergeSort(int[] v,int[] w, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(v, w, inicio, meio);
            mergeSort(v, w, meio + 1, fim);
            intercalar(v, w, inicio, meio, fim);
        }
        return w;
    }

    void intercalar(int[] v, int[] w, int inicio, int meio, int fim) {
        for (int k = inicio; k <= fim; k++) {
            w[k] = v[k];
        } // Copia o vetor 

        int i = inicio;
        int j = meio + 1;

        for (int l = inicio; l <= fim; l++) {
            if (i > meio) {
                v[l] = w[j++];
            } else if (j > fim) {
                v[l] = w[i++];
            } else if (w[i] < w[j]) {
                v[l] = w[i++];
            } else {
                v[l] = w[j++];
            }
        }
    }
}
