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
public class Memoria implements Componente {
    private int velocidade = 0;
    private int capacidade = 0;
    private String channel = "";
    String tipo = "";
    private String marca = "";
    private int preco = 0;

    public Memoria(int velocidade, int capacidade, String channel, String tipo, String marca, int preco) {
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.channel = channel;
        this.tipo = tipo;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Descricao da memória");
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("Velocidade: " + String.valueOf(velocidade) + " MHz");
        System.out.println("Capacidade: " + String.valueOf(capacidade) + " GB");
        System.out.println("Channel: " + channel);
        System.out.println("Preco: R$ " + String.valueOf(preco));
    }
    
    @Override
    public int getPreco(){
        return this.preco;
    }
}
