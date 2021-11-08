/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FornecedorApple;
import interfaces.*;
import dadosDoEstoqueDaApple.DadosDosProdutosApple;
import java.util.*;
/**
 *
 * @author guilherme
 */
public class Apple implements Sujeito{
    private ArrayList observers;
    private DadosDosProdutosApple dados;
    
    public Apple(){
        this.observers = new ArrayList();
    }

    @Override
    public void incluirObservador(Observador obj) {
        this.observers.add(obj);
    }

    @Override
    public void removerObservador(Observador obj) {
        int pos = this.observers.indexOf(obj);
        if(pos >= 0){
            this.observers.remove(pos);
        }
    }

    @Override
    public void notificarObservador() {
        for(int i = 0; i < this.observers.size(); i++){
            Observador observer = (Observador)this.observers.get(i);
            observer.atualizar(this.dados);
        }
    }

    public void setDados(DadosDosProdutosApple dados) {
        this.dados = dados;
        notificarObservador();
    }
    
    
}
