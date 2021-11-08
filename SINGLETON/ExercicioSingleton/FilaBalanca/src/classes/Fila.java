/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author guilherme
 */
public class Fila {
    private String identificador = "Fila de balanca";
    private int quantidadeDeClientes = 0;
    
    private Fila(){
    }
    
    private static Fila filaUnica = null;
    
    public static Fila getInstanciaDaFila() {
        if(filaUnica == null){
            filaUnica = new Fila();
        }
        return filaUnica;
    }
    
    public String getIdentificador(){
        return identificador;
    }
    
    public int getQuantidadeDeClientes(){
        return quantidadeDeClientes;
    }
    
    public void setQuantidadeDeClientes(){
        this.quantidadeDeClientes++;
    }
}
