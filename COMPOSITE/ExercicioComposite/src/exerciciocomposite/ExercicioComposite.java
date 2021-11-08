/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciocomposite;

import classes.Notebook;
import fabrica.FabricaComponente;
import interfaces.Componente;

/**
 *
 * @author guilherme
 */
public class ExercicioComposite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Componente processador = FabricaComponente.getComponente("Processador");
        Componente memoria = FabricaComponente.getComponente("Memoria");
        Componente armazenamento = FabricaComponente.getComponente("Armazenamento");
        Componente placa_video = FabricaComponente.getComponente("PlacaDeVideo");
        
        Notebook notebook = new Notebook();
        notebook.adiciona(processador);
        notebook.adiciona(memoria);
        notebook.adiciona(armazenamento);
        notebook.adiciona(placa_video);
        
        notebook.descricao();
        System.out.println("Preço total: R$ " + String.valueOf(notebook.getPreco()));
    }
    
}
