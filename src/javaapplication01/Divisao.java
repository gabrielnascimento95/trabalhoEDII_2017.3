/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

/**
 *
 * @author 12265041670
 */
public class Divisao {
    int vet[];

   public Divisao(int[] vet) {
       this.vet = vet;

   }

      public void troca(int ind1, int ind2) {
       int aux = vet[ind1];
       vet[ind1] = vet[ind2];
       vet[ind2] = aux;
   }

   public void quicksort(int esq, int dir, int procura) {
       if (dir < esq) {
           if (procura - 1 < vet.length && esq == procura - 1) {
               System.out.println(vet[procura - 1]);
           }
           return;
       } else {
           int pivo = this.vet[dir];
           int particao = this.particao(esq, dir, pivo, procura);

           quicksort(esq, particao - 1, procura);
           quicksort(particao + 1, dir, procura);

       }

   }

   public int particao(int esq, int dir, double pivo, int procura) {
       int esqPtr = esq - 1;
       int dirPtr = dir;
       /*int k = 0;
       System.out.println("IteraÃ§Ã£o " + k + " :");
       k++;

       imprimirVetorDiv();
       System.out.println('\n');*/
       while (true) {
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           while (vet[++esqPtr] < pivo);
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           while (dirPtr > esq && vet[--dirPtr] > pivo);
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
