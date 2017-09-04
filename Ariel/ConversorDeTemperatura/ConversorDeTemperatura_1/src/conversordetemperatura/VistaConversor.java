/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordetemperatura;

/**
 *
 * @author alumno
 */
public class VistaConversor extends javax.swing.JFrame {

    /**
     * Creates new form VistaConversor
     */
    
    public String valorSeleccionado;
    public String valorPantalla;
    public VistaConversor() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtConvertir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSelecBox2 = new javax.swing.JComboBox<>();
        jSelecBox1 = new javax.swing.JComboBox<>();
        JpantallaB = new javax.swing.JTextField();
        JpantallaA = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtConvertir.setText("Convertir");
        jBtConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtConvertirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtConvertir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, -1, -1));

        jSelecBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Kelvin", "Fahrenheit" }));
        getContentPane().add(jSelecBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 130, 20));

        jSelecBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Kelvin", "Fahrenheit" }));
        jSelecBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSelecBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jSelecBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 130, 20));

        JpantallaB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JpantallaB.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        JpantallaB.setPreferredSize(new java.awt.Dimension(4, 5));
        JpantallaB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JpantallaBActionPerformed(evt);
            }
        });
        getContentPane().add(JpantallaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 130, 40));

        JpantallaA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JpantallaA.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(JpantallaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 130, 40));

        titulo.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Conversor de temperatura");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 500, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("A");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 30, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("De");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversordetemperatura/calorTiempo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JpantallaBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JpantallaBActionPerformed
      
    }//GEN-LAST:event_JpantallaBActionPerformed

    private void jBtConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtConvertirActionPerformed
       
        Conversor temperatura = new Conversor();
        int seleccionado1;
        int seleccionado2;
        seleccionado1 = jSelecBox1.getSelectedIndex();
        seleccionado2 = jSelecBox2.getSelectedIndex();
        if(seleccionado1 == 0){
           
                if (seleccionado2 == 0) {
                JpantallaB.setText(JpantallaA.getText());
                }else if (seleccionado2 == 1) {
                    JpantallaB.setText(temperatura.getCelsiusConvertir(JpantallaA.getText(), 1));
                }else if (seleccionado2 == 2) {
                    JpantallaB.setText(temperatura.getCelsiusConvertir(JpantallaA.getText(), 2));
                }
                
        }else if(seleccionado1 ==1){
                if (seleccionado2 == 0){
                    JpantallaB.setText(temperatura.getKelvinconvertir(JpantallaA.getText(), 1));
                }else if (seleccionado2 == 1){
                    JpantallaB.setText(JpantallaA.getText());
                }else if(seleccionado2 == 2){
                    JpantallaB.setText(temperatura.getKelvinconvertir(JpantallaA.getText(), 2));
                }
                
        }else if(seleccionado1 ==2){
                if (seleccionado2 == 0) {
                    JpantallaB.setText(temperatura.getFarengeiConvertir(JpantallaA.getText(), 1));
                }else if (seleccionado2 == 1) {
                     JpantallaB.setText(temperatura.getFarengeiConvertir(JpantallaA.getText(), 2));
                }else if (seleccionado2 == 2) {
                    JpantallaB.setText(JpantallaA.getText());
                }
    }
        
        
    }//GEN-LAST:event_jBtConvertirActionPerformed

    private void jSelecBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSelecBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSelecBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JpantallaA;
    private javax.swing.JTextField JpantallaB;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jBtConvertir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> jSelecBox1;
    private javax.swing.JComboBox<String> jSelecBox2;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
