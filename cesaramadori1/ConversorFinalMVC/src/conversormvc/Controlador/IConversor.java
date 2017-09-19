/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormvc.Controlador;

import java.util.List;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface IConversor {
    public Double convertir (Double valor, int ti , int to);
    
    public List<String> getUnitList();
}
