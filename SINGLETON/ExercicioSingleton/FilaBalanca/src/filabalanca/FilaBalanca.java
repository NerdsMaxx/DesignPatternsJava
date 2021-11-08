/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filabalanca;
import classes.*;
/**
 *
 * @author guilherme
 */
public class FilaBalanca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Cliente godofredo = new Cliente("Godofredo das Cove",Fila.getInstanciaDaFila());
        
        System.out.println(godofredo.descricao());

        Cliente orozimbo = new Cliente("Orozimbo dos Pepinos", Fila.getInstanciaDaFila());
        
        System.out.println(orozimbo.descricao());
        
        Cliente nabuco = new Cliente("Nabuco das Rosas ",Fila.getInstanciaDaFila());
        
        System.out.println(nabuco.descricao());
        
    }
    
}
