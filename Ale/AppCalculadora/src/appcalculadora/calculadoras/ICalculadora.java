/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora.calculadoras;

/**
 *
 * @author alumno
 */
public interface ICalculadora {
    
    public String getOperation();
    public void setOperation(String operation);
    
    public float getElement(int position);
    public void setElement(int position, float element);
    
    public float executeBinaryOpertion();
    
//    public float binaryOperation(float element1, String operation, float element2);
}
