/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import classededados.Professor;
/**
 *
 * @author guilherme
 */
public interface ICriterioOrdenacao {
    boolean eMenor(Professor prof1, Professor prof2);
}
