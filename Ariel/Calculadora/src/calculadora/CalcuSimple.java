/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author alumno
 */
public class CalcuSimple implements ICalculadora {
    private String numeroA;
    private String numeroB;
    private String resultado;
    private String miPantalla;
    private String signo;

    public CalcuSimple() {
        
    }
    public CalcuSimple(String numeroA, String numeroB, String resultado, String signo) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.resultado = resultado;
        this.signo = signo;
    }
    public String getOperaciones(String valorA,String valorB, String signo,String pantalla){
        numeroA=valorA;
        numeroB=valorB;
        miPantalla = pantalla;
        
        if (miPantalla.equals("")){
        if (signo.equals("+")) {
            double r= Double.parseDouble(numeroA)+Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        } else if(signo.equals("-")) {
             double r= Double.parseDouble(numeroA)-Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }else if(signo.equals("*")) {
             double r= Double.parseDouble(numeroA)*Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }else if(signo.equals("-")) {
             double r= Double.parseDouble(numeroA)/Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }
        }else {
             if (signo.equals("+")) {
            double r= Double.parseDouble(numeroA)+Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        } else if(signo.equals("-")) {
             double r= Double.parseDouble(numeroA)-Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }else if(signo.equals("*")) {
             double r= Double.parseDouble(numeroA)*Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }else if(signo.equals("-")) {
             double r= Double.parseDouble(numeroA)/Double.parseDouble(numeroB);
            resultado= Double.toString(r);
        }
        }
        
        
        
        return resultado;
       }
    
    public String getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(String numeroA) {
        this.numeroA = numeroA;
    }

    public String getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(String numeroB) {
        this.numeroB = numeroB;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    
    
   
    
    
}
