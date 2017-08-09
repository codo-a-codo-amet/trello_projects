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
public class Composite {
    
    protected List<IView> component_list;

    public Composite() {
        component_list = new ArrayList<>();
    }
    
    
    
    final public void add(IView component){
        component_list.add(component);
    }
}
