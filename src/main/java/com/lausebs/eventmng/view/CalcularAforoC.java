/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.lausebs.eventmng.view;

import java.awt.Color;

/**
 *
 * @author estigia
 */
public class CalcularAforoC extends javax.swing.JFrame {

    /**
     * Creates new form CalcularAforoC
     */
    public CalcularAforoC() {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtFBuscarConcierto = new javax.swing.JTextField();
        pnlCenter = new javax.swing.JPanel();
        lblNLocalidades = new javax.swing.JLabel();
        txtFUbicacion = new javax.swing.JTextField();
        txtFNLocalidades = new javax.swing.JTextField();
        txtFPrecio = new javax.swing.JTextField();
        lblArtista = new javax.swing.JLabel();
        txtFFechaDIa = new javax.swing.JTextField();
        txtFFechaMes = new javax.swing.JTextField();
        txtFFechaAño = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblTipoMusica = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        txtFTipoMusica = new javax.swing.JTextField();
        lblFecha = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtFNLocalidades1 = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtFNStands1 = new javax.swing.JTextField();
        btnCalcularAforo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtFBuscarConcierto.setForeground(new java.awt.Color(153, 153, 153));
        txtFBuscarConcierto.setText("Digite el nombre");
        txtFBuscarConcierto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFBuscarConciertoMousePressed(evt);
            }
        });
        txtFBuscarConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFBuscarConciertoActionPerformed(evt);
            }
        });

        pnlCenter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblNLocalidades.setForeground(new java.awt.Color(5, 44, 77));
        lblNLocalidades.setText("Nª Localidades");

        txtFUbicacion.setEditable(false);
        txtFUbicacion.setBackground(new java.awt.Color(185, 209, 226));
        txtFUbicacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFUbicacionActionPerformed(evt);
            }
        });

        txtFNLocalidades.setEditable(false);
        txtFNLocalidades.setBackground(new java.awt.Color(185, 209, 226));
        txtFNLocalidades.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNLocalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNLocalidadesActionPerformed(evt);
            }
        });

        txtFPrecio.setEditable(false);
        txtFPrecio.setBackground(new java.awt.Color(185, 209, 226));
        txtFPrecio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFPrecioActionPerformed(evt);
            }
        });

        lblArtista.setForeground(new java.awt.Color(5, 44, 77));
        lblArtista.setText("Artista");

        txtFFechaDIa.setEditable(false);
        txtFFechaDIa.setBackground(new java.awt.Color(185, 209, 226));
        txtFFechaDIa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFFechaDIa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaDIaActionPerformed(evt);
            }
        });

        txtFFechaMes.setEditable(false);
        txtFFechaMes.setBackground(new java.awt.Color(185, 209, 226));
        txtFFechaMes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFFechaMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaMesActionPerformed(evt);
            }
        });

        txtFFechaAño.setEditable(false);
        txtFFechaAño.setBackground(new java.awt.Color(185, 209, 226));
        txtFFechaAño.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFFechaAño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFFechaAñoActionPerformed(evt);
            }
        });

        lblNombre.setForeground(new java.awt.Color(5, 44, 77));
        lblNombre.setText("Nombre");

        lblTipoMusica.setForeground(new java.awt.Color(5, 44, 77));
        lblTipoMusica.setText("Tipo de musica");

        txtFNombre.setEditable(false);
        txtFNombre.setBackground(new java.awt.Color(185, 209, 226));
        txtFNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreActionPerformed(evt);
            }
        });

        txtFTipoMusica.setEditable(false);
        txtFTipoMusica.setBackground(new java.awt.Color(185, 209, 226));
        txtFTipoMusica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFTipoMusica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFTipoMusicaActionPerformed(evt);
            }
        });

        lblFecha.setForeground(new java.awt.Color(5, 44, 77));
        lblFecha.setText("Fecha");

        lblUbicacion.setForeground(new java.awt.Color(5, 44, 77));
        lblUbicacion.setText("Ubicacion");

        lblPrecio.setForeground(new java.awt.Color(5, 44, 77));
        lblPrecio.setText("Precio");

        txtFNLocalidades1.setEditable(false);
        txtFNLocalidades1.setBackground(new java.awt.Color(185, 209, 226));
        txtFNLocalidades1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNLocalidades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNLocalidades1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addComponent(lblUbicacion)
                        .addGap(47, 47, 47)
                        .addComponent(txtFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblFecha))
                        .addGap(56, 56, 56)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtFFechaDIa, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFFechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFFechaAño, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlCenterLayout.createSequentialGroup()
                            .addComponent(lblPrecio)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNLocalidades)
                                    .addComponent(lblArtista))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFNLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFNLocalidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                                .addComponent(lblTipoMusica)
                                .addGap(18, 18, 18)
                                .addComponent(txtFTipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFFechaDIa, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtFFechaMes, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txtFFechaAño, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbicacion)
                    .addComponent(txtFUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoMusica)
                    .addComponent(txtFTipoMusica, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNLocalidades)
                    .addComponent(txtFNLocalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblArtista)
                    .addComponent(txtFNLocalidades1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        lblTitulo.setFont(new java.awt.Font("URW Gothic", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(5, 44, 77));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Calcular Aforo Concierto");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnBuscar.setBackground(new java.awt.Color(5, 44, 77));
        btnBuscar.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtFNStands1.setEditable(false);
        txtFNStands1.setBackground(new java.awt.Color(185, 209, 226));
        txtFNStands1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNStands1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNStands1ActionPerformed(evt);
            }
        });

        btnCalcularAforo.setBackground(new java.awt.Color(5, 44, 77));
        btnCalcularAforo.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnCalcularAforo.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularAforo.setText("Calcular Aforo");
        btnCalcularAforo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularAforoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFBuscarConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnCalcularAforo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFNStands1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblTitulo)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFBuscarConcierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcularAforo)
                    .addComponent(txtFNStands1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFBuscarConciertoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFBuscarConciertoMousePressed
        txtFBuscarConcierto.setText("");
        txtFBuscarConcierto.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_txtFBuscarConciertoMousePressed

    private void txtFBuscarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFBuscarConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFBuscarConciertoActionPerformed

    private void txtFUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFUbicacionActionPerformed

    private void txtFNLocalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNLocalidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNLocalidadesActionPerformed

    private void txtFPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFPrecioActionPerformed

    private void txtFFechaDIaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaDIaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaDIaActionPerformed

    private void txtFFechaMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaMesActionPerformed

    private void txtFFechaAñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFFechaAñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFFechaAñoActionPerformed

    private void txtFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreActionPerformed

    private void txtFTipoMusicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFTipoMusicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFTipoMusicaActionPerformed

    private void txtFNLocalidades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNLocalidades1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNLocalidades1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtFNStands1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNStands1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNStands1ActionPerformed

    private void btnCalcularAforoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularAforoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalcularAforoActionPerformed

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
            java.util.logging.Logger.getLogger(CalcularAforoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcularAforoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcularAforoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcularAforoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcularAforoC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCalcularAforo;
    private javax.swing.JLabel lblArtista;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNLocalidades;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTipoMusica;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JTextField txtFBuscarConcierto;
    private javax.swing.JTextField txtFFechaAño;
    private javax.swing.JTextField txtFFechaDIa;
    private javax.swing.JTextField txtFFechaMes;
    private javax.swing.JTextField txtFNLocalidades;
    private javax.swing.JTextField txtFNLocalidades1;
    private javax.swing.JTextField txtFNStands1;
    private javax.swing.JTextField txtFNombre;
    private javax.swing.JTextField txtFPrecio;
    private javax.swing.JTextField txtFTipoMusica;
    private javax.swing.JTextField txtFUbicacion;
    // End of variables declaration//GEN-END:variables
}
