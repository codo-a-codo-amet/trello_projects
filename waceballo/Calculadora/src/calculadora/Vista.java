/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author alumno
 */
public class Vista extends javax.swing.JFrame {
    
    protected List<IViewEventListener> list_listener;
    
    /**
     * Creates new form Vista1
     */
    public Vista() {
        initComponents();
        list_listener = new ArrayList<>();
    }

        public void AddEventListener(IViewEventListener listener) {
        list_listener.add(listener);
    }
    
    public void RemoveEventListener(IViewEventListener listener){
        list_listener.remove(listener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBoton1 = new javax.swing.JButton();
        btnBoton2 = new javax.swing.JButton();
        btnBoton3 = new javax.swing.JButton();
        btnBoton4 = new javax.swing.JButton();
        btnBoton5 = new javax.swing.JButton();
        btnBoton6 = new javax.swing.JButton();
        btnBoton7 = new javax.swing.JButton();
        btnBoton8 = new javax.swing.JButton();
        btnBoton9 = new javax.swing.JButton();
        btnBoton10 = new javax.swing.JButton();
        btnBoton11 = new javax.swing.JButton();
        btnBoton12 = new javax.swing.JButton();
        btnBoton13 = new javax.swing.JButton();
        btnBoton14 = new javax.swing.JButton();
        btnBoton15 = new javax.swing.JButton();
        btnBoton16 = new javax.swing.JButton();
        txtPantalla = new javax.swing.JTextField();
        cbConversores = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnBoton1.setText("1");
        btnBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton2.setText("4");
        btnBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton3.setText("7");
        btnBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton4.setText(".");
        btnBoton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton5.setText("2");
        btnBoton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton6.setText("5");
        btnBoton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton7.setText("8");
        btnBoton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton8.setText("0");
        btnBoton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton9.setText("6");
        btnBoton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton10.setText("3");
        btnBoton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton11.setText("9");
        btnBoton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton12.setText("=");
        btnBoton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton13.setText("*");
        btnBoton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton14.setText("+");
        btnBoton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton15.setText("-");
        btnBoton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        btnBoton16.setText("/");
        btnBoton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresionoBoton(evt);
            }
        });

        txtPantalla.setText("0.00");

        cbConversores.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cbConversoresComboBoxSeleccionado(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbConversores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBoton1)
                            .addComponent(btnBoton2)
                            .addComponent(btnBoton3)
                            .addComponent(btnBoton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBoton5)
                            .addComponent(btnBoton6)
                            .addComponent(btnBoton7)
                            .addComponent(btnBoton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBoton9)
                            .addComponent(btnBoton10)
                            .addComponent(btnBoton11)
                            .addComponent(btnBoton12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBoton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBoton15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnBoton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBoton13, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbConversores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBoton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBoton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBoton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton12))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBoton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBoton16)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PresionoBoton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresionoBoton
        // TODO add your handling code here:
        for (int i = 0; i < list_listener.size(); i++) {
            IViewEventListener listener = list_listener.get(i);
            
            // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event event = new Event(evt, 0, evt);
            
            // El objeto event viaja hacia los que estan escuchando a la vista
            listener.listen(event);
            
        }        
    }//GEN-LAST:event_PresionoBoton

    
    
    private void cbConversoresComboBoxSeleccionado(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cbConversoresComboBoxSeleccionado
        // TODO add your handling code here:
        for (int i = 0; i < list_listener.size(); i++) {
            IViewEventListener listener = list_listener.get(i);

            // Creamos un objeto Event con la informacion de lo que le sucedde
            // a la vista, por ejemplo. Se presiono un boton
            Event event = new Event(evt, 0, evt);

            // El objeto event viaja hacia los que estan escuchando a la vista
            listener.listen(event);

        }
    }//GEN-LAST:event_cbConversoresComboBoxSeleccionado

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoton1;
    private javax.swing.JButton btnBoton10;
    private javax.swing.JButton btnBoton11;
    private javax.swing.JButton btnBoton12;
    private javax.swing.JButton btnBoton13;
    private javax.swing.JButton btnBoton14;
    private javax.swing.JButton btnBoton15;
    private javax.swing.JButton btnBoton16;
    private javax.swing.JButton btnBoton2;
    private javax.swing.JButton btnBoton3;
    private javax.swing.JButton btnBoton4;
    private javax.swing.JButton btnBoton5;
    private javax.swing.JButton btnBoton6;
    private javax.swing.JButton btnBoton7;
    private javax.swing.JButton btnBoton8;
    private javax.swing.JButton btnBoton9;
    private javax.swing.JComboBox<String> cbConversores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPantalla;
    // End of variables declaration//GEN-END:variables

    public JComboBox<String> getCbConversores() {
        return cbConversores;
    }
}
