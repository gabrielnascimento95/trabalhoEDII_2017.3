/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import java.math.BigInteger;

/**
 *
 * @author gabriel
 */
public class ControllerHash {
    private final static int TABELA_TAMANHO = 5000000; 
    Hash[] tabela;

    ControllerHash() {
        tabela = new Hash[TABELA_TAMANHO];
        for(int i =0; i < TABELA_TAMANHO; i++){
            tabela[i] = null;
        }
    }
    
    public int retorna(String chave){
        int hash = new BigInteger(converteAsc(chave)).mod(new BigInteger(((Integer) TABELA_TAMANHO).toString())).intValue();
        while (tabela[hash] != null && tabela[hash].getChave() != chave) {
            hash = (hash + 1) % TABELA_TAMANHO;
        }
        if (tabela[hash] == null) {
            return -1;
        } else {
            return tabela[hash].getValor();
        }
    }
    
    public int insere(String chave, int pos){
        int hash = new BigInteger(converteAsc(chave)).mod(new BigInteger(((Integer)TABELA_TAMANHO).toString())).intValue();
        while (tabela[hash] != null && tabela[hash].getChave()!= chave)
                  hash = (hash + 1) % TABELA_TAMANHO;
            tabela[hash] = new Hash(chave, pos);
        return hash;
    }

    private static String converteAsc(String chave) {
        StringBuilder sb = new StringBuilder();
        long ascParaInteiro;
        for (int i = 0; i < chave.length(); i++){
            char c = chave.charAt(i);
            ascParaInteiro = (int)c; 
            sb.append(ascParaInteiro);
        }
        return String.valueOf(sb);
    }  
}
