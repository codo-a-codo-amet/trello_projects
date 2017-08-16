/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.Label;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author wceba
 */
public class Vista extends JFrame{
    
    private JPanel Contenedor;
    
    private Label lblEtiqueta1; //titulo del juego
    private Label lblEtiqueta2; //titulo adivina la palabra
    private Label lblEtiquetaPalabraAdivinar; //palabra a adivinar
    private Label lblEtiqueta3; //texto palabra a adivinar
    private Label lblEtiqueta4; //texto lista de letras ingresadas
    private Label lblEtiqueta5; //lista de letras ingresadas
    
    protected JTextField txtLetra;
    
    public Vista(){
        setBounds(300, 100, 600, 600);
        setTitle("Juego del Ahorcado");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        Contenedor = new JPanel();
        getContentPane().add(Contenedor);
        
        lblEtiqueta1 = new Label("Juego Ahorcado");
        Contenedor.add(lblEtiqueta1);
        
        lblEtiqueta2 = new Label("Adivine la Palabra:");
        Contenedor.add(lblEtiqueta2);
    }
    
    
}
