/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.lausebs.eventmng.view;

import com.lausebas.eventmng.services.ServicioArtista;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author estigia
 */
public class EliminarArtista extends javax.swing.JFrame {

    private ServicioArtista servicioArtista;

    public EliminarArtista(ServicioArtista servicioArtista) {
        initComponents();
        setLocationRelativeTo(this);
        setResizable(false);
        this.servicioArtista = servicioArtista;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtFNombre = new javax.swing.JTextField();
        lblDisquera = new javax.swing.JLabel();
        txtFDisquera = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        txtFBuscarArtista = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        lblNombre.setForeground(new java.awt.Color(5, 44, 77));
        lblNombre.setText("Nombre");

        txtFNombre.setEditable(false);
        txtFNombre.setBackground(new java.awt.Color(185, 209, 226));
        txtFNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNombreActionPerformed(evt);
            }
        });

        lblDisquera.setForeground(new java.awt.Color(5, 44, 77));
        lblDisquera.setText("Disquera");

        txtFDisquera.setEditable(false);
        txtFDisquera.setBackground(new java.awt.Color(185, 209, 226));
        txtFDisquera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(5, 44, 77), 1, true));
        txtFDisquera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFDisqueraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(9, 9, 9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNombre)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblDisquera)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                            .addComponent(txtFDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(10, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 116, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(txtFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFDisquera, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDisquera))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        btnEliminar.setBackground(new java.awt.Color(5, 44, 77));
        btnEliminar.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("URW Gothic", 1, 22)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(5, 44, 77));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Eliminar Artista");
        lblTitulo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtFBuscarArtista.setForeground(new java.awt.Color(153, 153, 153));
        txtFBuscarArtista.setText("Digite el nombre");
        txtFBuscarArtista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFBuscarArtistaMousePressed(evt);
            }
        });
        txtFBuscarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFBuscarArtistaActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(5, 44, 77));
        btnBuscar.setFont(new java.awt.Font("URW Gothic", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addGap(117, 117, 117))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(btnBuscar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtFBuscarArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(lblTitulo)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(txtFBuscarArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNombreActionPerformed

    private void txtFDisqueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFDisqueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFDisqueraActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String nombre = txtFBuscarArtista.getText();
        try {
            int confirmacion = JOptionPane.showConfirmDialog(this,
                    "¿Está seguro que desea eliminar el artista " + nombre + "?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            // Si el usuario confirma, eliminar el concierto
            if (confirmacion == JOptionPane.YES_OPTION) {
                servicioArtista.eliminarArtista(servicioArtista.buscarArtista(nombre));
                JOptionPane.showMessageDialog(this, "Artista eliminado exitosamente.",
                        "Eliminación exitosa",
                        JOptionPane.INFORMATION_MESSAGE);
                txtFNombre.setText("");
                txtFDisquera.setText("");
                txtFBuscarArtista.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "No se elimino el concierto",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtFBuscarArtistaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFBuscarArtistaMousePressed
        txtFBuscarArtista.setText("");
        txtFBuscarArtista.setForeground(Color.black);
    }//GEN-LAST:event_txtFBuscarArtistaMousePressed

    private void txtFBuscarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFBuscarArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFBuscarArtistaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombre = txtFBuscarArtista.getText();
        try {
            txtFNombre.setText(servicioArtista.buscarArtista(nombre).getNombre());
            txtFDisquera.setText(servicioArtista.buscarArtista(nombre).getDisquera());
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDisquera;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtFBuscarArtista;
    private javax.swing.JTextField txtFDisquera;
    private javax.swing.JTextField txtFNombre;
    // End of variables declaration//GEN-END:variables
}
