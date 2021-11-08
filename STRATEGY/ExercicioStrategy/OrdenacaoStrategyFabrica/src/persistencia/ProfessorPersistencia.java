/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;
import classededados.Professor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import interfaces.ICriterioOrdenacao;
import fabrica.FabricaDeCriterios;
/**
 *
 * @author eugeniojulio
 */
public class ProfessorPersistencia {
    //Atributos
    private String nomeDoArquivo;
    private ICriterioOrdenacao criterio = null;
    //Metodos
    public ProfessorPersistencia(String nome, ICriterioOrdenacao criterio){
        this.nomeDoArquivo = nome;
        this.criterio = criterio;
    }
    
    public Iterator listagemDeProfessoresOrdenados()throws Exception{
        try{
            ArrayList<Professor> dadosDosProfessores = new ArrayList<Professor>();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br  = new BufferedReader(fr);
            String linha = "";
            int pos = 0;
            while((linha=br.readLine())!=null){
                String[] vetorDeString = linha.split(";");
                if(vetorDeString.length < 6) throw new Exception("Erro de leitura de dados");
                Professor objetoProfessor = new Professor(Integer.parseInt(vetorDeString[0]), vetorDeString[1], vetorDeString[2], vetorDeString[3], vetorDeString[4], vetorDeString[5]);
                dadosDosProfessores.add(objetoProfessor);
                pos++;
            }
            br.close();
            //algoritmo de Ordenação
            for (int i = 0; i < dadosDosProfessores.size(); i++) {
                for (int j = i; j < dadosDosProfessores.size(); j++) {
                    if (!criterio.eMenor(dadosDosProfessores.get(i), dadosDosProfessores.get(j))) {
                        Professor temp = dadosDosProfessores.get(j);
                        dadosDosProfessores.set(j, dadosDosProfessores.get(i));
                        dadosDosProfessores.set(i, temp);
                    }
                }
            }
            return dadosDosProfessores.iterator();
        }catch(Exception erro){
            throw erro;
        } 
    }
    
}
