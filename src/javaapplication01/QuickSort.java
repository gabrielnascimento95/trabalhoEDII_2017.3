/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 12265041670
 */
public class QuickSort {

    ArrayList<Tuite> id = new ArrayList<>();

    public QuickSort(ArrayList<Tuite> list) {
        this.id.addAll(list);
        doQuicksort(0, id.size()-1);
        //divisao.ordenar(vetor, 2 );
        imprimirVetorDiv();
    }

    private void troca(int i, int j) {
        //Collections.swap(id, i, j);
        final List l = id;
        l.set(i, l.set(j, l.get(i)));
    }

    public void doQuicksort(int esq, int dir) {
       
         int meio =particao(esq,dir);
         
         if(esq < meio- 1){
             doQuicksort(esq, meio-1);
         }
         
         if(dir>meio){
             doQuicksort(meio, dir);
         }
    }

    public int particao(int esq, int dir) {
        BigInteger pivo = id.get(esq).getTweetID();
        while (esq <= dir) { //vet.get(esqPtr++) < pivo.get(dir)
            //System.out.println("Esquerda: " + esq + " Direita: " + dir);
            while (id.get(esq).getTweetID().compareTo(pivo) == -1) {
                esq++;
            }
            while (id.get(dir).getTweetID().compareTo(pivo) == 1) {
                dir--;
            }
            //System.out.println("Esquerda: " + esq + " Direita: " + dir);
            if (esq <= dir) {
                troca(esq, dir);
                esq++;
                dir--;
            }
        }
        return esq;

        //System.out.println('\n');
        //System.out.println('\n');
        //imprimirVetorDiv();
    }

    public void imprimirVetorDiv() {
        for (int r = 0; r < id.size(); r++) {
            if (r < id.size() - 1) {
                System.out.print(" " + id.get(r).getTweetID() + " ,");

            } else {
                System.out.print(" " + id.get(r).getTweetID() + " ");
            }
        }

    }

}
