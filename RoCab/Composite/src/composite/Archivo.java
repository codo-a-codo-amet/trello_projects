/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;
//package estructurales.composite.composite01;
public class Archivo extends Nodo
{
    public Archivo( String nombre )
    {
        this.setTipoNodo( Nodo.ARCHIVO );
        this.setNombre( nombre );
    }
    // ----------------------------
    @Override
     public void mostrar()
    {
        System.out.println( "Archivo: [" + this.getNombre() + "]" );
    }
}