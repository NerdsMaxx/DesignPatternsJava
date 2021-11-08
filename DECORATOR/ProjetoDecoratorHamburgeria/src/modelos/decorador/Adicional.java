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
public abstract class Adicional implements IHamburger{
    protected IHamburger hamburger = null;
    
    public Adicional(IHamburger hamburger) {
        this.hamburger = hamburger;
    }    
}
