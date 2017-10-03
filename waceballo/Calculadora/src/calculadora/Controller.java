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

        CalculadoraComboBoxModel cb = new CalculadoraComboBoxModel(ConversorFactory.getListaConversores());
        unaVista.getCbConversores().setModel(cb);

        unaVista.getLblMensaje().setVisible(false);
        //unaVista.getTxtCalculo().setEnabled(false);

        calc.setOperacion("*");
        calc.setOperando1(10.0f);
        calc.setOperando2(5.0f);

        System.out.println("Resultado " + calc.Operaciones(calc.getOperando1(), calc.getOperacion(), calc.getOperando2()));

        //A partir de ahora, escucha lo que le sucede a la vista.
        unaVista.AddEventListener(this);
        unaVista.setVisible(true);

        Utiles u = new Utiles();
        System.out.println("formato "+u.FormatoDecimal("1000"));
    }

    @Override
    public void listen(Event event) {

        ActionEvent ae = (ActionEvent) event.target;
        String tecla = ae.getActionCommand();

        System.out.println("Tecla " + ae.getActionCommand());

        if (ae.getActionCommand().equalsIgnoreCase("Salir")) {
            System.exit(0);
        }

        if (tecla.matches("\\d")) {

            String numero;
            String n;

            n = unaVista.getTxtCalculo().getText();
            //n = "";
            numero = n;
            numero = numero + tecla;
            System.out.println("numero " + numero);

            if (numero.length() > 12) {
                unaVista.getLblMensaje().setVisible(true);
            } else {
                unaVista.getTxtCalculo().setText(numero);
            }

            System.out.println("tamaño " + numero.length());
            System.out.println("Es un numero");
        } else {
            if (tecla.equals("C")) {
                unaVista.getTxtCalculo().setText("0.00");
            }
        }

    }

}
