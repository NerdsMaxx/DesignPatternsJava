/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import criterios.*;
import interfaces.ICriterioOrdenacao;
/**
 *
 * @author Guilherme
 */
public class FabricaDeCriterios {
    
    public enum Criterios{
        Nome, Matricula, EscolaENome, TitulacaoENome, EscolaTitulacaoENome, TitulacaoEscolaENome;
    }
    
    public static ICriterioOrdenacao getCriterio(String tipoDeCriterio){
        Criterios tipo = Criterios.valueOf(tipoDeCriterio);
        switch(tipo){
            case Nome:
                return new OrdenadoPorNome();
            
            case Matricula:
                return new OrdenadoPorMatricula();
            
            case EscolaENome:
                return new OrdenadoPorEscolaENome();
            
            case TitulacaoENome:
                return new OrdenadoPorTitulacaoENome();
            
            case EscolaTitulacaoENome:
                return new OrdenadoPorEscolaTitulacaoENome();
                
            case TitulacaoEscolaENome:
                return new OrdenadoPorTitulacaoEscolaENome();
                
            default:
                return null;
        }
    }
}
