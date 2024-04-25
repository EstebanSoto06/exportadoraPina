/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaces;

/**
 *
 * @author Usuario
 */
public class CRUDInmersiones extends javax.swing.JFrame {

    private PantallaPrincipalDigitador pPrincipal;
    /**
     * Creates new form BoletasCosecha
     */
    public CRUDInmersiones() {
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

        jpBackground = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        lbSubtitulo = new javax.swing.JLabel();
        lbExportadora = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnEliminarInmersion = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnNuevaInmersion = new javax.swing.JButton();
        btnEditarInmersion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jpBackground.setBackground(new java.awt.Color(255, 255, 204));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("LOS 3 PATITOS");
        jpBackground.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        lbSubtitulo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setText("Inmersiones");
        jpBackground.add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, -1, 20));

        lbExportadora.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbExportadora.setForeground(new java.awt.Color(0, 0, 0));
        lbExportadora.setText("Exportadora");
        jpBackground.add(lbExportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jpBackground.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1135, 10, 120, -1));

        btnEliminarInmersion.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminarInmersion.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnEliminarInmersion.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminarInmersion.setText("Eliminar Inmersión");
        jpBackground.add(btnEliminarInmersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 30));

        btnCargarDatos.setBackground(new java.awt.Color(204, 204, 0));
        btnCargarDatos.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnCargarDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnCargarDatos.setText("Cargar Datos");
        jpBackground.add(btnCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, 30));

        btnNuevaInmersion.setBackground(new java.awt.Color(204, 255, 204));
        btnNuevaInmersion.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnNuevaInmersion.setForeground(new java.awt.Color(0, 0, 0));
        btnNuevaInmersion.setText("Nueva Inmersión");
        jpBackground.add(btnNuevaInmersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 30));

        btnEditarInmersion.setBackground(new java.awt.Color(204, 255, 255));
        btnEditarInmersion.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        btnEditarInmersion.setForeground(new java.awt.Color(0, 0, 0));
        btnEditarInmersion.setText("Editar Inmersión");
        jpBackground.add(btnEditarInmersion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 170, 30));

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

        jpBackground.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 1040, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1273, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, 1273, Short.MAX_VALUE))
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

    public void setPrincipal(PantallaPrincipalDigitador pPrincipal){
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
            java.util.logging.Logger.getLogger(CRUDInmersiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDInmersiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDInmersiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDInmersiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDInmersiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnEditarInmersion;
    private javax.swing.JButton btnEliminarInmersion;
    private javax.swing.JButton btnNuevaInmersion;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lbExportadora;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    public javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}