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
    private float aux = 0;
    private float aux1 = 0;
    private float aux2 = 0;

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

//        System.out.println("Resultado " + calc.Operaciones(calc.getOperando1(), calc.getOperacion(), calc.getOperando2()));
        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);
        unaVista.setVisible(true);

    }

    @Override
    public void listen(Event event) {

        if (event.target.getClass().getCanonicalName().equalsIgnoreCase("java.awt.event.ActionEvent")) {

            ActionEvent ae = (ActionEvent) event.target;
            String tecla = ae.getActionCommand();

            //System.out.println("Tecla " + ae.getActionCommand());

            if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
                System.exit(0);
            }

            String numero;
            String n;
            String signo = "";

            n = unaVista.getTxtCalculo().getText();

            if (tecla.matches("\\d")) {
                if (n.equals("0.00")) {
                    n = "";
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

                if (signo.equals("C")) {
                    unaVista.getTxtCalculo().setText("0.00");
                    unaVista.getLblMensaje().setVisible(false);
                } else if (signo.equals(".")) {
                    n1 = n;

                    if (!n1.contains(".")) {
                        n1 = n + signo;
                    }
                } else if (signo.equals("<-")) {
                    n1 = n.substring(0, n.length() - 1);

                    if (n1.equals("")) {
                        n1 = "0.00";
                    }
                } else if (signo.equals("+")) {
                    n1 = n + tecla;
                } else if (signo.equals("-")) {
                    n1 = n + tecla;
                } else if (signo.equals("*")) {
                    n1 = n + tecla;
                } else if (signo.equals("/")) {
                    n1 = n + tecla;
                } else if (signo.equals("%")) {
                    n1 = n + tecla;
                } else if (signo.equals("=")) {
                    n1 = unaVista.getTxtCalculo().getText();
                    
                    int contador = 0;
                    
                    for (int i = 0; i < n1.length(); i++) {
                        System.out.println("pasada n°" + i);
                        System.out.println("salida "+n1.substring(i, i + 1));
                        String sig = "";
                        
                        if (n1.substring(i, i + 1).equals("+")) {
                            sig = n1.substring(i, i + 1);
                            System.out.println("tiene signo "+sig);
                        } else {
                            if (contador<i) {
                                System.out.println("else pasada n°" + i);
                                aux = Float.parseFloat(n1.substring(i, i+1));
                            } else {
                                System.out.println("if pasada n°" + i);
                                aux = Float.parseFloat(n1.substring(i, i+1));
                                aux2 = Float.parseFloat(n1.substring(i, i+1));
                            }
                            aux1 = aux;
                            contador += i;
                            System.out.println("numero " + aux1 + " + " + aux2);
                            float n2 = calc.Operaciones(aux1, sig, aux2);
                            System.out.println("resultado "+n2);
                            unaVista.getTxtCalculo().setText(String.valueOf(n2));
                            //n1 = calc.Operaciones(String.valueOf(aux1), signo, String.valueOf(aux2)));
                        }
                        //System.out.println("salida "+n1.substring(i, i+1));
                    }

                }

                unaVista.getTxtCalculo().setText(n1);

            }

        } else {
            String nuevaCalculadora = (String) unaVista.getCbConversores().getModel().getSelectedItem();
            con = CalculadoraFactory.CrearCalculadora(nuevaCalculadora);

        }

    }

}
