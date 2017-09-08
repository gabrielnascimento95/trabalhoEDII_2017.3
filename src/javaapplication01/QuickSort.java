/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author 12265041670
 */
public class QuickSort {
   ArrayList<BigInteger> id = new ArrayList<>();
   
   public QuickSort(ArrayList<BigInteger> list) {
       this.id= list;       
       for (int i = 0; i < id.size(); i++) {
           id.add(i, list.get(i));;
       }
       int pivo = 2;
       doQuicksort(0, list.size() - 1, 2);
       //divisao.ordenar(vetor, 2 );
       imprimirVetorDiv();
   }
   
    private void troca(ArrayList<BigInteger> vet, int i, int j){
        String n = String.valueOf(vet.get(i));
        String n2 = String.valueOf(vet.get(j));
        BigInteger aux = new BigInteger(n);
        BigInteger aux2 = new BigInteger(n2);
        vet.add(i, aux2);
        vet.add(j, aux);
    }

   public void doQuicksort(int esq, int dir, int procura) {
       if (dir < esq) {
           if (procura - 1 < id.size() && esq == procura - 1) {
               System.out.println(id.get(procura - 1));
           }
           return;
       } else {
           ArrayList<BigInteger> pivo = new ArrayList<>();
           pivo.add(this.id.get(dir));
           int particao = particao(esq, dir, pivo, procura);
           doQuicksort(esq, particao - 1, procura);
           doQuicksort(particao + 1, dir, procura);

       }

   }

   public int particao(int esq, int dir, ArrayList<BigInteger> pivo, int procura) {
       int esqPtr = esq - 1;
       int dirPtr = dir;
       /*int k = 0;
       System.out.println("IteraÃ§Ã£o " + k + " :");
       k++;

       imprimirVetorDiv();
       System.out.println('\n');*/

       //System.out.println("Esquerda: " + esq + " Direita: " + dir);
       while (id.get(esqPtr++).compareTo(pivo.get(dir)) == -1) { //vet.get(esqPtr++) < pivo.get(dir)
           //System.out.println("Esquerda: " + esq + " Direita: " + dir);
           while (dirPtr > esq && id.get(--dirPtr).compareTo(pivo.get(dir)) == 1) {
               //System.out.println("Esquerda: " + esq + " Direita: " + dir);
               if (esqPtr >= dirPtr) {
                   break;
               } else {
                   troca(pivo, esqPtr, dirPtr);
               }
               //System.out.println("IteraÃ§Ã£o " + k + " :");
               //k++;
               //imprimirVetorDiv();
               //System.out.println('\n');
           }
       }

       troca(pivo, esqPtr, dir); //DANDO ERRO NESTA LINHA --- NÃO SEI PQ

       return esqPtr;

       //System.out.println('\n');
       //System.out.println('\n');
       //imprimirVetorDiv();

   }

   public void imprimirVetorDiv() {
       for (int r = 0; r < id.size(); r++) {
           if (r < id.size() - 1) {
               System.out.print(" " + id.get(r) + " ,");

           } else {
               System.out.print(" " + id.get(r) + " ");
           }
       }

   }
    
}
