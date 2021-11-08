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
public class PlacaDeVideo implements Componente {
    private int velocidade_clock = 0;
    private int capacidadeVRAM = 0;
    private int velocidadeVRAM = 0;
    private String tipoVRAM = "";
    private String marca = "";
    private int preco = 0;

    public PlacaDeVideo(int velocidade_clock, int capacidadeVRAM, int velocidadeVRAM, String tipoVRAM, String marca, int preco) {
        this.velocidade_clock = velocidade_clock;
        this.capacidadeVRAM = capacidadeVRAM;
        this.velocidadeVRAM = velocidadeVRAM;
        this.tipoVRAM = tipoVRAM;
        this.marca = marca;
        this.preco = preco;
    }

    @Override
    public void descricao() {
        System.out.println("Descricao da placa de vídeo");
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade de clock: " + String.valueOf(velocidade_clock) + " MHz");
        System.out.println("Velocidade do VRAM: " + String.valueOf(velocidadeVRAM) + " MHz");
        System.out.println("Capacidade do VRAM: " + String.valueOf(capacidadeVRAM) + " GB");
        System.out.println("Tipo de VRAM: " + tipoVRAM);
        System.out.println("Preco: R$ " + String.valueOf(preco));
    }
    
    @Override
    public int getPreco(){
        return this.preco;
    }
}
