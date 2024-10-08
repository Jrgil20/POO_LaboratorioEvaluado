package laboratorioevaluado1.View;

import java.awt.Color;
import javax.swing.JOptionPane;


public class VentanaAgregar extends javax.swing.JFrame {

    int xMause,yMause;
    public VentanaAgregar() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupModoCrear = new javax.swing.ButtonGroup();
        btnGroupVigencia = new javax.swing.ButtonGroup();
        PanelHorizontal2 = new javax.swing.JPanel();
        jPanelGENX1 = new javax.swing.JPanel();
        jLabelGENX1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        PanelVertical2 = new javax.swing.JPanel();
        jLabelMenu1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButtonInicio1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelModoCrear = new javax.swing.JPanel();
        btnSeleccionar1 = new javax.swing.JButton();
        radioBtnPredeterminados = new javax.swing.JRadioButton();
        radioBtnPredefinidos = new javax.swing.JRadioButton();
        radioBtnManual = new javax.swing.JRadioButton();
        jPanelLeerDatos = new javax.swing.JPanel();
        btnAgregarMedicamento = new javax.swing.JButton();
        jLabelMenu2 = new javax.swing.JLabel();
        jLabelMenu3 = new javax.swing.JLabel();
        jLabelMenu4 = new javax.swing.JLabel();
        jLabelMenu5 = new javax.swing.JLabel();
        jLabelMenu6 = new javax.swing.JLabel();
        jLabelMenu7 = new javax.swing.JLabel();
        nCodigo = new javax.swing.JSpinner();
        nUnidadesExistentes = new javax.swing.JSpinner();
        nPrecio = new javax.swing.JSpinner();
        nCosto = new javax.swing.JSpinner();
        nLote = new javax.swing.JSpinner();
        jLabelMenu8 = new javax.swing.JLabel();
        jLabelMenu9 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabelMenu10 = new javax.swing.JLabel();
        nUnidadesVendidas = new javax.swing.JSpinner();
        txtNombre = new javax.swing.JTextField();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabelMenu11 = new javax.swing.JLabel();
        jLabelMenu12 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

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

        PanelVertical2.setBackground(new java.awt.Color(51, 51, 51));
        PanelVertical2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenu1.setBackground(new java.awt.Color(255, 255, 255));
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

