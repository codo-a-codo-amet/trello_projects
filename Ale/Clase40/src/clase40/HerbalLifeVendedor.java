/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class HerbalLifeVendedor implements IComposite{
    
    protected List<IComposite> vendedores;

    public HerbalLifeVendedor() {
        vendedores  = new ArrayList<>();
    }
    
    @Override
    public void add(IComposite newComponent) {
        vendedores.add(newComponent);
     }

    @Override
    public void Remove(IComposite component) {
        vendedores.remove(component);
    }

    @Override
    public List getComoponentList() {
        
        return vendedores;
    }

    @Override
    public String toString() {
        return "Yo soy un vendedor y esta es mi lista de esclavos " + vendedores; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
