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
public class Celular extends Produto{
    private String marca;
    private String modelo;
    private String capacidadeArmazenamento;
    private int tamanhoTela;
    private String sistemaOperacional;
    
    public Celular(int codigo, double preco, String tipo, String marca, String modelo, String capacidadeArmazenamento, int tamanhoTela, String sistemaOperacional) {
        super(codigo, preco, tipo);
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
    }
    
    public Celular(int codigo, double preco, String tipo) {
        super(codigo, preco, tipo);
    }
    
    public void setCelular(String marca, String modelo, String capacidadeArmazenamento, int tamanhoTela, String sistemaOperacional){
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tamanhoTela = tamanhoTela;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public int getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(int tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }
    
    @Override
    public String descricao(){
        return("Tipo: "+getTipo()+'\n'+
               "Marca: "+marca+'\n'+
               "Modelo: "+modelo+'\n'+
               "Capacidade do armazenamento: "+capacidadeArmazenamento+'\n'+
               "Tamanho da tela: "+String.valueOf(tamanhoTela)+'\n'+
               "Sistema operacional: "+sistemaOperacional+'\n'+
               "Preco: "+String.valueOf(getPreco()));
    }
    
}
