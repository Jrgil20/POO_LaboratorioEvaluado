package laboratorioevaluado1.View;

public class VentanaEliminar extends javax.swing.JFrame {

    public VentanaEliminar() {
        initComponents();
        this.setLocationRelativeTo(null);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        BgDashboard = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PanelVertical3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabelMenu2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelHorizontal3 = new javax.swing.JPanel();
        jPanelGENX2 = new javax.swing.JPanel();
        jLabelGENX2 = new javax.swing.JLabel();
        jPanelConfirmarEliminacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFechaDeVencimiento = new javax.swing.JLabel();
        btnCancelarEliminacion = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        btnConfirmarEliminacion = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        BgDashboard.setBackground(new java.awt.Color(204, 217, 255));
        BgDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BgDashboard.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        PanelVertical3.setBackground(new java.awt.Color(51, 51, 51));
        PanelVertical3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Inicio");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelVertical3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 170, -1));

        jLabelMenu2.setText("Menu");
        PanelVertical3.add(jLabelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 20));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelVertical3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 170, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        PanelVertical3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 270, 210, 220));

        BgDashboard.add(PanelVertical3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 540));

        PanelHorizontal3.setBackground(new java.awt.Color(164, 159, 224));
        PanelHorizontal3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGENX2.setBackground(new java.awt.Color(204, 204, 255));
        jPanelGENX2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGENX2.setForeground(new java.awt.Color(102, 204, 255));

        jLabelGENX2.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 0, 16)); // NOI18N
        jLabelGENX2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGENX2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGENX2.setText("GEN X");
        jLabelGENX2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelGENX2Layout = new javax.swing.GroupLayout(jPanelGENX2);
        jPanelGENX2.setLayout(jPanelGENX2Layout);
        jPanelGENX2Layout.setHorizontalGroup(
            jPanelGENX2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGENX2Layout.createSequentialGroup()
                .addComponent(jLabelGENX2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelGENX2Layout.setVerticalGroup(
            jPanelGENX2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGENX2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGENX2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelHorizontal3.add(jPanelGENX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        BgDashboard.add(PanelHorizontal3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanelConfirmarEliminacion.setBackground(new java.awt.Color(204, 204, 255));
        jPanelConfirmarEliminacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelConfirmarEliminacion.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanelConfirmarEliminacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("<html>¿Está seguro de que quiere eliminar este medicamento?</html>");
        jLabel2.setAutoscrolls(true);
        jLabel2.setMaximumSize(new java.awt.Dimension(156, 64));
        jLabel2.setMinimumSize(new java.awt.Dimension(156, 64));
        jLabel2.setPreferredSize(new java.awt.Dimension(156, 64));
        jPanelConfirmarEliminacion.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 60));

        jLabelFechaDeVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFechaDeVencimiento.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelFechaDeVencimiento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaDeVencimiento.setText("Fecha de Vencimiento:");
        jPanelConfirmarEliminacion.add(jLabelFechaDeVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 110, 30));

        btnCancelarEliminacion.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelarEliminacion.setText("Cancelar");
        btnCancelarEliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEliminacionActionPerformed(evt);
            }
        });
        jPanelConfirmarEliminacion.add(btnCancelarEliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 90, -1));

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre");
        jPanelConfirmarEliminacion.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, 30));

        jLabelCosto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCosto.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCosto.setText("Costo");
        jPanelConfirmarEliminacion.add(jLabelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 90, 30));

        btnConfirmarEliminacion.setBackground(new java.awt.Color(102, 102, 102));
        btnConfirmarEliminacion.setText("Confirmar");
        btnConfirmarEliminacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarEliminacionActionPerformed(evt);
            }
        });
        jPanelConfirmarEliminacion.add(btnConfirmarEliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 90, -1));

        BgDashboard.add(jPanelConfirmarEliminacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 470, 260));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe Script", 0, 32)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medicamento", " " }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.setOpaque(true);
        BgDashboard.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 430, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BgDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Inicio w = new Inicio();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnCancelarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEliminacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarEliminacionActionPerformed

    private void btnConfirmarEliminacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarEliminacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfirmarEliminacionActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BgDashboard;
    private javax.swing.JPanel PanelHorizontal3;
    private javax.swing.JPanel PanelVertical3;
    public javax.swing.JButton btnCancelarEliminacion;
    public javax.swing.JButton btnConfirmarEliminacion;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelFechaDeVencimiento;
    private javax.swing.JLabel jLabelGENX2;
    private javax.swing.JLabel jLabelMenu2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanelConfirmarEliminacion;
    private javax.swing.JPanel jPanelGENX2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
