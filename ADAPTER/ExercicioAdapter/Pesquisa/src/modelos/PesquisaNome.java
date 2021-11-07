/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.Vector;
/**
 *
 * @author Guilherme
 */
public class PesquisaNome implements PesquisaString{
    
    @Override
    public boolean contem(Vector<String> vector, String element){
        
        for(int i=0; i<vector.size(); i++){
            if(vector.elementAt(i) == element){
                return true;
            }
        }
        return false;
    }
}
