/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;
import java.util.ArrayList;
import java.util.List;
import interfaces.Componente;

/**
 *
 * @author guilherme
 */
public class Notebook implements Componente{
    private List<Componente> componentes;
    private int preco_total = 0;
    
    public Notebook() {
        this.componentes = new ArrayList <Componente>();
    }
    
    public void adiciona(Componente componente) { 
        this.componentes.add(componente);
        preco_total += componente.getPreco();
    }
    
    public void remover(Componente componente) { 
        this.componentes.remove(componente);
        preco_total -= componente.getPreco();
    }
    
    @Override
    public void descricao() {
        for (Componente componente : this.componentes) {
            componente.descricao(); 
            System.out.println();
        }
    }
    
    @Override
    public int getPreco(){
        return this.preco_total;
    }
}