        jButtonInicio1.setBackground(new java.awt.Color(102, 102, 102));
        jButtonInicio1.setText("Inicio");
        jButtonInicio1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio1ActionPerformed(evt);
            }
        });
        PanelVertical2.add(jButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 28, 170, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        jLabel1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorioevaluado1/View/resources/images/medicine-bottle-cute.png"))); // NOI18N
        PanelVertical2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 260, 200, -1));

        jPanel1.setBackground(new java.awt.Color(204, 217, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 560));

        jPanelModoCrear.setBackground(new java.awt.Color(204, 204, 255));
        jPanelModoCrear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelModoCrear.setPreferredSize(new java.awt.Dimension(240, 120));

        btnSeleccionar1.setBackground(new java.awt.Color(102, 102, 102));
        btnSeleccionar1.setText("Seleccionar");
        btnSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionar1ActionPerformed(evt);
            }
        });

        btnGroupModoCrear.add(radioBtnPredeterminados);
        radioBtnPredeterminados.setText("Crear con valores predeterminados (genéricos)");

        btnGroupModoCrear.add(radioBtnPredefinidos);
        radioBtnPredefinidos.setText("Crear con valores predefinidos (sin valores)");

        btnGroupModoCrear.add(radioBtnManual);
        radioBtnManual.setText("Crear valores manualmente");

        javax.swing.GroupLayout jPanelModoCrearLayout = new javax.swing.GroupLayout(jPanelModoCrear);
        jPanelModoCrear.setLayout(jPanelModoCrearLayout);
        jPanelModoCrearLayout.setHorizontalGroup(
            jPanelModoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModoCrearLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanelModoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelModoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(radioBtnManual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(radioBtnPredefinidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(radioBtnPredeterminados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelModoCrearLayout.setVerticalGroup(
            jPanelModoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelModoCrearLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(radioBtnPredeterminados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelModoCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnPredefinidos)
                    .addComponent(btnSeleccionar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radioBtnManual)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanelLeerDatos.setBackground(new java.awt.Color(204, 204, 255));
        jPanelLeerDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelLeerDatos.setPreferredSize(new java.awt.Dimension(240, 120));
        jPanelLeerDatos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregarMedicamento.setBackground(new java.awt.Color(102, 102, 102));
        btnAgregarMedicamento.setText("Agregar");
        btnAgregarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMedicamentoActionPerformed(evt);
            }
        });
        jPanelLeerDatos.add(btnAgregarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 190, 60));

        jLabelMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu2.setText("Vigencia en el mercado:");
        jPanelLeerDatos.add(jLabelMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 250, -1));

        jLabelMenu3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu3.setText("Código:");
        jPanelLeerDatos.add(jLabelMenu3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabelMenu4.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu4.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu4.setText("Costo");
        jPanelLeerDatos.add(jLabelMenu4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabelMenu5.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu5.setText("Precio");
        jPanelLeerDatos.add(jLabelMenu5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabelMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu6.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu6.setText("no almacenar en: ");
        jPanelLeerDatos.add(jLabelMenu6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jLabelMenu7.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu7.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu7.setText("Unidades existentes");
        jPanelLeerDatos.add(jLabelMenu7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));
        jPanelLeerDatos.add(nCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 121, -1));

        nUnidadesExistentes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelLeerDatos.add(nUnidadesExistentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 121, -1));
        jPanelLeerDatos.add(nPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 121, -1));

        nCosto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 10));
        jPanelLeerDatos.add(nCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 121, -1));

        nLote.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelLeerDatos.add(nLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 121, -1));

        jLabelMenu8.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu8.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu8.setText("Fecha");
        jPanelLeerDatos.add(jLabelMenu8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, -1, -1));

        jLabelMenu9.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu9.setForeground(new java.awt.Color(0, 0, 0));
        jPanelLeerDatos.add(jLabelMenu9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        btnGroupVigencia.add(jRadioButton1);
        jRadioButton1.setText("Retirado");
        jPanelLeerDatos.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 80, -1));

        btnGroupVigencia.add(jRadioButton2);
        jRadioButton2.setText("No vigente");
        jPanelLeerDatos.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 100, -1));

        btnGroupVigencia.add(jRadioButton3);
        jRadioButton3.setText("Vigente");
        jPanelLeerDatos.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 80, -1));

        jLabelMenu10.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu10.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu10.setText("Unidades vendidas");
        jPanelLeerDatos.add(jLabelMenu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        nUnidadesVendidas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanelLeerDatos.add(nUnidadesVendidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 121, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanelLeerDatos.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 210, -1));
        jPanelLeerDatos.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 120, -1));

        jLabelMenu11.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu11.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu11.setText("Nombre");
        jPanelLeerDatos.add(jLabelMenu11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabelMenu12.setBackground(new java.awt.Color(255, 255, 255));
        jLabelMenu12.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMenu12.setText("Número de lote");
        jPanelLeerDatos.add(jLabelMenu12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        Lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LugarActionPerformed(evt);
            }
        });
        jPanelLeerDatos.add(Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 160, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jPanelModoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanelLeerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanelModoCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelLeerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 170, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PanelHorizontal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PanelVertical2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionar1ActionPerformed
        // TODO add your handling code here:
        if(radioBtnPredeterminados.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Se creo un medicamento "
                    + "con valores predeterminados");
        }   
        else if(radioBtnPredefinidos.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Se creo un medicamento "
                    + "con valores predefinidos");
        }
        else if(radioBtnManual.isSelected())
        {
            jPanelModoCrear.setVisible(false);
            jPanelLeerDatos.setVisible(true);
            
        }
    }//GEN-LAST:event_btnSeleccionar1ActionPerformed

    private void btnAgregarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMedicamentoActionPerformed
        
    }//GEN-LAST:event_btnAgregarMedicamentoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        // TODO add your handling code here:
        Inicio w = new Inicio();
        w.setLocationRelativeTo(null);
        w.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonInicio1ActionPerformed

    private void LugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LugarActionPerformed
        String NoAlmacenar = Lugar.getText();
        //guardar la informacion
    }//GEN-LAST:event_LugarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Lugar;
    private javax.swing.JPanel PanelHorizontal2;
    private javax.swing.JPanel PanelVertical2;
    public javax.swing.JButton btnAgregarMedicamento;
    private javax.swing.ButtonGroup btnGroupModoCrear;
    private javax.swing.ButtonGroup btnGroupVigencia;
    public javax.swing.JButton btnSeleccionar1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButtonInicio1;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelGENX1;
    private javax.swing.JLabel jLabelMenu1;
    private javax.swing.JLabel jLabelMenu10;
    private javax.swing.JLabel jLabelMenu11;
    private javax.swing.JLabel jLabelMenu12;
    private javax.swing.JLabel jLabelMenu2;
    private javax.swing.JLabel jLabelMenu3;
    private javax.swing.JLabel jLabelMenu4;
    private javax.swing.JLabel jLabelMenu5;
    private javax.swing.JLabel jLabelMenu6;
    private javax.swing.JLabel jLabelMenu7;
    private javax.swing.JLabel jLabelMenu8;
    private javax.swing.JLabel jLabelMenu9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelGENX1;
    public javax.swing.JPanel jPanelLeerDatos;
    public javax.swing.JPanel jPanelModoCrear;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JSpinner nCodigo;
    private javax.swing.JSpinner nCosto;
    private javax.swing.JSpinner nLote;
    private javax.swing.JSpinner nPrecio;
    private javax.swing.JSpinner nUnidadesExistentes;
    private javax.swing.JSpinner nUnidadesVendidas;
    private javax.swing.JRadioButton radioBtnManual;
    private javax.swing.JRadioButton radioBtnPredefinidos;
    private javax.swing.JRadioButton radioBtnPredeterminados;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
