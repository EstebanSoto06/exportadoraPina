/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

import datos.VariedadesDB;
import logica.VariedadFruto;

/**
 *
 * @author Usuario
 */
public class CRUDVariedadFruta extends javax.swing.JFrame {

    private PantallaPrincipalAdmin pPrincipal;
    /**
     * Creates new form Proveedores
     */
    public CRUDVariedadFruta() {
        initComponents();
        cargarDatosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackground = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbExportadora = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jpBackground.setBackground(new java.awt.Color(255, 255, 204));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("LOS 3 PATITOS");
        jpBackground.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lbSubtitulo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setText("Variedades de Piña");
        jpBackground.add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, 20));

        lbExportadora.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbExportadora.setForeground(new java.awt.Color(0, 0, 0));
        lbExportadora.setText("Exportadora");
        jpBackground.add(lbExportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jpBackground.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 10, 110, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar variedad");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jpBackground.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 30));

        btnCargarDatos.setBackground(new java.awt.Color(204, 204, 0));
        btnCargarDatos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnCargarDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });
        jpBackground.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        btnAgregar.setBackground(new java.awt.Color(204, 255, 204));
        btnAgregar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("Nueva variedad");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jpBackground.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

        btnEditar.setBackground(new java.awt.Color(204, 255, 255));
        btnEditar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("Editar variedad");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jpBackground.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 30));

        tblDatos.setBackground(new java.awt.Color(255, 255, 255));
        tblDatos.setForeground(new java.awt.Color(0, 0, 0));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        jpBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 570, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        pPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        POPVariedadFruta pGestion = new POPVariedadFruta();
        pGestion.setCrud(this);
        pGestion.setLocationRelativeTo(null);
        pGestion.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        VariedadesDB gestor = new VariedadesDB();
        VariedadFruto variedad = gestor.seleccionarVariedad(tblDatos);
        if (variedad != null){
            POPVariedadFruta pGestion = new POPVariedadFruta();
            pGestion.setCrud(this);
            pGestion.setEditando(true, variedad);
            pGestion.setLocationRelativeTo(null);
            pGestion.setVisible(true);
            this.setEnabled(false);
        } 
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        cargarDatosTabla();
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        VariedadesDB gestor = new VariedadesDB();
        VariedadFruto variedad = gestor.seleccionarVariedad(tblDatos);
        if (variedad != null){
            gestor.eliminarVariedad(variedad.getId());
            cargarDatosTabla();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void cargarDatosTabla(){
        VariedadesDB gestor = new VariedadesDB();
        gestor.cargarVariedades(tblDatos);
    }
    
    public void setPrincipal(PantallaPrincipalAdmin pPrincipal){
        this.pPrincipal = pPrincipal;
    }
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
            java.util.logging.Logger.getLogger(CRUDVariedadFruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDVariedadFruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDVariedadFruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDVariedadFruta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDVariedadFruta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lbExportadora;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    public javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
