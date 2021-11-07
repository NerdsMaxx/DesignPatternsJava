/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.*;
import modelos.*;
/**
 *
 * @author Guilherme
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Vector<String> lista = new Vector<String>();
        lista.add("João");
        lista.add("Guilherme");
        lista.add("Eugenio");
        lista.add("Marcio");
        
        //***********************************************//
        PesquisaString x = new PesquisaNome();
        
        if(x.contem(lista, "Marcio")){
            System.out.println("Encontrado\n");
        }
        else{
            System.out.println("Não encontrado\n");
        }
        
        //**********************************************//
        PesquisaString y = new AdapterPesquisa();
        
        if(y.contem(lista, "Sérgio")){
            System.out.println("Encontrado\n");
        }
        else{
            System.out.println("Não encontrado\n");
        }
    }
    
}
