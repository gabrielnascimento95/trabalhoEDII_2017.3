package Parte1;

public class QuickSortSemRecursao {

    public int[] particao(int[] vetor) {
        int pivo = (vetor[0] + vetor[1] + vetor[2]) / 3; //determianar o pivô
        int ini = 0;
        int fim = 2;

        while (ini < fim) {
            while (vetor[ini] < pivo) {
                ini++;
            }
            while (vetor[fim] > pivo) {
                fim--;
            }

            if (ini <= fim) {//verifica se ele cruzou
                int troca = vetor[ini];
                vetor[ini] = vetor[fim];
                vetor[fim] = troca;

               ini++;
               fim--;
            }

        }

        return vetor;
    }

}
