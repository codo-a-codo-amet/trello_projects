/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase25;

/**
 *
 * @author alumno
 */
public class Clase25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro unPerro = new Perro () {
            @Override
            public boolean EsIgualA(IAritmetica Objeto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String Descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        };
        Perro otroPerro = new Perro () {
            @Override
            public boolean EsIgualA(IAritmetica Objeto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String Descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        
        };
        
        System.out.println(unPerro.descripcion());
        
        unPerro.Sumar(otroPerro);
    
        System.out.println(unPerro.descripcion);
        
    
    
    
        IAritmetica primerObjetoAProbar = new Perro() {
            @Override
            public boolean EsIgualA(IAritmetica Objeto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String Descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        IAritmetica segundoObjetoAProbar = new Perro(3) {
            @Override
            public boolean EsIgualA(IAritmetica Objeto) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String Descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public boolean descripcion() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        //Pruebas al objeto
        // Prueba de suma
        primerObjetoAProbar.Sumar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de Resta
        primerObjetoAProbar.Restar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de Multiplicacion
        primerObjetoAProbar.Multiplicar(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de division
        primerObjetoAProbar.Dividir(segundoObjetoAProbar);
        System.out.println(primerObjetoAProbar.descripcion());
        
        //prueba de igualdad
        Boolean esIgual = primerObjetoAProbar.EsIgualA(segundoObjetoAProbar);
        System.out.println("Es igual: " + esIgual);
        
        
    }
    
}
