/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Componente;

/**
 *
 * @author guilherme
 */
public class Armazenamento implements Componente {
    private int velocidade_leitura = 0;
    private int velocidade_escrita = 0;
    private int capacidade = 0;
    private String tipo = "";
    private String marca = "";
    private int preco = 0;

    public Armazenamento(int velocidade_leitura, int velocidade_escrita, int capacidade, String tipo, String marca, int preco) {
        this.velocidade_leitura = velocidade_leitura;
        this.velocidade_escrita = velocidade_escrita;
        this.capacidade = capacidade;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Descricao do armazenamento");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidade de leitura: " + String.valueOf(velocidade_leitura) + " MB/s");
        System.out.println("Velocidade de escrita: " + String.valueOf(velocidade_escrita) + " MB/s");
        System.out.println("Capacidade: " + String.valueOf(capacidade) + " GB");
        System.out.println("Preco: R$ " + String.valueOf(preco));
    }
    
    @Override
    public int getPreco(){
        return this.preco;
    }
}
