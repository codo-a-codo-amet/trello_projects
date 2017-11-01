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
    private String resultadoSignoUsado;
    private double decimales;

    public CalcuSimple() {
        
    }
  public CalcuSimple(String numeroA, String numeroB, String resultado, String signo) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
        this.resultado = resultado;
        this.signo = signo;
        
    }
    
    public String CalculadoraSimple(String evento){
        String boton=evento;
        
        return null;
        
    }
    
    public String getOperaciones(String valorA,String valorB, String signo){
        numeroA=valorA;
        numeroB=valorB;
     
        
      
        if (signo.equals("+")) {
            double r= Double.parseDouble(numeroA)+Double.parseDouble(numeroB);
             resultado= Double.toString(r);
        } else if(signo.equals("-")) {
             double r= Double.parseDouble(numeroA)-Double.parseDouble(numeroB);
             resultado= Double.toString(r);
        }else if(signo.equals("*")) {
             double r= Double.parseDouble(numeroA)*Double.parseDouble(numeroB);
             resultado= Double.toString(r);
        }else if(signo.equals("/")) {
             double r= Double.parseDouble(numeroA)/Double.parseDouble(numeroB);
             resultado= Double.toString(r);
  }
      
        for (int i = 0; i < resultado.length(); i++) {
            if (resultado.substring(i,i+1).equals(".")) {
                if(resultado.substring(i+1,i+2).equals("0")){
                    double d;
                    int j;
                    d = Double.parseDouble(resultado);
                    j= (int)d;
                    resultado = Integer.toString(j);
                    
                }
            }
        }
        
        
        return resultado;
       }
    
    public String getSignoUsado(String boton, String valorA, String valorB, String signo){
        if (boton.equals("+")){
            resultadoSignoUsado = getOperaciones (valorA, valorB,signo);
        }else if (boton.equals("-")){
            resultadoSignoUsado = getOperaciones (valorA, valorB,signo);
        }else if (boton.equals("*")){
            resultadoSignoUsado = getOperaciones (valorA, valorB,signo);
        }else if (boton.equals("/")){
            resultadoSignoUsado = getOperaciones (valorA, valorB,signo);
        }
        
        return resultadoSignoUsado;
    }
    
     public double getLimitarDecimales(double temperatura){
        double decimalesReducidos;
        double a;
        int valorEntero;
        a = temperatura * 10000;
        valorEntero = (int)a;
        decimalesReducidos = (double)valorEntero / 10000;
        
        return decimalesReducidos;
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
