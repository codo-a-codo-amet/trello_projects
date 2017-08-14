/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author alejandro.medici
 */
public class Game implements ActionListener, KeyListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        System.out.println(actionCommand);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char actionCommand = e.getKeyChar();
        System.out.println("Key character type " + actionCommand);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        char actionCommand = e.getKeyChar();
        System.out.println("Key character Pressed " + actionCommand);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        char actionCommand = e.getKeyChar();
        System.out.println("Key character Released " + actionCommand);

    }

}
