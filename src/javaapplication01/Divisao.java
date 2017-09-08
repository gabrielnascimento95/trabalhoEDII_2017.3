/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.util.ArrayList;
import javaapplication01.Associacao;

/**
 *
 * @author 12265041670
 */
public class Divisao {
    ArrayList<Associacao> vet = new ArrayList<>();

   public Divisao(ArrayList<Associacao> vet) {
       this.vet = vet;

   }

      public void troca(int ind1, int ind2) {
       ArrayList<Associacao> aux = new ArrayList<>();
       aux.add(vet.get(ind1));
       vet.add(ind1, vet.get(ind2));
       vet.add(ind2, aux.get(0));
   }

   public void quicksort(int esq, int dir, int procura) {
       if (dir < esq) {
           if (procura - 1 < vet.size() && esq == procura - 1) {
               System.out.println(vet.get(procura - 1));
           }
           return;
       } else {
           Associacao pivo = this.vet.get(dir);
           int particao = this.particao(esq, dir, pivo, procura);

           quicksort(esq, particao - 1, procura);
           quicksort(particao + 1, dir, procura);

       }

   }

   public int particao(int esq, int dir, ArrayList<Associacao> pivo, int procura) {
       int esqPtr = esq - 1;
       int dirPtr = dir;
       /*int k = 0;
       System.out.println("IteraÃ§Ã£o " + k + " :");
       k++;

       imprimirVetorDiv();
       System.out.println('\n');*/
       while (true) {
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           while (vet.get(esqPtr++). < pivo.get(dir)){
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           while (dirPtr > esq && vet[--dirPtr] > pivo){
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           if (esqPtr >= dirPtr) {

               break;
           } else {
               troca(esqPtr, dirPtr);
           }
           //System.out.println("IteraÃ§Ã£o " + k + " :");
           //k++;
           //imprimirVetorDiv();
           //System.out.println('\n');
            }
           }
       }
       troca(esqPtr, dir);

       return esqPtr;
       //System.out.println('\n');
       //System.out.println('\n');
       //imprimirVetorDiv();

   }

   public void imprimirVetorDiv() {
       for (int r = 0; r < vet.length; r++) {
           if (r < vet.length - 1) {
               System.out.print(" " + vet[r] + " ,");

           } else {
               System.out.print(" " + vet[r] + " ");
           }
       }

   }
    
}
