/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversormvc.Vista;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JRadioButton;


public class Vista extends javax.swing.JFrame {
      protected List<IViewEventListener> list_listener;
      
      
      JRadioButton celciusI;
      JRadioButton farenheitI;
      JRadioButton kelvinI;
      JRadioButton celciusO;
      JRadioButton farenheitO;
      JRadioButton kelvinO;
    public Vista() {
        initComponents();
        list_listener = new ArrayList<>();
        CelciusI.setSelected(true);
        jRadioCelciusO.setSelected(true);
        jTextDestino.setEditable(false);
        celciusI = new JRadioButton();
        buttonGroup1.add(celciusI);
      
        
    }
    public void AddEventListener(IViewEventListener listener) {
        list_listener.add(listener);
    }
    
    public void RemoveEventListener(IViewEventListener listener){
        list_listener.remove(listener);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextInicial = new javax.swing.JTextField();
        jTextDestino = new javax.swing.JTextField();
        ValorInicial = new javax.swing.JLabel();
        CelciusI = new javax.swing.JRadioButton();
        jRadioKelvinI = new javax.swing.JRadioButton();
        jRadioFarenheitI = new javax.swing.JRadioButton();
        ValorInicial1 = new javax.swing.JLabel();
        jRadioCelciusO = new javax.swing.JRadioButton();
        jRadioKelvinO = new javax.swing.JRadioButton();
        jRadioFaenheitO = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextInicial.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextInicialActionPerformed(evt);
            }
        });

        jTextDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDestinoActionPerformed(evt);
            }
        });

        ValorInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorInicial.setText("Temperatura Original");

        CelciusI.setText(" (C)Celcius");
        CelciusI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CelciusIActionPerformed(evt);
            }
        });

        jRadioKelvinI.setText("(K) Kelvin");
        jRadioKelvinI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioKelvinIActionPerformed(evt);
            }
        });

        jRadioFarenheitI.setText("(F) Farenheit");

        ValorInicial1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorInicial1.setText("Temperatura destino");

        jRadioCelciusO.setText(" (C)Celcius");
        jRadioCelciusO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscucharVista(evt);
            }
        });

        jRadioKelvinO.setText("(K) Kelvin");
        jRadioKelvinO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscucharVista(evt);
            }
        });

        jRadioFaenheitO.setText("(F) Farenheit");

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscucharVista(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(CelciusI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioKelvinI)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jRadioFarenheitI))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextInicial)
                                    .addComponent(ValorInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(ValorInicial1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jRadioCelciusO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioKelvinO)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioFaenheitO))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ValorInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelciusI)
                    .addComponent(jRadioKelvinI)
                    .addComponent(jRadioFarenheitI))
                .addGap(26, 26, 26)
                .addComponent(ValorInicial1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioCelciusO)
                    .addComponent(jRadioKelvinO)
                    .addComponent(jRadioFaenheitO))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextInicialActionPerformed

    private void jTextDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDestinoActionPerformed

    private void jRadioKelvinIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioKelvinIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioKelvinIActionPerformed

    private void CelciusIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CelciusIActionPerformed
             
    }//GEN-LAST:event_CelciusIActionPerformed

    private void EscucharVista(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscucharVista
        for (int i = 0; i < list_listener.size(); i++) {
            IViewEventListener listener = list_listener.get(i);
            
            // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event event = new Event(evt, 0, evt);
            
            // El objeto event viaja hacia los que estan escuchando a la vista
            listener.listen(event);
            
        }
    }//GEN-LAST:event_EscucharVista

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CelciusI;
    private javax.swing.JLabel ValorInicial;
    private javax.swing.JLabel ValorInicial1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JRadioButton jRadioCelciusO;
    private javax.swing.JRadioButton jRadioFaenheitO;
    private javax.swing.JRadioButton jRadioFarenheitI;
    private javax.swing.JRadioButton jRadioKelvinI;
    private javax.swing.JRadioButton jRadioKelvinO;
    private javax.swing.JTextField jTextDestino;
    private javax.swing.JTextField jTextInicial;
    // End of variables declaration//GEN-END:variables
}
