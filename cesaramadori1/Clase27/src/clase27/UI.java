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
        //Asignar la lista de salas al combo box
        comboSalas.setModel(new DefaultComboBoxModel(Hoyts.salas.toArray()));
        //Instanciar una sala para asignarle la que esta seleccionada en el combo box
        Sala salaSeleccionada = (Sala)comboSalas.getSelectedItem();
        //Llamado al metodo para mostar en txtPelicula, segun sala seleccionada
        obtenerPelicula(salaSeleccionada);
        //Llamado al metodo que muestra las butacas vacias de la sala seleccionada
        //butacasVacias(salaSeleccionada);
        //Asignar la lista de peliculas al combo box para seleccionar por pelicula la sala
        comboPeliculas.setModel(new DefaultComboBoxModel(Hoyts.listado_de_Peliculas));
        salaporPelicula();
        
    }
    
    public void obtenerPelicula(Sala laSala){
        
        txtPelicula.setText(laSala.laPelicula.getNombre()); 
        butacasVacias(laSala);
        butacasOcupadas(laSala);
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
    public void salaporPelicula (){
        for (int i = 0; i < Hoyts.salas.size(); i++) {
                if (Hoyts.salas.get(i).laPelicula.getNombre() == (String) comboPeliculas.getSelectedItem()) {
                    jtxtSala.setText(Hoyts.salas.get(i).nombre);
                }
            }
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

        jtxtSala = new javax.swing.JTextField();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboPeliculas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 480));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtSala.setEditable(false);
        jtxtSala.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jtxtSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtSalaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 160, 30));

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
        getContentPane().add(comboSalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 110, 30));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 93, 230));

        txtPelicula.setEditable(false);
        txtPelicula.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
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
        getContentPane().add(txtPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 332, 30));

        jLabel1.setText("Sala");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 28, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel2.setText("Pelicula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 60, -1));

        jButocupadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButocupadasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jButocupadas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, 93, 230));

        btnComprarEntrada.setText("Comprar Entrada");
        btnComprarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel3.setText("Butacas Libres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, -1));

        jLabel4.setText("Butacas Vendidas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 120, -1));

        jtxttotallibres.setEditable(false);
        jtxttotallibres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttotallibresActionPerformed(evt);
            }
        });
        getContentPane().add(jtxttotallibres, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 93, 30));

        jtxttotalvendidas.setEditable(false);
        jtxttotalvendidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttotalvendidasActionPerformed(evt);
            }
        });
        getContentPane().add(jtxttotalvendidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 93, 30));

        jButton1.setText("Anular Venta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 110, -1));

        jLabel5.setText("Pelicula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6, -1, 40));

        jLabel6.setText("Listado Vendidas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, 20));

        jLabel7.setText("Listado Libres");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 20));

        comboPeliculas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPeliculas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPeliculasItemStateChanged(evt);
            }
        });
        getContentPane().add(comboPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 250, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        jLabel8.setText("Sala");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 6, 40, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("Buscar Sala por Pelicula");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Buscar Pelicula por Sala");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 780, 20));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 800, 510));

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
           
            obtenerPelicula(salaSeleccionada);
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

    private void jtxtSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtSalaActionPerformed

    private void comboPeliculasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPeliculasItemStateChanged
        
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            
            salaporPelicula();
        }
    }//GEN-LAST:event_comboPeliculasItemStateChanged

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
    private javax.swing.JComboBox<String> comboPeliculas;
    private javax.swing.JComboBox<String> comboSalas;
    private javax.swing.JLabel fondo;
    private javax.swing.JList<String> jButlibres;
    private javax.swing.JList<String> jButocupadas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtxtSala;
    private javax.swing.JTextField jtxttotallibres;
    private javax.swing.JTextField jtxttotalvendidas;
    private javax.swing.JTextField txtPelicula;
    // End of variables declaration//GEN-END:variables

    
}
