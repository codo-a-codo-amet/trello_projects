/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahorcado.Vista;

import ahorcado.Controlador.PalabraControlador;
import java.awt.event.ActionEvent;
import java.util.Arrays;

/**
 *
 * @author TheGuru
 */
public class Vista extends javax.swing.JFrame {

    private int juego = 1; //Variable que indica la cantidad de partes del grafico
    
    PalabraControlador palabraControlador;

    public Vista() {
        initComponents();
        
        palabraControlador = new PalabraControlador();
        jPalabra.setText(palabraControlador.entregarGuionesPrimeraVez());
        inicioJuego();
    }

    //Metodo para Inicializar los parametros del juego
    public void inicioJuego() {
        juego = 1;
        img1.setVisible(true);
        img2.setVisible(false);
        img3.setVisible(false);
        img4.setVisible(false);
        img5.setVisible(false);
        img6.setVisible(false);
        img7.setVisible(false);
        Jganaste.setVisible(false);
        jSiguiente.setVisible(false);
        Jperdiste.setVisible(false);
        resetearletras();
        jPalabra.setText(palabraControlador.entregarGuionesPrimeraVez());
        jLabel8.setText(String.valueOf(juego));
        palabraControlador.resetearJuego();
    }

    //Metodo para resetear los botones de letras
    public void resetearletras() {
        botonA.setVisible(true);
        botonA.setSelected(false);
        botonB.setVisible(true);
        botonB.setSelected(false);
        botonC.setVisible(true);
        botonC.setSelected(false);
        botonD.setVisible(true);
        botonD.setSelected(false);
        botonE.setVisible(true);
        botonE.setSelected(false);
        botonF.setVisible(true);
        botonF.setSelected(false);
        botonG.setVisible(true);
        botonG.setSelected(false);
        botonH.setVisible(true);
        botonH.setSelected(false);
        botonI.setVisible(true);
        botonI.setSelected(false);
        botonJ.setVisible(true);
        botonJ.setSelected(false);
        botonK.setVisible(true);
        botonK.setSelected(false);
        botonL.setVisible(true);
        botonL.setSelected(false);
        botonM.setVisible(true);
        botonM.setSelected(false);
        botonN.setVisible(true);
        botonN.setSelected(false);
        botonÑ.setVisible(true);
        botonÑ.setSelected(false);
        botonO.setVisible(true);
        botonO.setSelected(false);
        botonP.setVisible(true);
        botonP.setSelected(false);
        botonQ.setVisible(true);
        botonQ.setSelected(false);
        botonR.setVisible(true);
        botonR.setSelected(false);
        botonS.setVisible(true);
        botonS.setSelected(false);
        botonT.setVisible(true);
        botonT.setSelected(false);
        botonU.setVisible(true);
        botonU.setSelected(false);
        botonV.setVisible(true);
        botonV.setSelected(false);
        botonW.setVisible(true);
        botonW.setSelected(false);
        botonX.setVisible(true);
        botonX.setSelected(false);
        botonY.setVisible(true);
        botonY.setSelected(false);
        botonZ.setVisible(true);
        botonZ.setSelected(false);
    }
     //Metodo para quitar los botones de letras
    public void quitarletras() {
        botonA.setVisible(false);
        botonB.setVisible(false);
        botonC.setVisible(false);
        botonD.setVisible(false);
        botonE.setVisible(false);
        botonF.setVisible(false);
        botonG.setVisible(false);
        botonH.setVisible(false);
        botonI.setVisible(false);
        botonJ.setVisible(false);
        botonK.setVisible(false);
        botonL.setVisible(false);
        botonM.setVisible(false);
        botonN.setVisible(false);
        botonÑ.setVisible(false);
        botonO.setVisible(false);
        botonP.setVisible(false);
        botonQ.setVisible(false);
        botonR.setVisible(false);
        botonS.setVisible(false);
        botonT.setVisible(false);
        botonU.setVisible(false);
        botonV.setVisible(false);
        botonW.setVisible(false);
        botonX.setVisible(false);
        botonY.setVisible(false);
        botonZ.setVisible(false);
    }
    //Metodo que lista palabras completas
    public void palabraCompleta() {
        //Agrega la palabra a la lista de completadas
    }
   
