/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

//import clase29.IView;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Composite {
    private List<IView> component_list;
    
    public void add(IView component){
        component_list.add(component);
        
    }

    
}
