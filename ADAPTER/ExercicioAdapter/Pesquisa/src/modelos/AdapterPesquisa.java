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
public class AdapterPesquisa implements PesquisaString{
    @Override
    public boolean contem(Vector<String> vector, String element){
        return vector.contains(element);
    }
}
