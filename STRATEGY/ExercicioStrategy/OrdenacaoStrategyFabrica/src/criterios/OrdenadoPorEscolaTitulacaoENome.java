/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criterios;
import classededados.Professor;
import interfaces.ICriterioOrdenacao;

/**
 *
 * @author guilherme
 */
public class OrdenadoPorEscolaTitulacaoENome implements ICriterioOrdenacao{
    @Override
    public boolean eMenor(Professor prof1, Professor prof2) {
        int resultado = prof1.getEscola().compareToIgnoreCase(prof2.getEscola());
        resultado = (resultado == 0) ? prof1.getTitulacao().compareToIgnoreCase(prof2.getTitulacao()) : resultado;
        resultado = (resultado == 0) ? prof1.getNome().compareToIgnoreCase(prof2.getNome()) : resultado;
       
        return (resultado <= 0);
    }
    
}
