/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 
 * @author alumno
 */
public class ConversorComboBoxModel implements ListModel<String>, ComboBoxModel<String>{

    protected List<String> combo_list;
    protected Integer elementoSeleccionado;
    
    public ConversorComboBoxModel(){
        combo_list = new ArrayList<>();
        elementoSeleccionado = 0;
    }
    
    public ConversorComboBoxModel(List<String> combo_list){
        this.combo_list = combo_list;
        elementoSeleccionado = 0;
    }
    
    
    @Override
    public int getSize() {
        return combo_list.size();
    }

    @Override
    public String getElementAt(int i) {
        return combo_list.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        
    }

    @Override
    public void setSelectedItem(Object o) {
        elementoSeleccionado = combo_list.indexOf(o);
    }

    @Override
    public Object getSelectedItem() {
        return combo_list.get(elementoSeleccionado);
    }
    
}
