/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;
import java.io.*; 
import java.math.BigInteger;
import java.util.ArrayList;
//import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_Nascimento
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tuite> lista = new ArrayList<>();
        ArrayList<BigInteger> id = new ArrayList<>();
        
        try {
            String endereco = "/home/12265041670/Downloads/cargaMenor.txt", linha = null;
            BufferedReader br = new BufferedReader(new FileReader(endereco));    
            while((linha = br.readLine()) != null){
                String[] cod = linha.split("	");
                for(int i=0;i<cod.length;i++){
                    Tuite e = new Tuite();
                    e.setUserID(cod[0]);
                    e.setTweetID(cod[1]);
                    e.setTweet(cod[2]);
                    e.setDate(cod[3]);
                    lista.add(e);
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).imprime());
            BigInteger aux = new BigInteger(lista.get(i).getTweetID());
            id.add(aux);
            Associacao associacao = new Associacao(id);
            System.out.println(id);
        }
        
        
        //QuickSort qs =new QuickSort(id);
                
        
    }
}
    
