/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author guilherme
 */
public interface Sujeito {
    public void incluirObservador(Observador obj);
    public void removerObservador(Observador obj);
    public void notificarObservador();
}
