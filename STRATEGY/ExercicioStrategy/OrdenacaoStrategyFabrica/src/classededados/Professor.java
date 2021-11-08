/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classededados;

/**
 *
 * @author guilherme
 */
public class Professor {
    private int matricula;
    private String nome;
    private String escola;
    private String titulacao;
    private String tipoDeContrato;
    private String dataDaContratacao;
    
    public Professor(int matricula, String nome, String escola, String titulacao, String tipoDeContrato, String dataDaContratacao) {
        this.matricula = matricula;
        this.nome = nome;
        this.escola = escola;
        this.titulacao = titulacao;
        this.tipoDeContrato = tipoDeContrato;
        this.dataDaContratacao = dataDaContratacao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getTipoDeContrato() {
        return tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public String getDataDaContratacao() {
        return dataDaContratacao;
    }

    public void setDataDaContratacao(String dataDaContratacao) {
        this.dataDaContratacao = dataDaContratacao;
    }
    
    
    
}
