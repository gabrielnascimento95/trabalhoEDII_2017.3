/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication01;
import java.util.ArrayList;

/**
 *
 * @author Gabriel_Nascimento
 */
public class InsertionSort {
   ArrayList<Associacao> lista = new ArrayList<>();

    public ArrayList<Associacao> InsertionSort(ArrayList<Associacao> list) {
        Associacao aux;     
        for(int i=0; i < list.size(); i++){
            for(int j = i; j>0; j--){
               if(list.get(j).equals(j-1)){
                   aux = list.get(j);
                   list.add(j, list.get(j-1));
                   list.add(j-1, aux);
               } 
            }
        }
        return list;
    }   
}