/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classededados.Professor;

/**
 *
 * @author guilherme
 */
public class OrdenadoPorTitulacaoENome extends ProfessorPersistenciaTemplateMethod{

    public OrdenadoPorTitulacaoENome(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        int resultado = prof1.getTitulacao().compareToIgnoreCase(prof2.getTitulacao());
        resultado = (resultado == 0) ? prof1.getNome().compareToIgnoreCase(prof2.getNome()) : resultado;
       
        return (resultado <= 0);
    }
    
}
