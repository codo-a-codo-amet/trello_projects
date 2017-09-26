/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorNull implements IConversor {

    @Override
    public Double convertir(Double valor, int ti, int to) {
        return 0.00;
    }

    @Override
    public List<String> getUnitList() {
        List<String> lista_vacia = new ArrayList<>();
        lista_vacia.add("----------");
        
        
        return lista_vacia;
    }

}