    public void metodoBoton (String letra){
        palabraControlador.verificarLetra(letra);
        jPalabra.setText(palabraControlador.entregarGuiones());
        estado(palabraControlador.getJuego());
        ganaste();
    }
    public void ganaste(){
        if (palabraControlador.ganaste()) {
            Jganaste.setVisible(true);
            jSiguiente.setVisible(true);
            quitarletras();
        }
    }
    //Metodo que muestra como cambia la imagen del jugador
    public void estado(int juego) {
        switch (juego) {
            case 1:
                break;
            case 2:
                img2.setVisible(true);
                break;
            case 3:
                img3.setVisible(true);
                break;
            case 4:
                img4.setVisible(true);
                break;
            case 5:
                img5.setVisible(true);
                break;
            case 6:
                img6.setVisible(true);
                break;
            case 7:
                img7.setVisible(true);
                Jperdiste.setVisible(true);
                quitarletras();
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonC = new javax.swing.JToggleButton();
        botonA = new javax.swing.JToggleButton();
        botonB = new javax.swing.JToggleButton();
        botonD = new javax.swing.JToggleButton();
        botonE = new javax.swing.JToggleButton();
        botonF = new javax.swing.JToggleButton();
        botonI = new javax.swing.JToggleButton();
        botonG = new javax.swing.JToggleButton();
        botonH = new javax.swing.JToggleButton();
        botonJ = new javax.swing.JToggleButton();
        botonK = new javax.swing.JToggleButton();
        botonL = new javax.swing.JToggleButton();
        botonÑ = new javax.swing.JToggleButton();
        botonM = new javax.swing.JToggleButton();
        botonN = new javax.swing.JToggleButton();
        botonO = new javax.swing.JToggleButton();
        botonP = new javax.swing.JToggleButton();
        botonQ = new javax.swing.JToggleButton();
        botonT = new javax.swing.JToggleButton();
        botonR = new javax.swing.JToggleButton();
        botonS = new javax.swing.JToggleButton();
        botonU = new javax.swing.JToggleButton();
        botonV = new javax.swing.JToggleButton();
        botonW = new javax.swing.JToggleButton();
        botonZ = new javax.swing.JToggleButton();
        botonX = new javax.swing.JToggleButton();
        botonY = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabLetrasBotones = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        img4 = new javax.swing.JLabel();
        img5 = new javax.swing.JLabel();
        img6 = new javax.swing.JLabel();
        img7 = new javax.swing.JLabel();
        jPalabra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Jperdiste = new javax.swing.JLabel();
        jBtnSalir = new javax.swing.JButton();
        jBtnReiniciar = new javax.swing.JButton();
        Jganaste = new javax.swing.JLabel();
        jSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonC.setText("C");
        botonC.setMaximumSize(new java.awt.Dimension(45, 25));
        botonC.setMinimumSize(new java.awt.Dimension(45, 25));
        botonC.setPreferredSize(new java.awt.Dimension(45, 25));
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        getContentPane().add(botonC, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 45, 25));

        botonA.setText("A");
        botonA.setMaximumSize(new java.awt.Dimension(45, 25));
        botonA.setMinimumSize(new java.awt.Dimension(45, 25));
        botonA.setPreferredSize(new java.awt.Dimension(45, 25));
        botonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAActionPerformed(evt);
            }
        });
        getContentPane().add(botonA, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 45, 25));

        botonB.setText("B");
        botonB.setMaximumSize(new java.awt.Dimension(45, 25));
        botonB.setMinimumSize(new java.awt.Dimension(45, 25));
        botonB.setPreferredSize(new java.awt.Dimension(45, 25));
        botonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBActionPerformed(evt);
            }
        });
        getContentPane().add(botonB, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 45, 25));

        botonD.setText("D");
        botonD.setMaximumSize(new java.awt.Dimension(45, 25));
        botonD.setMinimumSize(new java.awt.Dimension(45, 25));
        botonD.setPreferredSize(new java.awt.Dimension(45, 25));
        botonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDActionPerformed(evt);
            }
        });
        getContentPane().add(botonD, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 45, 25));

        botonE.setText("E");
        botonE.setMaximumSize(new java.awt.Dimension(45, 25));
        botonE.setMinimumSize(new java.awt.Dimension(45, 25));
        botonE.setPreferredSize(new java.awt.Dimension(45, 25));
        botonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEActionPerformed(evt);
            }
        });
        getContentPane().add(botonE, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 45, 25));

        botonF.setText("F");
        botonF.setMaximumSize(new java.awt.Dimension(45, 25));
        botonF.setMinimumSize(new java.awt.Dimension(45, 25));
        botonF.setPreferredSize(new java.awt.Dimension(45, 25));
        botonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFActionPerformed(evt);
            }
        });
        getContentPane().add(botonF, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 45, 25));

        botonI.setText("I");
        botonI.setMaximumSize(new java.awt.Dimension(45, 25));
        botonI.setMinimumSize(new java.awt.Dimension(45, 25));
        botonI.setPreferredSize(new java.awt.Dimension(45, 25));
        botonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIActionPerformed(evt);
            }
        });
        getContentPane().add(botonI, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 45, 25));

        botonG.setText("G");
        botonG.setMaximumSize(new java.awt.Dimension(45, 25));
        botonG.setMinimumSize(new java.awt.Dimension(45, 25));
        botonG.setPreferredSize(new java.awt.Dimension(45, 25));
        botonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGActionPerformed(evt);
            }
        });
        getContentPane().add(botonG, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 45, 25));

        botonH.setText("H");
        botonH.setMaximumSize(new java.awt.Dimension(45, 25));
        botonH.setMinimumSize(new java.awt.Dimension(45, 25));
        botonH.setPreferredSize(new java.awt.Dimension(45, 25));
        botonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonHActionPerformed(evt);
            }
        });
        getContentPane().add(botonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 45, 25));

        botonJ.setText("J");
        botonJ.setMaximumSize(new java.awt.Dimension(45, 25));
        botonJ.setMinimumSize(new java.awt.Dimension(45, 25));
        botonJ.setPreferredSize(new java.awt.Dimension(45, 25));
        botonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJActionPerformed(evt);
            }
        });
        getContentPane().add(botonJ, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 45, 25));

        botonK.setText("K");
        botonK.setMaximumSize(new java.awt.Dimension(45, 25));
        botonK.setMinimumSize(new java.awt.Dimension(45, 25));
        botonK.setPreferredSize(new java.awt.Dimension(45, 25));
        botonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonKActionPerformed(evt);
            }
        });
        getContentPane().add(botonK, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 160, 45, 25));

        botonL.setText("L");
        botonL.setMaximumSize(new java.awt.Dimension(45, 25));
        botonL.setMinimumSize(new java.awt.Dimension(45, 25));
        botonL.setPreferredSize(new java.awt.Dimension(45, 25));
        botonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLActionPerformed(evt);
            }
        });
        getContentPane().add(botonL, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 160, 45, 25));

        botonÑ.setText("Ñ");
        botonÑ.setMaximumSize(new java.awt.Dimension(45, 25));
        botonÑ.setMinimumSize(new java.awt.Dimension(45, 25));
        botonÑ.setPreferredSize(new java.awt.Dimension(45, 25));
        botonÑ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonÑActionPerformed(evt);
            }
        });
        getContentPane().add(botonÑ, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 45, 25));

        botonM.setText("M");
        botonM.setMaximumSize(new java.awt.Dimension(45, 25));
        botonM.setMinimumSize(new java.awt.Dimension(45, 25));
        botonM.setPreferredSize(new java.awt.Dimension(45, 25));
        botonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMActionPerformed(evt);
            }
        });
        getContentPane().add(botonM, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 45, 25));

        botonN.setText("N");
        botonN.setMaximumSize(new java.awt.Dimension(45, 25));
        botonN.setMinimumSize(new java.awt.Dimension(45, 25));
        botonN.setPreferredSize(new java.awt.Dimension(45, 25));
        botonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNActionPerformed(evt);
            }
        });
        getContentPane().add(botonN, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 45, 25));

        botonO.setText("O");
        botonO.setMaximumSize(new java.awt.Dimension(45, 25));
        botonO.setMinimumSize(new java.awt.Dimension(45, 25));
        botonO.setPreferredSize(new java.awt.Dimension(45, 25));
        botonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOActionPerformed(evt);
            }
        });
        getContentPane().add(botonO, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 45, 25));

        botonP.setText("P");
        botonP.setMaximumSize(new java.awt.Dimension(45, 25));
        botonP.setMinimumSize(new java.awt.Dimension(45, 25));
        botonP.setPreferredSize(new java.awt.Dimension(45, 25));
        botonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPActionPerformed(evt);
            }
        });
        getContentPane().add(botonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, 45, 25));

        botonQ.setText("Q");
        botonQ.setMaximumSize(new java.awt.Dimension(45, 25));
        botonQ.setMinimumSize(new java.awt.Dimension(45, 25));
        botonQ.setPreferredSize(new java.awt.Dimension(45, 25));
        botonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQActionPerformed(evt);
            }
        });
        getContentPane().add(botonQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 45, 25));

        botonT.setText("T");
        botonT.setMaximumSize(new java.awt.Dimension(45, 25));
        botonT.setMinimumSize(new java.awt.Dimension(45, 25));
        botonT.setPreferredSize(new java.awt.Dimension(45, 25));
        botonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTActionPerformed(evt);
            }
        });
        getContentPane().add(botonT, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 45, 25));

        botonR.setText("R");
        botonR.setMaximumSize(new java.awt.Dimension(45, 25));
        botonR.setMinimumSize(new java.awt.Dimension(45, 25));
        botonR.setPreferredSize(new java.awt.Dimension(45, 25));
        botonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRActionPerformed(evt);
            }
        });
        getContentPane().add(botonR, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 45, 25));

        botonS.setText("S");
        botonS.setMaximumSize(new java.awt.Dimension(45, 25));
        botonS.setMinimumSize(new java.awt.Dimension(45, 25));
        botonS.setPreferredSize(new java.awt.Dimension(45, 25));
        botonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSActionPerformed(evt);
            }
        });
        getContentPane().add(botonS, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 45, 25));

        botonU.setText("U");
        botonU.setMaximumSize(new java.awt.Dimension(45, 25));
        botonU.setMinimumSize(new java.awt.Dimension(45, 25));
        botonU.setPreferredSize(new java.awt.Dimension(45, 25));
        botonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUActionPerformed(evt);
            }
        });
        getContentPane().add(botonU, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 45, 25));

        botonV.setText("V");
        botonV.setMaximumSize(new java.awt.Dimension(45, 25));
        botonV.setMinimumSize(new java.awt.Dimension(45, 25));
        botonV.setPreferredSize(new java.awt.Dimension(45, 25));
        botonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVActionPerformed(evt);
            }
        });
        getContentPane().add(botonV, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, 45, 25));

        botonW.setText("W");
        botonW.setMaximumSize(new java.awt.Dimension(45, 25));
        botonW.setMinimumSize(new java.awt.Dimension(45, 25));
        botonW.setPreferredSize(new java.awt.Dimension(45, 25));
        botonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonWActionPerformed(evt);
            }
        });
        getContentPane().add(botonW, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 45, 25));

        botonZ.setText("Z");
        botonZ.setMaximumSize(new java.awt.Dimension(45, 25));
        botonZ.setMinimumSize(new java.awt.Dimension(45, 25));
        botonZ.setPreferredSize(new java.awt.Dimension(45, 25));
        botonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonZActionPerformed(evt);
            }
        });
        getContentPane().add(botonZ, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 45, 25));

        botonX.setText("X");
        botonX.setMaximumSize(new java.awt.Dimension(45, 25));
        botonX.setMinimumSize(new java.awt.Dimension(45, 25));
        botonX.setPreferredSize(new java.awt.Dimension(45, 25));
        botonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXActionPerformed(evt);
            }
        });
        getContentPane().add(botonX, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 45, 25));

        botonY.setText("Y");
        botonY.setMaximumSize(new java.awt.Dimension(45, 25));
        botonY.setMinimumSize(new java.awt.Dimension(45, 25));
        botonY.setPreferredSize(new java.awt.Dimension(45, 25));
        botonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonYActionPerformed(evt);
            }
        });
        getContentPane().add(botonY, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 45, 25));

        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 130, 190));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Palabras Acertadas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, -1, -1));

        jLabLetrasBotones.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabLetrasBotones.setText("Letras Disponibles");
        getContentPane().add(jLabLetrasBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, -1, -1));

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 330, 190));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Ahorcado v0.1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/1.png"))); // NOI18N
        getContentPane().add(img1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/2.png"))); // NOI18N
        getContentPane().add(img2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/3.png"))); // NOI18N
        getContentPane().add(img3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/4.png"))); // NOI18N
        getContentPane().add(img4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/5.png"))); // NOI18N
        getContentPane().add(img5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/6.png"))); // NOI18N
        getContentPane().add(img6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        img7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ahorcado/Imagenes/7.png"))); // NOI18N
        getContentPane().add(img7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 320));

        jPalabra.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jPalabra.setText("_ _ _ _ _ _ _ _ _ _ _ _");
        getContentPane().add(jPalabra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 350, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 1000, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Puntaje:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 70, 20));

        jLabel8.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jLabel8PropertyChange(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 70, 30));

        Jperdiste.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Jperdiste.setForeground(new java.awt.Color(255, 51, 51));
        Jperdiste.setText("Perdiste");
        getContentPane().add(Jperdiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, -1, -1));

        jBtnReiniciar.setText("Reiniciar");
        jBtnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnReiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, -1, -1));

        Jganaste.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Jganaste.setForeground(new java.awt.Color(0, 204, 0));
        Jganaste.setText("Ganaste");
        getContentPane().add(Jganaste, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jSiguiente.setText("Siguiente Palabra");
        jSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        botonC.setVisible(false);
        metodoBoton("C");
    }//GEN-LAST:event_botonCActionPerformed

    private void botonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAActionPerformed
        botonA.setVisible(false);
        metodoBoton("A");
    }//GEN-LAST:event_botonAActionPerformed

    private void botonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBActionPerformed
        botonB.setVisible(false);
        metodoBoton("B");
    }//GEN-LAST:event_botonBActionPerformed

    private void botonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDActionPerformed
        botonD.setVisible(false);
        metodoBoton("D");
    }//GEN-LAST:event_botonDActionPerformed

    private void botonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEActionPerformed
        botonE.setVisible(false);
        metodoBoton("E");
    }//GEN-LAST:event_botonEActionPerformed

    private void botonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFActionPerformed
        botonF.setVisible(false);
         metodoBoton("F");
    }//GEN-LAST:event_botonFActionPerformed

    private void botonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIActionPerformed
        botonI.setVisible(false);
         metodoBoton("I");
    }//GEN-LAST:event_botonIActionPerformed

    private void botonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGActionPerformed
        botonG.setVisible(false);
         metodoBoton("G");
    }//GEN-LAST:event_botonGActionPerformed

    private void botonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonHActionPerformed
        botonH.setVisible(false);
         metodoBoton("H");
    }//GEN-LAST:event_botonHActionPerformed

    private void botonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJActionPerformed
        botonJ.setVisible(false);
         metodoBoton("J");
    }//GEN-LAST:event_botonJActionPerformed

    private void botonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonKActionPerformed
        botonK.setVisible(false);
         metodoBoton("K");
    }//GEN-LAST:event_botonKActionPerformed

    private void botonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLActionPerformed
        botonL.setVisible(false);
         metodoBoton("L");
    }//GEN-LAST:event_botonLActionPerformed

    private void botonÑActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonÑActionPerformed
        botonÑ.setVisible(false);
        metodoBoton("Ñ");
    }//GEN-LAST:event_botonÑActionPerformed

    private void botonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMActionPerformed
        botonM.setVisible(false);
        metodoBoton("M");
    }//GEN-LAST:event_botonMActionPerformed

    private void botonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNActionPerformed
        botonN.setVisible(false);
        metodoBoton("N");
    }//GEN-LAST:event_botonNActionPerformed

    private void botonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOActionPerformed
        botonO.setVisible(false);
        metodoBoton("O");
    }//GEN-LAST:event_botonOActionPerformed

    private void botonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPActionPerformed
        botonP.setVisible(false);
        metodoBoton("P");
    }//GEN-LAST:event_botonPActionPerformed

    private void botonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQActionPerformed
        botonQ.setVisible(false);
        metodoBoton("Q");
    }//GEN-LAST:event_botonQActionPerformed

    private void botonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTActionPerformed
        botonT.setVisible(false);
        metodoBoton("T");
    }//GEN-LAST:event_botonTActionPerformed

    private void botonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRActionPerformed
        botonR.setVisible(false);
        metodoBoton("R");
    }//GEN-LAST:event_botonRActionPerformed

    private void botonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSActionPerformed
        botonS.setVisible(false);
        metodoBoton("S");
    }//GEN-LAST:event_botonSActionPerformed

    private void botonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUActionPerformed
        botonU.setVisible(false);
        metodoBoton("U");
    }//GEN-LAST:event_botonUActionPerformed

    private void botonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVActionPerformed
        botonV.setVisible(false);
        metodoBoton("V");
    }//GEN-LAST:event_botonVActionPerformed

    private void botonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonWActionPerformed
        botonW.setVisible(false);
        metodoBoton("W");
    }//GEN-LAST:event_botonWActionPerformed

    private void botonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonZActionPerformed
        botonZ.setVisible(false);
        metodoBoton("Z");
    }//GEN-LAST:event_botonZActionPerformed

    private void botonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXActionPerformed
        botonX.setVisible(false);
        metodoBoton("X");
    }//GEN-LAST:event_botonXActionPerformed

    private void botonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonYActionPerformed
        botonY.setVisible(false);
        metodoBoton("Y");
    }//GEN-LAST:event_botonYActionPerformed

    private void jLabel8PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jLabel8PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8PropertyChange

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReiniciarActionPerformed
        inicioJuego(); // TODO add your handling code here:
    }//GEN-LAST:event_jBtnReiniciarActionPerformed

    private void jSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSiguienteActionPerformed
        palabraCompleta();
        inicioJuego();
        // TODO add your handling code here:
    }//GEN-LAST:event_jSiguienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jganaste;
    private javax.swing.JLabel Jperdiste;
    private javax.swing.JToggleButton botonA;
    private javax.swing.JToggleButton botonB;
    private javax.swing.JToggleButton botonC;
    private javax.swing.JToggleButton botonD;
    private javax.swing.JToggleButton botonE;
    private javax.swing.JToggleButton botonF;
    private javax.swing.JToggleButton botonG;
    private javax.swing.JToggleButton botonH;
    private javax.swing.JToggleButton botonI;
    private javax.swing.JToggleButton botonJ;
    private javax.swing.JToggleButton botonK;
    private javax.swing.JToggleButton botonL;
    private javax.swing.JToggleButton botonM;
    private javax.swing.JToggleButton botonN;
    private javax.swing.JToggleButton botonO;
    private javax.swing.JToggleButton botonP;
    private javax.swing.JToggleButton botonQ;
    private javax.swing.JToggleButton botonR;
    private javax.swing.JToggleButton botonS;
    private javax.swing.JToggleButton botonT;
    private javax.swing.JToggleButton botonU;
    private javax.swing.JToggleButton botonV;
    private javax.swing.JToggleButton botonW;
    private javax.swing.JToggleButton botonX;
    private javax.swing.JToggleButton botonY;
    private javax.swing.JToggleButton botonZ;
    private javax.swing.JToggleButton botonÑ;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel img4;
    private javax.swing.JLabel img5;
    private javax.swing.JLabel img6;
    private javax.swing.JLabel img7;
    private javax.swing.JButton jBtnReiniciar;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabLetrasBotones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jPalabra;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jSiguiente;
    // End of variables declaration//GEN-END:variables
}
