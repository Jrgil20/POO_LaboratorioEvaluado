
package laboratorioevaluado1.View;

/**
 *
 * @author jrmat
 */
public class VentanaLeer extends javax.swing.JFrame {

    public VentanaLeer() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelVertical2 = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        jLabelMenu1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PanelHorizontal2 = new javax.swing.JPanel();
        jPanelGENX1 = new javax.swing.JPanel();
        jLabelGENX1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelPrincipal = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelCosto = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jLabelUnidadesExistentes = new javax.swing.JLabel();
        jLabelUnidadesVendidas = new javax.swing.JLabel();
        jLabelVigenciaMercado = new javax.swing.JLabel();
        jLabelFechaDeVencimiento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelVertical2.setBackground(new java.awt.Color(51, 51, 51));
        PanelVertical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setText("Inicio");
        btnInicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });
        PanelVertical2.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 170, -1));

        jLabelMenu1.setText("Menu");
        PanelVertical2.add(jLabelMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        PanelVertical2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 270, 210, 220));

        PanelHorizontal2.setBackground(new java.awt.Color(164, 159, 224));
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

        jPanel1.setBackground(new java.awt.Color(204, 217, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jScrollPane2.setToolTipText("");
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(240, 100));

        jPanelPrincipal.setBackground(new java.awt.Color(204, 204, 255));
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipal.setPreferredSize(new java.awt.Dimension(240, 24000));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 120));

        jLabelCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCodigo.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setText("Código");

        jLabelNombre.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombre.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setText("Nombre");

        jLabelCosto.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCosto.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelCosto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCosto.setText("Costo");

        jLabelPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jLabelPrecio.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecio.setText("Precio");

        jLabelUnidadesExistentes.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUnidadesExistentes.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelUnidadesExistentes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUnidadesExistentes.setText("Unidades Existentes");

        jLabelUnidadesVendidas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUnidadesVendidas.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelUnidadesVendidas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUnidadesVendidas.setText("Unidades Vendidas");

        jLabelVigenciaMercado.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVigenciaMercado.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelVigenciaMercado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelVigenciaMercado.setText("Vigencia en el mercado");

        jLabelFechaDeVencimiento.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFechaDeVencimiento.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabelFechaDeVencimiento.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaDeVencimiento.setText("Fecha de vencimiento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelUnidadesExistentes)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelVigenciaMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabelFechaDeVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUnidadesExistentes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelVigenciaMercado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFechaDeVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23839, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanelPrincipal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 171, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(PanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicioMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLeer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHorizontal2;
    private javax.swing.JPanel PanelVertical2;
    private javax.swing.JButton btnInicio;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelCodigo;
    public javax.swing.JLabel jLabelCosto;
    public javax.swing.JLabel jLabelFechaDeVencimiento;
    private javax.swing.JLabel jLabelGENX1;
    private javax.swing.JLabel jLabelMenu1;
    public javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelPrecio;
    public javax.swing.JLabel jLabelUnidadesExistentes;
    public javax.swing.JLabel jLabelUnidadesVendidas;
    public javax.swing.JLabel jLabelVigenciaMercado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelGENX1;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
