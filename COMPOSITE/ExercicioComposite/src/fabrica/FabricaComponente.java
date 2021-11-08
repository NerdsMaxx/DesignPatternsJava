/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;
import classes.*;
import interfaces.Componente;
/**
 *
 * @author guilherme
 */
public class FabricaComponente {
    public enum Componentes {
        Processador, Memoria, Armazenamento, PlacaDeVideo
    }
    
    public static Componente getComponente(String tipoDeComponente){
        Componentes tipo = Componentes.valueOf(tipoDeComponente);
        
        switch(tipo){
            case Processador:
                return new Processador(3700, 4400, 4, 8, "Intel", 994);
            
            case Memoria:
                return new Memoria(2666, 8, "Dual-channel", "DDR4", "Corsair Vengeance", 300);
                
            case Armazenamento:
                return new Armazenamento(500, 350, 240, "SSD", "Kingston", 526);
            
            case PlacaDeVideo:
                return new PlacaDeVideo(1680, 6, 14000, "GDDR6", "Gigabyte NVIDIA", 728);
                
            default:
                return null;
        }
    }
}
