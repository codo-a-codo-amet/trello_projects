/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase40;

import java.util.List;

/**
 *
 * @author alumno
 * @param <Type>
 */
public interface IComposite <Type extends IComposite> {
    public void Add(Type newComponent);
    public void Remove(Type newComponent);
    public List<Type> getComponentList();
}
