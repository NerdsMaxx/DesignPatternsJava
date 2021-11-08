/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos.decorador;
import modelos.basicos.IHamburger;

/**
 *
 * @author guilherme
 */
public class Cebola extends Adicional{

    public Cebola(IHamburger hamburger) {
        super(hamburger);
    }

    @Override
    public String getDescricao() {
        return hamburger.getDescricao() + ", cebola";
    }

    @Override
    public double preco() {
        return hamburger.preco() + 1.00;
    }
    
    
    
}
