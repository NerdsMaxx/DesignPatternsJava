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
public class OrdenadoPorMatricula extends ProfessorPersistenciaTemplateMethod{

    public OrdenadoPorMatricula(String nome) {
        super(nome);
    }

    @Override
    public boolean ePrimeiro(Professor prof1, Professor prof2) {
        return prof1.getMatricula() < prof2.getMatricula();
    }
    
    
}
