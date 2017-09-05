/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;
import java.io.*; 
//import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel_Nascimento
 */
public class JavaApplication01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String endereco = "C:\\Users\\gabri\\Dropbox\\Downloads\\arquivos Trab ED 2 2017.3\\test_set_users.txt", linha = null;
            BufferedReader br = new BufferedReader(new FileReader(endereco));
            while((linha = br.readLine()) != null){
                String[] cod = linha.split("	");
                for(int i=0;i<cod.length;i++){
                    if(i ==0){
                        System.out.println(i);
                        System.out.println(cod[i]);
                        System.out.println("----------------------");
                    }
                }
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        
    }
}
    

