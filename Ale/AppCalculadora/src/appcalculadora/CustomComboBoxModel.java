/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author alumno
 */
public class CustomComboBoxModel implements ComboBoxModel<String>, ListModel<String> {

    protected List<String> combo_list;
    protected Integer elemento_seleccionado;

    public CustomComboBoxModel() {
        combo_list = new ArrayList<>();
        elemento_seleccionado = 0;
    }

    public CustomComboBoxModel(List<String> combo_list) {
        this.combo_list = combo_list;
        elemento_seleccionado = 0;
    }

    @Override
    public void setSelectedItem(Object o) {
        elemento_seleccionado = combo_list.indexOf(o);
    }

    @Override
    public Object getSelectedItem() {
        return combo_list.get(elemento_seleccionado);
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
        System.out.print("Aca no hay nada");
    }

    @Override
    public void removeListDataListener(ListDataListener ll) {
        System.out.print("Aca tampoco");

    }

}
