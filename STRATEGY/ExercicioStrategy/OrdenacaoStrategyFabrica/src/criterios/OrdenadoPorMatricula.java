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
public class OrdenadoPorMatricula implements ICriterioOrdenacao{
    @Override
    public boolean eMenor(Professor prof1, Professor prof2) {
        return prof1.getMatricula() < prof2.getMatricula();
    }
}