
package laboratorioevaluado1.View;

import java.awt.Color;
import java.awt.Font;


public class VentanaModificar extends javax.swing.JFrame {

    int xMause, yMause;
    /**
     * Creates new form VentanaModificar
     */
    public VentanaModificar() {
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

        PanelVertical2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabelMenu2 = new javax.swing.JLabel();
        jButtonInicio1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        PanelHorizontal2 = new javax.swing.JPanel();
        jPanelGENX1 = new javax.swing.JPanel();
        jLabelGENX1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelNombre = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jPanelCodigo = new javax.swing.JPanel();
        jLabelCodigo = new javax.swing.JLabel();
        jPanelPrecio = new javax.swing.JPanel();
        jLabelPrecio = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabelUnidadesExistentes = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabelNumeroDeLote = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabelVigenciaMercado = new javax.swing.JLabel();
        jPanelCosto = new javax.swing.JPanel();
        jLabelCosto = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabelUnidadesVendidas = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabelFechaCaducidad = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        PanelVertical2.setBackground(new java.awt.Color(51, 51, 51));
        PanelVertical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabelMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu2.setText("Menu");
        PanelVertical2.add(jLabelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        jLabel2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        PanelVertical2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 290, 210, 220));

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

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html>Seleccione la propiedad que desea modificar:</html>");
        jLabel1.setAutoscrolls(true);
        jLabel1.setMaximumSize(new java.awt.Dimension(156, 64));
        jLabel1.setMinimumSize(new java.awt.Dimension(156, 64));
        jLabel1.setPreferredSize(new java.awt.Dimension(156, 64));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 60));

        jPanelNombre.setBackground(new java.awt.Color(204, 204, 204));
        jPanelNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelNombre.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelNombreMouseEntered(evt);
            }
        });
        jPanelNombre.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNombre.setText("Nombre");
        jLabelNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelNombreMouseClicked(evt);
            }
        });
        jPanelNombre.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 6, 140, 30));

        jPanel2.add(jPanelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 140, 40));

        jPanelCodigo.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCodigo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCodigo.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanelCodigo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCodigo.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCodigo.setText("Código");
        jPanelCodigo.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 6, 130, 30));

        jPanel2.add(jPanelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 140, 40));

        jPanelPrecio.setBackground(new java.awt.Color(204, 204, 204));
        jPanelPrecio.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrecio.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanelPrecio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jLabelPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPrecio.setText("Precio");
        jPanelPrecio.add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jPanel2.add(jPanelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 140, 50));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelUnidadesExistentes.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUnidadesExistentes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUnidadesExistentes.setText("<html>Unidades existentes</html>");
        jPanel8.add(jLabelUnidadesExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 50));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, 50));

        jPanel9.setBackground(new java.awt.Color(204, 204, 204));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNumeroDeLote.setForeground(new java.awt.Color(0, 0, 0));
        jLabelNumeroDeLote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNumeroDeLote.setText("Numero de lote");
        jPanel9.add(jLabelNumeroDeLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 6, 140, 40));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 140, 50));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel10.setPreferredSize(new java.awt.Dimension(240, 120));

        jLabelVigenciaMercado.setForeground(new java.awt.Color(0, 0, 0));
        jLabelVigenciaMercado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVigenciaMercado.setText("<html>Vigencia en el mercado</html>");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVigenciaMercado, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelVigenciaMercado, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, 50));

        jPanelCosto.setBackground(new java.awt.Color(204, 204, 204));
        jPanelCosto.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCosto.setPreferredSize(new java.awt.Dimension(240, 120));

        jLabelCosto.setForeground(new java.awt.Color(0, 0, 0));
        jLabelCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCosto.setText("Costo");

        javax.swing.GroupLayout jPanelCostoLayout = new javax.swing.GroupLayout(jPanelCosto);
        jPanelCosto.setLayout(jPanelCostoLayout);
        jPanelCostoLayout.setHorizontalGroup(
            jPanelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelCostoLayout.setVerticalGroup(
            jPanelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCostoLayout.createSequentialGroup()
                .addComponent(jLabelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 140, 40));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setPreferredSize(new java.awt.Dimension(240, 120));

        jLabelUnidadesVendidas.setForeground(new java.awt.Color(0, 0, 0));
        jLabelUnidadesVendidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUnidadesVendidas.setText("<html>Unidades vendidas</html>");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelUnidadesVendidas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 140, 50));

        jPanel13.setBackground(new java.awt.Color(204, 204, 204));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel13.setPreferredSize(new java.awt.Dimension(240, 120));

        jLabelFechaCaducidad.setForeground(new java.awt.Color(0, 0, 0));
        jLabelFechaCaducidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFechaCaducidad.setText("<html>Fecha de caducidad</html>");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabelFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 140, 50));

        jComboBox1.setBackground(new java.awt.Color(204, 204, 255));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe Script", 0, 32)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 204));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "medicamento", " " }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jComboBox1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jPanelNombreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelNombreMouseEntered
        // TODO add your handling code here:
        Color af = new Color(164,159,224);
        jLabelCodigo.setForeground(af);
    }//GEN-LAST:event_jPanelNombreMouseEntered

    private void jLabelNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelNombreMouseClicked
        // TODO add your handling code here:
        javax.swing.JTextField txtNombre = null;
        txtNombre.setLocation(0, 0);
    }//GEN-LAST:event_jLabelNombreMouseClicked

    private void jButtonInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonInicio1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonInicio1MouseClicked

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        // TODO add your handling code here:
        Inicio w = new Inicio();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInicio1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHorizontal2;
    private javax.swing.JPanel PanelVertical2;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButtonInicio1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelCosto;
    private javax.swing.JLabel jLabelFechaCaducidad;
    private javax.swing.JLabel jLabelGENX1;
    private javax.swing.JLabel jLabelMenu2;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNumeroDeLote;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelUnidadesExistentes;
    private javax.swing.JLabel jLabelUnidadesVendidas;
    private javax.swing.JLabel jLabelVigenciaMercado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelCodigo;
    private javax.swing.JPanel jPanelCosto;
    private javax.swing.JPanel jPanelGENX1;
    private javax.swing.JPanel jPanelNombre;
    private javax.swing.JPanel jPanelPrecio;
    // End of variables declaration//GEN-END:variables
}
