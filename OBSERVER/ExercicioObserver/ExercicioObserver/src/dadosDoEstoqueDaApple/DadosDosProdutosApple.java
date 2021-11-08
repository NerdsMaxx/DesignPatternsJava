/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dadosDoEstoqueDaApple;

/**
 *
 * @author guilherme
 */
public class DadosDosProdutosApple {
    //Iphone
    private int quantidadeDeIphone = 0;
    
    //Ipad
    private int quantidadeDeIpad = 0;
    private int quantidadeDeIpadAir = 0;
    private int quantidadeDeIpadPro = 0;
    private int quantidadeDeIpadMini = 0;
    
    //Mac Book
    private int quantidadeDeMacBookAir = 0;
    private int quantidadeDeMacBookPro = 0;

    public DadosDosProdutosApple(int qtdIphone, int qtdIpad, int qtdIpadAir, int qtdIpadPro,
            int qtdIpadMini, int qtdMacBookAir, int qtdMacBookPro) {
        this.quantidadeDeIphone = qtdIphone;
        
        this.quantidadeDeIpad = qtdIpad;
        this.quantidadeDeIpadAir = qtdIpadAir;
        this.quantidadeDeIpadPro = qtdIpadPro;
        this.quantidadeDeIpadMini = qtdIpadMini;
        
        this.quantidadeDeMacBookAir = qtdMacBookAir;
        this.quantidadeDeMacBookPro = qtdMacBookPro;
    }

    public int getQuantidadeDeIphone() {
        return quantidadeDeIphone;
    }

    public int getQuantidadeDeIpad() {
        return quantidadeDeIpad;
    }

    public int getQuantidadeDeIpadAir() {
        return quantidadeDeIpadAir;
    }

    public int getQuantidadeDeIpadPro() {
        return quantidadeDeIpadPro;
    }

    public int getQuantidadeDeIpadMini() {
        return quantidadeDeIpadMini;
    }

    public int getQuantidadeDeMacBookAir() {
        return quantidadeDeMacBookAir;
    }

    public int getQuantidadeDeMacBookPro() {
        return quantidadeDeMacBookPro;
    }
    
    
}
