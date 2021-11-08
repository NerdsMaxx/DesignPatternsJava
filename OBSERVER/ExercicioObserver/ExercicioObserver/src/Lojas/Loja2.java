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
public class Loja2 implements Observador{
    private Sujeito apple;
    private DadosDosProdutosApple dados;

    public Loja2(Sujeito apple) {
        this.apple = apple;
        this.apple.incluirObservador(this);
    }

    @Override
    public void atualizar(DadosDosProdutosApple dados) {
        this.dados = dados;
        telefonar();
    }
    
    public void telefonar(){
        String telefone = "Telefone: (62) 1234-5678\n";
        
        String dadosNaTela = "";
        
        dadosNaTela = "Iphone: " + dados.getQuantidadeDeIphone() + " unidades\n";
        dadosNaTela += "Ipad: " + dados.getQuantidadeDeIpad() + " unidades\n";
        dadosNaTela += "Ipad Air: " + dados.getQuantidadeDeIpadAir() + " unidades\n";
        dadosNaTela += "Ipad Pro: " + dados.getQuantidadeDeIpadPro() + " unidades\n";
        dadosNaTela += "Ipad Mini: " + dados.getQuantidadeDeIpadMini() + " unidades\n";
        dadosNaTela += "Mac Book Air: " + dados.getQuantidadeDeMacBookAir() + " unidades\n";
        dadosNaTela += "Mac Book Pro: " + dados.getQuantidadeDeMacBookPro() + " unidades\n";
        
        System.out.println("Loja 2\n" + telefone + dadosNaTela);
    }
}
