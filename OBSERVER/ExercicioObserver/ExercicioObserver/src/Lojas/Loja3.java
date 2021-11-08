package Lojas;
import interfaces.*;
import dadosDoEstoqueDaApple.*;

/**
 *
 * @author guilherme
 */
public class Loja3 implements Observador{
    private Sujeito apple;
    private DadosDosProdutosApple dados;

    public Loja3(Sujeito apple) {
        this.apple = apple;
        this.apple.incluirObservador(this);
    }

    @Override
    public void atualizar(DadosDosProdutosApple dados) {
        this.dados = dados;
        enviarMensagemWhatsApp();
    }
    
    public void enviarMensagemWhatsApp(){
        String WhatsApp = "WhatsApp: (62) 9876-5432\n";
        
        String dadosNaTela = "";
        
        dadosNaTela = "Iphone: " + dados.getQuantidadeDeIphone() + " unidades\n";
        dadosNaTela += "Ipad: " + dados.getQuantidadeDeIpad() + " unidades\n";
        dadosNaTela += "Ipad Air: " + dados.getQuantidadeDeIpadAir() + " unidades\n";
        dadosNaTela += "Ipad Pro: " + dados.getQuantidadeDeIpadPro() + " unidades\n";
        dadosNaTela += "Ipad Mini: " + dados.getQuantidadeDeIpadMini() + " unidades\n";
        dadosNaTela += "Mac Book Air: " + dados.getQuantidadeDeMacBookAir() + " unidades\n";
        dadosNaTela += "Mac Book Pro: " + dados.getQuantidadeDeMacBookPro() + " unidades\n";
        
        System.out.println("Loja 3\n" + WhatsApp + dadosNaTela);
    }
}
