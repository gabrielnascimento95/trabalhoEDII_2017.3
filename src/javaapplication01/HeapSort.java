package javaapplication01;

//import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rian Alves
 */
public class HeapSort {

    ArrayList<Tuite> list = new ArrayList<>();

    public HeapSort(ArrayList<Tuite> lista) {
        list.addAll(lista);
        constroiHeap(lista);
        int n = lista.size();
        
        for(int i = lista.size()-1; i> 0 ; i--)
        {
            Tuite aux = lista.get(i);
            Tuite aux1 = lista.get(i);
            Tuite teste = lista.get(0);
            
            aux = aux1;
            aux1=teste;
            teste = aux;
            
            heapify(lista, 0, --n);
            
         }
         
        imprimirVetorDiv(lista);
    }

    public void constroiHeap(ArrayList<Tuite> list) {

        int tam = list.size();
        for (int i = (tam -1) / 2; i >= 0; i--) {
            heapify(list, tam, i);
        }
        
      
    }

    private void heapify(ArrayList<Tuite> vetor, int tam, int i) {
        int maior = i;
        int esq = 2 * i + 1;
        int dir = esq + 1;

        if (esq < tam) {
            if (dir < tam) {
                if (vetor.get(esq).getTweetID().equals(vetor.get(dir).getTweetID())) {
                    esq = dir;
                }
                if (vetor.get(esq).getTweetID().equals(vetor.get(maior).getTweetID())) {;
                    troca(vetor, esq, maior);
                }
                
            }
            

        }
    }

    private void troca(ArrayList<Tuite> vet, int i, int j) {
            
        final List l = vet;
        l.set(i, l.set(j, l.get(i)));
    }

    public void imprimirVetorDiv(ArrayList<Tuite>list) {
        for (int r = 0; r < list.size(); r++) {
            if (r < list.size() - 1) {
                System.out.print(" " + list.get(r).getTweetID() + " ,");

            } else {
                System.out.print(" " + list.get(r).getTweetID() + " ");
            }
        }

    }
}
