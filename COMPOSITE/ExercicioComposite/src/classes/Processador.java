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
public class Processador implements Componente{
    private int frequencia_base = 0;
    private int frequencia_turbo = 0;
    private int qtdNucleos = 0;
    private int qtdThreads = 0;
    private String marca = "";
    private int preco = 0;

    public Processador(int frequencia_base, int frequencia_turbo, int qtdNucleos, int qtdThreads, String marca, int preco) {
        this.frequencia_base = frequencia_base;
        this.frequencia_turbo = frequencia_turbo;
        this.qtdNucleos = qtdNucleos;
        this.qtdThreads = qtdThreads;
        this.marca = marca;
        this.preco = preco;
    }
    
    @Override
    public void descricao(){
        System.out.println("Descricao do processador");
        System.out.println("Marca: " + marca);
        System.out.println("Frequencia Base: " + String.valueOf(frequencia_base) + " MHz");
        System.out.println("Frequencia Turbo: " + String.valueOf(frequencia_turbo) + " MHz");
        System.out.println("Quantidada de núcleos: " + String.valueOf(qtdNucleos));
        System.out.println("Quantidade de threads: " + String.valueOf(qtdThreads));
        System.out.println("Preco: R$ " + String.valueOf(preco));
    }
    
    @Override
    public int getPreco(){
        return this.preco;
    }
}
