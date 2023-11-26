
package laboratorioevaluado1.View;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author jrmat
 */
public class SeleccionarTipo extends javax.swing.JFrame {

    int xMause,yMause;
    Color fondo = new Color (187);
    /**
     * Creates new form SeleccionarTipo
     */
    public SeleccionarTipo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoSeleccion = new javax.swing.ButtonGroup();
        PanelVertical2 = new javax.swing.JPanel();
        jLabelMenu1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonInicio1 = new javax.swing.JButton();
        PanelHorizontal2 = new javax.swing.JPanel();
        jPanelGENX1 = new javax.swing.JPanel();
        jLabelGENX1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelColdMedicine = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRefrigerado = new javax.swing.JLabel();
        jLabelTemperaturaAmbiente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("TipoMedicamento"); // NOI18N
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 560));
        setResizable(false);

        PanelVertical2.setBackground(new java.awt.Color(51, 51, 51));
        PanelVertical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu1.setText("Menu");
        PanelVertical2.add(jLabelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/logo.png"))); // NOI18N
        PanelVertical2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 190));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelVertical2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 170, 40));

        jButtonInicio1.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInicio1.setText("Inicio");
        jButtonInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonInicio1MouseClicked(evt);
            }
        });
        jButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio1ActionPerformed(evt);
            }
        });
        PanelVertical2.add(jButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 170, -1));

        PanelHorizontal2.setBackground(new java.awt.Color(164, 159, 224));
        PanelHorizontal2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelHorizontal2MouseDragged(evt);
            }
        });
        PanelHorizontal2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelHorizontal2MousePressed(evt);
            }
        });
        PanelHorizontal2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelGENX1.setBackground(new java.awt.Color(204, 204, 255));
        jPanelGENX1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelGENX1.setForeground(new java.awt.Color(102, 204, 255));

        jLabelGENX1.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 0, 16)); // NOI18N
        jLabelGENX1.setForeground(new java.awt.Color(0, 0, 0));
        jLabelGENX1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelGENX1.setText("GEN X");
        jLabelGENX1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanelGENX1Layout = new javax.swing.GroupLayout(jPanelGENX1);
        jPanelGENX1.setLayout(jPanelGENX1Layout);
        jPanelGENX1Layout.setHorizontalGroup(
            jPanelGENX1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGENX1Layout.createSequentialGroup()
                .addComponent(jLabelGENX1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelGENX1Layout.setVerticalGroup(
            jPanelGENX1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGENX1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelGENX1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelHorizontal2.add(jPanelGENX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 40));

        exit.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(0, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        PanelHorizontal2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 40));

        jPanel1.setBackground(new java.awt.Color(204, 217, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabelColdMedicine.setFont(new java.awt.Font("A.C.M.E. Secret Agent", 0, 16)); // NOI18N
        jLabelColdMedicine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelColdMedicine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/Cold-medicine-bottle.png"))); // NOI18N
        jLabelColdMedicine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabelColdMedicine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelColdMedicineMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelColdMedicineMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelColdMedicineMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-Temp.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabelRefrigerado.setForeground(new java.awt.Color(0, 0, 255));
        jLabelRefrigerado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRefrigerado.setText("Refrigerado");

        jLabelTemperaturaAmbiente.setForeground(new java.awt.Color(255, 0, 51));
        jLabelTemperaturaAmbiente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTemperaturaAmbiente.setText("Temperatura Ambiente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelRefrigerado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabelColdMedicine)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabelTemperaturaAmbiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelColdMedicine, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRefrigerado)
                    .addComponent(jLabelTemperaturaAmbiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(PanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PanelVertical2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInicio1MouseClicked

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInicio1ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(Color.white);
    }//GEN-LAST:event_exitMouseExited

    private void PanelHorizontal2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHorizontal2MouseDragged
        int xOnScrean = evt.getXOnScreen();
        int yOnScrean = evt.getYOnScreen();
        this.setLocation(( xOnScrean -xMause),(yOnScrean - yMause));

    }//GEN-LAST:event_PanelHorizontal2MouseDragged

    private void PanelHorizontal2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelHorizontal2MousePressed
        xMause = evt.getX();
        yMause = evt.getY();
    }//GEN-LAST:event_PanelHorizontal2MousePressed

    private void jLabelColdMedicineMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelColdMedicineMouseEntered
   
        jLabelRefrigerado.setForeground(fondo);
    }//GEN-LAST:event_jLabelColdMedicineMouseEntered

    private void jLabelColdMedicineMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelColdMedicineMouseExited
        jLabelRefrigerado.setForeground(Color.blue);
    }//GEN-LAST:event_jLabelColdMedicineMouseExited

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabelTemperaturaAmbiente.setForeground(fondo);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabelTemperaturaAmbiente.setForeground(Color.red);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabelColdMedicineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelColdMedicineMouseClicked
        JOptionPane.showMessageDialog(null, "Usted "
                    + "selecciono un medicamento refrigerado");
    }//GEN-LAST:event_jLabelColdMedicineMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null, "Usted "
                    + "selecciono un medicamento temperatura ambiente");
    }//GEN-LAST:event_jLabel1MouseClicked
 
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
            java.util.logging.Logger.getLogger(SeleccionarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarTipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarTipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHorizontal2;
    private javax.swing.JPanel PanelVertical2;
    private javax.swing.JLabel exit;
    private javax.swing.ButtonGroup grupoSeleccion;
    private javax.swing.JButton jButtonInicio1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelColdMedicine;
    private javax.swing.JLabel jLabelGENX1;
    private javax.swing.JLabel jLabelMenu1;
    private javax.swing.JLabel jLabelRefrigerado;
    private javax.swing.JLabel jLabelTemperaturaAmbiente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelGENX1;
    // End of variables declaration//GEN-END:variables
}
