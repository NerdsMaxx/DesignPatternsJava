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
public class Cliente {
    private String nome = "";
    private Fila fila = null;

    public Cliente(String nome, Fila fila) {
        this.nome = nome;
        this.fila = fila;
        fila.setQuantidadeDeClientes();
    }
    
    public String descricao(){
        String saida = "\n\nDados do Cliente\n";
        saida += "Nome: " + nome + "\n";
        saida += "Fila: " + fila.getIdentificador() + "\n";
        saida += "Quantidade de Clientes: " + fila.getQuantidadeDeClientes() + "\n";
        saida += "Codigo: " + fila.hashCode();
        return saida;
    }
}
