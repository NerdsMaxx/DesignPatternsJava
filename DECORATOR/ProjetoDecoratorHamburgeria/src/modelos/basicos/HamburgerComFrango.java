/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.basicos;

/**
 *
 * @author guilherme
 */
public class HamburgerComFrango implements IHamburger{
    private String descricao;
    
    public HamburgerComFrango(){
        descricao = "Pão, frango, queijo";
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double preco() {
        return 40.00;
    }
    
    
}
