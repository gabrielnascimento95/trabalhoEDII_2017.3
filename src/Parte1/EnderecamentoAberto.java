/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte1;

import java.util.ArrayList;

/**
 *
 * @author Gabriel_Nascimento
 */
public class EnderecamentoAberto {
    
    public void EnderecamentoAberto(ArrayList<Tuite> lista, int h, String valor)
    {
       if(lista.indexOf(lista.get(h)) == 0)
         {
            lista.get(h).setTweetID(valor);
         }
         
         if(lista.indexOf(lista.get(h)) == 1)
         {
            while(lista.indexOf(lista.get(h)) == 1)  {   
                h++;
                
            }
                lista.get(h).setTweetID(valor);
            
         }
    
    }
}
