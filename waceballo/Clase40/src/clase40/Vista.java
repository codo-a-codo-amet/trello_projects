/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

import java.util.Iterator;

/**
 *
 * @author alumno
 */
public class Vista extends Composite implements IView{

    public Vista() {
        vistaPrincipal unaNuevaVista = new vistaPrincipal();
        unaNuevaVista.setVisible(true);
    }
    
    
    @Override
    public void Draw(String texto) {
        for (Iterator<IView> iterator = component_list.iterator(); iterator.hasNext();) {
            IView next = iterator.next();
            next.Draw(texto);
        }
        System.out.println(texto);
    }

    
    
    
    
}
