/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lojas;
import interfaces.*;
import dadosDoEstoqueDaApple.*;

/**
 *
 * @author guilherme
 */
public class Loja1 implements Observador{
    private Sujeito apple;
    private DadosDosProdutosApple dados;

    public Loja1(Sujeito apple) {
        this.apple = apple;
        this.apple.incluirObservador(this);
    }

    @Override
    public void atualizar(DadosDosProdutosApple dados) {
        this.dados = dados;
        enviarEmail();
    }
    
    public void enviarEmail(){
        String email = "Email: loja1@gmail.com\n";
        
        String dadosNaTela = "";
        
        dadosNaTela = "Iphone: " + dados.getQuantidadeDeIphone() + " unidades\n";
        dadosNaTela += "Ipad: " + dados.getQuantidadeDeIpad() + " unidades\n";
        dadosNaTela += "Ipad Air: " + dados.getQuantidadeDeIpadAir() + " unidades\n";
        dadosNaTela += "Ipad Pro: " + dados.getQuantidadeDeIpadPro() + " unidades\n";
        dadosNaTela += "Ipad Mini: " + dados.getQuantidadeDeIpadMini() + " unidades\n";
        dadosNaTela += "Mac Book Air: " + dados.getQuantidadeDeMacBookAir() + " unidades\n";
        dadosNaTela += "Mac Book Pro: " + dados.getQuantidadeDeMacBookPro() + " unidades\n";
        
        System.out.println("Loja 1\n" + email + dadosNaTela);
    }
}
