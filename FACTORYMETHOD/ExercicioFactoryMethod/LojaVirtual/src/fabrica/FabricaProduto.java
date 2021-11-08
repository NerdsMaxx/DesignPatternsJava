/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;
import produtos.*;

/**
 *
 * @author Guilherme
 */
public class FabricaProduto {
    
    public enum Produtos{
        LIVRO, CDMUSICA, NOTEBOOK, CELULAR;
    }
    
    public static Produto getProduto(String tipoDeProduto){
        Produtos tipo = Produtos.valueOf(tipoDeProduto);
        switch(tipo){
            case LIVRO:
                return new Livro(1,52.00,tipoDeProduto,"Fulano1","Fulano2","EditoraQualquer",2001);
            case CDMUSICA:
                return new CDMusica(2,56.89,tipoDeProduto,"NomeQualquer","Banda1","Fulano","GeneroQualquer");
            case NOTEBOOK:
                return new Notebook(3,89.56,tipoDeProduto,"MarcaQualquer","ModeloQualquer","8 GB","100 GB","Intel",14,"Windows");
            case CELULAR:
                return new Celular(4,45.23,tipoDeProduto,"MarcaQualquer","ModeloQualquer","64 GB",14,"Android");
            default:
                return null;
        }
    }
}
