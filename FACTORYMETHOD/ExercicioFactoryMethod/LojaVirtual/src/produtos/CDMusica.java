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
public class CDMusica extends Produto{
    private String nomeDoAlbum;
    private String banda;
    private String cantor;
    private String generoMusical;
    
    public CDMusica(int codigo, double preco, String tipo, String nomeDoAlbum, String banda, String cantor, String generoMusical) {
        super(codigo, preco, tipo);
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }
    
    public CDMusica(int codigo, double preco, String tipo) {
        super(codigo, preco, tipo);
    }
    
    public void setCDMusica(String nomeDoAlbum, String banda, String cantor, String generoMusical){
        this.nomeDoAlbum = nomeDoAlbum;
        this.banda = banda;
        this.cantor = cantor;
        this.generoMusical = generoMusical;
    }

    public String getNomeDoAlbum() {
        return nomeDoAlbum;
    }

    public void setNomeDoAlbum(String nomeDoAlbum) {
        this.nomeDoAlbum = nomeDoAlbum;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }


    
    @Override
    public String descricao(){
        return("Tipo: "+getTipo()+'\n'+
               "Nome do album: "+nomeDoAlbum+'\n'+
               "Banda: "+banda+'\n'+
               "Cantor: "+cantor+'\n'+
               "Genero Musical: "+generoMusical+'\n'+
               "Preco: "+String.valueOf(getPreco()));
    }
}
