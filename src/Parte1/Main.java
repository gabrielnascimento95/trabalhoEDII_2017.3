/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;

import Parte1.QuickSort;
import Parte1.Tuite;
import Parte1.Validacao;
import Parte2.ControllerHash;
import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
//import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_Nascimento
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<Tuite> lista = new ArrayList<>();
        ArrayList<BigInteger> id = new ArrayList<>();
        Validacao validacao = new Validacao();
        ControllerHash ct = new ControllerHash(); //cria obg controllerHAsh
        String linha = null;
        
        try {
            String endereco = "C:\\Users\\gabri\\Dropbox\\Downloads\\arquivos Trab ED 2 2017.3\\cargaMenor.txt";
            BufferedReader br = new BufferedReader(new FileReader(endereco));
            while ((linha = br.readLine()) != null) {
                String[] cod = linha.split("	");
                
                if (cod.length == 4 && validacao.eValido(cod)) {
                    Tuite e = new Tuite();
                    e.setUserID(cod[0]);
                    e.setTweetID(cod[1]);
                    e.setTweet(cod[2]);
                    e.setDate(cod[3]);
                    lista.add(e);
                } else {
                    //System.out.println("Formato Invalido: " + linha);

                }

            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } 
        

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).imprime());
            BigInteger aux = lista.get(i).getTweetID();
            String aux2 = String.valueOf(aux);
            ct.insere(aux2, i); //insere na tabela hash
            id.add(aux);
            System.out.println(id);
        }

        Long tempoInicial = System.currentTimeMillis();
        Date data1 = new Date(tempoInicial);
        QuickSort qs = new QuickSort(lista);
        //InsertionSort is = new InsertionSort();
        //is.insertionSort(lista);
        //MergeSort ms = new MergeSort();
        // ms.merge(lista);
        Long tempoFinal = System.currentTimeMillis();
        Date data2 = new Date(tempoFinal);

        FileWriter arq = new FileWriter("C:\\Users\\gabri\\Documents\\NetBeansProjects\\trabalhoEDII_2017.3\\saida25.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("+------------QuickSort 25 elementos---------------------+");
        gravarArq.printf("\n\nTempo inicial: " + data1 + "\n\n");
        gravarArq.printf("\n\nResultado: ");
        qs.imprimirVetorDiv();
        gravarArq.printf("\n\n");
        gravarArq.printf("\n\nTempo Final: " + data2 + "\n\n");
        gravarArq.printf("+---------------------------Fim------------------------+");
        arq.close();

    }
}
