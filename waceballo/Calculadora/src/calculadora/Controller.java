package calculadora;

import java.awt.Event;
import java.awt.event.ActionEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumno
 */
public class Controller implements IViewEventListener {

    private Pantalla unaVista;
    private ICalculadora con;
    private CalculadoraSimple calc;

    public Controller() {
        unaVista = new Pantalla();
        calc = new CalculadoraSimple();
    }

    public void Run() {

        CalculadoraComboBoxModel cb = new CalculadoraComboBoxModel(CalculadoraFactory.getListaConversores());
        unaVista.getCbConversores().setModel(cb);

        unaVista.getLblMensaje().setVisible(false);
        unaVista.getTxtCalculo().setEnabled(false);

        calc.setOperacion("*");
        calc.setOperando1(10.0f);
        calc.setOperando2(5.0f);

        System.out.println("Resultado " + calc.Operaciones(calc.getOperando1(), calc.getOperacion(), calc.getOperando2()));

        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);
        unaVista.setVisible(true);

    }

    @Override
    public void listen(Event event) {

        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {

            ActionEvent ae = (ActionEvent) event.target;
            String tecla = ae.getActionCommand();

            System.out.println("Tecla " + ae.getActionCommand());

            if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
                System.exit(0);
            }

            String numero;
            String n;
            String signo = "";

            n = unaVista.getTxtCalculo().getText();

            if (tecla.matches("\\d")) {
                if (n.equals("0.00")){
                    n="";
                }
                
                numero = n;
                numero = numero + tecla;

                if (numero.length() > 12) {
                    unaVista.getLblMensaje().setText("No puede Ingresar mas de 12 digitos");
                    unaVista.getLblMensaje().setVisible(true);
                } else {
                    unaVista.getTxtCalculo().setText(numero);
                }
            } else {
                signo = tecla;
                String n1 = "";
                String [] opera = new String[2]; 
                
                if (signo.equals("C")) {
                    unaVista.getTxtCalculo().setText("0.00");
                    unaVista.getLblMensaje().setVisible(false);
                }else if (signo.equals(".")){
                    n1 = n;

                    if (!n1.contains(".")){
                        n1 = n + signo;
                    }
                }else if (signo.equals("<-")){
                    n1 = n.substring(0, n.length()-1);
                    
                    if (n1.equals("")){
                        n1 = "0.00";
                    }
                }else if (signo.equals("+")){
                    opera[0] = n;
                    opera[1] = tecla;
                    
                    n1 = n+tecla;
                }else if (signo.equals("-")){
                    n1 = n+tecla;
                }else if (signo.equals("*")){
                    n1 = n+tecla;
                }else if (signo.equals("/")){
                    n1 = n+tecla;
                }else if (signo.equals("%")){
                    n1 = n+tecla;
                }else if (signo.equals("=")){
                    opera[2] = n;
                    float res = calc.Operaciones(Float.parseFloat(opera[0]), opera[1], Float.parseFloat(opera[2]));
                    n1 = Float.toString(res);
                }
                
                unaVista.getTxtCalculo().setText(n1);



            }
            
        } else {
            String nuevaCalculadora = (String) unaVista.getCbConversores().getModel().getSelectedItem();
            con = CalculadoraFactory.CrearCalculadora(nuevaCalculadora);

        }

    }

}
