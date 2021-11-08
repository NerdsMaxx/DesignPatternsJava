/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojavirtual;
import javax.swing.JOptionPane;
import produtos.*;
import fabrica.FabricaProduto;
/**
 *
 * @author Guilherme
 */
public class LojaVirtual {

    private static void imprimirDados(Produto objeto){
        String saida = objeto.descricao();
        JOptionPane.showMessageDialog(null, saida);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean controle = true;
        Object[] opcoes = { "LIVRO", "CDMUSICA", "NOTEBOOK", "CELULAR"};
        Object tipoDoProduto;
        Produto obj = null;
        do{
            tipoDoProduto = JOptionPane.showInputDialog(null,
                                "Deseja finalizar o programa?",
                                "Finalização",
                                JOptionPane.PLAIN_MESSAGE,
                                null,opcoes,"LIVRO");
            obj = FabricaProduto.getProduto(tipoDoProduto.toString());
            imprimirDados(obj);
        }while(controle);
    }
}
