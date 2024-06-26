package interfaces;


public class PantallaPrincipalAdmin extends javax.swing.JFrame {
    
    private Login login;
    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipalAdmin() {
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
        btnLogout = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnFincas = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnTipoFruta = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnVariedadFruta = new javax.swing.JButton();
        btnUsuarios1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpBackground.setBackground(new java.awt.Color(255, 255, 204));
        jpBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitulo.setFont(new java.awt.Font("Serif", 1, 48)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbTitulo.setText("LOS 3 PATITOS");
        jpBackground.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lbSubtitulo.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbSubtitulo.setForeground(new java.awt.Color(0, 0, 0));
        lbSubtitulo.setText("Página administrador");
        jpBackground.add(lbSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, 20));

        lbExportadora.setFont(new java.awt.Font("Serif", 2, 18)); // NOI18N
        lbExportadora.setForeground(new java.awt.Color(0, 0, 0));
        lbExportadora.setText("Exportadora");
        jpBackground.add(lbExportadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        btnLogout.setBackground(new java.awt.Color(255, 204, 153));
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jpBackground.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(255, 204, 204));
        btnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jpBackground.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));

        btnFincas.setBackground(new java.awt.Color(204, 204, 0));
        btnFincas.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnFincas.setForeground(new java.awt.Color(0, 0, 0));
        btnFincas.setText("Fincas");
        btnFincas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFincasActionPerformed(evt);
            }
        });
        jpBackground.add(btnFincas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 250, 110));

        btnProveedores.setBackground(new java.awt.Color(204, 204, 0));
        btnProveedores.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(0, 0, 0));
        btnProveedores.setText("Proveedores");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jpBackground.add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 110));

        btnTipoFruta.setBackground(new java.awt.Color(204, 204, 0));
        btnTipoFruta.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnTipoFruta.setForeground(new java.awt.Color(0, 0, 0));
        btnTipoFruta.setText("Tipos de Fruta");
        btnTipoFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoFrutaActionPerformed(evt);
            }
        });
        jpBackground.add(btnTipoFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 250, 110));

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 0));
        btnUsuarios.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios.setText("Usuarios");
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });
        jpBackground.add(btnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 250, 110));

        btnVariedadFruta.setBackground(new java.awt.Color(204, 204, 0));
        btnVariedadFruta.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnVariedadFruta.setForeground(new java.awt.Color(0, 0, 0));
        btnVariedadFruta.setText("Variedad de Frutas");
        btnVariedadFruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVariedadFrutaActionPerformed(evt);
            }
        });
        jpBackground.add(btnVariedadFruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 250, 110));

        btnUsuarios1.setBackground(new java.awt.Color(204, 204, 0));
        btnUsuarios1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        btnUsuarios1.setForeground(new java.awt.Color(0, 0, 0));
        btnUsuarios1.setText("Perfil Usuario");
        btnUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarios1ActionPerformed(evt);
            }
        });
        jpBackground.add(btnUsuarios1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 250, 110));

        getContentPane().add(jpBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        getAccessibleContext().setAccessibleName("aaaaa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        CRUDUsuarios pUsuarios = new CRUDUsuarios();
        pUsuarios.setPrincipal(this);
        pUsuarios.setLocationRelativeTo(null);
        pUsuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnUsuariosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        CRUDProveedores pProveedores = new CRUDProveedores();
        pProveedores.setPrincipal(this);
        pProveedores.setLocationRelativeTo(null);
        pProveedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnFincasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFincasActionPerformed
        CRUDFincas pFincas = new CRUDFincas();
        pFincas.setPrincipal(this);
        pFincas.setLocationRelativeTo(null);
        pFincas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnFincasActionPerformed

    private void btnTipoFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoFrutaActionPerformed
        CRUDTipoFruta pTipos = new CRUDTipoFruta();
        pTipos.setPrincipal(this);
        pTipos.setLocationRelativeTo(null);
        pTipos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnTipoFrutaActionPerformed

    private void btnVariedadFrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVariedadFrutaActionPerformed
        CRUDVariedadFruta pVariedades = new CRUDVariedadFruta();
        pVariedades.setPrincipal(this);
        pVariedades.setLocationRelativeTo(null);
        pVariedades.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVariedadFrutaActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarios1ActionPerformed
        PantallaPrincipalDigitador pDigitador = new PantallaPrincipalDigitador();
        pDigitador.setAdmin(true);
        pDigitador.setLogin(this.login);
        pDigitador.setLocationRelativeTo(null);
        pDigitador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUsuarios1ActionPerformed
    
    public void setLogin(Login login){
        this.login = login;
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
            java.util.logging.Logger.getLogger(PantallaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnFincas;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnTipoFruta;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnUsuarios1;
    private javax.swing.JButton btnVariedadFruta;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JLabel lbExportadora;
    private javax.swing.JLabel lbSubtitulo;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
