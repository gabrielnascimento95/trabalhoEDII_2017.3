package javaapplication01;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Rian Alves
 */
public class HeapSort {

   public HeapSort(ArrayList<BigInteger> lista) {
        ArrayList<BigInteger> list = new ArrayList<>(lista);
   }
    
   public ArrayList<BigInteger> constroiHeap(ArrayList<BigInteger> list)
   {
       int tam = list.size();
       for(int i = tam/2 - 1; i >= 0; i--){
           heapify(list, tam, i);
       }
       for(int i = tam -1; i >= 0; i--){
           troca(list,0,i);
           heapify(list, i, 0);
       }
       return list;
   }

    private void heapify(ArrayList<BigInteger> vetor, int tam, int i) {
        int maior = i;
        int esq = 2*i + 1;
        int dir = 2*i + 2;
        
        if(esq < tam){
            if(vetor.get(esq).equals(vetor.get(maior)))
            maior = esq;
        }
        if(dir < tam){
            if(vetor.get(dir).equals(vetor.get(maior)))
            maior = dir;
        }
        if(maior != i){
            troca(vetor, i, maior);
        }
    }
    
    private void troca(ArrayList<BigInteger> vet, int i, int j){
        String n = String.valueOf(vet.get(i));
        String n2 = String.valueOf(vet.get(j));
        BigInteger aux = new BigInteger(n);
        BigInteger aux2 = new BigInteger(n2);
        vet.add(i, aux2);
        vet.add(j, aux);
    }
    
}
