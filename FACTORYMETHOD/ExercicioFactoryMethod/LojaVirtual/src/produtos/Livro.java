/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package produtos;

/**
 *
 * @author Guilherme
 */
public class Livro extends Produto{
    
    private String autor;
    private String tradutor;
    private String editora;
    private int anoPublicacao;
    
    public Livro(int codigo, double preco, String tipo, String autor, String tradutor, String editora, int anoPublicacao){
        super(codigo,preco,tipo);
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public Livro(int codigo, double preco, String tipo){
        super(codigo,preco,tipo);
    }
    
    public void setLivro(String autor, String tradutor, String editora, int anoPublicacao){
        this.autor = autor;
        this.tradutor = tradutor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTradutor() {
        return tradutor;
    }

    public void setTradutor(String tradutor) {
        this.tradutor = tradutor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
    @Override
    public String descricao(){
        return("Tipo: "+getTipo()+'\n'+
               "Autor: "+autor+'\n'+
               "Tradutor: "+tradutor+'\n'+
               "Editora: "+editora+'\n'+
               "Ano de publicacao: "+String.valueOf(anoPublicacao)+'\n'+
               "Preco: "+String.valueOf(getPreco()));
    }
}
