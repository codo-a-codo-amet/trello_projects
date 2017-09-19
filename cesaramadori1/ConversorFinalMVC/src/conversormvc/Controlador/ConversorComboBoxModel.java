/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package conversormvc.Controlador;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConversorComboBoxModel implements ComboBoxModel<String>,ListModel<String>{

    protected List<String> combo_list;
    protected Integer elementoSeleccionado;
    
    public ConversorComboBoxModel() {
        combo_list = new ArrayList<>();
        elementoSeleccionado = 0;
    }

    public ConversorComboBoxModel(List<String> combo_list) {
        this.combo_list = combo_list;
        elementoSeleccionado = 0;
    }
    
    
    
    @Override
    public void setSelectedItem(Object anItem) {
         elementoSeleccionado = combo_list.indexOf(anItem);
    }

    @Override
    public Object getSelectedItem() {
        return combo_list.get(elementoSeleccionado);
    }

    @Override
    public int getSize() {
        return combo_list.size();
    }

    @Override
    public String getElementAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        System.out.println("Por ahora nada"); 
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        System.out.println("Por ahora nada"); 
    }

}
