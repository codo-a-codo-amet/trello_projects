/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase27;


import java.awt.event.ItemEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;


/**
 *
 * @author TheGuru
 */
public class UI extends javax.swing.JFrame  {

    Complejo Hoyts = new Complejo();
    public UI() {
        initComponents();
        
        comboSalas.setModel(new DefaultComboBoxModel(Hoyts.salas.toArray()));
        Sala salaSeleccionada = (Sala)comboSalas.getSelectedItem();
        obtenerPelicula(salaSeleccionada);
        
        
        butacasVacias(salaSeleccionada);
         
        
    }
    
    public void obtenerPelicula(Sala laSala){
        txtPelicula.setText(laSala.laPelicula.getNombre());  
    }
    
    public void butacasVacias (Sala laSala){
        DefaultListModel listVacias = new DefaultListModel();
        
        for (int i = 0; i < Hoyts.getListaButacasLibres(laSala).size(); i++)
        {
            if (Hoyts.getListaButacasLibres(laSala).get(i).isOcupada()== false) {
                listVacias.addElement(Hoyts.getListaButacasLibres(laSala).get(i));
            }
              jButlibres.setModel(listVacias);
              
        }
        String cantidad = String.valueOf(Hoyts.getListaButacasLibres(laSala).size());
        jtxttotallibres.setText(cantidad);
    }
    public void butacasOcupadas (Sala laSala){
        DefaultListModel listOcupadas = new DefaultListModel();
        for (int i = 0; i < laSala.asientos.size(); i++) {
            if (laSala.asientos.get(i).isOcupada()== true) {
                listOcupadas.addElement(laSala.asientos.get(i));
            }
        }
        jButocupadas.setModel(listOcupadas);
        String cantidad = String.valueOf(listOcupadas.size());
        jtxttotalvendidas.setText(cantidad);
    }
    
    public void comprarentradas(){
        Sala salaSeleccionada = (Sala)comboSalas.getSelectedItem();
        int item = this.jButlibres.getSelectedIndex();
        Hoyts.getListaButacasLibres(salaSeleccionada).get(item).setOcupada(true);
        
    }
    public void anularVenta(){
        //para hacer
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboSalas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jButlibres = new javax.swing.JList<>();
        txtPelicula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jButocupadas = new javax.swing.JList<>();
        btnComprarEntrada = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxttotallibres = new javax.swing.JTextField();
        jtxttotalvendidas = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        comboSalas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSalas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboSalasItemStateChanged(evt);
            }
        });
        comboSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSalasActionPerformed(evt);
            }
        });
        comboSalas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                comboSalasPropertyChange(evt);
            }
        });

        jButlibres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButlibresMouseClicked(evt);
            }
        });
        jButlibres.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jButlibresPropertyChange(evt);
            }
        });
        jButlibres.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jButlibresValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jButlibres);

        txtPelicula.setEditable(false);
        txtPelicula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPelicula.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtPeliculaComponentAdded(evt);
            }
        });
        txtPelicula.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPeliculaCaretUpdate(evt);
            }
        });
        txtPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPeliculaMouseClicked(evt);
            }
        });
        txtPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeliculaActionPerformed(evt);
            }
        });

        jLabel1.setText("Sala");

        jLabel2.setText("Pelicula");

        jButocupadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButocupadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jButocupadas);

        btnComprarEntrada.setText("Comprar Entrada");
        btnComprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarEntradaActionPerformed(evt);
            }
        });

        jLabel3.setText("Butacas Libres");

        jLabel4.setText("Butacas Vendidas");

        jtxttotallibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttotallibresActionPerformed(evt);
            }
        });

        jtxttotalvendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttotalvendidasActionPerformed(evt);
            }
        });

        jButton1.setText("Anular Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jtxttotallibres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnComprarEntrada)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPelicula)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jtxttotalvendidas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                        .addGap(0, 74, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxttotalvendidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxttotallibres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnComprarEntrada)
                    .addComponent(jButton1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSalasActionPerformed

    private void txtPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeliculaActionPerformed
     
    }//GEN-LAST:event_txtPeliculaActionPerformed

    private void btnComprarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarEntradaActionPerformed
       comprarentradas();
       butacasVacias((Sala)comboSalas.getSelectedItem());
       butacasOcupadas((Sala)comboSalas.getSelectedItem());
    }//GEN-LAST:event_btnComprarEntradaActionPerformed

    private void txtPeliculaCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPeliculaCaretUpdate
      
    }//GEN-LAST:event_txtPeliculaCaretUpdate

    private void txtPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPeliculaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeliculaMouseClicked

    private void jButlibresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jButlibresPropertyChange
        
    }//GEN-LAST:event_jButlibresPropertyChange

    private void comboSalasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_comboSalasPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSalasPropertyChange

    private void comboSalasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboSalasItemStateChanged
        Sala salaSeleccionada = (Sala)comboSalas.getSelectedItem();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
           
                this.txtPelicula.setText(salaSeleccionada.laPelicula.getNombre());
                butacasVacias((Sala)comboSalas.getSelectedItem());
                butacasOcupadas((Sala)comboSalas.getSelectedItem());
            
        }
    }//GEN-LAST:event_comboSalasItemStateChanged

    private void txtPeliculaComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtPeliculaComponentAdded
      
    }//GEN-LAST:event_txtPeliculaComponentAdded

    private void jtxttotallibresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttotallibresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttotallibresActionPerformed

    private void jButlibresValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jButlibresValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jButlibresValueChanged

    private void jtxttotalvendidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttotalvendidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttotalvendidasActionPerformed

    private void jButlibresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButlibresMouseClicked
       
    }//GEN-LAST:event_jButlibresMouseClicked

    private void jButocupadasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButocupadasMouseClicked
       
    }//GEN-LAST:event_jButocupadasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         anularVenta();
       butacasVacias((Sala)comboSalas.getSelectedItem());
       butacasOcupadas((Sala)comboSalas.getSelectedItem());// TODO add your
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarEntrada;
    private javax.swing.JComboBox<String> comboSalas;
    private javax.swing.JList<String> jButlibres;
    private javax.swing.JList<String> jButocupadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtxttotallibres;
    private javax.swing.JTextField jtxttotalvendidas;
    private javax.swing.JTextField txtPelicula;
    // End of variables declaration//GEN-END:variables

    
}
