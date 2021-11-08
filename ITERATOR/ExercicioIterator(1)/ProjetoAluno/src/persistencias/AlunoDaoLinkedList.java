/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencias;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Iterator;
import modelos.Aluno;
import modelos.IDados;

/**
 *
 * @author guilherme
 */
public class AlunoDaoLinkedList implements IDados{

    @Override
    public Iterator obterListagemDeAlunos(String nomeArquivoDisco)throws Exception {
        LinkedList linkedListAlunos = new LinkedList();
        FileReader fr = new FileReader(nomeArquivoDisco);
        BufferedReader br  = new BufferedReader(fr);
        String linha = "";
        while((linha=br.readLine())!=null){
            String[] vetorDeString = linha.split(";");
            if(vetorDeString.length < 4) throw new Exception("Erro de leitura de dados");
            Aluno objetoAluno = new Aluno(vetorDeString[0], vetorDeString[1], vetorDeString[2], vetorDeString[3]);
            linkedListAlunos.add(objetoAluno); 
        }
        return linkedListAlunos.iterator();
    }
    
}
