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
public class Associacao {
    private ArrayList<BigInteger> lista = new ArrayList<>();

    public Associacao(ArrayList lista) {
        this.lista = lista;
    }

    public ArrayList<BigInteger> getLista() {
        return lista;
    }

    public void setLista(ArrayList<BigInteger> lista) {
        this.lista = lista;
    }
    
    public BigInteger retornaValor(int index){
        return this.lista.get(index);
    }
}
