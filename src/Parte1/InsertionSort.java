/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel_Nascimento
 */
public class InsertionSort {
   ArrayList<Tuite> lista = new ArrayList<>();

    public void insertionSort(ArrayList<Tuite> list) {
        lista.addAll(list);
        for(int i=0; i < lista.size(); i++){
            for(int j = i; j>0; j--){
               if(lista.get(j).getTweetID().compareTo(lista.get(j-1).getTweetID())==-1){
                   troca(j,j-1);
               } 
            }
        }
        imprimirVetorDiv();
    }
    public void imprimirVetorDiv() {
        for (int r = 0; r < lista.size(); r++) {
            if (r < lista.size() - 1) {
                System.out.print(" " + lista.get(r).getTweetID() + " ,");

            } else {
                System.out.print(" " + lista.get(r).getTweetID() + " ");
            }
        }

    }
    
     private void troca(int i, int j) {
        //Collections.swap(id, i, j);
        final List l = lista;
        l.set(i, l.set(j, l.get(i)));
    }
}
