/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.awt.Event;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class VistaCalculadora extends javax.swing.JFrame {

    protected List<IViewEventListener> list_listener;
    /**
     * Creates new form VistaCalculadora
     */
    public VistaCalculadora() {
        initComponents();
        this.setLocationRelativeTo(null);
        list_listener = new ArrayList<>();
    }
    
    public void AddEventListener(IViewEventListener listener) {
        list_listener.add(listener);
    }
    
    public void RemoveEventListener(IViewEventListener listener){
        list_listener.remove(listener);
    }

    public List<IViewEventListener> getList_listener() {
        return list_listener;
    }

    public void setList_listener(List<IViewEventListener> list_listener) {
        this.list_listener = list_listener;
    }

    public JButton getjButtonIgual0() {
        return jButtonIgual0;
    }

    public void setjButtonIgual0(JButton jButtonIgual0) {
        this.jButtonIgual0 = jButtonIgual0;
    }

    public JButton getjButtonIgual1() {
        return jButtonIgual1;
    }

    public void setjButtonIgual1(JButton jButtonIgual1) {
        this.jButtonIgual1 = jButtonIgual1;
    }

    public JButton getjButtonIgual10() {
        return jButtonIgual10;
    }

    public void setjButtonIgual10(JButton jButtonIgual10) {
        this.jButtonIgual10 = jButtonIgual10;
    }

    public JButton getjButtonIgual11() {
        return jButtonIgual11;
    }

    public void setjButtonIgual11(JButton jButtonIgual11) {
        this.jButtonIgual11 = jButtonIgual11;
    }

    public JButton getjButtonIgual2() {
        return jButtonIgual2;
    }

    public void setjButtonIgual2(JButton jButtonIgual2) {
        this.jButtonIgual2 = jButtonIgual2;
    }

    public JButton getjButtonIgual3() {
        return jButtonIgual3;
    }

    public void setjButtonIgual3(JButton jButtonIgual3) {
        this.jButtonIgual3 = jButtonIgual3;
    }

    public JButton getjButtonIgual4() {
        return jButtonIgual4;
    }

    public void setjButtonIgual4(JButton jButtonIgual4) {
        this.jButtonIgual4 = jButtonIgual4;
    }

    public JButton getjButtonIgual5() {
        return jButtonIgual5;
    }

    public void setjButtonIgual5(JButton jButtonIgual5) {
        this.jButtonIgual5 = jButtonIgual5;
    }

    public JButton getjButtonIgual6() {
        return jButtonIgual6;
    }

    public void setjButtonIgual6(JButton jButtonIgual6) {
        this.jButtonIgual6 = jButtonIgual6;
    }

    public JButton getjButtonIgual7() {
        return jButtonIgual7;
    }

    public void setjButtonIgual7(JButton jButtonIgual7) {
        this.jButtonIgual7 = jButtonIgual7;
    }

    public JButton getjButtonIgual8() {
        return jButtonIgual8;
    }

    public void setjButtonIgual8(JButton jButtonIgual8) {
        this.jButtonIgual8 = jButtonIgual8;
    }

    public JButton getjButtonIgual9() {
        return jButtonIgual9;
    }

    public void setjButtonIgual9(JButton jButtonIgual9) {
        this.jButtonIgual9 = jButtonIgual9;
    }

    public JButton getjButtonIgualC() {
        return jButtonIgualC;
    }

    public void setjButtonIgualC(JButton jButtonIgualC) {
        this.jButtonIgualC = jButtonIgualC;
    }

    public JButton getjButtonIgualCE() {
        return jButtonIgualCE;
    }

    public void setjButtonIgualCE(JButton jButtonIgualCE) {
        this.jButtonIgualCE = jButtonIgualCE;
    }

    public JButton getjButtonIgualDiv() {
        return jButtonIgualDiv;
    }

    public void setjButtonIgualDiv(JButton jButtonIgualDiv) {
        this.jButtonIgualDiv = jButtonIgualDiv;
    }

    public JButton getjButtonIgualIgual() {
        return jButtonIgualIgual;
    }

    public void setjButtonIgualIgual(JButton jButtonIgualIgual) {
        this.jButtonIgualIgual = jButtonIgualIgual;
    }

    public JButton getjButtonIgualMult() {
        return jButtonIgualMult;
    }

    public void setjButtonIgualMult(JButton jButtonIgualMult) {
        this.jButtonIgualMult = jButtonIgualMult;
    }

    public JButton getjButtonIgualPorsentaje() {
        return jButtonIgualPorsentaje;
    }

    public void setjButtonIgualPorsentaje(JButton jButtonIgualPorsentaje) {
        this.jButtonIgualPorsentaje = jButtonIgualPorsentaje;
    }

    public JButton getjButtonIgualResta() {
        return jButtonIgualResta;
    }

    public void setjButtonIgualResta(JButton jButtonIgualResta) {
        this.jButtonIgualResta = jButtonIgualResta;
    }

    public JButton getjButtonIgualSuma() {
        return jButtonIgualSuma;
    }

    public void setjButtonIgualSuma(JButton jButtonIgualSuma) {
        this.jButtonIgualSuma = jButtonIgualSuma;
    }

    public JTextField getjPantalla() {
        return jPantalla;
    }

    public void setjPantalla(JTextField jPantalla) {
        this.jPantalla = jPantalla;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPantalla = new javax.swing.JTextField();
        jButtonIgualIgual = new javax.swing.JButton();
        jButtonIgual1 = new javax.swing.JButton();
        jButtonIgual2 = new javax.swing.JButton();
        jButtonIgual3 = new javax.swing.JButton();
        jButtonIgual4 = new javax.swing.JButton();
        jButtonIgual5 = new javax.swing.JButton();
        jButtonIgual6 = new javax.swing.JButton();
        jButtonIgual7 = new javax.swing.JButton();
        jButtonIgual8 = new javax.swing.JButton();
        jButtonIgual9 = new javax.swing.JButton();
        jButtonIgual0 = new javax.swing.JButton();
        jButtonIgual10 = new javax.swing.JButton();
        jButtonIgual11 = new javax.swing.JButton();
        jButtonIgualSuma = new javax.swing.JButton();
        jButtonIgualResta = new javax.swing.JButton();
        jButtonIgualMult = new javax.swing.JButton();
        jButtonIgualDiv = new javax.swing.JButton();
        jButtonIgualC = new javax.swing.JButton();
        jButtonIgualCE = new javax.swing.JButton();
        jButtonIgualPorsentaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        jPantalla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jButtonIgualIgual.setText("=");
        jButtonIgualIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual1.setText("1");
        jButtonIgual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual2.setText("2");
        jButtonIgual2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual3.setText("3");
        jButtonIgual3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual4.setText("3");
        jButtonIgual4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual5.setText("5");
        jButtonIgual5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual6.setText("6");
        jButtonIgual6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual7.setText("7");
        jButtonIgual7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual8.setText("8");
        jButtonIgual8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual9.setText("9");
        jButtonIgual9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual0.setText("0");
        jButtonIgual0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual10.setText("+/-");
        jButtonIgual10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgual11.setText(".");
        jButtonIgual11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualSuma.setText("+");
        jButtonIgualSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualResta.setText("-");
        jButtonIgualResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualMult.setText("*");
        jButtonIgualMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualDiv.setText("/");
        jButtonIgualDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualC.setText("C");
        jButtonIgualC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualCE.setText("CE");
        jButtonIgualCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        jButtonIgualPorsentaje.setText("%");
        jButtonIgualPorsentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIgualIgualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIgual3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIgual5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIgual6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIgualResta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIgualCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonIgual7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonIgual10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonIgual0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgual11, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgualDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgualIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonIgual8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgual9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgualMult, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonIgualPorsentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPantalla, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonIgual1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonIgual2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonIgual4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonIgualSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonIgualC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualResta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualCE, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualMult, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualPorsentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIgual0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgual11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonIgualIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIgualIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIgualIgualActionPerformed
          for (int i = 0; i < list_listener.size(); i++) {
            IViewEventListener listener = list_listener.get(i);
            
            // Creamos un objeto Event con la informacion de lo que le sucedde 
            // a la vista, por ejemplo. Se presiono un boton
            Event event = new Event(evt, 0, evt);
            
            // El objeto event viaja hacia los que estan escuchando a la vista
            listener.listen(event);
          }
    }//GEN-LAST:event_jButtonIgualIgualActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIgual0;
    private javax.swing.JButton jButtonIgual1;
    private javax.swing.JButton jButtonIgual10;
    private javax.swing.JButton jButtonIgual11;
    private javax.swing.JButton jButtonIgual2;
    private javax.swing.JButton jButtonIgual3;
    private javax.swing.JButton jButtonIgual4;
    private javax.swing.JButton jButtonIgual5;
    private javax.swing.JButton jButtonIgual6;
    private javax.swing.JButton jButtonIgual7;
    private javax.swing.JButton jButtonIgual8;
    private javax.swing.JButton jButtonIgual9;
    private javax.swing.JButton jButtonIgualC;
    private javax.swing.JButton jButtonIgualCE;
    private javax.swing.JButton jButtonIgualDiv;
    private javax.swing.JButton jButtonIgualIgual;
    private javax.swing.JButton jButtonIgualMult;
    private javax.swing.JButton jButtonIgualPorsentaje;
    private javax.swing.JButton jButtonIgualResta;
    private javax.swing.JButton jButtonIgualSuma;
    private javax.swing.JTextField jPantalla;
    // End of variables declaration//GEN-END:variables
}
