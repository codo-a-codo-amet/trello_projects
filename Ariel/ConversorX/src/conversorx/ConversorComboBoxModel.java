/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorx;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author alumno
 */
public class ConversorComboBoxModel implements ListModel, ComboBoxModel{

    protected List<String> combo_list;
    protected Integer elemento_seleccionado;
    
    public ConversorComboBoxModel (){
        combo_list = new ArrayList<>();
        elemento_seleccionado = 0;
        
    }
    
    public ConversorComboBoxModel(List<String> combo_list){
        this.combo_list = combo_list;
        elemento_seleccionado = 0;
    }
    
    @Override
    public int getSize() {
    return    combo_list.size();
    }

    @Override // por ahi n o lo usamos
    public Object getElementAt(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override //por ahi no lo usamos
    public void addListDataListener(ListDataListener ll) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setSelectedItem(Object o) {
        elemento_seleccionado = combo_list.indexOf(o);
    }
    

    @Override
    public Object getSelectedItem() {
        return combo_list.get(elemento_seleccionado);
   }
    
}
