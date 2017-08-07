/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

import java.util.*;

/**
 *
 * @author alumno
 */
public class Composite {
    
    private List<IView> component_list;
    
    public Composite(){
        component_list = new ArrayList<>();
    }
    
    public void add(IView component){
        component_list.add(component);
    
    }
    
    public void remove(IView component){
        component_list.remove(component);
    }
    
    public  List<IView> getComponet(){
        /*for (Iterator<IView> iterator = component_list.iterator(); iterator.hasNext();) {
            IView next = iterator.next();
        }
        System.out.println(component_list);*/
        return component_list;
    }
   
    
}
