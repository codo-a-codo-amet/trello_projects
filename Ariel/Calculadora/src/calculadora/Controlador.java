/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Event;
import java.awt.event.ActionEvent;

/**
 *
 * @author alumno
 */
public class Controlador implements IViewEventListener{
    
    private String valorA;
    private String valorB;
    private String signo;
    private String boton;
    private String laPantalla;
    private String memoria;
    private boolean signoUsado;
    protected ICalculadora calculadora;
    protected VistaCalculadora vistaCalculadora;
    public Controlador() {
       signo="";
       signoUsado = false;
        vistaCalculadora = new VistaCalculadora();
        vistaCalculadora.setVisible(true);
    }

    public void Run() {
        //A partir de ahora, escucha lo que le sucede a la vista.
        vistaCalculadora.AddEventListener(this);

        // Lista de conversores
       // System.out.println("Lista de converors: " + ConversorFactory.GetConversorList());
        
     
    }

   
    public void listen(Event event) {
        
        System.out.println("Objecto dentro del evento: " + event.target.getClass().getCanonicalName());
        ActionEvent ae = (ActionEvent) event.target;
        laPantalla = vistaCalculadora.getjPantalla().getText();
        boton = ae.getActionCommand();
        //Calculadora Simple
        //Números
        
        calculadora = CalcuFactory.CreateCalculadora("CalcuSimple");
        // \d -> Es una Regular expression que indica todo aquello que sea un string numerico.
        if(boton.matches("\\d")){
            if (laPantalla.length() <21){
            if(laPantalla.equals("0")||laPantalla.equals(memoria)){
            vistaCalculadora.getjPantalla().setText(ae.getActionCommand().toString());
            }else{
            vistaCalculadora.getjPantalla().setText(vistaCalculadora.getjPantalla().getText()+ae.getActionCommand().toString());
            }
            }
        //Punto y condicional para que no se pueda poner mas de un punto  
        }else if(boton.equals(".")){
            if(laPantalla.equals("0")){
            vistaCalculadora.getjPantalla().setText("0.");
            }else {
                if (!HayPunto(vistaCalculadora.getjPantalla().getText())){
                vistaCalculadora.getjPantalla().setText(vistaCalculadora.getjPantalla().getText()+ae.getActionCommand().toString());
                }
            }
        //Reconociendo botones de Operaciones    
        }else if (boton.equals("+")||boton.equals("-")||boton.equals("*")||boton.equals("/")){
            if(boton.equals("+")){
                if(!signoUsado){
                    if(!laPantalla.equals("0")){
                    valorA = laPantalla;
                    signo="+";
                    signoUsado = true;
                    memoria=valorA;
                     vistaCalculadora.getjPantalla().setText(memoria);
                    }
                }else if (boton.equals("+")){
                    String resul= calculadora.getSignoUsado(boton,memoria, vistaCalculadora.getjPantalla().getText(), signo);
                    
                    vistaCalculadora.getjPantalla().setText(resul);
                    signo = "+";
                    memoria = resul;
                    valorA = resul;
                }
                
            }else if (boton.equals("-")){
                if(!signoUsado){
                if(!laPantalla.equals("0")){
                 valorA = laPantalla;
                 signo="-";
                 signoUsado = true;
                 memoria=valorA;
                 vistaCalculadora.getjPantalla().setText(memoria);
                }
                 }else if (boton.equals("-")){
                    String resul= calculadora.getSignoUsado(boton,memoria, vistaCalculadora.getjPantalla().getText(), signo);
                    
                    vistaCalculadora.getjPantalla().setText(resul);
                    signo = "-";
                    memoria = resul;
                    valorA = resul;
                }
            }else if (boton.equals("*")){
                if(!signoUsado){
                if(!laPantalla.equals("0")){
                 valorA = laPantalla;
                 signo="*";
                 signoUsado = true;
                 memoria=valorA;
                 vistaCalculadora.getjPantalla().setText(memoria);
                }
                 }else if (boton.equals("*")){
                    String resul= calculadora.getSignoUsado(boton,memoria, vistaCalculadora.getjPantalla().getText(), signo);
                    
                    vistaCalculadora.getjPantalla().setText(resul);
                    signo = "*";
                    memoria = resul;
                    valorA = resul;
                }
            }else if (boton.equals("/")){
                    if(!signoUsado){
                    if(!laPantalla.equals("0")){
                    valorA = laPantalla;
                    signo="/";
                    signoUsado = true;
                    memoria=valorA;
                    vistaCalculadora.getjPantalla().setText(memoria);
                    }
                 }else if (boton.equals("/")){
                    String resul= calculadora.getSignoUsado(boton,memoria, vistaCalculadora.getjPantalla().getText(), signo);
                    
                    vistaCalculadora.getjPantalla().setText(resul);
                    signo = "/";
                    memoria = resul;
                    valorA = resul;
                }
            }
        //Para borrar la pantalla    
        } else if(boton.equals("C")||boton.equals("CE")){
            if(boton.equals ("C")){
                vistaCalculadora.getjPantalla().setText("0");
                valorA="0";
                valorB="0";
                signo = "";
                signoUsado=false;
                memoria = "";
            }else{
                if (laPantalla.equals("0")){
                   vistaCalculadora.getjPantalla().setText("0"); 
                }else{
                 String cadena;
                 cadena = laPantalla;
                 if (cadena.length()>0) {
                cadena=cadena.substring(0, cadena.length()-1);
                vistaCalculadora.getjPantalla().setText(cadena);
            }
            }
            }
        // Llamando a la calculadora simple
        } else if(boton.equals("=")){
            String resultado;
            valorB = vistaCalculadora.getjPantalla().getText();
               
                if (!valorB.equals("")) {
                resultado= calculadora.getOperaciones(valorA,valorB,signo);
               
                vistaCalculadora.getjPantalla().setText(resultado);
                signoUsado=false;
                signo = "";
                memoria = vistaCalculadora.getjPantalla().getText();
                }
        }
        

        
        
        //Probando los botones
        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {
           

            System.out.println("Se apreto boton desde controller" + ae.getActionCommand());
         }
        CalcuSimple operacion = new CalcuSimple();
        laPantalla= operacion.getOperaciones("12", "10", "+");
        
        System.out.println("El resultado es "+laPantalla);
    
}
    //metodo para buscar punto
    public  boolean HayPunto(String cadena){
        boolean resultado=false;
         for (int i = 0; i < cadena.length(); i++) {
            if (cadena.substring(i, i+1).equals(".")) {
                resultado = true;
                break;
                
            }
        
    }
       return resultado;  
    }
}