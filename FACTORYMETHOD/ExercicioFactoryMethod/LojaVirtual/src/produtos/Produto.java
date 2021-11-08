/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author Guilherme
 */
public abstract class Produto {
    //Atributos
    private int codigo;
    private double preco;
    private String tipo;
    
    //Métodos
    public abstract String descricao();
    
    public Produto(int codigo, double preco, String tipo) {
        this.codigo = codigo;
        this.preco = preco;
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
