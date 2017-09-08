package javaapplication01;

/**
 *
 * @author Rian Alves
 */
public class HeapSort {
    
   public int[] constroiHeap(int []vetor)
   {
       int tam = vetor.length;
       for(int i = tam/2 - 1; i >= 0; i--){
           heapify(vetor, tam, i);
       }
       for(int i = tam -1; i >= 0; i--){
           int temp = vetor[0];
           vetor[0] = vetor[i];
           vetor[i] = temp;
           heapify(vetor, i, 0);
       }
       return vetor;
   }

    private void heapify(int[] vetor, int tam, int i) {
        int maior = i;
        int esq = 2*i + 1;
        int dir = 2*i + 2;
        
        if(esq < tam && vetor[esq] > vetor[maior]){
            maior = esq;
        }
        if(dir < tam && vetor[dir] > vetor[maior]){
            maior = dir;
        }
        if(maior != i){
            troca(vetor, i, maior);
        }
    }
    
    private void troca(int[] vet, int i, int j){
        int aux = vet[i];
        vet[i] = vet[j];
        vet[j] = aux;
    }
    
}
